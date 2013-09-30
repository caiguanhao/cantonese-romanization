child_process = require 'child_process'
STDOUT = write: (data) ->
  process.stdout.write data.toString()

string_to_octal_array = (string) -> (b.toString(8) for b in new Buffer(string))

parse_body = (body) -> (/^<span\stitle="(.*)">(.*)<\/span>$/.exec(match) \
  for match in body.match(/^<span\stitle=".*">.*<\/span>$/img) || [])

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

get_cantonese_pinyin = (string, done) ->
  if string.length == 0
    done ''
    return

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
  console.log 'Sending HTTP request...'

chars_file = __dirname + '/chars.json'

task 'get:all', 'get all pinyin', ->
  min = 19968 # parseInt('4e00', 16)
  max = 40907 # parseInt('9fcb', 16)
  step = 8000
  list = if require('fs').existsSync(chars_file) then require(chars_file) else {}
  keys = Object.keys(list)

  get_chars = (start, finish) ->
    end = start + step - 1
    if end > max then end = max
    hans = ''
    for num in [start..end]
      continue if keys.indexOf(num) == -1
      hans += String.fromCharCode(num)

    if hans.length > 0
      console.log 'From ' + hans[0] + ' (' + hans[0].charCodeAt() + '), to ' + hans[hans.length-1] +
        ' (' + hans[hans.length-1].charCodeAt() + '), length = ' + hans.length
    else
      console.log 'Length = 0'

    get_cantonese_pinyin hans, (body) ->
      for entry in parse_body(body)
        code = entry[2].charCodeAt()
        continue if max < code or code < min
        list[code] = entry[1]
      if end < max
        get_chars start + step, finish
      else
        finish()

  get_chars min, ->
    data = JSON.stringify(list, null, 2)
    write_file chars_file, data, ->
      console.log 'done.'

java_src_dir = __dirname + '/java/src/octal/org/cghio/cantonese/romanization/'

task 'java:make', 'make java files', ->
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
    o += '    if (pinyin == null) pinyin = Hanzi2PinyinData' + num + '.fromChar(octal);\n' for num in [2..max] if max >= 2
    o += '    return pinyin;\n'
    o += '  }\n\n'
    o += '}\n'

  make_java_source = (list, index) ->
    o  = 'package org.cghio.cantonese.romanization;\n\n'
    o += 'public class Hanzi2PinyinData' + index + ' {\n\n'
    o += '  /**\n'
    o += '   * Returns Cantonese Pinyin of a Chinese character.\n'
    o += '   * @param octal integer array of the octal values of each byte of a Chinese character\n'
    o += '   */\n'
    o += '  public static String fromChar(int[] octal) {\n'
    o += '    switch (octal[0]) {\n'
    for k1, v1 of list
      o += '    case ' + k1 + ':\n'
      o += '      switch (octal[1]) {\n'
      for k2, v2 of v1
        o += '      case ' + k2 + ':\n'
        o += '        switch (octal[2]) {\n'
        for k3, v3 of v2
          o += '        case ' + k3 + ': /* ' + v3.char + ' */ return "' + v3.pinyin + '";\n'
        o += '        }\n'
      o += '      }\n'
    o += '    }\n'
    o += '    return null;\n'
    o += '  }\n\n'
    o += '}\n'

  list = if require('fs').existsSync(chars_file) then require(chars_file) else {}
  keys = Object.keys(list)
  step = 4200
  index = 0

  chars_to_java = (start, finish) ->
    index += 1
    end = start + step
    if end > keys.length then end = keys.length
    olist = {}
    count = 0
    for i in [start...end]
      char = String.fromCharCode(keys[i])
      oct = string_to_octal_array(char)
      olist[oct[0]] = {} unless olist.hasOwnProperty(oct[0])
      olist[oct[0]][oct[1]] = {} unless olist[oct[0]].hasOwnProperty(oct[1])
      olist[oct[0]][oct[1]][oct[2]] = { char: char, pinyin: list[keys[i]] }
      count += 1
    console.log 'From ' + String.fromCharCode(keys[start]) + ' (' + keys[start] + '), to ' +
      String.fromCharCode(keys[end-1]) + ' (' + keys[end-1] + '), length = ' + count
    data = make_java_source olist, index
    file = java_src_dir + 'Hanzi2PinyinData' + index + '.java'
    write_file file, data, ->
      console.log 'File was saved: ' + file.replace(/^.*\//, '')
      if end < keys.length
        chars_to_java start + step, finish
      else
        finish index

  exec 'mkdir -p "' + java_src_dir + '"', ->
    chars_to_java 0, (max) ->
      write_file java_src_dir + 'Hanzi2Pinyin.java', make_java_main(max), ->
        console.log 'File was saved: Hanzi2Pinyin.java'

task 'java:compile', 'compile java files and put them into jar', ->
  tmp_dir = __dirname + '/tmp'
  jar_file = __dirname + '/cantonese-romanization.jar'

  exec 'mkdir -p "' + tmp_dir + '"', ->
    require('fs').readdir java_src_dir, (err, files) ->
      files = files.filter (file) -> /\.java$/.test(file)
      files = files.map (file) -> java_src_dir + file
      console.log 'Compiling...'
      spawn 'javac', ['-d', tmp_dir].concat(files), ->
        console.log 'Archiving...'
        spawn 'jar', ['cf', jar_file, '-C', tmp_dir, 'org'], ->
          exec 'rm -rf "' + tmp_dir + '"', ->
            console.log 'OK. Jar file is made: ' + jar_file
