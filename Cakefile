child_process = require 'child_process'
STDOUT = write: (data) ->
  process.stdout.write data.toString()

string_to_octal_array = (string) -> (b.toString(8) for b in new Buffer(string))

get_cantonese_pinyin = (string, done) ->
  http = require 'http'
  query = require('querystring').stringify
    mode: 'cantonese'
    q: string
  req = http.request
    host: "www.kawa.net"
    path: "/works/ajax/romanize/romanize.cgi"
    method: "POST"
    headers:
      'Content-Length': Buffer.byteLength query
  , (res) ->
    body = ''
    res.on 'data', (data) -> body += data;
    res.on 'end', -> done body
  req.end query

parse_body = (body) -> (/^<span\stitle="(.*)">(.*)<\/span>$/.exec(match) \
  for match in body.match(/^<span\stitle=".*">.*<\/span>$/img) || [])

make_java_source = (list, index) ->
  output  = 'package org.cghio.cantonese.romanization;\n\n'
  output += 'public class Hanzi2PinyinData' + index + ' {\n\n'
  output += '  /**\n'
  output += '   * Returns Cantonese Pinyin of a Chinese character.\n'
  output += '   * @param octal integer array of the octal values of each byte of a Chinese character\n'
  output += '   */\n'
  output += '  public static String fromChar(int[] octal) {\n'
  output += '    switch (octal[0]) {\n'
  for k1, v1 of list
    output += '    case ' + k1 + ':\n'
    output += '      switch (octal[1]) {\n'
    for k2, v2 of v1
      output += '      case ' + k2 + ':\n'
      output += '        switch (octal[2]) {\n'
      for k3, v3 of v2
        output += '        case ' + k3 + ': /* ' + v3.char + ' */ return "' + v3.pinyin + '";\n'
      output += '        }\n'
    output += '      }\n'
  output += '    }\n'
  output += '    return null;\n'
  output += '  }\n\n'
  output += '}\n'

write_file = (path, content, next) ->
  require('fs').writeFile path, content, (error) ->
    if error then console.log 'Failed: Unable to write to file: ' + path else next()

exec = (command, next) ->
  child_process.exec command, (error, stdout, stderr) ->
    if error then console.log 'Failed: Unable to ' + command else next()

spawn = (command, options, next) ->
  cmd = child_process.spawn command, options
  cmd.stdout.on 'data', STDOUT.write
  cmd.stderr.on 'data', STDOUT.write
  cmd.on 'close', (code) ->
    if code is 0 then next() else console.log 'Failed: ' + command + ' returns status code ' + code + '.'

task 'make:java', 'make java files and compile to jar', ->
  min = 19968 # parseInt('4e00', 16)
  max = 40907 # parseInt('9fcb', 16)
  step = 8000

  java_src_dir = __dirname + '/java/src/org/cghio/cantonese/romanization/'
  tmp_dir = __dirname + '/tmp'
  jar_file = __dirname + '/cantonese-romanization.jar'

  files = []
  index = 0

  make_java_main = (max) ->
    o   = """
          package org.cghio.cantonese.romanization;

          public class Hanzi2Pinyin {

            /**
             * Returns Cantonese Pinyin of a Chinese character.
             * @param character the Chinese character to convert
             */
            public static String fromChar(String character) throws java.io.UnsupportedEncodingException {
              if (character == null || character.isEmpty()) return null;

              byte[] b = character.getBytes();
              if (b.length < 3) return null;

              return fromChar(new int[]{
                Integer.parseInt(String.format("%o", b[0])),
                Integer.parseInt(String.format("%o", b[1])),
                Integer.parseInt(String.format("%o", b[2]))
              });
            }

            /**
             * Returns Cantonese Pinyin of a Chinese character.
             * @param octal integer array of the octal values of each byte of a Chinese character
             */
            public static String fromChar(int[] octal) {
              if (octal.length < 3) return null;
              String pinyin = Hanzi2PinyinData1.fromChar(octal);

          """
    o += '    if (pinyin == null) pinyin = Hanzi2PinyinData' + num + '.fromChar(octal);\n' for num in [2..max]
    o += '    return pinyin;\n'
    o += '  }\n\n'
    o += '}\n'

  get_chars = (start, finish) ->
    index += 1
    end = start + step - 1
    if end > max then end = max
    hans = ''
    hans += String.fromCharCode(num) for num in [start..end]
    console.log start, end, hans.length, hans[0], hans[hans.length-1]
    get_cantonese_pinyin hans, (body) ->
      list = {}
      for entry in parse_body(body)
        oct = string_to_octal_array(entry[2])
        list[oct[0]] = {} unless list.hasOwnProperty(oct[0])
        list[oct[0]][oct[1]] = {} unless list[oct[0]].hasOwnProperty(oct[1])
        list[oct[0]][oct[1]][oct[2]] = { char: entry[2], pinyin: entry[1] }
      data = make_java_source list, index
      file = java_src_dir + 'Hanzi2PinyinData' + index + '.java'
      write_file file, data, ->
        files.push file
        if end < max
          get_chars start + step, finish
        else
          finish index

  exec 'mkdir -p "' + java_src_dir + '"', ->
    exec 'mkdir -p "' + tmp_dir + '"', ->
      get_chars min, (max) ->
        file = java_src_dir + 'Hanzi2Pinyin.java'
        files.push file
        write_file file, make_java_main(max), ->
          spawn 'javac', ['-d', tmp_dir].concat(files), ->
            spawn 'jar', ['cf', jar_file, '-C', tmp_dir, 'org'], ->
              exec 'rm -rf "' + tmp_dir + '"', ->
                console.log 'OK. Jar file is made: ' + jar_file
