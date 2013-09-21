package org.cghio.cantonese.romanization;

public class Hanzi2PinyinData2 {

  /**
   * Returns Cantonese Pinyin of a Chinese character.
   * @param octal integer array of the octal values of each byte of a Chinese character
   */
  public static String fromChar(int[] octal) {
    switch (octal[0]) {
    case 346:
      switch (octal[1]) {
      case 265:
        switch (octal[2]) {
        case 201: /* 流 */ return "lau";
        case 205: /* 浅 */ return "chin";
        case 206: /* 浆 */ return "jeung";
        case 207: /* 浇 */ return "hiu";
        case 212: /* 浊 */ return "juk";
        case 213: /* 测 */ return "chaak";
        case 216: /* 济 */ return "jai";
        case 221: /* 浑 */ return "wan";
        case 222: /* 浒 */ return "woo";
        case 223: /* 浓 */ return "nung";
        case 224: /* 浔 */ return "cham";
        case 231: /* 浙 */ return "jit";
        case 232: /* 浚 */ return "jun";
        case 246: /* 浦 */ return "po";
        case 251: /* 浩 */ return "ho";
        case 252: /* 浪 */ return "long";
        case 256: /* 浮 */ return "fau";
        case 264: /* 浴 */ return "yuk";
        case 267: /* 海 */ return "hoi";
        case 270: /* 浸 */ return "jam";
        }
      case 266:
        switch (octal[2]) {
        case 202: /* 涂 */ return "to";
        case 205: /* 涅 */ return "nip";
        case 210: /* 消 */ return "siu";
        case 211: /* 涉 */ return "sip";
        case 214: /* 涌 */ return "yung";
        case 216: /* 涎 */ return "yin";
        case 223: /* 涓 */ return "guen";
        case 225: /* 涕 */ return "tai";
        case 233: /* 涛 */ return "to";
        case 235: /* 涝 */ return "lo";
        case 237: /* 涟 */ return "lin";
        case 241: /* 涡 */ return "woh";
        case 243: /* 涣 */ return "woon";
        case 244: /* 涤 */ return "dik";
        case 246: /* 润 */ return "yun";
        case 247: /* 涧 */ return "gaan";
        case 250: /* 涨 */ return "jeung";
        case 251: /* 涩 */ return "sap";
        case 252: /* 涪 */ return "fau";
        case 257: /* 涯 */ return "ngaai";
        case 262: /* 液 */ return "yik";
        case 265: /* 涵 */ return "haam";
        case 270: /* 涸 */ return "kok";
        case 274: /* 涼 */ return "leung";
        }
      case 267:
        switch (octal[2]) {
        case 200: /* 淀 */ return "din";
        case 204: /* 淄 */ return "ji";
        case 206: /* 淆 */ return "ngaau";
        case 213: /* 淋 */ return "lam";
        case 214: /* 淌 */ return "tong";
        case 221: /* 淑 */ return "suk";
        case 222: /* 淒 */ return "chai";
        case 226: /* 淖 */ return "naau";
        case 230: /* 淘 */ return "to";
        case 232: /* 淚 */ return "lui";
        case 235: /* 淝 */ return "fei";
        case 241: /* 淡 */ return "daam";
        case 244: /* 淤 */ return "yue";
        case 250: /* 淨 */ return "jeng";
        case 252: /* 淪 */ return "lun";
        case 253: /* 淫 */ return "yam";
        case 254: /* 淬 */ return "sui";
        case 256: /* 淮 */ return "waai";
        case 261: /* 深 */ return "sam";
        case 263: /* 淳 */ return "sun";
        case 265: /* 淵 */ return "yuen";
        case 267: /* 混 */ return "wan";
        case 271: /* 淹 */ return "yim";
        case 273: /* 添 */ return "tim";
        case 274: /* 淼 */ return "miu";
        }
      case 270:
        switch (octal[2]) {
        case 205: /* 清 */ return "ching";
        case 212: /* 渊 */ return "yuen";
        case 215: /* 渍 */ return "jik";
        case 220: /* 渐 */ return "jim";
        case 224: /* 渔 */ return "yue";
        case 227: /* 渗 */ return "sam";
        case 231: /* 渙 */ return "woon";
        case 233: /* 減 */ return "gaam";
        case 235: /* 渝 */ return "yue";
        case 240: /* 渠 */ return "kui";
        case 241: /* 渡 */ return "do";
        case 243: /* 渣 */ return "ja";
        case 244: /* 渤 */ return "boot";
        case 245: /* 渥 */ return "uk";
        case 246: /* 渦 */ return "woh";
        case 251: /* 温 */ return "wan";
        case 254: /* 測 */ return "chaak";
        case 255: /* 渭 */ return "wai";
        case 257: /* 港 */ return "gong";
        case 264: /* 渴 */ return "hot";
        case 270: /* 游 */ return "yau";
        case 272: /* 渺 */ return "miu";
        case 276: /* 渾 */ return "wan";
        }
      case 271:
        switch (octal[2]) {
        case 203: /* 湃 */ return "baai";
        case 212: /* 湊 */ return "chau/chau#";
        case 215: /* 湍 */ return "chuen";
        case 226: /* 湖 */ return "woo";
        case 230: /* 湘 */ return "seung";
        case 233: /* 湛 */ return "jaam";
        case 247: /* 湧 */ return "yung";
        case 256: /* 湮 */ return "yin";
        case 257: /* 湯 */ return "tong";
        case 276: /* 湾 */ return "waan";
        case 277: /* 湿 */ return "sap";
        }
      case 272:
        switch (octal[2]) {
        case 203: /* 溃 */ return "kooi";
        case 205: /* 溅 */ return "chin/jin";
        case 211: /* 溉 */ return "koi";
        case 220: /* 源 */ return "yuen";
        case 226: /* 準 */ return "jun";
        case 234: /* 溜 */ return "lau";
        case 235: /* 溝 */ return "kau";
        case 242: /* 溢 */ return "yat";
        case 245: /* 溥 */ return "po";
        case 252: /* 溪 */ return "kai";
        case 253: /* 溫 */ return "wan";
        case 257: /* 溯 */ return "so/sue";
        case 266: /* 溶 */ return "yung";
        case 272: /* 溺 */ return "nik";
        }
      case 273:
        switch (octal[2]) {
        case 201: /* 滁 */ return "chui";
        case 202: /* 滂 */ return "pong";
        case 204: /* 滄 */ return "chong";
        case 205: /* 滅 */ return "mit";
        case 207: /* 滇 */ return "tin";
        case 213: /* 滋 */ return "ji";
        case 214: /* 滌 */ return "dik";
        case 221: /* 滑 */ return "waat";
        case 223: /* 滓 */ return "joi";
        case 224: /* 滔 */ return "to";
        case 225: /* 滕 */ return "tang";
        case 232: /* 滚 */ return "gwan";
        case 236: /* 滞 */ return "jai";
        case 241: /* 满 */ return "moon";
        case 244: /* 滤 */ return "lui";
        case 245: /* 滥 */ return "laam";
        case 246: /* 滦 */ return "luen";
        case 250: /* 滨 */ return "ban";
        case 251: /* 滩 */ return "taan";
        case 254: /* 滬 */ return "woo";
        case 257: /* 滯 */ return "jai";
        case 262: /* 滲 */ return "sam";
        case 264: /* 滴 */ return "dik";
        case 270: /* 滸 */ return "woo";
        case 276: /* 滾 */ return "gwan";
        case 277: /* 滿 */ return "moon";
        }
      case 274:
        switch (octal[2]) {
        case 201: /* 漁 */ return "yue";
        case 202: /* 漂 */ return "piu";
        case 206: /* 漆 */ return "chat";
        case 217: /* 漏 */ return "lau";
        case 223: /* 漓 */ return "lei";
        case 224: /* 演 */ return "yin";
        case 232: /* 漚 */ return "au";
        case 240: /* 漠 */ return "mok";
        case 242: /* 漢 */ return "hon";
        case 243: /* 漣 */ return "lin";
        case 252: /* 漪 */ return "yi";
        case 253: /* 漫 */ return "maan";
        case 254: /* 漬 */ return "jik";
        case 261: /* 漱 */ return "sau";
        case 262: /* 漲 */ return "jeung";
        case 263: /* 漳 */ return "jeung";
        case 270: /* 漸 */ return "jim";
        case 276: /* 漾 */ return "yeung";
        case 277: /* 漿 */ return "jeung/mei";
        }
      case 275:
        switch (octal[2]) {
        case 215: /* 潍 */ return "wai";
        case 221: /* 潑 */ return "poot";
        case 224: /* 潔 */ return "git";
        case 230: /* 潘 */ return "poon";
        case 233: /* 潛 */ return "chim";
        case 234: /* 潜 */ return "chim";
        case 236: /* 潞 */ return "lo";
        case 237: /* 潟 */ return "sik";
        case 244: /* 潤 */ return "yun";
        case 246: /* 潦 */ return "loh";
        case 255: /* 潭 */ return "taam";
        case 256: /* 潮 */ return "chiu";
        case 257: /* 潯 */ return "cham";
        case 260: /* 潰 */ return "kooi";
        case 272: /* 潺 */ return "saan";
        }
      case 276:
        switch (octal[2]) {
        case 200: /* 澀 */ return "sap";
        case 204: /* 澄 */ return "ching";
        case 206: /* 澆 */ return "hiu";
        case 207: /* 澇 */ return "lo";
        case 210: /* 澈 */ return "chit";
        case 216: /* 澎 */ return "paang";
        case 227: /* 澗 */ return "gaan";
        case 234: /* 澜 */ return "laan";
        case 241: /* 澡 */ return "cho";
        case 244: /* 澤 */ return "jaak";
        case 261: /* 澱 */ return "din";
        case 263: /* 澳 */ return "o";
        }
      case 277:
        switch (octal[2]) {
        case 200: /* 激 */ return "gik";
        case 201: /* 濁 */ return "juk";
        case 203: /* 濃 */ return "nung";
        case 222: /* 濒 */ return "pan";
        case 225: /* 濕 */ return "sap";
        case 230: /* 濘 */ return "ning";
        case 237: /* 濟 */ return "jai";
        case 244: /* 濤 */ return "to";
        case 253: /* 濫 */ return "laam";
        case 254: /* 濬 */ return "jun";
        case 260: /* 濰 */ return "wai";
        case 261: /* 濱 */ return "ban";
        case 272: /* 濺 */ return "chin/jin";
        case 276: /* 濾 */ return "lui";
        }
      }
    case 347:
      switch (octal[1]) {
      case 200:
        switch (octal[2]) {
        case 211: /* 瀉 */ return "se";
        case 221: /* 瀑 */ return "buk";
        case 225: /* 瀕 */ return "pan";
        case 232: /* 瀚 */ return "hon";
        case 233: /* 瀛 */ return "ying";
        case 235: /* 瀝 */ return "lik";
        case 250: /* 瀨 */ return "laai";
        case 276: /* 瀾 */ return "laan";
        }
      case 201:
        switch (octal[2]) {
        case 214: /* 灌 */ return "goon";
        case 230: /* 灘 */ return "taan";
        case 243: /* 灣 */ return "waan";
        case 244: /* 灤 */ return "luen";
        case 253: /* 火 */ return "foh";
        case 255: /* 灭 */ return "mit";
        case 257: /* 灯 */ return "dang";
        case 260: /* 灰 */ return "fooi";
        case 265: /* 灵 */ return "ling";
        case 266: /* 灶 */ return "jo";
        case 270: /* 灸 */ return "gau";
        case 274: /* 灼 */ return "cheuk";
        case 275: /* 災 */ return "joi";
        case 276: /* 灾 */ return "joi";
        case 277: /* 灿 */ return "chaan";
        }
      case 202:
        switch (octal[2]) {
        case 200: /* 炀 */ return "foh";
        case 205: /* 炅 */ return "yat";
        case 211: /* 炉 */ return "lo";
        case 212: /* 炊 */ return "chui";
        case 216: /* 炎 */ return "yim";
        case 222: /* 炒 */ return "chaau";
        case 224: /* 炔 */ return "kuet";
        case 225: /* 炕 */ return "kong";
        case 226: /* 炖 */ return "foh";
        case 231: /* 炙 */ return "jek";
        case 234: /* 炜 */ return "foh";
        case 235: /* 炝 */ return "foh";
        case 253: /* 炫 */ return "foh";
        case 254: /* 炬 */ return "gui";
        case 255: /* 炭 */ return "taan";
        case 256: /* 炮 */ return "paau";
        case 257: /* 炯 */ return "gwing";
        case 261: /* 炱 */ return "foh";
        case 263: /* 炳 */ return "bing";
        case 267: /* 炷 */ return "foh";
        case 270: /* 炸 */ return "ja";
        case 271: /* 点 */ return "dim";
        case 272: /* 為 */ return "wai";
        case 273: /* 炻 */ return "foh";
        case 274: /* 炼 */ return "lin";
        case 275: /* 炽 */ return "chi";
        }
      case 203:
        switch (octal[2]) {
        case 200: /* 烀 */ return "foh";
        case 201: /* 烁 */ return "lok";
        case 202: /* 烂 */ return "laan";
        case 203: /* 烃 */ return "ting";
        case 210: /* 烈 */ return "lit";
        case 212: /* 烊 */ return "foh";
        case 217: /* 烏 */ return "woo";
        case 230: /* 烘 */ return "hung";
        case 231: /* 烙 */ return "lok";
        case 233: /* 烛 */ return "juk";
        case 237: /* 烟 */ return "yin";
        case 244: /* 烤 */ return "haau";
        case 246: /* 烦 */ return "faan";
        case 247: /* 烧 */ return "siu";
        case 250: /* 烨 */ return "foh";
        case 251: /* 烩 */ return "kooi";
        case 253: /* 烫 */ return "tong";
        case 254: /* 烬 */ return "jun";
        case 255: /* 热 */ return "yit";
        case 257: /* 烯 */ return "hei";
        case 264: /* 烴 */ return "ting";
        case 267: /* 烷 */ return "yuen";
        case 271: /* 烹 */ return "paang";
        case 275: /* 烽 */ return "fung";
        }
      case 204:
        switch (octal[2]) {
        case 211: /* 焉 */ return "yin";
        case 212: /* 焊 */ return "hon";
        case 220: /* 焐 */ return "foh";
        case 223: /* 焓 */ return "foh";
        case 225: /* 焕 */ return "woon";
        case 226: /* 焖 */ return "foh";
        case 227: /* 焗 */ return "guk";
        case 230: /* 焘 */ return "to";
        case 231: /* 焙 */ return "booi";
        case 232: /* 焚 */ return "fan";
        case 241: /* 無 */ return "mo";
        case 246: /* 焦 */ return "jiu";
        case 257: /* 焯 */ return "foh";
        case 260: /* 焰 */ return "yim";
        case 261: /* 焱 */ return "foh";
        case 266: /* 然 */ return "yin";
        }
      case 205:
        switch (octal[2]) {
        case 205: /* 煅 */ return "foh";
        case 211: /* 煉 */ return "lin";
        case 212: /* 煊 */ return "foh";
        case 214: /* 煌 */ return "wong";
        case 216: /* 煎 */ return "jin";
        case 222: /* 煒 */ return "foh";
        case 231: /* 煙 */ return "yin";
        case 234: /* 煜 */ return "foh";
        case 236: /* 煞 */ return "saat";
        case 244: /* 煤 */ return "mooi";
        case 245: /* 煥 */ return "woon";
        case 246: /* 煦 */ return "hui";
        case 247: /* 照 */ return "jiu";
        case 250: /* 煨 */ return "foh";
        case 251: /* 煩 */ return "faan";
        case 254: /* 煬 */ return "foh";
        case 256: /* 煮 */ return "jue";
        case 262: /* 煲 */ return "bo";
        case 263: /* 煳 */ return "foh";
        case 270: /* 煸 */ return "foh";
        case 272: /* 煺 */ return "foh";
        case 275: /* 煽 */ return "sin";
        }
      case 206:
        switch (octal[2]) {
        case 204: /* 熄 */ return "sik";
        case 212: /* 熊 */ return "hung";
        case 217: /* 熏 */ return "fan";
        case 222: /* 熒 */ return "ying";
        case 224: /* 熔 */ return "yung";
        case 230: /* 熘 */ return "foh";
        case 231: /* 熙 */ return "hei";
        case 237: /* 熟 */ return "suk";
        case 240: /* 熠 */ return "foh";
        case 250: /* 熨 */ return "tong";
        case 254: /* 熬 */ return "ngo";
        case 261: /* 熱 */ return "yit";
        case 263: /* 熳 */ return "foh";
        case 265: /* 熵 */ return "seung";
        case 271: /* 熹 */ return "hei";
        case 276: /* 熾 */ return "chi";
        }
      case 207:
        switch (octal[2]) {
        case 201: /* 燁 */ return "foh";
        case 203: /* 燃 */ return "yin";
        case 204: /* 燄 */ return "yim";
        case 210: /* 燈 */ return "dang";
        case 211: /* 燉 */ return "foh";
        case 216: /* 燎 */ return "liu";
        case 222: /* 燒 */ return "siu";
        case 224: /* 燔 */ return "foh";
        case 225: /* 燕 */ return "yin";
        case 231: /* 燙 */ return "tong";
        case 234: /* 燜 */ return "foh";
        case 237: /* 營 */ return "ying";
        case 240: /* 燠 */ return "foh";
        case 245: /* 燥 */ return "cho";
        case 246: /* 燦 */ return "chaan";
        case 247: /* 燧 */ return "foh";
        case 255: /* 燭 */ return "juk";
        case 264: /* 燴 */ return "kooi";
        case 271: /* 燹 */ return "foh";
        case 274: /* 燼 */ return "jun";
        case 276: /* 燾 */ return "to";
        }
      case 210:
        switch (octal[2]) {
        case 206: /* 爆 */ return "baau";
        case 215: /* 爍 */ return "lok";
        case 220: /* 爐 */ return "lo";
        case 233: /* 爛 */ return "laan";
        case 235: /* 爝 */ return "foh";
        case 250: /* 爨 */ return "foh";
        case 252: /* 爪 */ return "jaau";
        case 254: /* 爬 */ return "pa";
        case 255: /* 爭 */ return "jaang";
        case 260: /* 爰 */ return "yuen";
        case 261: /* 爱 */ return "oi";
        case 265: /* 爵 */ return "jeuk";
        case 266: /* 父 */ return "foo";
        case 267: /* 爷 */ return "ye";
        case 270: /* 爸 */ return "ba";
        case 271: /* 爹 */ return "de";
        case 272: /* 爺 */ return "ye";
        case 273: /* 爻 */ return "ngaau";
        case 275: /* 爽 */ return "song";
        case 276: /* 爾 */ return "yi";
        case 277: /* 爿 */ return "baan/sam";
        }
      case 211:
        switch (octal[2]) {
        case 206: /* 牆 */ return "cheung";
        case 207: /* 片 */ return "pin";
        case 210: /* 版 */ return "baan";
        case 214: /* 牌 */ return "paai";
        case 215: /* 牍 */ return "duk";
        case 222: /* 牒 */ return "dip";
        case 226: /* 牖 */ return "yau";
        case 230: /* 牘 */ return "duk";
        case 231: /* 牙 */ return "nga";
        case 233: /* 牛 */ return "ngau";
        case 235: /* 牝 */ return "ngau";
        case 237: /* 牟 */ return "mau";
        case 241: /* 牡 */ return "maau";
        case 242: /* 牢 */ return "lo";
        case 246: /* 牦 */ return "ngau";
        case 247: /* 牧 */ return "muk";
        case 251: /* 物 */ return "mat";
        case 256: /* 牮 */ return "ngau";
        case 257: /* 牯 */ return "ngau";
        case 262: /* 牲 */ return "sang";
        case 265: /* 牵 */ return "hin";
        case 271: /* 特 */ return "dak";
        case 272: /* 牺 */ return "hei";
        case 275: /* 牽 */ return "hin";
        case 276: /* 牾 */ return "ngau";
        case 277: /* 牿 */ return "ngau";
        }
      case 212:
        switch (octal[2]) {
        case 200: /* 犀 */ return "sai";
        case 201: /* 犁 */ return "lai";
        case 204: /* 犄 */ return "ngau";
        case 212: /* 犊 */ return "duk";
        case 213: /* 犋 */ return "ngau";
        case 215: /* 犍 */ return "ngau";
        case 217: /* 犏 */ return "ngau";
        case 222: /* 犒 */ return "ngau";
        case 237: /* 犟 */ return "ngau";
        case 242: /* 犢 */ return "duk";
        case 247: /* 犧 */ return "hei";
        case 254: /* 犬 */ return "huen";
        case 257: /* 犯 */ return "faan";
        case 260: /* 犰 */ return "gau";
        case 264: /* 犴 */ return "gau";
        case 266: /* 状 */ return "jong";
        case 267: /* 犷 */ return "gau";
        case 270: /* 犸 */ return "gau";
        case 271: /* 犹 */ return "yau";
        }
      case 213:
        switch (octal[2]) {
        case 200: /* 狀 */ return "jong";
        case 201: /* 狁 */ return "gau";
        case 202: /* 狂 */ return "kong";
        case 203: /* 狃 */ return "gau";
        case 204: /* 狄 */ return "dik";
        case 210: /* 狈 */ return "booi";
        case 215: /* 狍 */ return "gau";
        case 216: /* 狎 */ return "gau";
        case 220: /* 狐 */ return "woo";
        case 222: /* 狒 */ return "gau";
        case 227: /* 狗 */ return "gau";
        case 231: /* 狙 */ return "jui";
        case 236: /* 狞 */ return "ning";
        case 240: /* 狠 */ return "han";
        case 241: /* 狡 */ return "gaau";
        case 250: /* 狨 */ return "gau";
        case 251: /* 狩 */ return "sau";
        case 254: /* 独 */ return "duk";
        case 255: /* 狭 */ return "haap";
        case 256: /* 狮 */ return "si";
        case 257: /* 狯 */ return "gau";
        case 260: /* 狰 */ return "jaang";
        case 261: /* 狱 */ return "yuk";
        case 262: /* 狲 */ return "gau";
        case 263: /* 狳 */ return "gau";
        case 264: /* 狴 */ return "gau";
        case 267: /* 狷 */ return "gau";
        case 270: /* 狸 */ return "lei";
        case 271: /* 狹 */ return "haap";
        case 272: /* 狺 */ return "gau";
        case 273: /* 狻 */ return "gau";
        case 274: /* 狼 */ return "long";
        case 275: /* 狽 */ return "booi";
        }
      case 214:
        switch (octal[2]) {
        case 201: /* 猁 */ return "gau";
        case 203: /* 猃 */ return "gau";
        case 212: /* 猊 */ return "gau";
        case 216: /* 猎 */ return "lip";
        case 223: /* 猓 */ return "gau";
        case 225: /* 猕 */ return "gau";
        case 226: /* 猖 */ return "cheung";
        case 227: /* 猗 */ return "gau";
        case 231: /* 猙 */ return "jaang";
        case 233: /* 猛 */ return "maang";
        case 234: /* 猜 */ return "chaai";
        case 235: /* 猝 */ return "gau";
        case 236: /* 猞 */ return "gau";
        case 241: /* 猡 */ return "gau";
        case 242: /* 猢 */ return "woo";
        case 245: /* 猥 */ return "gau";
        case 251: /* 猩 */ return "sing";
        case 252: /* 猪 */ return "jue";
        case 253: /* 猫 */ return "maau";
        case 254: /* 猬 */ return "gau";
        case 256: /* 献 */ return "hin";
        case 261: /* 猱 */ return "gau";
        case 264: /* 猴 */ return "hau";
        case 266: /* 猶 */ return "yau";
        case 267: /* 猷 */ return "yau";
        case 270: /* 猸 */ return "gau";
        case 271: /* 猹 */ return "gau";
        case 273: /* 猻 */ return "gau";
        case 276: /* 猾 */ return "waat";
        case 277: /* 猿 */ return "yuen";
        }
      case 215:
        switch (octal[2]) {
        case 204: /* 獄 */ return "yuk";
        case 205: /* 獅 */ return "si";
        case 215: /* 獍 */ return "gau";
        case 216: /* 獎 */ return "jeung";
        case 220: /* 獐 */ return "gau";
        case 222: /* 獒 */ return "muk";
        case 227: /* 獗 */ return "gau";
        case 240: /* 獠 */ return "gau";
        case 250: /* 獨 */ return "duk";
        case 252: /* 獪 */ return "gau";
        case 253: /* 獫 */ return "gau";
        case 254: /* 獬 */ return "gau";
        case 255: /* 獭 */ return "chaat";
        case 257: /* 獯 */ return "gau";
        case 260: /* 獰 */ return "ning";
        case 262: /* 獲 */ return "wok";
        case 265: /* 獵 */ return "lip";
        case 267: /* 獷 */ return "gau";
        case 270: /* 獸 */ return "sau";
        case 272: /* 獺 */ return "chaat";
        case 273: /* 獻 */ return "hin";
        case 274: /* 獼 */ return "gau";
        case 276: /* 獾 */ return "gau";
        }
      case 216:
        switch (octal[2]) {
        case 200: /* 玀 */ return "gau";
        case 204: /* 玄 */ return "yuen";
        case 207: /* 率 */ return "lut";
        case 211: /* 玉 */ return "yuk";
        case 213: /* 王 */ return "wong";
        case 216: /* 玎 */ return "wong";
        case 221: /* 玑 */ return "wong";
        case 226: /* 玖 */ return "gau";
        case 233: /* 玛 */ return "ma";
        case 237: /* 玟 */ return "wong";
        case 242: /* 玢 */ return "wong";
        case 250: /* 玨 */ return "gok";
        case 251: /* 玩 */ return "waan/woon";
        case 253: /* 玫 */ return "mooi";
        case 256: /* 玮 */ return "wong";
        case 257: /* 环 */ return "waan";
        case 260: /* 现 */ return "yin";
        case 262: /* 玲 */ return "ling";
        case 263: /* 玳 */ return "wong";
        case 267: /* 玷 */ return "wong";
        case 272: /* 玺 */ return "saai";
        case 273: /* 玻 */ return "boh";
        }
      case 217:
        switch (octal[2]) {
        case 200: /* 珀 */ return "paak";
        case 202: /* 珂 */ return "wong";
        case 210: /* 珈 */ return "wong";
        case 211: /* 珉 */ return "wong";
        case 212: /* 珊 */ return "saan";
        case 215: /* 珍 */ return "jan";
        case 217: /* 珏 */ return "gok";
        case 220: /* 珐 */ return "faat";
        case 221: /* 珑 */ return "lung";
        case 231: /* 珙 */ return "wong";
        case 236: /* 珞 */ return "wong";
        case 240: /* 珠 */ return "jue";
        case 245: /* 珥 */ return "wong";
        case 247: /* 珧 */ return "wong";
        case 251: /* 珩 */ return "wong";
        case 255: /* 班 */ return "baan";
        case 262: /* 珲 */ return "wong";
        case 276: /* 現 */ return "yin";
        }
      case 220:
        switch (octal[2]) {
        case 203: /* 球 */ return "kau";
        case 205: /* 琅 */ return "long";
        case 206: /* 理 */ return "lei";
        case 211: /* 琉 */ return "lau";
        case 212: /* 琊 */ return "wong";
        case 217: /* 琏 */ return "wong";
        case 220: /* 琐 */ return "soh";
        case 232: /* 琚 */ return "wong";
        case 233: /* 琛 */ return "wong";
        case 242: /* 琢 */ return "deuk";
        case 245: /* 琥 */ return "wong";
        case 246: /* 琦 */ return "wong";
        case 250: /* 琨 */ return "wong";
        case 252: /* 琪 */ return "kei";
        case 254: /* 琬 */ return "wong";
        case 256: /* 琮 */ return "wong";
        case 260: /* 琰 */ return "wong";
        case 263: /* 琳 */ return "lam";
        case 264: /* 琴 */ return "kam";
        case 265: /* 琵 */ return "pei";
        case 266: /* 琶 */ return "pa";
        case 272: /* 琺 */ return "faat";
        case 274: /* 琼 */ return "king";
        case 277: /* 琿 */ return "wong";
        }
      case 221:
        switch (octal[2]) {
        case 201: /* 瑁 */ return "wong";
        case 204: /* 瑄 */ return "suen";
        case 213: /* 瑋 */ return "wong";
        case 225: /* 瑕 */ return "ha";
        case 227: /* 瑗 */ return "wong";
        case 231: /* 瑙 */ return "wong";
        case 232: /* 瑚 */ return "woo";
        case 233: /* 瑛 */ return "wong";
        case 234: /* 瑜 */ return "wong";
        case 236: /* 瑞 */ return "sui";
        case 237: /* 瑟 */ return "sat";
        case 243: /* 瑣 */ return "soh";
        case 244: /* 瑤 */ return "yiu";
        case 251: /* 瑩 */ return "ying";
        case 252: /* 瑪 */ return "ma";
        case 255: /* 瑭 */ return "wong";
        case 260: /* 瑰 */ return "gwai";
        case 266: /* 瑶 */ return "yiu";
        case 267: /* 瑷 */ return "wong";
        case 276: /* 瑾 */ return "wong";
        }
      case 222:
        switch (octal[2]) {
        case 200: /* 璀 */ return "wong";
        case 201: /* 璁 */ return "wong";
        case 203: /* 璃 */ return "lei";
        case 207: /* 璇 */ return "suen/wong";
        case 211: /* 璉 */ return "wong";
        case 213: /* 璋 */ return "wong";
        case 216: /* 璎 */ return "wong";
        case 220: /* 璐 */ return "wong";
        case 234: /* 璜 */ return "wong";
        case 236: /* 璞 */ return "wong";
        case 243: /* 璣 */ return "wong";
        case 246: /* 璦 */ return "wong";
        case 247: /* 璧 */ return "bik";
        case 250: /* 璨 */ return "wong";
        case 251: /* 璩 */ return "wong";
        case 260: /* 環 */ return "waan";
        case 272: /* 璺 */ return "man";
        case 275: /* 璽 */ return "saai";
        }
      case 223:
        switch (octal[2]) {
        case 212: /* 瓊 */ return "king";
        case 217: /* 瓏 */ return "lung";
        case 222: /* 瓒 */ return "wong";
        case 224: /* 瓔 */ return "wong";
        case 232: /* 瓚 */ return "wong";
        case 234: /* 瓜 */ return "gwa";
        case 236: /* 瓞 */ return "dit";
        case 240: /* 瓠 */ return "woo";
        case 242: /* 瓢 */ return "piu";
        case 243: /* 瓣 */ return "faan";
        case 244: /* 瓤 */ return "nong";
        case 246: /* 瓦 */ return "nga";
        case 256: /* 瓮 */ return "ngung";
        case 257: /* 瓯 */ return "nga";
        case 264: /* 瓴 */ return "nga";
        case 266: /* 瓶 */ return "ping";
        case 267: /* 瓷 */ return "chi";
        case 277: /* 瓿 */ return "nga";
        }
      case 224:
        switch (octal[2]) {
        case 204: /* 甄 */ return "yan";
        case 214: /* 甌 */ return "nga";
        case 217: /* 甏 */ return "nga";
        case 221: /* 甑 */ return "nga";
        case 223: /* 甓 */ return "nga";
        case 225: /* 甕 */ return "ngung";
        case 230: /* 甘 */ return "gam";
        case 232: /* 甚 */ return "sam";
        case 234: /* 甜 */ return "tim";
        case 237: /* 生 */ return "saang/sang";
        case 242: /* 產 */ return "chaan";
        case 245: /* 甥 */ return "sang";
        case 250: /* 用 */ return "yung";
        case 251: /* 甩 */ return "lat";
        case 253: /* 甫 */ return "foo";
        case 254: /* 甬 */ return "yung";
        case 255: /* 甭 */ return "bung";
        case 260: /* 田 */ return "tin";
        case 261: /* 由 */ return "yau";
        case 262: /* 甲 */ return "gaap";
        case 263: /* 申 */ return "san";
        case 265: /* 电 */ return "din";
        case 267: /* 男 */ return "naam";
        case 270: /* 甸 */ return "din";
        case 272: /* 町 */ return "ting";
        case 273: /* 画 */ return "wa/waak";
        case 276: /* 甾 */ return "joi";
        }
      case 225:
        switch (octal[2]) {
        case 200: /* 畀 */ return "bei";
        case 205: /* 畅 */ return "cheung";
        case 210: /* 畈 */ return "faan";
        case 213: /* 畋 */ return "tin";
        case 214: /* 界 */ return "gaai";
        case 216: /* 畎 */ return "huen";
        case 217: /* 畏 */ return "wai";
        case 224: /* 畔 */ return "boon";
        case 231: /* 留 */ return "lau";
        case 233: /* 畛 */ return "chan";
        case 234: /* 畜 */ return "chuk";
        case 235: /* 畝 */ return "mau";
        case 242: /* 畢 */ return "bat";
        case 245: /* 略 */ return "leuk";
        case 246: /* 畦 */ return "wa";
        case 252: /* 番 */ return "faan";
        case 253: /* 畫 */ return "wa/waak";
        case 254: /* 畬 */ return "yue";
        case 260: /* 異 */ return "yi";
        case 262: /* 畲 */ return "yue";
        case 264: /* 畴 */ return "chau";
        case 266: /* 當 */ return "dong";
        case 270: /* 畸 */ return "kei";
        case 271: /* 畹 */ return "yuen";
        case 277: /* 畿 */ return "gei";
        }
      case 226:
        switch (octal[2]) {
        case 203: /* 疃 */ return "tun";
        case 206: /* 疆 */ return "geung";
        case 207: /* 疇 */ return "chau/chau$";
        case 212: /* 疊 */ return "dip";
        case 213: /* 疋 */ return "pat";
        case 217: /* 疏 */ return "soh";
        case 221: /* 疑 */ return "yi";
        case 224: /* 疔 */ return "deng";
        case 226: /* 疖 */ return "beng";
        case 227: /* 疗 */ return "liu";
        case 231: /* 疙 */ return "gat";
        case 232: /* 疚 */ return "gau";
        case 235: /* 疝 */ return "beng";
        case 237: /* 疟 */ return "yeuk";
        case 240: /* 疠 */ return "beng";
        case 241: /* 疡 */ return "yeung";
        case 243: /* 疣 */ return "beng";
        case 244: /* 疤 */ return "ba";
        case 245: /* 疥 */ return "gaai";
        case 253: /* 疫 */ return "yik";
        case 254: /* 疬 */ return "beng";
        case 256: /* 疮 */ return "chong";
        case 257: /* 疯 */ return "fung";
        case 260: /* 疰 */ return "beng";
        case 261: /* 疱 */ return "beng";
        case 262: /* 疲 */ return "pei";
        case 263: /* 疳 */ return "beng";
        case 264: /* 疴 */ return "oh";
        case 265: /* 疵 */ return "chi";
        case 270: /* 疸 */ return "beng";
        case 271: /* 疹 */ return "chan";
        case 274: /* 疼 */ return "tung";
        case 275: /* 疽 */ return "jui";
        case 276: /* 疾 */ return "jat";
        }
      case 227:
        switch (octal[2]) {
        case 202: /* 痂 */ return "beng";
        case 203: /* 痃 */ return "beng";
        case 204: /* 痄 */ return "beng";
        case 205: /* 病 */ return "beng";
        case 207: /* 症 */ return "jing";
        case 210: /* 痈 */ return "yung";
        case 211: /* 痉 */ return "ging";
        case 212: /* 痊 */ return "chuen";
        case 215: /* 痍 */ return "beng";
        case 222: /* 痒 */ return "yeung";
        case 224: /* 痔 */ return "ji";
        case 225: /* 痕 */ return "han";
        case 226: /* 痖 */ return "beng";
        case 230: /* 痘 */ return "dau";
        case 231: /* 痙 */ return "ging";
        case 233: /* 痛 */ return "tung";
        case 236: /* 痞 */ return "pei";
        case 244: /* 痤 */ return "beng";
        case 246: /* 痦 */ return "beng";
        case 247: /* 痧 */ return "beng";
        case 250: /* 痨 */ return "lo";
        case 252: /* 痪 */ return "woon";
        case 253: /* 痫 */ return "beng";
        case 260: /* 痰 */ return "taam";
        case 261: /* 痱 */ return "beng";
        case 264: /* 痴 */ return "chi";
        case 271: /* 痹 */ return "bei";
        case 272: /* 痺 */ return "bei";
        case 274: /* 痼 */ return "beng";
        case 276: /* 痾 */ return "oh";
        case 277: /* 痿 */ return "beng";
        }
      case 230:
        switch (octal[2]) {
        case 200: /* 瘀 */ return "yue";
        case 201: /* 瘁 */ return "sui";
        case 203: /* 瘃 */ return "beng";
        case 205: /* 瘅 */ return "beng";
        case 212: /* 瘊 */ return "beng";
        case 213: /* 瘋 */ return "fung";
        case 214: /* 瘌 */ return "laat";
        case 215: /* 瘍 */ return "yeung";
        case 220: /* 瘐 */ return "beng";
        case 223: /* 瘓 */ return "woon";
        case 225: /* 瘕 */ return "beng";
        case 227: /* 瘗 */ return "beng";
        case 230: /* 瘘 */ return "beng";
        case 231: /* 瘙 */ return "beng";
        case 233: /* 瘛 */ return "beng";
        case 236: /* 瘞 */ return "beng";
        case 237: /* 瘟 */ return "wan";
        case 240: /* 瘠 */ return "beng";
        case 241: /* 瘡 */ return "chong";
        case 242: /* 瘢 */ return "beng";
        case 244: /* 瘤 */ return "lau";
        case 245: /* 瘥 */ return "beng";
        case 246: /* 瘦 */ return "sau";
        case 247: /* 瘧 */ return "yeuk";
        case 251: /* 瘩 */ return "daap";
        case 252: /* 瘪 */ return "bit";
        case 253: /* 瘫 */ return "taan";
        case 255: /* 瘭 */ return "beng";
        case 260: /* 瘰 */ return "beng";
        case 263: /* 瘳 */ return "beng";
        case 264: /* 瘴 */ return "jeung";
        case 265: /* 瘵 */ return "beng";
        case 270: /* 瘸 */ return "ke";
        case 274: /* 瘼 */ return "beng";
        case 276: /* 瘾 */ return "beng";
        case 277: /* 瘿 */ return "beng";
        }
      case 231:
        switch (octal[2]) {
        case 200: /* 癀 */ return "beng";
        case 202: /* 療 */ return "liu";
        case 203: /* 癃 */ return "beng";
        case 206: /* 癆 */ return "lo";
        case 207: /* 癇 */ return "beng";
        case 211: /* 癉 */ return "beng";
        case 214: /* 癌 */ return "ngaam";
        case 215: /* 癍 */ return "beng";
        case 222: /* 癒 */ return "yue";
        case 224: /* 癔 */ return "beng";
        case 226: /* 癖 */ return "pik";
        case 230: /* 癘 */ return "beng";
        case 234: /* 癜 */ return "beng";
        case 236: /* 癞 */ return "beng";
        case 237: /* 癟 */ return "bit";
        case 243: /* 癣 */ return "sin";
        case 244: /* 癤 */ return "beng";
        case 251: /* 癩 */ return "beng";
        case 253: /* 癫 */ return "din";
        case 254: /* 癬 */ return "sin";
        case 255: /* 癭 */ return "beng";
        case 256: /* 癮 */ return "beng";
        case 257: /* 癯 */ return "beng";
        case 260: /* 癰 */ return "yung";
        case 261: /* 癱 */ return "taan";
        case 262: /* 癲 */ return "din";
        case 270: /* 癸 */ return "kwai";
        case 273: /* 登 */ return "dang";
        case 274: /* 發 */ return "faat";
        case 275: /* 白 */ return "baak";
        case 276: /* 百 */ return "baak";
        }
      case 232:
        switch (octal[2]) {
        case 202: /* 皂 */ return "jo";
        case 204: /* 的 */ return "dik";
        case 206: /* 皆 */ return "gaai";
        case 207: /* 皇 */ return "wong";
        case 210: /* 皈 */ return "gwai";
        case 213: /* 皋 */ return "go";
        case 216: /* 皎 */ return "gaau";
        case 221: /* 皑 */ return "oi";
        case 223: /* 皓 */ return "ho";
        case 226: /* 皖 */ return "woon";
        case 231: /* 皙 */ return "sik";
        case 232: /* 皚 */ return "oi";
        case 244: /* 皤 */ return "poh";
        case 256: /* 皮 */ return "pei";
        case 260: /* 皰 */ return "beng";
        case 261: /* 皱 */ return "jau";
        case 272: /* 皺 */ return "jau";
        case 277: /* 皿 */ return "ming";
        }
      case 233:
        switch (octal[2]) {
        case 202: /* 盂 */ return "yue";
        case 205: /* 盅 */ return "jung";
        case 206: /* 盆 */ return "poon";
        case 210: /* 盈 */ return "ying";
        case 212: /* 益 */ return "yik";
        case 216: /* 盎 */ return "ong";
        case 217: /* 盏 */ return "jaan";
        case 220: /* 盐 */ return "yim";
        case 221: /* 监 */ return "gaam";
        case 222: /* 盒 */ return "hap";
        case 224: /* 盔 */ return "kwai";
        case 226: /* 盖 */ return "koi";
        case 227: /* 盗 */ return "do";
        case 230: /* 盘 */ return "poon";
        case 233: /* 盛 */ return "sing";
        case 234: /* 盜 */ return "do";
        case 236: /* 盞 */ return "jaan";
        case 237: /* 盟 */ return "mang";
        case 241: /* 盡 */ return "jun";
        case 243: /* 監 */ return "gaam";
        case 244: /* 盤 */ return "poon";
        case 247: /* 盧 */ return "lo";
        case 252: /* 盪 */ return "dong";
        case 256: /* 目 */ return "muk";
        case 257: /* 盯 */ return "deng";
        case 261: /* 盱 */ return "muk";
        case 262: /* 盲 */ return "maang";
        case 264: /* 直 */ return "jik";
        case 270: /* 相 */ return "seung";
        case 271: /* 盹 */ return "muk";
        case 274: /* 盼 */ return "paan";
        case 276: /* 盾 */ return "tun";
        }
      case 234:
        switch (octal[2]) {
        case 201: /* 省 */ return "saang";
        case 204: /* 眄 */ return "muk";
        case 207: /* 眇 */ return "muk";
        case 210: /* 眈 */ return "muk";
        case 211: /* 眉 */ return "mei";
        case 213: /* 看 */ return "hon";
        case 215: /* 眍 */ return "muk";
        case 231: /* 眙 */ return "muk";
        case 232: /* 眚 */ return "muk";
        case 237: /* 真 */ return "jan";
        case 240: /* 眠 */ return "min";
        case 242: /* 眢 */ return "muk";
        case 245: /* 眥 */ return "muk";
        case 246: /* 眦 */ return "muk";
        case 250: /* 眨 */ return "jaap";
        case 251: /* 眩 */ return "yuen";
        case 255: /* 眭 */ return "muk";
        case 257: /* 眯 */ return "mai";
        case 265: /* 眵 */ return "muk";
        case 266: /* 眶 */ return "hong/kwaang";
        case 267: /* 眷 */ return "guen";
        case 270: /* 眸 */ return "mau";
        case 272: /* 眺 */ return "tiu";
        case 274: /* 眼 */ return "ngaan";
        case 276: /* 眾 */ return "jung";
        }
      case 235:
        switch (octal[2]) {
        case 200: /* 着 */ return "jeuk";
        case 201: /* 睁 */ return "jaang";
        case 203: /* 睃 */ return "muk";
        case 207: /* 睇 */ return "tai";
        case 220: /* 睐 */ return "loi";
        case 221: /* 睑 */ return "muk";
        case 232: /* 睚 */ return "muk";
        case 233: /* 睛 */ return "jing";
        case 234: /* 睜 */ return "jaang";
        case 236: /* 睞 */ return "loi";
        case 241: /* 睡 */ return "sui";
        case 242: /* 睢 */ return "muk";
        case 243: /* 督 */ return "duk";
        case 245: /* 睥 */ return "muk";
        case 246: /* 睦 */ return "muk";
        case 250: /* 睨 */ return "muk";
        case 252: /* 睪 */ return "go";
        case 253: /* 睫 */ return "jit";
        case 254: /* 睬 */ return "choi";
        case 271: /* 睹 */ return "do";
        case 275: /* 睽 */ return "muk";
        case 276: /* 睾 */ return "go";
        case 277: /* 睿 */ return "yui";
        }
      case 236:
        switch (octal[2]) {
        case 200: /* 瞀 */ return "muk";
        case 204: /* 瞄 */ return "miu";
        case 205: /* 瞅 */ return "chau/chau!";
        case 207: /* 瞇 */ return "mai";
        case 214: /* 瞌 */ return "koi";
        case 215: /* 瞍 */ return "muk";
        case 216: /* 瞎 */ return "hat";
        case 221: /* 瞑 */ return "muk";
        case 222: /* 瞒 */ return "moon";
        case 236: /* 瞞 */ return "moon";
        case 237: /* 瞟 */ return "muk";
        case 240: /* 瞠 */ return "muk";
        case 245: /* 瞥 */ return "pit";
        case 247: /* 瞧 */ return "chiu";
        case 251: /* 瞩 */ return "juk";
        case 252: /* 瞪 */ return "ching";
        case 254: /* 瞬 */ return "sun";
        case 260: /* 瞰 */ return "muk";
        case 263: /* 瞳 */ return "tung";
        case 265: /* 瞵 */ return "muk";
        case 273: /* 瞻 */ return "jim";
        case 274: /* 瞼 */ return "muk";
        case 275: /* 瞽 */ return "muk";
        case 277: /* 瞿 */ return "kui";
        }
      case 237:
        switch (octal[2]) {
        case 227: /* 矗 */ return "chuk";
        case 232: /* 矚 */ return "juk";
        case 233: /* 矛 */ return "maau";
        case 234: /* 矜 */ return "ging";
        case 242: /* 矢 */ return "chi";
        case 243: /* 矣 */ return "yi";
        case 245: /* 知 */ return "ji";
        case 247: /* 矧 */ return "chan";
        case 251: /* 矩 */ return "gui";
        case 253: /* 矫 */ return "giu";
        case 254: /* 矬 */ return "choh";
        case 255: /* 短 */ return "duen";
        case 256: /* 矮 */ return "ngai";
        case 257: /* 矯 */ return "giu";
        case 263: /* 石 */ return "sek";
        case 266: /* 矶 */ return "sek";
        case 270: /* 矸 */ return "sek";
        case 275: /* 矽 */ return "jik";
        case 276: /* 矾 */ return "faan";
        case 277: /* 矿 */ return "kong/kwong";
        }
      case 240:
        switch (octal[2]) {
        case 200: /* 砀 */ return "sek";
        case 201: /* 码 */ return "ma";
        case 202: /* 砂 */ return "sa";
        case 211: /* 砉 */ return "sek";
        case 214: /* 砌 */ return "chai";
        case 215: /* 砍 */ return "ham";
        case 221: /* 砑 */ return "sek";
        case 222: /* 砒 */ return "pei";
        case 224: /* 研 */ return "yin";
        case 226: /* 砖 */ return "juen";
        case 227: /* 砗 */ return "sek";
        case 230: /* 砘 */ return "sek";
        case 232: /* 砚 */ return "yin";
        case 234: /* 砜 */ return "sek";
        case 235: /* 砝 */ return "sek";
        case 237: /* 砟 */ return "sek";
        case 243: /* 砣 */ return "sek";
        case 245: /* 砥 */ return "sek";
        case 246: /* 砦 */ return "sek";
        case 247: /* 砧 */ return "jim";
        case 251: /* 砩 */ return "sek";
        case 254: /* 砬 */ return "sek";
        case 255: /* 砭 */ return "sek";
        case 260: /* 砰 */ return "ping";
        case 264: /* 破 */ return "poh";
        case 265: /* 砵 */ return "boot";
        case 267: /* 砷 */ return "san";
        case 270: /* 砸 */ return "saap";
        case 271: /* 砹 */ return "sek";
        case 272: /* 砺 */ return "sek";
        case 273: /* 砻 */ return "sek";
        case 274: /* 砼 */ return "sek";
        case 276: /* 砾 */ return "nik";
        }
      case 241:
        switch (octal[2]) {
        case 200: /* 础 */ return "choh";
        case 205: /* 硅 */ return "gwai";
        case 207: /* 硇 */ return "sek";
        case 214: /* 硌 */ return "sek";
        case 216: /* 硎 */ return "sek";
        case 220: /* 硐 */ return "sek";
        case 222: /* 硒 */ return "sai";
        case 225: /* 硕 */ return "sek";
        case 226: /* 硖 */ return "sek";
        case 227: /* 硗 */ return "sek";
        case 235: /* 硝 */ return "siu";
        case 244: /* 硤 */ return "sek";
        case 250: /* 硨 */ return "sek";
        case 252: /* 硪 */ return "sek";
        case 253: /* 硫 */ return "lau";
        case 254: /* 硬 */ return "ngaang";
        case 255: /* 硭 */ return "sek";
        case 256: /* 确 */ return "kok";
        case 257: /* 硯 */ return "yin";
        case 267: /* 硷 */ return "gaan";
        case 274: /* 硼 */ return "paang";
        }
      case 242:
        switch (octal[2]) {
        case 207: /* 碇 */ return "sek";
        case 211: /* 碉 */ return "diu";
        case 214: /* 碌 */ return "luk";
        case 215: /* 碍 */ return "ngoi";
        case 216: /* 碎 */ return "sui";
        case 221: /* 碑 */ return "bei";
        case 223: /* 碓 */ return "sek";
        case 227: /* 碗 */ return "woon";
        case 230: /* 碘 */ return "din";
        case 232: /* 碚 */ return "sek";
        case 233: /* 碛 */ return "sek";
        case 234: /* 碜 */ return "sek";
        case 237: /* 碟 */ return "dip";
        case 241: /* 碡 */ return "sek";
        case 243: /* 碣 */ return "sek";
        case 245: /* 碥 */ return "sek";
        case 247: /* 碧 */ return "bik";
        case 251: /* 碩 */ return "sek";
        case 255: /* 碭 */ return "sek";
        case 260: /* 碰 */ return "pung";
        case 261: /* 碱 */ return "gaan";
        case 262: /* 碲 */ return "sek";
        case 263: /* 碳 */ return "taan";
        case 264: /* 碴 */ return "ja";
        case 271: /* 碹 */ return "sek";
        case 272: /* 確 */ return "kok";
        case 274: /* 碼 */ return "ma";
        case 276: /* 碾 */ return "jin";
        }
      case 243:
        switch (octal[2]) {
        case 201: /* 磁 */ return "chi";
        case 205: /* 磅 */ return "bong";
        case 211: /* 磉 */ return "sek";
        case 212: /* 磊 */ return "lui";
        case 213: /* 磋 */ return "choh";
        case 220: /* 磐 */ return "poon";
        case 224: /* 磔 */ return "sek";
        case 225: /* 磕 */ return "koi";
        case 231: /* 磙 */ return "sek";
        case 232: /* 磚 */ return "juen";
        case 243: /* 磣 */ return "sek";
        case 247: /* 磧 */ return "sek";
        case 250: /* 磨 */ return "moh";
        case 254: /* 磬 */ return "sek";
        case 257: /* 磯 */ return "sek";
        case 262: /* 磲 */ return "sek";
        case 264: /* 磴 */ return "sek";
        case 267: /* 磷 */ return "lun";
        case 272: /* 磺 */ return "wong";
        case 275: /* 磽 */ return "sek";
        }
      case 244:
        switch (octal[2]) {
        case 201: /* 礁 */ return "chiu";
        case 205: /* 礅 */ return "sek";
        case 216: /* 礎 */ return "choh";
        case 223: /* 礓 */ return "sek";
        case 231: /* 礙 */ return "ngoi";
        case 236: /* 礞 */ return "sek";
        case 241: /* 礡 */ return "sek";
        case 244: /* 礤 */ return "sek";
        case 246: /* 礦 */ return "kong/kwong";
        case 252: /* 礪 */ return "sek";
        case 253: /* 礫 */ return "nik";
        case 254: /* 礬 */ return "faan";
        case 261: /* 礱 */ return "sek";
        case 264: /* 礴 */ return "sek";
        case 272: /* 示 */ return "si";
        case 274: /* 礼 */ return "lai";
        case 276: /* 社 */ return "se";
        }
      case 245:
        switch (octal[2]) {
        case 200: /* 祀 */ return "ji";
        case 201: /* 祁 */ return "kei";
        case 206: /* 祆 */ return "hin";
        case 210: /* 祈 */ return "kei";
        case 211: /* 祉 */ return "ji";
        case 223: /* 祓 */ return "fat";
        case 226: /* 祖 */ return "jo";
        case 227: /* 祗 */ return "ji";
        case 232: /* 祚 */ return "jo";
        case 233: /* 祛 */ return "kui";
        case 234: /* 祜 */ return "woo";
        case 235: /* 祝 */ return "juk";
        case 236: /* 神 */ return "san";
        case 237: /* 祟 */ return "sui";
        case 240: /* 祠 */ return "chi";
        case 242: /* 祢 */ return "nei";
        case 245: /* 祥 */ return "cheung";
        case 247: /* 祧 */ return "tiu";
        case 250: /* 票 */ return "piu";
        case 255: /* 祭 */ return "jai";
        case 257: /* 祯 */ return "jing";
        case 267: /* 祷 */ return "to";
        case 270: /* 祸 */ return "woh";
        case 272: /* 祺 */ return "kei";
        case 277: /* 祿 */ return "luk";
        }
      case 246:
        switch (octal[2]) {
        case 200: /* 禀 */ return "ban";
        case 201: /* 禁 */ return "gam";
        case 204: /* 禄 */ return "luk";
        case 205: /* 禅 */ return "sim";
        case 212: /* 禊 */ return "hai";
        case 215: /* 禍 */ return "woh";
        case 216: /* 禎 */ return "jing";
        case 217: /* 福 */ return "fuk";
        case 232: /* 禚 */ return "jeuk";
        case 247: /* 禧 */ return "hei";
        case 252: /* 禪 */ return "sim";
        case 256: /* 禮 */ return "lai";
        case 261: /* 禱 */ return "to";
        case 263: /* 禳 */ return "yeung";
        case 271: /* 禹 */ return "yue";
        case 272: /* 禺 */ return "yue";
        case 273: /* 离 */ return "lei";
        case 275: /* 禽 */ return "hap/kam";
        case 276: /* 禾 */ return "woh";
        case 277: /* 禿 */ return "tuk";
        }
      case 247:
        switch (octal[2]) {
        case 200: /* 秀 */ return "sau";
        case 201: /* 私 */ return "si";
        case 203: /* 秃 */ return "tuk";
        case 206: /* 秆 */ return "gon";
        case 210: /* 秈 */ return "sin";
        case 211: /* 秉 */ return "bing";
        case 213: /* 秋 */ return "chau/chau!";
        case 215: /* 种 */ return "jung";
        case 221: /* 科 */ return "foh";
        case 222: /* 秒 */ return "miu";
        case 225: /* 秕 */ return "woh";
        case 230: /* 秘 */ return "bei";
        case 237: /* 租 */ return "jo";
        case 243: /* 秣 */ return "woh";
        case 244: /* 秤 */ return "ching";
        case 246: /* 秦 */ return "chun";
        case 247: /* 秧 */ return "yeung";
        case 251: /* 秩 */ return "dit";
        case 253: /* 秫 */ return "woh";
        case 255: /* 秭 */ return "woh";
        case 257: /* 积 */ return "jik";
        case 260: /* 称 */ return "ching";
        case 270: /* 秸 */ return "gaai";
        case 273: /* 移 */ return "yi";
        case 275: /* 秽 */ return "wai";
        }
      case 250:
        switch (octal[2]) {
        case 202: /* 稂 */ return "woh";
        case 203: /* 稃 */ return "woh";
        case 205: /* 稅 */ return "sui";
        case 206: /* 稆 */ return "woh";
        case 210: /* 稈 */ return "gon";
        case 213: /* 程 */ return "ching";
        case 215: /* 稍 */ return "saau";
        case 216: /* 税 */ return "sui";
        case 224: /* 稔 */ return "woh";
        case 227: /* 稗 */ return "baai";
        case 232: /* 稚 */ return "ji";
        case 236: /* 稞 */ return "woh";
        case 237: /* 稟 */ return "ban";
        case 240: /* 稠 */ return "chau/chau$";
        case 243: /* 稣 */ return "so";
        case 256: /* 種 */ return "jung";
        case 261: /* 稱 */ return "ching";
        case 263: /* 稳 */ return "wan";
        case 267: /* 稷 */ return "woh";
        case 271: /* 稹 */ return "woh";
        case 273: /* 稻 */ return "do";
        case 274: /* 稼 */ return "ga";
        case 275: /* 稽 */ return "kai";
        case 277: /* 稿 */ return "go";
        }
      case 251:
        switch (octal[2]) {
        case 206: /* 穆 */ return "muk";
        case 214: /* 穌 */ return "so";
        case 215: /* 積 */ return "jik";
        case 216: /* 穎 */ return "wing";
        case 221: /* 穑 */ return "woh";
        case 227: /* 穗 */ return "sui";
        case 241: /* 穡 */ return "woh";
        case 242: /* 穢 */ return "wai";
        case 251: /* 穩 */ return "wan";
        case 260: /* 穰 */ return "yeung";
        case 264: /* 穴 */ return "yuet";
        case 266: /* 究 */ return "gau";
        case 267: /* 穷 */ return "kung";
        case 270: /* 穸 */ return "jik";
        case 271: /* 穹 */ return "kung";
        case 272: /* 空 */ return "hung";
        case 277: /* 穿 */ return "chuen";
        }
      case 252:
        switch (octal[2]) {
        case 200: /* 窀 */ return "jun";
        case 201: /* 突 */ return "dat";
        case 203: /* 窃 */ return "sit";
        case 204: /* 窄 */ return "jaak";
        case 206: /* 窆 */ return "bin";
        case 210: /* 窈 */ return "miu";
        case 215: /* 窍 */ return "hiu";
        case 221: /* 窑 */ return "go";
        case 222: /* 窒 */ return "jat";
        case 225: /* 窕 */ return "tiu";
        case 226: /* 窖 */ return "gaau";
        case 227: /* 窗 */ return "cheung";
        case 230: /* 窘 */ return "kwan";
        case 234: /* 窜 */ return "chuen";
        case 235: /* 窝 */ return "woh";
        case 237: /* 窟 */ return "gwat";
        case 240: /* 窠 */ return "woh";
        case 245: /* 窥 */ return "kwai";
        case 246: /* 窦 */ return "dau";
        case 250: /* 窨 */ return "yam";
        case 251: /* 窩 */ return "woh";
        case 252: /* 窪 */ return "ding/wa";
        case 254: /* 窬 */ return "yue";
        case 255: /* 窭 */ return "gui";
        case 256: /* 窮 */ return "kung";
        case 257: /* 窯 */ return "go";
        case 263: /* 窳 */ return "yue";
        case 266: /* 窶 */ return "gui";
        case 272: /* 窺 */ return "kwai";
        case 277: /* 窿 */ return "lung";
        }
      case 253:
        switch (octal[2]) {
        case 204: /* 竄 */ return "chuen";
        case 205: /* 竅 */ return "hiu";
        case 207: /* 竇 */ return "dau";
        case 212: /* 竊 */ return "sit";
        case 213: /* 立 */ return "lap";
        case 226: /* 竖 */ return "sue";
        case 231: /* 站 */ return "jaam";
        case 236: /* 竞 */ return "ging";
        case 237: /* 竟 */ return "ging";
        case 240: /* 章 */ return "jeung";
        case 243: /* 竣 */ return "jun";
        case 245: /* 童 */ return "tung";
        case 246: /* 竦 */ return "sung";
        case 255: /* 竭 */ return "kit";
        case 257: /* 端 */ return "duen";
        case 266: /* 競 */ return "ging";
        case 271: /* 竹 */ return "juk";
        case 272: /* 竺 */ return "juk";
        case 275: /* 竽 */ return "yue";
        case 277: /* 竿 */ return "gon";
        }
      case 254:
        switch (octal[2]) {
        case 203: /* 笃 */ return "duk";
        case 204: /* 笄 */ return "jukfa";
        case 206: /* 笆 */ return "ba";
        case 210: /* 笈 */ return "kap";
        case 212: /* 笊 */ return "jukfa";
        case 213: /* 笋 */ return "sun";
        case 217: /* 笏 */ return "jukfa";
        case 221: /* 笑 */ return "siu";
        case 224: /* 笔 */ return "bat";
        case 225: /* 笕 */ return "jukfa";
        case 231: /* 笙 */ return "jukfa";
        case 233: /* 笛 */ return "dek";
        case 236: /* 笞 */ return "jukfa";
        case 240: /* 笠 */ return "lap";
        case 244: /* 笤 */ return "jukfa";
        case 245: /* 笥 */ return "jukfa";
        case 246: /* 符 */ return "foo";
        case 250: /* 笨 */ return "ban";
        case 252: /* 笪 */ return "daat";
        case 253: /* 笫 */ return "jukfa";
        case 254: /* 第 */ return "dai";
        case 256: /* 笮 */ return "jukfa";
        case 261: /* 笱 */ return "jukfa";
        case 263: /* 笳 */ return "jukfa";
        case 270: /* 笸 */ return "jukfa";
        case 272: /* 笺 */ return "jin";
        case 274: /* 笼 */ return "lung";
        case 276: /* 笾 */ return "jukfa";
        }
      case 255:
        switch (octal[2]) {
        case 205: /* 筅 */ return "jukfa";
        case 206: /* 筆 */ return "bat";
        case 207: /* 筇 */ return "jukfa";
        case 211: /* 等 */ return "dang";
        case 213: /* 筋 */ return "gan";
        case 214: /* 筌 */ return "jukfa";
        case 215: /* 筍 */ return "sun";
        case 217: /* 筏 */ return "fat";
        case 220: /* 筐 */ return "hong/kwaang";
        case 221: /* 筑 */ return "juk";
        case 222: /* 筒 */ return "tung";
        case 224: /* 答 */ return "daap";
        case 226: /* 策 */ return "chaak";
        case 230: /* 筘 */ return "jukfa";
        case 232: /* 筚 */ return "jukfa";
        case 233: /* 筛 */ return "sai";
        case 235: /* 筝 */ return "chung/jang";
        case 240: /* 筠 */ return "gwan";
        case 242: /* 筢 */ return "jukfa";
        case 247: /* 筧 */ return "jukfa";
        case 256: /* 筮 */ return "jukfa";
        case 261: /* 筱 */ return "jukfa";
        case 262: /* 筲 */ return "jukfa";
        case 265: /* 筵 */ return "yin";
        case 267: /* 筷 */ return "faai";
        case 271: /* 筹 */ return "chau";
        case 273: /* 筻 */ return "jukfa";
        case 276: /* 签 */ return "chim";
        }
      case 256:
        switch (octal[2]) {
        case 200: /* 简 */ return "gaan";
        case 205: /* 箅 */ return "jukfa";
        case 213: /* 箋 */ return "jin";
        case 215: /* 箍 */ return "koo";
        case 217: /* 箏 */ return "chung/jang";
        case 220: /* 箐 */ return "jukfa";
        case 224: /* 箔 */ return "bok";
        case 225: /* 箕 */ return "gei";
        case 227: /* 算 */ return "suen";
        case 234: /* 箜 */ return "jukfa";
        case 235: /* 箝 */ return "jukfa";
        case 241: /* 管 */ return "goon";
        case 242: /* 箢 */ return "jukfa";
        case 246: /* 箦 */ return "jukfa";
        case 247: /* 箧 */ return "jukfa";
        case 250: /* 箨 */ return "jukfa";
        case 251: /* 箩 */ return "loh";
        case 252: /* 箪 */ return "jukfa";
        case 253: /* 箫 */ return "siu";
        case 254: /* 箬 */ return "jukfa";
        case 255: /* 箭 */ return "jin";
        case 261: /* 箱 */ return "seung";
        case 264: /* 箴 */ return "jukfa";
        case 270: /* 箸 */ return "jukfa";
        }
      case 257:
        switch (octal[2]) {
        case 200: /* 節 */ return "jit";
        case 201: /* 篁 */ return "jukfa";
        case 204: /* 範 */ return "faan";
        case 206: /* 篆 */ return "suen";
        case 207: /* 篇 */ return "pin";
        case 211: /* 築 */ return "juk";
        case 213: /* 篋 */ return "jukfa";
        case 214: /* 篌 */ return "jukfa";
        case 221: /* 篑 */ return "jukfa";
        case 223: /* 篓 */ return "lau";
        case 231: /* 篙 */ return "go";
        case 232: /* 篚 */ return "jukfa";
        case 235: /* 篝 */ return "jukfa";
        case 241: /* 篡 */ return "saan";
        case 244: /* 篤 */ return "duk";
        case 245: /* 篥 */ return "jukfa";
        case 246: /* 篦 */ return "jukfa";
        case 251: /* 篩 */ return "sai";
        case 252: /* 篪 */ return "jukfa";
        case 256: /* 篮 */ return "laam";
        case 261: /* 篱 */ return "lei";
        case 263: /* 篳 */ return "jukfa";
        case 267: /* 篷 */ return "pung";
        case 274: /* 篼 */ return "jukfa";
        case 276: /* 篾 */ return "mit";
        }
      case 260:
        switch (octal[2]) {
        case 200: /* 簀 */ return "jukfa";
        case 207: /* 簇 */ return "juk";
        case 213: /* 簋 */ return "jukfa";
        case 214: /* 簌 */ return "jukfa";
        case 215: /* 簍 */ return "lau";
        case 217: /* 簏 */ return "jukfa";
        case 226: /* 簖 */ return "jukfa";
        case 236: /* 簞 */ return "jukfa";
        case 237: /* 簟 */ return "jukfa";
        case 241: /* 簡 */ return "gaan";
        case 243: /* 簣 */ return "jukfa";
        case 246: /* 簦 */ return "jukfa";
        case 247: /* 簧 */ return "wong";
        case 252: /* 簪 */ return "jukfa";
        case 253: /* 簫 */ return "siu";
        case 270: /* 簸 */ return "jukfa";
        case 275: /* 簽 */ return "chim";
        case 277: /* 簿 */ return "bo";
        }
      case 261:
        switch (octal[2]) {
        case 200: /* 籀 */ return "jukfa";
        case 201: /* 籁 */ return "jukfa";
        case 203: /* 籃 */ return "laam";
        case 214: /* 籌 */ return "chau/chau@";
        case 215: /* 籍 */ return "jik";
        case 220: /* 籐 */ return "tang";
        case 234: /* 籜 */ return "jukfa";
        case 237: /* 籟 */ return "jukfa";
        case 240: /* 籠 */ return "lung";
        case 251: /* 籩 */ return "jukfa";
        case 252: /* 籪 */ return "jukfa";
        case 254: /* 籬 */ return "lei";
        case 256: /* 籮 */ return "loh";
        case 263: /* 米 */ return "mai";
        case 264: /* 籴 */ return "dek";
        case 273: /* 类 */ return "lui";
        case 274: /* 籼 */ return "sin";
        case 275: /* 籽 */ return "ji";
        }
      case 262:
        switch (octal[2]) {
        case 211: /* 粉 */ return "fan";
        case 221: /* 粑 */ return "ba";
        case 222: /* 粒 */ return "lap";
        case 225: /* 粕 */ return "paak";
        case 227: /* 粗 */ return "cho";
        case 230: /* 粘 */ return "jim";
        case 234: /* 粜 */ return "tiu";
        case 235: /* 粝 */ return "lai";
        case 236: /* 粞 */ return "sai";
        case 237: /* 粟 */ return "suk";
        case 242: /* 粢 */ return "ji";
        case 244: /* 粤 */ return "yuet";
        case 245: /* 粥 */ return "juk";
        case 252: /* 粪 */ return "fan";
        case 256: /* 粮 */ return "leung";
        case 261: /* 粱 */ return "leung";
        case 262: /* 粲 */ return "chaan";
        case 263: /* 粳 */ return "gang";
        case 265: /* 粵 */ return "yuet";
        case 271: /* 粹 */ return "sui";
        case 275: /* 粽 */ return "jung";
        case 276: /* 精 */ return "jing";
        }
      case 263:
        switch (octal[2]) {
        case 205: /* 糅 */ return "nau";
        case 207: /* 糇 */ return "hau";
        case 212: /* 糊 */ return "woo";
        case 214: /* 糌 */ return "jaam";
        case 215: /* 糍 */ return "chi";
        case 225: /* 糕 */ return "go";
        case 226: /* 糖 */ return "tong";
        case 227: /* 糗 */ return "chau";
        case 231: /* 糙 */ return "cho";
        case 234: /* 糜 */ return "mei";
        case 236: /* 糞 */ return "fan";
        case 237: /* 糟 */ return "jo";
        case 240: /* 糠 */ return "hong";
        case 247: /* 糧 */ return "leung";
        case 250: /* 糨 */ return "geung";
        case 257: /* 糯 */ return "noh";
        case 264: /* 糴 */ return "dek";
        case 273: /* 系 */ return "hai";
        case 276: /* 糾 */ return "dau";
        }
      case 264:
        switch (octal[2]) {
        case 200: /* 紀 */ return "gei";
        case 202: /* 紂 */ return "jau";
        case 204: /* 約 */ return "yeuk";
        case 205: /* 紅 */ return "hung";
        case 206: /* 紆 */ return "si";
        case 207: /* 紇 */ return "si";
        case 210: /* 紈 */ return "si";
        case 211: /* 紉 */ return "yan";
        case 212: /* 紊 */ return "man";
        case 213: /* 紋 */ return "man";
        case 215: /* 納 */ return "naap";
        case 220: /* 紐 */ return "nau";
        case 223: /* 紓 */ return "si";
        case 224: /* 純 */ return "sun";
        case 225: /* 紕 */ return "si";
        case 227: /* 紗 */ return "sa";
        case 231: /* 紙 */ return "ji";
        case 232: /* 級 */ return "kap";
        case 233: /* 紛 */ return "fan";
        case 240: /* 素 */ return "so";
        case 241: /* 紡 */ return "fong";
        case 242: /* 索 */ return "sok";
        case 247: /* 紧 */ return "gan";
        case 253: /* 紫 */ return "ji";
        case 256: /* 紮 */ return "jaat";
        case 257: /* 累 */ return "lui";
        case 260: /* 細 */ return "sai";
        case 261: /* 紱 */ return "si";
        case 262: /* 紲 */ return "si";
        case 263: /* 紳 */ return "san";
        case 271: /* 紹 */ return "siu";
        case 272: /* 紺 */ return "si";
        case 274: /* 紼 */ return "si";
        }
      case 265:
        switch (octal[2]) {
        case 200: /* 絀 */ return "si";
        case 202: /* 終 */ return "jung";
        case 204: /* 組 */ return "jo";
        case 206: /* 絆 */ return "boon";
        case 216: /* 絎 */ return "si";
        case 220: /* 結 */ return "git";
        case 225: /* 絕 */ return "juet";
        case 233: /* 絛 */ return "to";
        case 236: /* 絞 */ return "gaau";
        case 241: /* 絡 */ return "lok";
        case 242: /* 絢 */ return "huen";
        case 246: /* 給 */ return "kap";
        case 250: /* 絨 */ return "yung";
        case 256: /* 絮 */ return "sui";
        case 261: /* 統 */ return "tung";
        case 262: /* 絲 */ return "si";
        case 263: /* 絳 */ return "si";
        case 271: /* 絹 */ return "guen";
        }
      case 266:
        switch (octal[2]) {
        case 201: /* 綁 */ return "bong";
        case 203: /* 綃 */ return "si";
        case 206: /* 綆 */ return "si";
        case 210: /* 綈 */ return "si";
        case 217: /* 綏 */ return "sui";
        case 223: /* 經 */ return "ging";
        case 234: /* 綜 */ return "jung";
        case 236: /* 綞 */ return "si";
        case 240: /* 綠 */ return "luk";
        case 242: /* 綢 */ return "chau";
        case 243: /* 綣 */ return "si";
        case 254: /* 綬 */ return "si";
        case 255: /* 維 */ return "wai";
        case 260: /* 綰 */ return "si";
        case 261: /* 綱 */ return "gong";
        case 264: /* 綴 */ return "chuet/juet";
        case 270: /* 綸 */ return "lun";
        case 271: /* 綹 */ return "si";
        case 272: /* 綺 */ return "yi";
        case 273: /* 綻 */ return "jaan";
        case 275: /* 綽 */ return "cheuk";
        case 276: /* 綾 */ return "si";
        case 277: /* 綿 */ return "min";
        }
      case 267:
        switch (octal[2]) {
        case 204: /* 緄 */ return "si";
        case 207: /* 緇 */ return "si";
        case 212: /* 緊 */ return "gan";
        case 213: /* 緋 */ return "si";
        case 222: /* 緒 */ return "sui";
        case 227: /* 緗 */ return "si";
        case 230: /* 緘 */ return "gam";
        case 231: /* 緙 */ return "si";
        case 232: /* 線 */ return "sin";
        case 235: /* 緝 */ return "chap";
        case 236: /* 緞 */ return "duen";
        case 240: /* 締 */ return "tai";
        case 241: /* 緡 */ return "si";
        case 243: /* 緣 */ return "yuen";
        case 246: /* 緦 */ return "si";
        case 250: /* 編 */ return "pin";
        case 251: /* 緩 */ return "woon";
        case 254: /* 緬 */ return "min";
        case 257: /* 緯 */ return "wai";
        case 261: /* 緱 */ return "si";
        case 262: /* 緲 */ return "si";
        case 264: /* 練 */ return "lin";
        case 266: /* 緶 */ return "si";
        case 271: /* 緹 */ return "si";
        }
      case 270:
        switch (octal[2]) {
        case 211: /* 縉 */ return "si";
        case 212: /* 縊 */ return "si";
        case 213: /* 縋 */ return "si";
        case 220: /* 縐 */ return "si";
        case 221: /* 縑 */ return "si";
        case 233: /* 縛 */ return "bok";
        case 235: /* 縝 */ return "si";
        case 236: /* 縞 */ return "si";
        case 237: /* 縟 */ return "si";
        case 243: /* 縣 */ return "yuen";
        case 253: /* 縫 */ return "fung";
        case 255: /* 縭 */ return "si";
        case 256: /* 縮 */ return "suk";
        case 261: /* 縱 */ return "jue/jung";
        case 262: /* 縲 */ return "si";
        case 265: /* 縵 */ return "si";
        case 267: /* 縷 */ return "lui";
        case 271: /* 縹 */ return "si";
        case 273: /* 縻 */ return "mei";
        case 275: /* 總 */ return "jung";
        case 276: /* 績 */ return "jik";
        }
      case 271:
        switch (octal[2]) {
        case 201: /* 繁 */ return "faan";
        case 203: /* 繃 */ return "baang";
        case 205: /* 繅 */ return "si";
        case 206: /* 繆 */ return "si";
        case 222: /* 繒 */ return "si";
        case 224: /* 織 */ return "jik";
        case 225: /* 繕 */ return "sin";
        case 232: /* 繚 */ return "si";
        case 236: /* 繞 */ return "yiu";
        case 241: /* 繡 */ return "sau";
        case 242: /* 繢 */ return "si";
        case 251: /* 繩 */ return "sing";
        case 252: /* 繪 */ return "kooi";
        case 253: /* 繫 */ return "hai";
        case 255: /* 繭 */ return "gaan";
        case 257: /* 繯 */ return "si";
        case 260: /* 繰 */ return "si";
        case 263: /* 繳 */ return "giu";
        case 271: /* 繹 */ return "yik";
        case 274: /* 繼 */ return "gai";
        case 275: /* 繽 */ return "si";
        case 276: /* 繾 */ return "si";
        }
      case 272:
        switch (octal[2]) {
        case 202: /* 纂 */ return "jaan";
        case 210: /* 纈 */ return "si";
        case 212: /* 纊 */ return "si";
        case 214: /* 續 */ return "juk";
        case 217: /* 纏 */ return "chin";
        case 223: /* 纓 */ return "ying";
        case 226: /* 纖 */ return "chin/hin";
        case 230: /* 纘 */ return "si";
        case 234: /* 纜 */ return "laam";
        case 240: /* 纠 */ return "dau";
        case 241: /* 纡 */ return "si";
        case 242: /* 红 */ return "hung";
        case 243: /* 纣 */ return "jau";
        case 244: /* 纤 */ return "chin/hin";
        case 245: /* 纥 */ return "si";
        case 246: /* 约 */ return "yeuk";
        case 247: /* 级 */ return "kap";
        case 250: /* 纨 */ return "si";
        case 251: /* 纩 */ return "si";
        case 252: /* 纪 */ return "gei";
        case 253: /* 纫 */ return "yan";
        case 254: /* 纬 */ return "wai";
        case 257: /* 纯 */ return "sun";
        case 260: /* 纰 */ return "si";
        case 261: /* 纱 */ return "sa";
        case 262: /* 纲 */ return "gong";
        case 263: /* 纳 */ return "naap";
        case 265: /* 纵 */ return "jue/jung";
        case 266: /* 纶 */ return "lun";
        case 267: /* 纷 */ return "fan";
        case 270: /* 纸 */ return "ji";
        case 271: /* 纹 */ return "man";
        case 272: /* 纺 */ return "fong";
        case 275: /* 纽 */ return "nau";
        case 276: /* 纾 */ return "si";
        case 277: /* 线 */ return "sin";
        }
      case 273:
        switch (octal[2]) {
        case 200: /* 绀 */ return "si";
        case 201: /* 绁 */ return "si";
        case 202: /* 绂 */ return "si";
        case 203: /* 练 */ return "lin";
        case 204: /* 组 */ return "jo";
        case 205: /* 绅 */ return "san";
        case 206: /* 细 */ return "sai";
        case 207: /* 织 */ return "jik";
        case 210: /* 终 */ return "jung";
        case 211: /* 绉 */ return "si";
        case 212: /* 绊 */ return "boon";
        case 213: /* 绋 */ return "si";
        case 214: /* 绌 */ return "si";
        case 215: /* 绍 */ return "siu";
        case 216: /* 绎 */ return "yik";
        case 217: /* 经 */ return "ging";
        case 220: /* 绐 */ return "si";
        case 221: /* 绑 */ return "bong";
        case 222: /* 绒 */ return "yung";
        case 223: /* 结 */ return "git";
        case 224: /* 绔 */ return "si";
        case 225: /* 绕 */ return "yiu";
        case 227: /* 绗 */ return "si";
        case 230: /* 绘 */ return "kooi";
        case 231: /* 给 */ return "kap";
        case 232: /* 绚 */ return "huen";
        case 233: /* 绛 */ return "si";
        case 234: /* 络 */ return "lok";
        case 235: /* 绝 */ return "juet";
        case 236: /* 绞 */ return "gaau";
        case 237: /* 统 */ return "tung";
        case 240: /* 绠 */ return "si";
        case 241: /* 绡 */ return "si";
        case 242: /* 绢 */ return "guen";
        case 243: /* 绣 */ return "sau";
        case 245: /* 绥 */ return "sui";
        case 246: /* 绦 */ return "to";
        case 247: /* 继 */ return "gai";
        case 250: /* 绨 */ return "si";
        case 251: /* 绩 */ return "jik";
        case 252: /* 绪 */ return "sui";
        case 253: /* 绫 */ return "si";
        case 255: /* 续 */ return "juk";
        case 256: /* 绮 */ return "yi";
        case 257: /* 绯 */ return "si";
        case 260: /* 绰 */ return "cheuk";
        case 261: /* 绱 */ return "si";
        case 262: /* 绲 */ return "si";
        case 263: /* 绳 */ return "sing";
        case 264: /* 维 */ return "wai";
        case 265: /* 绵 */ return "min";
        case 266: /* 绶 */ return "si";
        case 267: /* 绷 */ return "baang";
        case 270: /* 绸 */ return "chau";
        case 272: /* 绺 */ return "si";
        case 273: /* 绻 */ return "si";
        case 274: /* 综 */ return "jung";
        case 275: /* 绽 */ return "jaan";
        case 276: /* 绾 */ return "si";
        case 277: /* 绿 */ return "luk";
        }
      case 274:
        switch (octal[2]) {
        case 200: /* 缀 */ return "chuet/juet";
        case 201: /* 缁 */ return "si";
        case 202: /* 缂 */ return "si";
        case 203: /* 缃 */ return "si";
        case 204: /* 缄 */ return "gam";
        case 205: /* 缅 */ return "min";
        case 206: /* 缆 */ return "laam";
        case 207: /* 缇 */ return "si";
        case 210: /* 缈 */ return "si";
        case 211: /* 缉 */ return "chap";
        case 213: /* 缋 */ return "si";
        case 214: /* 缌 */ return "si";
        case 215: /* 缍 */ return "si";
        case 216: /* 缎 */ return "duen";
        case 217: /* 缏 */ return "si";
        case 221: /* 缑 */ return "si";
        case 222: /* 缒 */ return "si";
        case 223: /* 缓 */ return "woon";
        case 224: /* 缔 */ return "tai";
        case 225: /* 缕 */ return "lui";
        case 226: /* 编 */ return "pin";
        case 227: /* 缗 */ return "si";
        case 230: /* 缘 */ return "yuen";
        case 231: /* 缙 */ return "si";
        case 232: /* 缚 */ return "bok";
        case 233: /* 缛 */ return "si";
        case 234: /* 缜 */ return "si";
        case 235: /* 缝 */ return "fung";
        case 237: /* 缟 */ return "si";
        case 240: /* 缠 */ return "chin";
        case 241: /* 缡 */ return "si";
        case 242: /* 缢 */ return "si";
        case 243: /* 缣 */ return "si";
        case 244: /* 缤 */ return "si";
        case 245: /* 缥 */ return "si";
        case 246: /* 缦 */ return "si";
        case 247: /* 缧 */ return "si";
        case 250: /* 缨 */ return "ying";
        case 251: /* 缩 */ return "suk";
        case 252: /* 缪 */ return "si";
        case 253: /* 缫 */ return "si";
        case 254: /* 缬 */ return "si";
        case 255: /* 缭 */ return "si";
        case 256: /* 缮 */ return "sin";
        case 257: /* 缯 */ return "si";
        case 260: /* 缰 */ return "si";
        case 261: /* 缱 */ return "si";
        case 262: /* 缲 */ return "si";
        case 263: /* 缳 */ return "si";
        case 264: /* 缴 */ return "giu";
        case 265: /* 缵 */ return "si";
        case 266: /* 缶 */ return "fau";
        case 270: /* 缸 */ return "gong";
        case 272: /* 缺 */ return "kuet";
        case 275: /* 缽 */ return "boot";
        }
      case 275:
        switch (octal[2]) {
        case 202: /* 罂 */ return "aang";
        case 204: /* 罄 */ return "hing";
        case 205: /* 罅 */ return "la";
        case 214: /* 罌 */ return "aang";
        case 220: /* 罐 */ return "goon";
        case 221: /* 网 */ return "mong";
        case 224: /* 罔 */ return "mong";
        case 225: /* 罕 */ return "hon";
        case 227: /* 罗 */ return "loh";
        case 230: /* 罘 */ return "fau";
        case 232: /* 罚 */ return "fat";
        case 237: /* 罟 */ return "goo";
        case 241: /* 罡 */ return "gong";
        case 242: /* 罢 */ return "ba";
        case 250: /* 罨 */ return "yim";
        case 251: /* 罩 */ return "jaau";
        case 252: /* 罪 */ return "jui";
        case 256: /* 置 */ return "ji";
        case 260: /* 罰 */ return "fat";
        case 261: /* 罱 */ return "laam";
        case 262: /* 署 */ return "chue";
        case 264: /* 罴 */ return "bei";
        case 265: /* 罵 */ return "ma";
        case 267: /* 罷 */ return "ba";
        case 271: /* 罹 */ return "lei";
        case 276: /* 罾 */ return "jang";
        }
      case 276:
        switch (octal[2]) {
        case 201: /* 羁 */ return "gei";
        case 205: /* 羅 */ return "loh";
        case 206: /* 羆 */ return "bei";
        case 210: /* 羈 */ return "gei";
        case 212: /* 羊 */ return "yeung";
        case 214: /* 羌 */ return "geung";
        case 216: /* 美 */ return "mei";
        case 224: /* 羔 */ return "go";
        case 232: /* 羚 */ return "ling";
        case 235: /* 羝 */ return "dai";
        case 236: /* 羞 */ return "sau";
        case 237: /* 羟 */ return "keung";
        case 241: /* 羡 */ return "sin";
        case 244: /* 群 */ return "kwan";
        case 245: /* 羥 */ return "keung";
        case 247: /* 羧 */ return "soh";
        case 250: /* 羨 */ return "sin";
        case 251: /* 義 */ return "yi";
        case 257: /* 羯 */ return "kit";
        case 260: /* 羰 */ return "tong";
        case 262: /* 羲 */ return "hei";
        case 270: /* 羸 */ return "lui";
        case 271: /* 羹 */ return "gang";
        case 275: /* 羽 */ return "yue";
        case 277: /* 羿 */ return "ngai";
        }
      case 277:
        switch (octal[2]) {
        case 201: /* 翁 */ return "yung";
        case 205: /* 翅 */ return "chi";
        case 212: /* 翊 */ return "hui";
        case 214: /* 翌 */ return "yik";
        case 222: /* 習 */ return "jaap";
        case 224: /* 翔 */ return "cheung";
        case 230: /* 翘 */ return "kiu";
        case 237: /* 翟 */ return "jaak";
        case 240: /* 翠 */ return "chui";
        case 241: /* 翡 */ return "fei";
        case 246: /* 翦 */ return "jin";
        case 260: /* 翰 */ return "hon";
        case 261: /* 翱 */ return "ngo";
        case 271: /* 翹 */ return "kiu";
        case 273: /* 翻 */ return "faan";
        case 274: /* 翼 */ return "yik";
        }
      }
    case 350:
      switch (octal[1]) {
      case 200:
        switch (octal[2]) {
        case 200: /* 耀 */ return "yiu";
        case 201: /* 老 */ return "lo";
        case 203: /* 考 */ return "haau";
        case 204: /* 耄 */ return "mo";
        case 205: /* 者 */ return "je";
        case 206: /* 耆 */ return "yat";
        case 214: /* 而 */ return "yi";
        case 215: /* 耍 */ return "sa";
        case 220: /* 耐 */ return "noi";
        case 222: /* 耒 */ return "loi";
        case 224: /* 耔 */ return "ji";
        case 225: /* 耕 */ return "gaang";
        case 226: /* 耖 */ return "chaau";
        case 227: /* 耗 */ return "ho";
        case 230: /* 耘 */ return "wan";
        case 231: /* 耙 */ return "pa";
        case 234: /* 耜 */ return "ji";
        case 240: /* 耠 */ return "hap";
        case 242: /* 耢 */ return "lo";
        case 245: /* 耥 */ return "tong";
        case 246: /* 耦 */ return "ngau";
        case 247: /* 耧 */ return "lau";
        case 250: /* 耨 */ return "nau";
        case 251: /* 耩 */ return "gong";
        case 252: /* 耪 */ return "pong";
        case 254: /* 耬 */ return "lau";
        case 261: /* 耱 */ return "moh";
        case 263: /* 耳 */ return "yi";
        case 265: /* 耵 */ return "ding";
        case 266: /* 耶 */ return "ye";
        case 270: /* 耸 */ return "sung";
        case 273: /* 耻 */ return "chi";
        case 275: /* 耽 */ return "daam";
        case 277: /* 耿 */ return "gang";
        }
      case 201:
        switch (octal[2]) {
        case 202: /* 聂 */ return "nip";
        case 203: /* 聃 */ return "daam";
        case 206: /* 聆 */ return "ling";
        case 212: /* 聊 */ return "liu";
        case 213: /* 聋 */ return "lung";
        case 214: /* 职 */ return "jik";
        case 215: /* 聍 */ return "ning";
        case 222: /* 聒 */ return "koot";
        case 224: /* 联 */ return "luen";
        case 226: /* 聖 */ return "sing";
        case 230: /* 聘 */ return "ping";
        case 232: /* 聚 */ return "jui";
        case 236: /* 聞 */ return "man";
        case 251: /* 聩 */ return "kooi";
        case 252: /* 聪 */ return "chung";
        case 257: /* 聯 */ return "luen";
        case 260: /* 聰 */ return "chung";
        case 261: /* 聱 */ return "ngo";
        case 262: /* 聲 */ return "seng/sing";
        case 263: /* 聳 */ return "sung";
        case 265: /* 聵 */ return "kooi";
        case 266: /* 聶 */ return "nip";
        case 267: /* 職 */ return "jik";
        case 271: /* 聹 */ return "ning";
        case 275: /* 聽 */ return "ting";
        case 276: /* 聾 */ return "lung";
        case 277: /* 聿 */ return "lut";
        }
      case 202:
        switch (octal[2]) {
        case 203: /* 肃 */ return "suk";
        case 204: /* 肄 */ return "yi";
        case 205: /* 肅 */ return "suk";
        case 206: /* 肆 */ return "si";
        case 207: /* 肇 */ return "siu";
        case 211: /* 肉 */ return "yuk";
        case 213: /* 肋 */ return "lak";
        case 214: /* 肌 */ return "gei";
        case 223: /* 肓 */ return "fong";
        case 226: /* 肖 */ return "chiu";
        case 230: /* 肘 */ return "jaau";
        case 232: /* 肚 */ return "to";
        case 233: /* 肛 */ return "gong";
        case 234: /* 肜 */ return "yuk";
        case 235: /* 肝 */ return "gon";
        case 237: /* 肟 */ return "yuk";
        case 240: /* 肠 */ return "cheung";
        case 241: /* 股 */ return "goo";
        case 242: /* 肢 */ return "ji";
        case 244: /* 肤 */ return "foo";
        case 245: /* 肥 */ return "fei";
        case 251: /* 肩 */ return "gin";
        case 252: /* 肪 */ return "fong";
        case 253: /* 肫 */ return "yuk";
        case 255: /* 肭 */ return "yuk";
        case 256: /* 肮 */ return "ong";
        case 257: /* 肯 */ return "hang";
        case 261: /* 肱 */ return "yuk";
        case 262: /* 育 */ return "yuk";
        case 264: /* 肴 */ return "ngaau";
        case 267: /* 肷 */ return "yuk";
        case 272: /* 肺 */ return "fai";
        case 274: /* 肼 */ return "yuk";
        case 275: /* 肽 */ return "yuk";
        case 276: /* 肾 */ return "san";
        case 277: /* 肿 */ return "jung";
        }
      case 203:
        switch (octal[2]) {
        case 200: /* 胀 */ return "jeung";
        case 201: /* 胁 */ return "hip";
        case 202: /* 胂 */ return "yuk";
        case 203: /* 胃 */ return "wai";
        case 204: /* 胄 */ return "jau";
        case 206: /* 胆 */ return "daam";
        case 214: /* 背 */ return "booi";
        case 215: /* 胍 */ return "yuk";
        case 216: /* 胎 */ return "toi";
        case 226: /* 胖 */ return "boon";
        case 227: /* 胗 */ return "yuk";
        case 231: /* 胙 */ return "yuk";
        case 232: /* 胚 */ return "pooi";
        case 233: /* 胛 */ return "gaap";
        case 234: /* 胜 */ return "sing";
        case 235: /* 胝 */ return "yuk";
        case 236: /* 胞 */ return "baau";
        case 241: /* 胡 */ return "woo";
        case 244: /* 胤 */ return "yan";
        case 245: /* 胥 */ return "sui";
        case 247: /* 胧 */ return "lung";
        case 250: /* 胨 */ return "yuk";
        case 251: /* 胩 */ return "yuk";
        case 252: /* 胪 */ return "yuk";
        case 253: /* 胫 */ return "yuk";
        case 254: /* 胬 */ return "nui";
        case 255: /* 胭 */ return "yin";
        case 257: /* 胯 */ return "kwa";
        case 260: /* 胰 */ return "yi";
        case 261: /* 胱 */ return "yuk";
        case 262: /* 胲 */ return "yuk";
        case 263: /* 胳 */ return "gaak";
        case 264: /* 胴 */ return "tung";
        case 266: /* 胶 */ return "gaau";
        case 270: /* 胸 */ return "hung";
        case 272: /* 胺 */ return "on";
        case 274: /* 胼 */ return "sau/yuk";
        case 275: /* 能 */ return "nang";
        }
      case 204:
        switch (octal[2]) {
        case 202: /* 脂 */ return "ji";
        case 205: /* 脅 */ return "hip";
        case 206: /* 脆 */ return "chui";
        case 210: /* 脈 */ return "mak";
        case 211: /* 脉 */ return "mak";
        case 212: /* 脊 */ return "jek";
        case 215: /* 脍 */ return "kooi";
        case 216: /* 脎 */ return "yuk";
        case 217: /* 脏 */ return "jong";
        case 220: /* 脐 */ return "chi";
        case 221: /* 脑 */ return "no";
        case 222: /* 脒 */ return "yuk";
        case 223: /* 脓 */ return "nung";
        case 226: /* 脖 */ return "boot";
        case 230: /* 脘 */ return "yuk";
        case 232: /* 脚 */ return "geuk";
        case 233: /* 脛 */ return "yuk";
        case 236: /* 脞 */ return "yuk";
        case 253: /* 脫 */ return "tuet";
        case 254: /* 脬 */ return "yuk";
        case 257: /* 脯 */ return "po";
        case 261: /* 脱 */ return "tuet";
        case 262: /* 脲 */ return "yuk";
        case 266: /* 脶 */ return "yuk";
        case 270: /* 脸 */ return "lim";
        case 271: /* 脹 */ return "jeung";
        case 276: /* 脾 */ return "bei";
        }
      case 205:
        switch (octal[2]) {
        case 206: /* 腆 */ return "tin";
        case 210: /* 腈 */ return "yuk";
        case 212: /* 腊 */ return "laap";
        case 213: /* 腋 */ return "yik";
        case 214: /* 腌 */ return "yuk";
        case 216: /* 腎 */ return "san";
        case 220: /* 腐 */ return "foo";
        case 221: /* 腑 */ return "foo";
        case 223: /* 腓 */ return "fei";
        case 224: /* 腔 */ return "hong";
        case 225: /* 腕 */ return "woon";
        case 231: /* 腙 */ return "yuk";
        case 232: /* 腚 */ return "yuk";
        case 240: /* 腠 */ return "yuk";
        case 241: /* 腡 */ return "yuk";
        case 245: /* 腥 */ return "seng/sing";
        case 246: /* 腦 */ return "no";
        case 247: /* 腧 */ return "yuk";
        case 251: /* 腩 */ return "naam";
        case 253: /* 腫 */ return "jung";
        case 255: /* 腭 */ return "yuk";
        case 256: /* 腮 */ return "soi";
        case 260: /* 腰 */ return "yiu";
        case 261: /* 腱 */ return "gin";
        case 263: /* 腳 */ return "geuk";
        case 264: /* 腴 */ return "yuk";
        case 270: /* 腸 */ return "cheung";
        case 271: /* 腹 */ return "fuk";
        case 272: /* 腺 */ return "sin";
        case 273: /* 腻 */ return "nei";
        case 274: /* 腼 */ return "yuk";
        case 275: /* 腽 */ return "yuk";
        case 276: /* 腾 */ return "tang";
        case 277: /* 腿 */ return "tui";
        }
      case 206:
        switch (octal[2]) {
        case 200: /* 膀 */ return "pong";
        case 202: /* 膂 */ return "yuk";
        case 203: /* 膃 */ return "yuk";
        case 210: /* 膈 */ return "gaak";
        case 212: /* 膊 */ return "bok";
        case 217: /* 膏 */ return "go";
        case 221: /* 膑 */ return "ban";
        case 230: /* 膘 */ return "piu";
        case 232: /* 膚 */ return "foo";
        case 233: /* 膛 */ return "tong";
        case 234: /* 膜 */ return "mok";
        case 235: /* 膝 */ return "sat";
        case 240: /* 膠 */ return "gaau";
        case 243: /* 膣 */ return "yuk";
        case 246: /* 膦 */ return "yuk";
        case 250: /* 膨 */ return "paang";
        case 251: /* 膩 */ return "nei";
        case 252: /* 膪 */ return "yuk";
        case 263: /* 膳 */ return "sin";
        case 273: /* 膻 */ return "yuk";
        case 275: /* 膽 */ return "daam";
        case 276: /* 膾 */ return "kooi";
        case 277: /* 膿 */ return "nung";
        }
      case 207:
        switch (octal[2]) {
        case 200: /* 臀 */ return "tuen";
        case 201: /* 臁 */ return "yuk";
        case 202: /* 臂 */ return "bei";
        case 203: /* 臃 */ return "yung";
        case 206: /* 臆 */ return "yik";
        case 211: /* 臉 */ return "lim";
        case 212: /* 臊 */ return "cho";
        case 214: /* 臌 */ return "yuk";
        case 215: /* 臍 */ return "chi";
        case 217: /* 臏 */ return "ban";
        case 230: /* 臘 */ return "laap";
        case 232: /* 臚 */ return "yuk";
        case 237: /* 臟 */ return "jong";
        case 243: /* 臣 */ return "san";
        case 245: /* 臥 */ return "ngoh";
        case 247: /* 臧 */ return "jong";
        case 250: /* 臨 */ return "lam";
        case 252: /* 自 */ return "ji";
        case 254: /* 臬 */ return "yit";
        case 255: /* 臭 */ return "chau/chau#";
        case 263: /* 至 */ return "ji";
        case 264: /* 致 */ return "ji";
        case 273: /* 臻 */ return "jun";
        case 274: /* 臼 */ return "kau";
        case 276: /* 臾 */ return "yue";
        }
      case 210:
        switch (octal[2]) {
        case 200: /* 舀 */ return "yiu";
        case 201: /* 舁 */ return "yue";
        case 202: /* 舂 */ return "jung";
        case 204: /* 舄 */ return "sik";
        case 205: /* 舅 */ return "kau";
        case 206: /* 舆 */ return "yue";
        case 207: /* 與 */ return "yue";
        case 210: /* 興 */ return "hing";
        case 211: /* 舉 */ return "gui";
        case 212: /* 舊 */ return "gau";
        case 213: /* 舋 */ return "yan";
        case 214: /* 舌 */ return "sit";
        case 215: /* 舍 */ return "se";
        case 220: /* 舐 */ return "saai";
        case 222: /* 舒 */ return "sue";
        case 224: /* 舔 */ return "tim";
        case 226: /* 舖 */ return "po";
        case 234: /* 舜 */ return "sun";
        case 236: /* 舞 */ return "mo";
        case 237: /* 舟 */ return "jau";
        case 241: /* 舡 */ return "jau";
        case 242: /* 舢 */ return "saan";
        case 243: /* 舣 */ return "ngai";
        case 250: /* 舨 */ return "baan";
        case 252: /* 航 */ return "hong";
        case 253: /* 舫 */ return "fong";
        case 254: /* 般 */ return "boon";
        case 255: /* 舭 */ return "jau";
        case 257: /* 舯 */ return "jung";
        case 260: /* 舰 */ return "laam";
        case 261: /* 舱 */ return "chong";
        case 263: /* 舳 */ return "juk";
        case 264: /* 舴 */ return "jaak";
        case 265: /* 舵 */ return "toh";
        case 266: /* 舶 */ return "bok";
        case 267: /* 舷 */ return "yin";
        case 270: /* 舸 */ return "hoh";
        case 271: /* 船 */ return "suen";
        case 273: /* 舻 */ return "lo";
        case 276: /* 舾 */ return "jau";
        }
      case 211:
        switch (octal[2]) {
        case 204: /* 艄 */ return "saau";
        case 207: /* 艇 */ return "teng";
        case 211: /* 艉 */ return "mei";
        case 213: /* 艋 */ return "maang";
        case 217: /* 艏 */ return "sau";
        case 230: /* 艘 */ return "sau";
        case 231: /* 艙 */ return "chong";
        case 232: /* 艚 */ return "cho";
        case 237: /* 艟 */ return "tung";
        case 244: /* 艤 */ return "ngai";
        case 246: /* 艦 */ return "laam";
        case 250: /* 艨 */ return "mung";
        case 253: /* 艫 */ return "lo";
        case 256: /* 艮 */ return "gan";
        case 257: /* 良 */ return "leung";
        case 260: /* 艰 */ return "gaan";
        case 261: /* 艱 */ return "gaan";
        case 262: /* 色 */ return "sik";
        case 263: /* 艳 */ return "yim";
        case 264: /* 艴 */ return "fat";
        case 267: /* 艷 */ return "yim";
        case 272: /* 艺 */ return "ngai";
        case 276: /* 艾 */ return "ngaai";
        }
      case 212:
        switch (octal[2]) {
        case 202: /* 节 */ return "jit";
        case 213: /* 芋 */ return "woo";
        case 215: /* 芍 */ return "cheuk";
        case 222: /* 芒 */ return "mong";
        case 231: /* 芙 */ return "foo";
        case 234: /* 芜 */ return "mo";
        case 235: /* 芝 */ return "ji";
        case 245: /* 芥 */ return "gaai";
        case 246: /* 芦 */ return "lo";
        case 253: /* 芫 */ return "yuen";
        case 254: /* 芬 */ return "fan";
        case 255: /* 芭 */ return "ba";
        case 257: /* 芯 */ return "yui";
        case 261: /* 花 */ return "fa";
        case 263: /* 芳 */ return "fong";
        case 267: /* 芷 */ return "ji";
        case 270: /* 芸 */ return "wan";
        case 271: /* 芹 */ return "kan";
        case 273: /* 芻 */ return "choh";
        case 275: /* 芽 */ return "nga";
        }
      case 213:
        switch (octal[2]) {
        case 207: /* 苇 */ return "wai";
        case 215: /* 苍 */ return "chong";
        case 217: /* 苏 */ return "so";
        case 221: /* 苑 */ return "yuen";
        case 224: /* 苔 */ return "toi";
        case 227: /* 苗 */ return "miu";
        case 233: /* 苛 */ return "oh";
        case 234: /* 苜 */ return "muk";
        case 236: /* 苞 */ return "baau";
        case 237: /* 苟 */ return "gau";
        case 245: /* 若 */ return "yeuk";
        case 246: /* 苦 */ return "foo";
        case 253: /* 苫 */ return "sim";
        case 257: /* 苯 */ return "boon";
        case 261: /* 英 */ return "ying";
        case 271: /* 苹 */ return "ping";
        case 273: /* 苻 */ return "foo";
        }
      case 214:
        switch (octal[2]) {
        case 201: /* 茁 */ return "chuet";
        case 202: /* 茂 */ return "mau";
        case 203: /* 范 */ return "faan";
        case 204: /* 茄 */ return "ke";
        case 205: /* 茅 */ return "maau";
        case 211: /* 茉 */ return "moot";
        case 216: /* 茎 */ return "ging";
        case 227: /* 茗 */ return "ming";
        case 247: /* 茧 */ return "gaan";
        case 250: /* 茨 */ return "chi";
        case 253: /* 茫 */ return "mong";
        case 254: /* 茬 */ return "cha";
        case 261: /* 茱 */ return "jue";
        case 262: /* 茲 */ return "ji";
        case 265: /* 茵 */ return "yan";
        case 266: /* 茶 */ return "cha";
        case 270: /* 茸 */ return "yung";
        case 271: /* 茹 */ return "yue";
        }
      case 215:
        switch (octal[2]) {
        case 200: /* 荀 */ return "sun";
        case 203: /* 荃 */ return "chuen";
        case 206: /* 荆 */ return "ging";
        case 211: /* 草 */ return "cho";
        case 212: /* 荊 */ return "ging";
        case 220: /* 荐 */ return "jin";
        case 222: /* 荒 */ return "fong";
        case 224: /* 荔 */ return "lai";
        case 232: /* 荚 */ return "gaap";
        case 241: /* 荡 */ return "dong";
        case 243: /* 荣 */ return "wing";
        case 244: /* 荤 */ return "fan";
        case 247: /* 荧 */ return "ying";
        case 253: /* 荫 */ return "yam";
        case 257: /* 药 */ return "yeuk";
        case 267: /* 荷 */ return "hoh";
        case 274: /* 荼 */ return "to";
        }
      case 216:
        switch (octal[2]) {
        case 205: /* 莅 */ return "yap";
        case 206: /* 莆 */ return "po";
        case 211: /* 莉 */ return "lei";
        case 212: /* 莊 */ return "jong";
        case 216: /* 莎 */ return "sa";
        case 226: /* 莖 */ return "ging";
        case 236: /* 莞 */ return "goon";
        case 240: /* 莠 */ return "sau";
        case 242: /* 莢 */ return "gaap";
        case 253: /* 莫 */ return "mok";
        case 261: /* 莱 */ return "loi";
        case 262: /* 莲 */ return "lin";
        case 267: /* 获 */ return "wok";
        case 271: /* 莹 */ return "ying";
        case 272: /* 莺 */ return "ang";
        case 275: /* 莽 */ return "mong";
        }
      case 217:
        switch (octal[2]) {
        case 207: /* 菇 */ return "goo";
        case 212: /* 菊 */ return "guk";
        case 214: /* 菌 */ return "kwan";
        case 217: /* 菏 */ return "hoh";
        case 234: /* 菜 */ return "choi";
        case 240: /* 菠 */ return "boh";
        case 251: /* 菩 */ return "pooi";
        case 257: /* 華 */ return "wa";
        case 261: /* 菱 */ return "ling";
        case 262: /* 菲 */ return "fei";
        }
      case 220:
        switch (octal[2]) {
        case 203: /* 萃 */ return "sui";
        case 204: /* 萄 */ return "to";
        case 212: /* 萊 */ return "loi";
        case 213: /* 萋 */ return "chai";
        case 214: /* 萌 */ return "mang";
        case 215: /* 萍 */ return "ping";
        case 216: /* 萎 */ return "wai";
        case 235: /* 萝 */ return "loh";
        case 244: /* 萤 */ return "ying";
        case 245: /* 营 */ return "ying";
        case 247: /* 萧 */ return "siu";
        case 250: /* 萨 */ return "saat";
        case 254: /* 萬 */ return "maan";
        case 261: /* 萱 */ return "huen";
        case 275: /* 落 */ return "lok";
        }
      case 221:
        switch (octal[2]) {
        case 211: /* 葉 */ return "yip";
        case 227: /* 著 */ return "jeuk/jue";
        case 233: /* 葛 */ return "got";
        case 241: /* 葡 */ return "po";
        case 243: /* 董 */ return "dung";
        case 246: /* 葦 */ return "wai";
        case 251: /* 葩 */ return "ba";
        case 253: /* 葫 */ return "woo";
        case 254: /* 葬 */ return "jong";
        case 261: /* 葱 */ return "chung";
        case 265: /* 葵 */ return "kwai";
        case 267: /* 葷 */ return "fan";
        }
      case 222:
        switch (octal[2]) {
        case 202: /* 蒂 */ return "tai";
        case 213: /* 蒋 */ return "jeung";
        case 231: /* 蒙 */ return "mung";
        case 234: /* 蒜 */ return "suen";
        case 236: /* 蒞 */ return "yap";
        case 262: /* 蒲 */ return "po";
        case 270: /* 蒸 */ return "jing";
        case 274: /* 蒼 */ return "chong";
        }
      case 223:
        switch (octal[2]) {
        case 204: /* 蓄 */ return "chuk";
        case 211: /* 蓉 */ return "yung";
        case 213: /* 蓋 */ return "koi";
        case 221: /* 蓑 */ return "soh";
        case 226: /* 蓖 */ return "bai";
        case 235: /* 蓝 */ return "laam";
        case 237: /* 蓟 */ return "gai";
        case 246: /* 蓦 */ return "mak";
        case 254: /* 蓬 */ return "pung";
        case 256: /* 蓮 */ return "lin";
        case 277: /* 蓿 */ return "suk";
        }
      case 224:
        switch (octal[2]) {
        case 221: /* 蔑 */ return "mit";
        case 223: /* 蔓 */ return "maan";
        case 227: /* 蔗 */ return "je";
        case 232: /* 蔚 */ return "wai";
        case 241: /* 蔡 */ return "choi";
        case 243: /* 蔣 */ return "jeung";
        case 245: /* 蔥 */ return "chung";
        case 253: /* 蔫 */ return "jin";
        case 254: /* 蔬 */ return "soh";
        case 255: /* 蔭 */ return "yam";
        case 267: /* 蔷 */ return "cheung";
        case 274: /* 蔼 */ return "oi";
        case 275: /* 蔽 */ return "bai";
        }
      case 225:
        switch (octal[2]) {
        case 203: /* 蕃 */ return "faan";
        case 211: /* 蕉 */ return "jiu";
        case 212: /* 蕊 */ return "yui";
        case 252: /* 蕪 */ return "mo";
        case 255: /* 蕭 */ return "siu";
        case 264: /* 蕴 */ return "wan";
        case 276: /* 蕾 */ return "lui";
        }
      case 226:
        switch (octal[2]) {
        case 204: /* 薄 */ return "bok";
        case 207: /* 薇 */ return "mei";
        case 212: /* 薊 */ return "gai";
        case 224: /* 薔 */ return "cheung";
        case 233: /* 薛 */ return "sit";
        case 246: /* 薦 */ return "jin";
        case 251: /* 薩 */ return "saat";
        case 252: /* 薪 */ return "san";
        case 257: /* 薯 */ return "sue";
        case 260: /* 薰 */ return "fan";
        }
      case 227:
        switch (octal[2]) {
        case 211: /* 藉 */ return "jik";
        case 215: /* 藍 */ return "laam";
        case 217: /* 藏 */ return "chong/jong";
        case 220: /* 藐 */ return "miu";
        case 225: /* 藕 */ return "ngau";
        case 235: /* 藝 */ return "ngai";
        case 244: /* 藤 */ return "tang";
        case 245: /* 藥 */ return "yeuk";
        case 251: /* 藩 */ return "faan";
        case 271: /* 藹 */ return "oi";
        case 273: /* 藻 */ return "jo";
        }
      case 230:
        switch (octal[2]) {
        case 206: /* 蘆 */ return "lo";
        case 207: /* 蘇 */ return "so";
        case 212: /* 蘊 */ return "wan";
        case 213: /* 蘋 */ return "ping";
        case 221: /* 蘑 */ return "moh";
        case 255: /* 蘭 */ return "laan";
        case 270: /* 蘸 */ return "jaam";
        case 277: /* 蘿 */ return "loh";
        }
      case 231:
        switch (octal[2]) {
        case 216: /* 虎 */ return "foo";
        case 217: /* 虏 */ return "lo";
        case 220: /* 虐 */ return "yeuk";
        case 221: /* 虑 */ return "lui";
        case 224: /* 虔 */ return "kin";
        case 225: /* 處 */ return "chue";
        case 232: /* 虚 */ return "hui";
        case 233: /* 虛 */ return "hui";
        case 234: /* 虜 */ return "lo";
        case 236: /* 虞 */ return "yan/yue";
        case 237: /* 號 */ return "ho";
        case 242: /* 虢 */ return "kwik";
        case 247: /* 虧 */ return "kwai";
        case 253: /* 虫 */ return "chung";
        case 254: /* 虬 */ return "kau";
        case 256: /* 虮 */ return "chung";
        case 257: /* 虯 */ return "kau";
        case 261: /* 虱 */ return "sat";
        case 271: /* 虹 */ return "hung";
        case 272: /* 虺 */ return "chung";
        case 273: /* 虻 */ return "chung";
        case 274: /* 虼 */ return "chung";
        case 275: /* 虽 */ return "sui";
        case 276: /* 虾 */ return "ha";
        case 277: /* 虿 */ return "chung";
        }
      case 232:
        switch (octal[2]) {
        case 200: /* 蚀 */ return "sik";
        case 201: /* 蚁 */ return "ngai";
        case 202: /* 蚂 */ return "ma";
        case 212: /* 蚊 */ return "man";
        case 213: /* 蚋 */ return "chung";
        case 214: /* 蚌 */ return "pong";
        case 215: /* 蚍 */ return "chung";
        case 223: /* 蚓 */ return "yan";
        case 225: /* 蚕 */ return "chaam";
        case 234: /* 蚜 */ return "nga";
        case 235: /* 蚝 */ return "chung";
        case 243: /* 蚣 */ return "gung";
        case 244: /* 蚤 */ return "jo";
        case 247: /* 蚧 */ return "chung";
        case 250: /* 蚨 */ return "chung";
        case 251: /* 蚩 */ return "chi";
        case 252: /* 蚪 */ return "dau";
        case 254: /* 蚬 */ return "hin";
        case 257: /* 蚯 */ return "yau";
        case 260: /* 蚰 */ return "chung";
        case 261: /* 蚱 */ return "ja";
        case 264: /* 蚴 */ return "chung";
        case 265: /* 蚵 */ return "chung";
        case 266: /* 蚶 */ return "chung";
        case 272: /* 蚺 */ return "chung";
        }
      case 233:
        switch (octal[2]) {
        case 200: /* 蛀 */ return "jue";
        case 204: /* 蛄 */ return "chung";
        case 206: /* 蛆 */ return "jui";
        case 207: /* 蛇 */ return "se";
        case 211: /* 蛉 */ return "chung";
        case 212: /* 蛊 */ return "goo";
        case 213: /* 蛋 */ return "daan";
        case 216: /* 蛎 */ return "chung";
        case 217: /* 蛏 */ return "chung";
        case 220: /* 蛐 */ return "chung";
        case 221: /* 蛑 */ return "chung";
        case 224: /* 蛔 */ return "wooi";
        case 230: /* 蛘 */ return "chung";
        case 231: /* 蛙 */ return "wa";
        case 233: /* 蛛 */ return "jue";
        case 236: /* 蛞 */ return "chung";
        case 237: /* 蛟 */ return "gaau";
        case 244: /* 蛤 */ return "gap";
        case 251: /* 蛩 */ return "chung";
        case 255: /* 蛭 */ return "chung/mei";
        case 256: /* 蛮 */ return "maan";
        case 260: /* 蛰 */ return "jik/jit";
        case 261: /* 蛱 */ return "chung";
        case 262: /* 蛲 */ return "chung";
        case 263: /* 蛳 */ return "chung";
        case 264: /* 蛴 */ return "chung";
        case 270: /* 蛸 */ return "chung";
        case 271: /* 蛹 */ return "yung";
        case 272: /* 蛺 */ return "chung";
        case 273: /* 蛻 */ return "tui";
        case 276: /* 蛾 */ return "ngoh";
        }
      case 234:
        switch (octal[2]) {
        case 200: /* 蜀 */ return "suk";
        case 202: /* 蜂 */ return "fung";
        case 203: /* 蜃 */ return "chung";
        case 206: /* 蜆 */ return "hin";
        case 207: /* 蜇 */ return "chung";
        case 210: /* 蜈 */ return "ng";
        case 211: /* 蜉 */ return "chung";
        case 212: /* 蜊 */ return "chung";
        case 215: /* 蜍 */ return "chung";
        case 222: /* 蜒 */ return "ting";
        case 223: /* 蜓 */ return "ting";
        case 225: /* 蜕 */ return "tui";
        case 227: /* 蜗 */ return "woh";
        case 230: /* 蜘 */ return "ji";
        case 232: /* 蜚 */ return "fei";
        case 234: /* 蜜 */ return "mat";
        case 236: /* 蜞 */ return "chung";
        case 241: /* 蜡 */ return "laap";
        case 242: /* 蜢 */ return "maang";
        case 243: /* 蜣 */ return "chung";
        case 245: /* 蜥 */ return "sik";
        case 251: /* 蜩 */ return "chung";
        case 256: /* 蜮 */ return "chung";
        case 261: /* 蜱 */ return "chung";
        case 264: /* 蜴 */ return "yik";
        case 267: /* 蜷 */ return "chung";
        case 273: /* 蜻 */ return "ching";
        case 276: /* 蜾 */ return "chung";
        case 277: /* 蜿 */ return "chung";
        }
      case 235:
        switch (octal[2]) {
        case 207: /* 蝇 */ return "ying";
        case 210: /* 蝈 */ return "chung";
        case 211: /* 蝉 */ return "sim";
        case 214: /* 蝌 */ return "foh";
        case 216: /* 蝎 */ return "kit";
        case 223: /* 蝓 */ return "chung";
        case 225: /* 蝕 */ return "sik";
        case 227: /* 蝗 */ return "wong";
        case 231: /* 蝙 */ return "pin";
        case 240: /* 蝠 */ return "fuk";
        case 243: /* 蝣 */ return "chung";
        case 244: /* 蝤 */ return "chung";
        case 245: /* 蝥 */ return "chung";
        case 246: /* 蝦 */ return "ha";
        case 250: /* 蝨 */ return "sat";
        case 256: /* 蝮 */ return "chung";
        case 260: /* 蝰 */ return "chung";
        case 264: /* 蝴 */ return "woo";
        case 266: /* 蝶 */ return "dip";
        case 270: /* 蝸 */ return "woh";
        case 273: /* 蝻 */ return "chung";
        case 274: /* 蝼 */ return "chung";
        case 275: /* 蝽 */ return "chung";
        case 276: /* 蝾 */ return "chung";
        }
      case 236:
        switch (octal[2]) {
        case 202: /* 螂 */ return "long";
        case 203: /* 螃 */ return "pong";
        case 204: /* 螄 */ return "chung";
        case 205: /* 螅 */ return "chung";
        case 210: /* 螈 */ return "chung";
        case 213: /* 螋 */ return "chung";
        case 215: /* 融 */ return "yung";
        case 223: /* 螓 */ return "chung";
        case 227: /* 螗 */ return "chung";
        case 236: /* 螞 */ return "ma";
        case 237: /* 螟 */ return "ming";
        case 242: /* 螢 */ return "ying";
        case 250: /* 螨 */ return "chung";
        case 253: /* 螫 */ return "chung";
        case 254: /* 螬 */ return "chung";
        case 255: /* 螭 */ return "chung";
        case 257: /* 螯 */ return "chung";
        case 263: /* 螳 */ return "tong";
        case 265: /* 螵 */ return "chung";
        case 272: /* 螺 */ return "loh";
        case 273: /* 螻 */ return "chung";
        case 275: /* 螽 */ return "chung";
        }
      case 237:
        switch (octal[2]) {
        case 200: /* 蟀 */ return "sut";
        case 204: /* 蟄 */ return "jik/jit";
        case 210: /* 蟈 */ return "chung";
        case 212: /* 蟊 */ return "chung";
        case 213: /* 蟋 */ return "sik";
        case 221: /* 蟑 */ return "jeung";
        case 222: /* 蟒 */ return "chung";
        case 223: /* 蟓 */ return "chung";
        case 233: /* 蟛 */ return "chung";
        case 240: /* 蟠 */ return "chung";
        case 243: /* 蟣 */ return "chung";
        case 245: /* 蟥 */ return "chung";
        case 252: /* 蟪 */ return "chung";
        case 254: /* 蟬 */ return "sim";
        case 256: /* 蟮 */ return "sin";
        case 257: /* 蟯 */ return "chung";
        case 266: /* 蟶 */ return "chung";
        case 271: /* 蟹 */ return "haai";
        case 273: /* 蟻 */ return "ngai";
        case 276: /* 蟾 */ return "chung";
        }
      case 240:
        switch (octal[2]) {
        case 205: /* 蠅 */ return "ying";
        case 206: /* 蠆 */ return "chung";
        case 212: /* 蠊 */ return "chung";
        case 215: /* 蠍 */ return "kit";
        case 220: /* 蠐 */ return "chung";
        case 221: /* 蠑 */ return "chung";
        case 223: /* 蠓 */ return "chung";
        case 224: /* 蠔 */ return "chung";
        case 225: /* 蠕 */ return "yue";
        case 226: /* 蠖 */ return "chung";
        case 233: /* 蠛 */ return "chung";
        case 237: /* 蠟 */ return "laap";
        case 241: /* 蠡 */ return "chung";
        case 242: /* 蠢 */ return "chun";
        case 243: /* 蠣 */ return "chung";
        case 261: /* 蠱 */ return "goo";
        case 266: /* 蠶 */ return "chaam";
        case 267: /* 蠷 */ return "chung";
        case 271: /* 蠹 */ return "chung";
        case 273: /* 蠻 */ return "maan";
        case 274: /* 蠼 */ return "chung";
        }
      case 241:
        switch (octal[2]) {
        case 200: /* 血 */ return "huet";
        case 204: /* 衄 */ return "nuk";
        case 205: /* 衅 */ return "yan";
        case 214: /* 行 */ return "haang/hang/hong";
        case 215: /* 衍 */ return "hin";
        case 223: /* 術 */ return "sut";
        case 224: /* 衔 */ return "haam";
        case 227: /* 街 */ return "gaai";
        case 231: /* 衙 */ return "nga";
        case 233: /* 衛 */ return "wai";
        case 241: /* 衡 */ return "hang";
        case 242: /* 衢 */ return "kui";
        case 243: /* 衣 */ return "yi";
        case 245: /* 补 */ return "bo";
        case 250: /* 表 */ return "biu";
        case 251: /* 衩 */ return "yi";
        case 253: /* 衫 */ return "saam";
        case 254: /* 衬 */ return "chan";
        case 256: /* 衮 */ return "gwan";
        case 260: /* 衰 */ return "sui";
        case 262: /* 衲 */ return "yi";
        case 267: /* 衷 */ return "chung";
        case 275: /* 衽 */ return "yi";
        case 276: /* 衾 */ return "kam";
        case 277: /* 衿 */ return "yi";
        }
      case 242:
        switch (octal[2]) {
        case 201: /* 袁 */ return "yuen";
        case 202: /* 袂 */ return "yi";
        case 204: /* 袄 */ return "o";
        case 205: /* 袅 */ return "niu";
        case 210: /* 袈 */ return "ga";
        case 213: /* 袋 */ return "doi";
        case 215: /* 袍 */ return "po";
        case 222: /* 袒 */ return "taan";
        case 226: /* 袖 */ return "jau";
        case 234: /* 袜 */ return "mat";
        case 236: /* 袞 */ return "gwan";
        case 242: /* 袢 */ return "yi";
        case 252: /* 袪 */ return "kui";
        case 253: /* 被 */ return "bei";
        case 255: /* 袭 */ return "jaap";
        case 261: /* 袱 */ return "fuk";
        case 267: /* 袷 */ return "yi";
        case 274: /* 袼 */ return "yi";
        }
      case 243:
        switch (octal[2]) {
        case 201: /* 裁 */ return "choi";
        case 202: /* 裂 */ return "lit";
        case 205: /* 装 */ return "jong";
        case 206: /* 裆 */ return "yi";
        case 211: /* 裉 */ return "yi";
        case 212: /* 裊 */ return "niu";
        case 216: /* 裎 */ return "yi";
        case 217: /* 裏 */ return "lui";
        case 224: /* 裔 */ return "yui";
        case 225: /* 裕 */ return "yue";
        case 230: /* 裘 */ return "kau";
        case 231: /* 裙 */ return "kwan";
        case 234: /* 補 */ return "bo";
        case 235: /* 裝 */ return "jong";
        case 237: /* 裟 */ return "sa";
        case 241: /* 裡 */ return "lei/lui";
        case 242: /* 裢 */ return "yi";
        case 243: /* 裣 */ return "yi";
        case 244: /* 裤 */ return "foo";
        case 245: /* 裥 */ return "yi";
        case 250: /* 裨 */ return "yi";
        case 260: /* 裰 */ return "yi";
        case 261: /* 裱 */ return "yi";
        case 263: /* 裳 */ return "seung";
        case 264: /* 裴 */ return "pooi";
        case 270: /* 裸 */ return "loh";
        case 271: /* 裹 */ return "gwoh";
        case 274: /* 裼 */ return "yi";
        case 275: /* 製 */ return "jai";
        case 276: /* 裾 */ return "yi";
        }
      case 244:
        switch (octal[2]) {
        case 202: /* 褂 */ return "kwa";
        case 207: /* 複 */ return "fuk";
        case 212: /* 褊 */ return "yi";
        case 220: /* 褐 */ return "got";
        case 222: /* 褒 */ return "bo";
        case 223: /* 褓 */ return "yi";
        case 231: /* 褙 */ return "yi";
        case 232: /* 褚 */ return "yi";
        case 233: /* 褛 */ return "yi";
        case 241: /* 褡 */ return "yi";
        case 245: /* 褥 */ return "yuk";
        case 252: /* 褪 */ return "tui";
        case 253: /* 褫 */ return "yi";
        case 262: /* 褲 */ return "foo";
        case 263: /* 褳 */ return "yi";
        case 264: /* 褴 */ return "laam";
        case 266: /* 褶 */ return "yi";
        case 270: /* 褸 */ return "yi";
        }
      case 245:
        switch (octal[2]) {
        case 201: /* 襁 */ return "yi";
        case 204: /* 襄 */ return "seung";
        case 211: /* 襉 */ return "yi";
        case 226: /* 襖 */ return "o";
        case 235: /* 襝 */ return "yi";
        case 236: /* 襞 */ return "bik";
        case 237: /* 襟 */ return "kam";
        case 240: /* 襠 */ return "yi";
        case 244: /* 襤 */ return "laam";
        case 246: /* 襦 */ return "yi";
        case 252: /* 襪 */ return "mat";
        case 257: /* 襯 */ return "chan";
        case 262: /* 襲 */ return "jaap";
        case 273: /* 襻 */ return "yi";
        case 277: /* 西 */ return "sai";
        }
      case 246:
        switch (octal[2]) {
        case 201: /* 要 */ return "yiu";
        case 203: /* 覃 */ return "taam";
        case 206: /* 覆 */ return "fuk";
        case 213: /* 見 */ return "gin";
        case 217: /* 規 */ return "kwai";
        case 223: /* 覓 */ return "mik";
        case 230: /* 覘 */ return "gin";
        case 241: /* 覡 */ return "gin";
        case 246: /* 覦 */ return "gin";
        case 252: /* 親 */ return "chan";
        case 254: /* 覬 */ return "gin";
        case 257: /* 覯 */ return "gin";
        case 262: /* 覲 */ return "gin";
        case 267: /* 覷 */ return "gin";
        case 272: /* 覺 */ return "gok";
        case 275: /* 覽 */ return "laam";
        case 277: /* 覿 */ return "gin";
        }
      case 247:
        switch (octal[2]) {
        case 200: /* 觀 */ return "goon";
        case 201: /* 见 */ return "gin";
        case 202: /* 观 */ return "goon";
        case 204: /* 规 */ return "kwai";
        case 205: /* 觅 */ return "mik";
        case 206: /* 视 */ return "si";
        case 207: /* 觇 */ return "gin";
        case 210: /* 览 */ return "laam";
        case 211: /* 觉 */ return "gok";
        case 212: /* 觊 */ return "gin";
        case 213: /* 觋 */ return "gin";
        case 214: /* 觌 */ return "gin";
        case 216: /* 觎 */ return "gin";
        case 217: /* 觏 */ return "gin";
        case 220: /* 觐 */ return "gin";
        case 221: /* 觑 */ return "gin";
        case 222: /* 角 */ return "gok";
        case 226: /* 觖 */ return "gok";
        case 232: /* 觚 */ return "gok";
        case 234: /* 觜 */ return "gok";
        case 236: /* 觞 */ return "gok";
        case 243: /* 解 */ return "gaai";
        case 245: /* 觥 */ return "gok";
        case 246: /* 触 */ return "juk";
        case 253: /* 觫 */ return "gok";
        case 257: /* 觯 */ return "gok";
        case 264: /* 觴 */ return "gok";
        case 266: /* 觶 */ return "gok";
        case 270: /* 觸 */ return "juk";
        }
      case 250:
        switch (octal[2]) {
        case 200: /* 言 */ return "yin";
        case 202: /* 訂 */ return "ding";
        case 203: /* 訃 */ return "foo";
        case 210: /* 計 */ return "gai";
        case 212: /* 訊 */ return "sun";
        case 214: /* 訌 */ return "yin";
        case 216: /* 討 */ return "to";
        case 220: /* 訐 */ return "yin";
        case 223: /* 訓 */ return "fan";
        case 225: /* 訕 */ return "yin";
        case 226: /* 訖 */ return "kai";
        case 230: /* 記 */ return "gei";
        case 233: /* 訛 */ return "ngoh";
        case 235: /* 訝 */ return "nga";
        case 237: /* 訟 */ return "jung";
        case 243: /* 訣 */ return "kuet";
        case 245: /* 訥 */ return "naap";
        case 252: /* 訪 */ return "fong";
        case 255: /* 設 */ return "chit";
        case 261: /* 許 */ return "hui";
        case 264: /* 訴 */ return "so";
        case 266: /* 訶 */ return "yin";
        case 272: /* 診 */ return "chan";
        case 273: /* 註 */ return "jue";
        case 274: /* 証 */ return "jing";
        }
      case 251:
        switch (octal[2]) {
        case 201: /* 詁 */ return "yin";
        case 206: /* 詆 */ return "yin";
        case 210: /* 詈 */ return "yin";
        case 216: /* 詎 */ return "yin";
        case 220: /* 詐 */ return "ja";
        case 222: /* 詒 */ return "yin";
        case 224: /* 詔 */ return "jiu";
        case 225: /* 評 */ return "ping";
        case 233: /* 詛 */ return "jui";
        case 236: /* 詞 */ return "chi";
        case 240: /* 詠 */ return "wing";
        case 241: /* 詡 */ return "hui";
        case 242: /* 詢 */ return "sun";
        case 243: /* 詣 */ return "ngai";
        case 246: /* 試 */ return "si";
        case 251: /* 詩 */ return "si";
        case 253: /* 詫 */ return "cha";
        case 254: /* 詬 */ return "yin";
        case 255: /* 詭 */ return "gwai";
        case 256: /* 詮 */ return "yin";
        case 260: /* 詰 */ return "yin";
        case 261: /* 話 */ return "wa";
        case 262: /* 該 */ return "goi";
        case 263: /* 詳 */ return "cheung";
        case 265: /* 詵 */ return "yin";
        case 271: /* 詹 */ return "jim";
        case 274: /* 詼 */ return "fooi";
        case 277: /* 詿 */ return "yin";
        }
      case 252:
        switch (octal[2]) {
        case 204: /* 誄 */ return "yin";
        case 205: /* 誅 */ return "jue";
        case 206: /* 誆 */ return "yin";
        case 207: /* 誇 */ return "kwa";
        case 211: /* 誉 */ return "yue";
        case 212: /* 誊 */ return "tung";
        case 214: /* 誌 */ return "ji";
        case 215: /* 認 */ return "ying";
        case 221: /* 誑 */ return "yin";
        case 222: /* 誒 */ return "yin";
        case 223: /* 誓 */ return "sai";
        case 225: /* 誕 */ return "daan";
        case 230: /* 誘 */ return "yau";
        case 232: /* 誚 */ return "yin";
        case 236: /* 語 */ return "yue";
        case 240: /* 誠 */ return "sing";
        case 241: /* 誡 */ return "gaai";
        case 243: /* 誣 */ return "mo";
        case 244: /* 誤 */ return "ng";
        case 245: /* 誥 */ return "go";
        case 246: /* 誦 */ return "jung";
        case 250: /* 誨 */ return "fooi";
        case 252: /* 說 */ return "suet";
        case 260: /* 誰 */ return "sui";
        case 262: /* 課 */ return "foh";
        case 266: /* 誶 */ return "yin";
        case 271: /* 誹 */ return "fei";
        case 274: /* 誼 */ return "yi";
        case 277: /* 調 */ return "diu/tiu";
        }
      case 253:
        switch (octal[2]) {
        case 202: /* 諂 */ return "yin";
        case 204: /* 諄 */ return "sun";
        case 207: /* 談 */ return "taam";
        case 211: /* 諉 */ return "yin";
        case 213: /* 請 */ return "cheng/ching";
        case 215: /* 諍 */ return "yin";
        case 217: /* 諏 */ return "yin";
        case 221: /* 諑 */ return "yin";
        case 222: /* 諒 */ return "leung";
        case 226: /* 論 */ return "lun";
        case 227: /* 諗 */ return "nam";
        case 233: /* 諛 */ return "yin";
        case 234: /* 諜 */ return "dip";
        case 236: /* 諞 */ return "yin";
        case 242: /* 諢 */ return "wan";
        case 244: /* 諤 */ return "ngok";
        case 246: /* 諦 */ return "tai";
        case 247: /* 諧 */ return "haai";
        case 253: /* 諫 */ return "gaan";
        case 255: /* 諭 */ return "yue";
        case 256: /* 諮 */ return "ji";
        case 261: /* 諱 */ return "wai";
        case 263: /* 諳 */ return "am";
        case 266: /* 諶 */ return "yin";
        case 267: /* 諷 */ return "fung";
        case 270: /* 諸 */ return "jue";
        case 272: /* 諺 */ return "yin";
        case 274: /* 諼 */ return "yin";
        case 276: /* 諾 */ return "nok";
        }
      case 254:
        switch (octal[2]) {
        case 200: /* 謀 */ return "mau";
        case 201: /* 謁 */ return "yit";
        case 202: /* 謂 */ return "wai";
        case 204: /* 謄 */ return "tung";
        case 205: /* 謅 */ return "jau";
        case 212: /* 謊 */ return "fong";
        case 216: /* 謎 */ return "mai";
        case 220: /* 謐 */ return "mat";
        case 224: /* 謔 */ return "yeuk";
        case 226: /* 謖 */ return "yin";
        case 227: /* 謗 */ return "pong";
        case 231: /* 謙 */ return "him";
        case 232: /* 謚 */ return "si";
        case 233: /* 講 */ return "gong";
        case 235: /* 謝 */ return "je";
        case 240: /* 謠 */ return "yiu";
        case 250: /* 謨 */ return "yin";
        case 253: /* 謫 */ return "jaak";
        case 254: /* 謬 */ return "mau";
        case 263: /* 謳 */ return "yin";
        case 271: /* 謹 */ return "gan";
        }
      case 255:
        switch (octal[2]) {
        case 211: /* 證 */ return "jing";
        case 216: /* 譎 */ return "kuet";
        case 217: /* 譏 */ return "gei";
        case 226: /* 譖 */ return "jam";
        case 230: /* 識 */ return "sik";
        case 231: /* 譙 */ return "yin";
        case 232: /* 譚 */ return "taam";
        case 234: /* 譜 */ return "po";
        case 246: /* 警 */ return "ging";
        case 253: /* 譫 */ return "jim";
        case 254: /* 譬 */ return "pei";
        case 257: /* 譯 */ return "yik";
        case 260: /* 議 */ return "yi";
        case 264: /* 譴 */ return "hin";
        case 267: /* 護 */ return "woo";
        case 275: /* 譽 */ return "yue";
        case 276: /* 譾 */ return "yin";
        }
      case 256:
        switch (octal[2]) {
        case 200: /* 讀 */ return "duk";
        case 212: /* 變 */ return "bin";
        case 222: /* 讒 */ return "chaam";
        case 223: /* 讓 */ return "yeung";
        case 225: /* 讕 */ return "laan";
        case 226: /* 讖 */ return "cham";
        case 232: /* 讚 */ return "jaan";
        case 234: /* 讜 */ return "yin";
        case 236: /* 讞 */ return "yin";
        case 241: /* 计 */ return "gai";
        case 242: /* 订 */ return "ding";
        case 243: /* 讣 */ return "foo";
        case 244: /* 认 */ return "ying";
        case 245: /* 讥 */ return "gei";
        case 246: /* 讦 */ return "yin";
        case 247: /* 讧 */ return "yin";
        case 250: /* 讨 */ return "to";
        case 251: /* 让 */ return "yeung";
        case 252: /* 讪 */ return "yin";
        case 253: /* 讫 */ return "kai";
        case 255: /* 训 */ return "fan";
        case 256: /* 议 */ return "yi";
        case 257: /* 讯 */ return "sun";
        case 260: /* 记 */ return "gei";
        case 262: /* 讲 */ return "gong";
        case 263: /* 讳 */ return "wai";
        case 264: /* 讴 */ return "yin";
        case 265: /* 讵 */ return "yin";
        case 266: /* 讶 */ return "nga";
        case 267: /* 讷 */ return "naap";
        case 270: /* 许 */ return "hui";
        case 271: /* 讹 */ return "ngoh";
        case 272: /* 论 */ return "lun";
        case 274: /* 讼 */ return "jung";
        case 275: /* 讽 */ return "fung";
        case 276: /* 设 */ return "chit";
        case 277: /* 访 */ return "fong";
        }
      case 257:
        switch (octal[2]) {
        case 200: /* 诀 */ return "kuet";
        case 201: /* 证 */ return "jing";
        case 202: /* 诂 */ return "yin";
        case 203: /* 诃 */ return "yin";
        case 204: /* 评 */ return "ping";
        case 205: /* 诅 */ return "jui";
        case 206: /* 识 */ return "sik";
        case 210: /* 诈 */ return "ja";
        case 211: /* 诉 */ return "so";
        case 212: /* 诊 */ return "chan";
        case 213: /* 诋 */ return "yin";
        case 214: /* 诌 */ return "jau";
        case 215: /* 词 */ return "chi";
        case 216: /* 诎 */ return "yin";
        case 217: /* 诏 */ return "jiu";
        case 221: /* 译 */ return "yik";
        case 222: /* 诒 */ return "yin";
        case 223: /* 诓 */ return "yin";
        case 224: /* 诔 */ return "yin";
        case 225: /* 试 */ return "si";
        case 226: /* 诖 */ return "yin";
        case 227: /* 诗 */ return "si";
        case 230: /* 诘 */ return "yin";
        case 231: /* 诙 */ return "fooi";
        case 232: /* 诚 */ return "sing";
        case 233: /* 诛 */ return "jue";
        case 234: /* 诜 */ return "yin";
        case 235: /* 话 */ return "wa";
        case 236: /* 诞 */ return "daan";
        case 237: /* 诟 */ return "yin";
        case 240: /* 诠 */ return "yin";
        case 241: /* 诡 */ return "gwai";
        case 242: /* 询 */ return "sun";
        case 243: /* 诣 */ return "ngai";
        case 244: /* 诤 */ return "yin";
        case 245: /* 该 */ return "goi";
        case 246: /* 详 */ return "cheung";
        case 247: /* 诧 */ return "cha";
        case 250: /* 诨 */ return "wan";
        case 251: /* 诩 */ return "hui";
        case 253: /* 诫 */ return "gaai";
        case 254: /* 诬 */ return "mo";
        case 255: /* 语 */ return "yue";
        case 256: /* 诮 */ return "yin";
        case 257: /* 误 */ return "ng";
        case 260: /* 诰 */ return "go";
        case 261: /* 诱 */ return "yau";
        case 262: /* 诲 */ return "fooi";
        case 263: /* 诳 */ return "yin";
        case 264: /* 说 */ return "suet";
        case 265: /* 诵 */ return "jung";
        case 266: /* 诶 */ return "yin";
        case 267: /* 请 */ return "cheng/ching";
        case 270: /* 诸 */ return "jue";
        case 271: /* 诹 */ return "yin";
        case 272: /* 诺 */ return "nok";
        case 273: /* 读 */ return "duk";
        case 274: /* 诼 */ return "yin";
        case 275: /* 诽 */ return "fei";
        case 276: /* 课 */ return "foh";
        case 277: /* 诿 */ return "yin";
        }
      case 260:
        switch (octal[2]) {
        case 200: /* 谀 */ return "yin";
        case 201: /* 谁 */ return "sui";
        case 202: /* 谂 */ return "nam";
        case 203: /* 调 */ return "diu/tiu";
        case 204: /* 谄 */ return "yin";
        case 205: /* 谅 */ return "leung";
        case 206: /* 谆 */ return "sun";
        case 207: /* 谇 */ return "yin";
        case 210: /* 谈 */ return "taam";
        case 212: /* 谊 */ return "yi";
        case 213: /* 谋 */ return "mau";
        case 214: /* 谌 */ return "yin";
        case 215: /* 谍 */ return "dip";
        case 216: /* 谎 */ return "fong";
        case 217: /* 谏 */ return "gaan";
        case 220: /* 谐 */ return "haai";
        case 221: /* 谑 */ return "yeuk";
        case 222: /* 谒 */ return "yit";
        case 223: /* 谓 */ return "wai";
        case 224: /* 谔 */ return "ngok";
        case 225: /* 谕 */ return "yue";
        case 226: /* 谖 */ return "yin";
        case 227: /* 谗 */ return "chaam";
        case 230: /* 谘 */ return "ji";
        case 231: /* 谙 */ return "am";
        case 232: /* 谚 */ return "yin";
        case 233: /* 谛 */ return "tai";
        case 234: /* 谜 */ return "mai";
        case 235: /* 谝 */ return "yin";
        case 237: /* 谟 */ return "yin";
        case 240: /* 谠 */ return "yin";
        case 241: /* 谡 */ return "yin";
        case 242: /* 谢 */ return "je";
        case 243: /* 谣 */ return "yiu";
        case 244: /* 谤 */ return "pong";
        case 245: /* 谥 */ return "si";
        case 246: /* 谦 */ return "him";
        case 247: /* 谧 */ return "mat";
        case 250: /* 谨 */ return "gan";
        case 252: /* 谪 */ return "jaak";
        case 253: /* 谫 */ return "yin";
        case 254: /* 谬 */ return "mau";
        case 255: /* 谭 */ return "taam";
        case 256: /* 谮 */ return "jam";
        case 257: /* 谯 */ return "yin";
        case 260: /* 谰 */ return "laan";
        case 261: /* 谱 */ return "po";
        case 262: /* 谲 */ return "kuet";
        case 263: /* 谳 */ return "yin";
        case 264: /* 谴 */ return "hin";
        case 265: /* 谵 */ return "jim";
        case 266: /* 谶 */ return "cham";
        case 267: /* 谷 */ return "guk";
        }
      case 261:
        switch (octal[2]) {
        case 201: /* 豁 */ return "koot";
        case 206: /* 豆 */ return "dau";
        case 210: /* 豈 */ return "hei";
        case 211: /* 豉 */ return "si";
        case 214: /* 豌 */ return "woon";
        case 216: /* 豎 */ return "sue";
        case 220: /* 豐 */ return "fung";
        case 232: /* 豚 */ return "yuk";
        case 241: /* 象 */ return "jeung";
        case 242: /* 豢 */ return "kuen";
        case 252: /* 豪 */ return "ho";
        case 253: /* 豫 */ return "yue";
        case 254: /* 豬 */ return "jue";
        case 263: /* 豳 */ return "saan";
        case 271: /* 豹 */ return "paau";
        case 272: /* 豺 */ return "chaai";
        }
      }
    case 357:
      switch (octal[1]) {
      case 277:
        switch (octal[2]) {
        case 275: /* ��� */ return "si";
        }
      }
    }
    return null;
  }

}
