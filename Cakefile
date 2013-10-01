child_process = require 'child_process'
test_dir = __dirname + '/test'

string_to_octal_array = (string) -> (b.toString(8) for b in new Buffer(string))

pinyin_to_integer = (pinyin) -> (c.charCodeAt() - 87 for c in pinyin).join('').match(/\d{1,6}/g)

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
  cmd.stdout.on 'data', (data) -> process.stdout.write data.toString()
  cmd.stderr.on 'data', (data) -> process.stderr.write data.toString()
  cmd.on 'close', (code) ->
    if code is 0
      next()
    else
      console.log 'Failed: ' + command + ' returns status code ' + code + '.'
      return process.exit(code)

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

code2pinyin = __dirname + '/json/code-pinyin.json'

task 'get:all', 'get all pinyin', ->
  min = 19968 # parseInt('4e00', 16)
  max = 40907 # parseInt('9fcb', 16)
  step = 8000
  list = if require('fs').existsSync(code2pinyin) then require(code2pinyin) else {}
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
    write_file code2pinyin, data, ->
      console.log 'done.'

pinyin2code = __dirname + '/json/pinyin-code.json'

task 'swap', 'swap keys and values', ->
  list = require(code2pinyin)
  values = []
  new_list = {}
  for k, v of list
    values.push(v)
  values = values.filter (e, i, arr) -> arr.lastIndexOf(e) is i
  values.sort()
  for v in values
    new_list[v] = []
  for k, v of list
    new_list[v].push parseInt(k)
  data = JSON.stringify(new_list, null, 2).replace(/\n\s{4}/g, ' ').replace(/\n\s{2}\]/g, ' ]')
  write_file pinyin2code, data, ->
    console.log 'done.'

pinyin2code_deep = __dirname + '/json/pinyin-code.deep.json'

task 'swap:deep', 'swap keys and values', ->
  list = require(code2pinyin)
  values = []
  new_list = {}
  for k, v of list
    v = v.split('/')
    values = values.concat(v)
  values = values.filter (e, i, arr) -> arr.lastIndexOf(e) is i
  values.sort()
  for v in values
    new_list[v] = []
  for k, v of list
    v = v.split('/')
    for wee in v
      new_list[wee].push parseInt(k)
  data = JSON.stringify(new_list, null, 2).replace(/\n\s{4}/g, ' ').replace(/\n\s{2}\]/g, ' ]')
  write_file pinyin2code_deep, data, ->
    console.log 'done.'

java_src_decimal_dir = __dirname + '/java/src/decimal/org/cghio/cantonese/romanization/'
java_src_octal_dir = __dirname + '/java/src/octal/org/cghio/cantonese/romanization/'
java_src_string_dir = __dirname + '/java/src/string/org/cghio/cantonese/romanization/'
java_src_to_compile = [java_src_decimal_dir, java_src_octal_dir, java_src_string_dir]

jar_file_decimal = __dirname + '/release/cantonese-romanization-decimal.jar'
jar_file_octal = __dirname + '/release/cantonese-romanization-octal.jar'
jar_file_string = __dirname + '/release/cantonese-romanization-string.jar'
jar_files = [jar_file_decimal, jar_file_octal, jar_file_string]

make_java = (type) ->
  java_src_dir = switch type
    when 'decimal' then java_src_decimal_dir
    when 'octal' then java_src_octal_dir
    when 'string' then java_src_string_dir

  make_hanzi2pinyin = (max) ->
    o   = """
          package org.cghio.cantonese.romanization;

          public class Hanzi2Pinyin {

            /**
             * Returns Cantonese Pinyin of a Chinese character.
             * @param character the Chinese character to convert
             */

          """
    switch type
      when 'decimal'
        o  += 
          """
            public static String fromChar(String character) {
              if (character == null || character.isEmpty()) return null;

              return fromChar(Character.codePointAt(character, 0));
            }

            /**
             * Returns Cantonese Pinyin of a Chinese character.
             * @param decimal value of Chinese character
             */
            public static String fromChar(int decimal) {
              String pinyin = Hanzi2PinyinData1.fromChar(decimal);
          
          """
        o +=
         '    if (pinyin == null) pinyin = Hanzi2PinyinData' + num + '.fromChar(decimal);\n' for num in [2..max] if max >= 2
      when 'octal'
        o  += 
          """
            public static String fromChar(String character) throws java.io.UnsupportedEncodingException {
              if (character == null || character.isEmpty()) return null;

              byte[] b = character.getBytes("UTF-8");
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
        o +=
         '    if (pinyin == null) pinyin = Hanzi2PinyinData' + num + '.fromChar(octal);\n' for num in [2..max] if max >= 2
      when 'string'
        o  += 
          """
            public static String fromChar(String character) {
              if (character == null || character.isEmpty()) return null;

              String pinyin = Hanzi2PinyinData1.fromChar(character);
          
          """
        o +=
         '    if (pinyin == null) pinyin = Hanzi2PinyinData' + num + '.fromChar(character);\n' for num in [2..max] if max >= 2

    o += '    return pinyin;\n'
    o += '  }\n\n'
    o += '}\n'

  make_java_decimal_source = (list, index) ->
    o  = 'package org.cghio.cantonese.romanization;\n\n'
    o += 'public class Hanzi2PinyinData' + index + ' {\n\n'
    o += '  /**\n'
    o += '   * Returns Cantonese Pinyin of a Chinese character.\n'
    o += '   * @param decimal value of Chinese character\n'
    o += '   */\n'
    o += '  public static String fromChar(int decimal) {\n'
    o += '    switch (decimal) {\n'
    for k, v of list
      o += '    case ' + k + ': /* ' + String.fromCharCode(k) + ' */ return "' + v + '";\n'
    o += '    }\n'
    o += '    return null;\n'
    o += '  }\n\n'
    o += '}\n'

  make_java_octal_source = (list, index) ->
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

  make_java_stirng_source = (list, index) ->
    o  = 'package org.cghio.cantonese.romanization;\n\n'
    o += 'public class Hanzi2PinyinData' + index + ' {\n\n'
    o += '  /**\n'
    o += '   * Returns Cantonese Pinyin of a Chinese character.\n'
    o += '   * @param the Chinese character\n'
    o += '   */\n'
    o += '  public static String fromChar(String c) {\n'
    for k, v of list
      o += '    if (c.equals("' + String.fromCharCode(k) + '")) return "' + v + '";\n'
    o += '    return null;\n'
    o += '  }\n\n'
    o += '}\n'

  list = if require('fs').existsSync(code2pinyin) then require(code2pinyin) else {}
  keys = Object.keys(list)
  step = 4200
  index = 0

  chars_to_java = (start, finish) ->
    index += 1
    end = start + step
    if end > keys.length then end = keys.length
    olist = {}
    count = 0
    data = ''
    switch type
      when 'decimal'
        for i in [start...end]
          olist[keys[i]] = list[keys[i]]
          count += 1
        data = make_java_decimal_source olist, index
      when 'string'
        for i in [start...end]
          olist[keys[i]] = list[keys[i]]
          count += 1
        data = make_java_stirng_source olist, index
      when 'octal'
        for i in [start...end]
          char = String.fromCharCode(keys[i])
          oct = string_to_octal_array(char)
          olist[oct[0]] = {} unless olist.hasOwnProperty(oct[0])
          olist[oct[0]][oct[1]] = {} unless olist[oct[0]].hasOwnProperty(oct[1])
          olist[oct[0]][oct[1]][oct[2]] = { char: char, pinyin: list[keys[i]] }
          count += 1
        data = make_java_octal_source olist, index
    console.log 'From ' + String.fromCharCode(keys[start]) + ' (' + keys[start] + '), to ' +
      String.fromCharCode(keys[end-1]) + ' (' + keys[end-1] + '), length = ' + count
    file = java_src_dir + 'Hanzi2PinyinData' + index + '.java'
    write_file file, data, ->
      console.log 'File was saved: ' + file.replace(/^.*\//, '')
      if end < keys.length
        chars_to_java start + step, finish
      else
        finish index

  make_pinyin2hanzi = (max) ->
    o   = """
          package org.cghio.cantonese.romanization;

          public class Pinyin2Hanzi {

            /**
             * Returns a array of char code of Chinese characters to a Cantonese Pinyin.
             * @param the string of a Cantonese Pinyin
             */
            public static int[] fromPinyin(String pinyin) {
              if (pinyin == null || pinyin.isEmpty()) return null;

              String code = "";
              for(char c : pinyin.toCharArray()) {
                code += ((int) c - 87);
              }
              String[] string_array = code.split("(?<=\\\\G.{6})");
              if (string_array.length > 2) return null;
              int[] int_array = new int[string_array.length];
              for (int i = 0; i < int_array.length; i++) {
                int_array[i] = Integer.parseInt(string_array[i]);
              }

              int[] hanzi = Pinyin2HanziData1.fromPinyin(int_array);

          """
    o += '    if (hanzi == null) hanzi = Pinyin2HanziData' + num + '.fromPinyin(int_array);\n' for num in [2..max] if max >= 2

    o += '    return hanzi;\n'
    o += '  }\n\n'
    o += '}\n'

  make_java_pinyin_source = (list, index) ->
    o  = 'package org.cghio.cantonese.romanization;\n\n'
    o += 'public class Pinyin2HanziData' + index + ' {\n\n'
    o += '  /**\n'
    o += '   * Returns a array of char code of Chinese characters to a Cantonese Pinyin.\n'
    o += '   * @param array of integers to a Cantonese Pinyin\n'
    o += '   */\n'
    o += '  public static int[] fromPinyin(int[] pinyin) {\n'
    o += '    int l = pinyin.length;\n'
    o += '    switch (pinyin[0]) {\n'

    last_int = 0
    last_int_2 = 0
    prev = ''

    `forr: //`
    for k, v of list
      switch index
        when 1
          `break forr` if k[0] >= 'k'
        when 2
          continue if k[0] < 'k'
      int = pinyin_to_integer(k)
      if last_int_2 != int[0] and last_int == 0
        o += prev
        prev = ''
      if last_int != int[0]
        if last_int > 0
          o += '      }\n'
        if last_int_2 != int[0]
          o += '    case ' + int[0] + ':'
      switch int.length
        when 1
          prev = ' /*' + k + '*/ return new int[]{ ' + v.join(', ') + ' };\n'
          last_int = 0
        when 2
          if last_int != int[0]
            o += '\n'
            if prev != ''
              o += '      if (l == 1)' + prev
              prev = ''
            o += '      switch (pinyin[1]) {\n'
          o += '      case ' + int[1] + ': /*' + k + '*/ return new int[]{ ' + v.join(', ') + ' };\n'
          last_int = int[0]
      last_int_2 = int[0]
    if prev != ''
      o += prev
    else
      o += '      }\n'
    o += '    }\n'
    o += '    return null;\n'
    o += '  }\n\n'
    o += '}\n'

  make_pinyin2hanzi_string = (max) ->
    o   = """
          package org.cghio.cantonese.romanization;

          public class Pinyin2Hanzi {

            /**
             * Returns a array of char code of Chinese characters to a Cantonese Pinyin.
             * @param the string of a Cantonese Pinyin
             */
            public static int[] fromPinyin(String pinyin) {
              if (pinyin == null || pinyin.isEmpty()) return null;

              int[] hanzi = Pinyin2HanziData1.fromPinyin(pinyin);

          """
    o += '    if (hanzi == null) hanzi = Pinyin2HanziData' + num + '.fromPinyin(pinyin);\n' for num in [2..max] if max >= 2
    o += '    return hanzi;\n'
    o += '  }\n\n'
    o += '}\n'

  make_java_pinyin_source_string = (list, index) ->
    o  = 'package org.cghio.cantonese.romanization;\n\n'
    o += 'public class Pinyin2HanziData' + index + ' {\n\n'
    o += '  /**\n'
    o += '   * Returns a array of char code of Chinese characters to a Cantonese Pinyin.\n'
    o += '   * @param array of integers to a Cantonese Pinyin\n'
    o += '   */\n'
    o += '  public static int[] fromPinyin(String pinyin) {\n'
    `forr: //`
    for k, v of list
      switch index
        when 1
          `break forr` if k[0] >= 'k'
        when 2
          continue if k[0] < 'k'
      o += '    if (pinyin.equals("' + k + '")) return new int[]{ ' + v.join(', ') + ' };\n'
    o += '    return null;\n'
    o += '  }\n\n'
    o += '}\n'

  pinyin_to_java = (finish) ->
    list = if require('fs').existsSync(pinyin2code_deep) then require(pinyin2code_deep) else {}
    if type == 'string'
      data = make_java_pinyin_source_string list, 1
    else
      data = make_java_pinyin_source list, 1
    file = java_src_dir + 'Pinyin2HanziData1.java'
    write_file file, data, ->
      console.log 'File was saved: ' + file.replace(/^.*\//, '')
      if type == 'string'
        data = make_java_pinyin_source_string list, 2
      else
        data = make_java_pinyin_source list, 2
      file = java_src_dir + 'Pinyin2HanziData2.java'
      write_file file, data, ->
        console.log 'File was saved: ' + file.replace(/^.*\//, '')
        finish 2

  exec 'mkdir -p "' + java_src_dir + '"', ->
    chars_to_java 0, (max) ->
      write_file java_src_dir + 'Hanzi2Pinyin.java', make_hanzi2pinyin(max), ->
        console.log 'File was saved: Hanzi2Pinyin.java'
        pinyin_to_java (max) ->
          if type == 'string'
            data = make_pinyin2hanzi_string(max)
          else
            data = make_pinyin2hanzi(max)
          write_file java_src_dir + 'Pinyin2Hanzi.java', data, ->
            console.log 'File was saved: Pinyin2Hanzi.java'

task 'java:decimal:make', 'make java files', ->
  make_java 'decimal'

task 'java:octal:make', 'make java files', ->
  make_java 'octal'

task 'java:string:make', 'make java files', ->
  make_java 'string'

task 'java:compile', 'compile java files and put them into jar', ->
  fs = require('fs')
  all_files = []
  tmp_dir = __dirname + '/tmp'

  for java_src_dir in java_src_to_compile
    if !fs.existsSync(java_src_dir) then continue
    files = fs.readdirSync(java_src_dir).filter (file) -> /\.java$/.test(file)
    files = files.map (file) -> java_src_dir + file
    if files.length == 0 then continue
    all_files.push(files)

  compile = (all_files_index) ->
    if all_files_index >= all_files.length then return
    exec 'mkdir -p "' + tmp_dir + '"', ->
      console.log 'Compiling...'
      spawn 'javac', ['-d', tmp_dir].concat(all_files[all_files_index]), ->
        console.log 'Archiving...'
        spawn 'jar', ['cf', jar_files[all_files_index], '-C', tmp_dir, 'org'], ->
          exec 'rm -rf "' + tmp_dir + '"', ->
            console.log 'OK. Jar file is made: ' + jar_files[all_files_index]
            compile all_files_index+1

  if all_files.length == 0
    console.log 'Please make java files first!'
  else
    compile 0

task 'java:test:make', 'make tests', ->
  code2pinyin_list = require(code2pinyin)
  code2pinyin_keys = Object.keys(code2pinyin_list)
  pinyin2code_deep_list = require(pinyin2code_deep)
  pinyin2code_deep_keys = Object.keys(pinyin2code_deep_list)

  h2p = (index, start, end) ->
    end ||= code2pinyin_keys.length
    o =    'import org.cghio.cantonese.romanization.Hanzi2Pinyin;\n'
    o +=   'import static org.junit.Assert.assertEquals;\n\n'
    o +=   'public class test_hanzi2pinyin_' + index + ' {\n\n'
    o +=   '  public static void main(String[] args) {\n'
    count = 0
    for i in [start...end]
      o += '    assertEquals(Hanzi2Pinyin.fromChar("' + String.fromCharCode(code2pinyin_keys[i]) + '"), "' +
        code2pinyin_list[code2pinyin_keys[i]] + '");\n'
      count += 1
    o +=   '    System.out.println("' + count + ' Hanzi-to-Pinyin tests were passed.");'
    o +=   '  }\n\n'
    o +=   '}\n'

  p2h = (index, start, end) ->
    end ||= pinyin2code_deep_keys.length
    o =    'import org.cghio.cantonese.romanization.Pinyin2Hanzi;\n'
    o +=   'import static org.junit.Assert.assertArrayEquals;\n\n'
    o +=   'public class test_pinyin2hanzi_' + index + ' {\n\n'
    o +=   '  public static void main(String[] args) {\n'
    count = 0
    for i in [start...end]
      o += '    assertArrayEquals(Pinyin2Hanzi.fromPinyin("' + pinyin2code_deep_keys[i] + '"), new int[]{ ' + pinyin2code_deep_list[pinyin2code_deep_keys[i]].join(', ') + ' });\n'
      count += 1
    o +=   '    System.out.println("' + count + ' Pinyin-to-Hanzi tests were passed.");'
    o +=   '  }\n\n'
    o +=   '}\n'

  write_file test_dir + '/test_hanzi2pinyin_1.java', h2p(1, 0, 4000), ->
    console.log 'File was saved: test_hanzi2pinyin_1.java'
    write_file test_dir + '/test_hanzi2pinyin_2.java', h2p(2, 4000), ->
      console.log 'File was saved: test_hanzi2pinyin_2.java'
      write_file test_dir + '/test_pinyin2hanzi_1.java', p2h(1, 0, 300), ->
        console.log 'File was saved: test_pinyin2hanzi_1.java'
        write_file test_dir + '/test_pinyin2hanzi_2.java', p2h(2, 300), ->
          console.log 'File was saved: test_pinyin2hanzi_2.java'

junit = test_dir + '/junit-4.11.jar'

test = (classpath, file, done) ->
  spawn 'javac', ['-cp', classpath, '-encoding', 'UTF8', test_dir + '/' + file + '.java'], ->
    spawn 'java', ['-cp', classpath + ':' + test_dir, file], ->
      if done then done()

task 'java:test:benchmark', 'run benchmark', ->
  console.log 'Decimal:'
  test jar_file_decimal, 'benchmark', ->
    console.log 'Octal:'
    test jar_file_octal, 'benchmark', ->
      console.log 'String:'
      test jar_file_string, 'benchmark', ->
        console.log 'Done.'

task 'java:test:h2p', 'run test', ->
  test jar_file_decimal + ':' + junit, 'test_hanzi2pinyin_1', ->
    test jar_file_decimal + ':' + junit, 'test_hanzi2pinyin_2'

task 'java:test:p2h', 'run test', ->
  test jar_file_decimal + ':' + junit, 'test_pinyin2hanzi_1', ->
    test jar_file_decimal + ':' + junit, 'test_pinyin2hanzi_2'
