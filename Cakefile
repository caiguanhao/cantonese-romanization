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

make_java = (list) ->
  output  = 'private String get_cantonese_pinyin(int[] octal) {\n'
  output += '  switch (octal[0]) {\n'
  for k1, v1 of list
    output += '  case ' + k1 + ':\n'
    output += '    switch (octal[1]) {\n'
    for k2, v2 of v1
      output += '    case ' + k2 + ':\n'
      output += '      switch (octal[2]) {\n'
      for k3, v3 of v2
        output += '      case ' + k3 + ': /* ' + v3.char + ' */ return "' + v3.pinyin + '";\n'
      output += '      }\n'
    output += '    }\n'
  output += '  }\n'
  output += '  return null;\n'
  output += '}'
  output

task 'convert', 'romanize all Chinese characters to Cantonese Pinyin', ->
  all_hans = (String.fromCharCode(num) for num in [parseInt('4e00', 16)..parseInt('9fcb', 16)])
  all_hans = all_hans[0..1000].join('')
  get_cantonese_pinyin all_hans, (body) ->
    list = {}
    for entry in parse_body(body)
      oct = string_to_octal_array(entry[2])
      list[oct[0]] = {} unless list.hasOwnProperty(oct[0])
      list[oct[0]][oct[1]] = {} unless list[oct[0]].hasOwnProperty(oct[1])
      list[oct[0]][oct[1]][oct[2]] = { char: entry[2], pinyin: entry[1] }
    console.log make_java(list)
