package org.cghio.cantonese.romanization;

public class Hanzi2PinyinData3 {

  /**
   * Returns Cantonese Pinyin of a Chinese character.
   * @param octal integer array of the octal values of each byte of a Chinese character
   */
  public static String fromChar(int[] octal) {
    switch (octal[0]) {
    case 350:
      switch (octal[1]) {
      case 262:
        switch (octal[2]) {
        case 202: /* 貂 */ return "diu";
        case 205: /* 貅 */ return "pao";
        case 211: /* 貉 */ return "lok";
        case 212: /* 貊 */ return "pao";
        case 214: /* 貌 */ return "maau";
        case 215: /* 貍 */ return "lei";
        case 223: /* 貓 */ return "maau";
        case 224: /* 貔 */ return "pao";
        case 230: /* 貘 */ return "pao";
        case 235: /* 貝 */ return "booi";
        case 236: /* 貞 */ return "jing";
        case 240: /* 負 */ return "foo";
        case 241: /* 財 */ return "choi";
        case 242: /* 貢 */ return "gung";
        case 247: /* 貧 */ return "pan";
        case 250: /* 貨 */ return "foh";
        case 251: /* 販 */ return "faan";
        case 252: /* 貪 */ return "taam";
        case 253: /* 貫 */ return "goon";
        case 254: /* 責 */ return "jaak";
        case 257: /* 貯 */ return "chue";
        case 260: /* 貰 */ return "booi";
        case 262: /* 貲 */ return "booi";
        case 264: /* 貴 */ return "gwai";
        case 266: /* 貶 */ return "bin";
        case 267: /* 買 */ return "maai";
        case 270: /* 貸 */ return "taai";
        case 272: /* 貺 */ return "booi";
        case 273: /* 費 */ return "fai";
        case 274: /* 貼 */ return "tip";
        case 275: /* 貽 */ return "booi";
        case 277: /* 貿 */ return "mau";
        }
      case 263:
        switch (octal[2]) {
        case 200: /* 賀 */ return "hoh";
        case 201: /* 賁 */ return "booi";
        case 202: /* 賂 */ return "lo";
        case 203: /* 賃 */ return "yam";
        case 204: /* 賄 */ return "kooi";
        case 205: /* 賅 */ return "booi";
        case 207: /* 資 */ return "ji";
        case 210: /* 賈 */ return "ga";
        case 212: /* 賊 */ return "chaak";
        case 221: /* 賑 */ return "jan";
        case 222: /* 賒 */ return "se";
        case 223: /* 賓 */ return "ban";
        case 225: /* 賕 */ return "booi";
        case 232: /* 賚 */ return "booi";
        case 234: /* 賜 */ return "chi";
        case 236: /* 賞 */ return "seung";
        case 240: /* 賠 */ return "pooi";
        case 242: /* 賢 */ return "yin";
        case 243: /* 賣 */ return "maai";
        case 244: /* 賤 */ return "jin";
        case 246: /* 賦 */ return "foo";
        case 247: /* 賧 */ return "booi";
        case 252: /* 質 */ return "jat";
        case 254: /* 賬 */ return "jeung";
        case 255: /* 賭 */ return "do";
        case 264: /* 賴 */ return "laai";
        case 272: /* 賺 */ return "jaan";
        case 273: /* 賻 */ return "foo";
        case 274: /* 購 */ return "kau";
        case 275: /* 賽 */ return "choi";
        }
      case 264:
        switch (octal[2]) {
        case 204: /* 贄 */ return "booi";
        case 205: /* 贅 */ return "jui";
        case 210: /* 贈 */ return "jang";
        case 212: /* 贊 */ return "jaan";
        case 215: /* 贍 */ return "jim";
        case 217: /* 贏 */ return "ying";
        case 220: /* 贐 */ return "booi";
        case 223: /* 贓 */ return "jong";
        case 226: /* 贖 */ return "suk";
        case 227: /* 贗 */ return "ying";
        case 233: /* 贛 */ return "gung";
        case 235: /* 贝 */ return "booi";
        case 236: /* 贞 */ return "jing";
        case 237: /* 负 */ return "foo";
        case 241: /* 贡 */ return "gung";
        case 242: /* 财 */ return "choi";
        case 243: /* 责 */ return "jaak";
        case 244: /* 贤 */ return "yin";
        case 245: /* 败 */ return "baai";
        case 246: /* 账 */ return "jeung";
        case 247: /* 货 */ return "foh";
        case 250: /* 质 */ return "jat";
        case 251: /* 贩 */ return "faan";
        case 252: /* 贪 */ return "taam";
        case 254: /* 贬 */ return "bin";
        case 255: /* 购 */ return "kau";
        case 256: /* 贮 */ return "chue";
        case 257: /* 贯 */ return "goon";
        case 261: /* 贱 */ return "jin";
        case 262: /* 贲 */ return "booi";
        case 263: /* 贳 */ return "booi";
        case 264: /* 贴 */ return "tip";
        case 265: /* 贵 */ return "gwai";
        case 266: /* 贶 */ return "booi";
        case 267: /* 贷 */ return "taai";
        case 270: /* 贸 */ return "mau";
        case 271: /* 费 */ return "fai";
        case 272: /* 贺 */ return "hoh";
        case 273: /* 贻 */ return "booi";
        case 274: /* 贼 */ return "chaak";
        case 275: /* 贽 */ return "booi";
        case 276: /* 贾 */ return "ga";
        case 277: /* 贿 */ return "kooi";
        }
      case 265:
        switch (octal[2]) {
        case 200: /* 赀 */ return "booi";
        case 201: /* 赁 */ return "yam";
        case 202: /* 赂 */ return "lo";
        case 203: /* 赃 */ return "jong";
        case 204: /* 资 */ return "ji";
        case 205: /* 赅 */ return "booi";
        case 206: /* 赆 */ return "booi";
        case 207: /* 赇 */ return "booi";
        case 210: /* 赈 */ return "jan";
        case 211: /* 赉 */ return "booi";
        case 212: /* 赊 */ return "se";
        case 213: /* 赋 */ return "foo";
        case 214: /* 赌 */ return "do";
        case 215: /* 赍 */ return "booi";
        case 216: /* 赎 */ return "suk";
        case 217: /* 赏 */ return "seung";
        case 220: /* 赐 */ return "chi";
        case 224: /* 赔 */ return "pooi";
        case 225: /* 赕 */ return "booi";
        case 226: /* 赖 */ return "laai";
        case 230: /* 赘 */ return "jui";
        case 231: /* 赙 */ return "foo";
        case 232: /* 赚 */ return "jaan";
        case 233: /* 赛 */ return "choi";
        case 235: /* 赝 */ return "ying";
        case 236: /* 赞 */ return "jaan";
        case 240: /* 赠 */ return "jang";
        case 241: /* 赡 */ return "jim";
        case 242: /* 赢 */ return "ying";
        case 243: /* 赣 */ return "gung";
        case 244: /* 赤 */ return "chik";
        case 246: /* 赦 */ return "se";
        case 253: /* 赫 */ return "hak";
        case 260: /* 走 */ return "jau";
        case 263: /* 赳 */ return "jau";
        case 264: /* 赴 */ return "foo";
        case 265: /* 赵 */ return "jiu";
        case 266: /* 赶 */ return "gon";
        case 267: /* 起 */ return "hei";
        }
      case 266:
        switch (octal[2]) {
        case 201: /* 趁 */ return "chan";
        case 204: /* 趄 */ return "jau";
        case 205: /* 超 */ return "chiu";
        case 212: /* 越 */ return "yuet";
        case 213: /* 趋 */ return "chui";
        case 221: /* 趑 */ return "jau";
        case 224: /* 趔 */ return "jau";
        case 225: /* 趕 */ return "gon";
        case 231: /* 趙 */ return "jiu";
        case 237: /* 趟 */ return "tong";
        case 243: /* 趣 */ return "chui";
        case 250: /* 趨 */ return "chui";
        case 261: /* 趱 */ return "jau";
        case 262: /* 趲 */ return "jau";
        case 263: /* 足 */ return "juk";
        case 264: /* 趴 */ return "pa";
        case 265: /* 趵 */ return "juk";
        case 270: /* 趸 */ return "juk";
        case 272: /* 趺 */ return "juk";
        case 274: /* 趼 */ return "juk";
        case 276: /* 趾 */ return "ji";
        case 277: /* 趿 */ return "juk";
        }
      case 267:
        switch (octal[2]) {
        case 203: /* 跃 */ return "yeuk";
        case 204: /* 跄 */ return "juk";
        case 206: /* 跆 */ return "juk";
        case 213: /* 跋 */ return "bat";
        case 214: /* 跌 */ return "dit";
        case 216: /* 跎 */ return "juk";
        case 217: /* 跏 */ return "juk";
        case 221: /* 跑 */ return "paau";
        case 226: /* 跖 */ return "tok";
        case 227: /* 跗 */ return "juk";
        case 232: /* 跚 */ return "saan";
        case 233: /* 跛 */ return "poh";
        case 235: /* 距 */ return "kui";
        case 236: /* 跞 */ return "juk";
        case 237: /* 跟 */ return "gan";
        case 241: /* 跡 */ return "jik";
        case 243: /* 跣 */ return "juk";
        case 244: /* 跤 */ return "gaau";
        case 250: /* 跨 */ return "kwa";
        case 252: /* 跪 */ return "gwai";
        case 253: /* 跫 */ return "juk";
        case 254: /* 跬 */ return "juk";
        case 257: /* 路 */ return "lo";
        case 263: /* 跳 */ return "tiu";
        case 265: /* 践 */ return "jin";
        case 267: /* 跷 */ return "juk";
        case 270: /* 跸 */ return "juk";
        case 271: /* 跹 */ return "juk";
        case 272: /* 跺 */ return "doh";
        case 273: /* 跻 */ return "juk";
        case 275: /* 跽 */ return "juk";
        }
      case 270:
        switch (octal[2]) {
        case 205: /* 踅 */ return "juk";
        case 211: /* 踉 */ return "juk";
        case 212: /* 踊 */ return "yung";
        case 214: /* 踌 */ return "chau";
        case 217: /* 踏 */ return "daap";
        case 220: /* 踐 */ return "jin";
        case 224: /* 踔 */ return "juk";
        case 235: /* 踝 */ return "juk";
        case 236: /* 踞 */ return "gui";
        case 237: /* 踟 */ return "chi";
        case 242: /* 踢 */ return "tek";
        case 243: /* 踣 */ return "juk";
        case 251: /* 踩 */ return "chaai";
        case 252: /* 踪 */ return "jung";
        case 254: /* 踬 */ return "juk";
        case 256: /* 踮 */ return "juk";
        case 257: /* 踯 */ return "juk";
        case 261: /* 踱 */ return "dok";
        case 264: /* 踴 */ return "yung";
        case 265: /* 踵 */ return "juk";
        case 271: /* 踹 */ return "juk";
        case 272: /* 踺 */ return "jau/juk";
        case 275: /* 踽 */ return "juk";
        }
      case 271:
        switch (octal[2]) {
        case 200: /* 蹀 */ return "juk";
        case 201: /* 蹁 */ return "juk";
        case 202: /* 蹂 */ return "juk";
        case 204: /* 蹄 */ return "tai";
        case 210: /* 蹈 */ return "to";
        case 211: /* 蹉 */ return "juk";
        case 212: /* 蹊 */ return "juk";
        case 213: /* 蹋 */ return "taap";
        case 214: /* 蹌 */ return "juk";
        case 221: /* 蹑 */ return "juk";
        case 222: /* 蹒 */ return "moon";
        case 225: /* 蹕 */ return "juk";
        case 231: /* 蹙 */ return "juk";
        case 243: /* 蹣 */ return "moon";
        case 244: /* 蹤 */ return "jung";
        case 246: /* 蹦 */ return "baang";
        case 251: /* 蹩 */ return "juk";
        case 254: /* 蹬 */ return "dang";
        case 255: /* 蹭 */ return "jang";
        case 257: /* 蹯 */ return "juk";
        case 260: /* 蹰 */ return "chue";
        case 262: /* 蹲 */ return "juen";
        case 264: /* 蹴 */ return "juk";
        case 266: /* 蹶 */ return "juk";
        case 272: /* 蹺 */ return "juk";
        case 274: /* 蹼 */ return "juk";
        case 277: /* 蹿 */ return "chuen";
        }
      case 272:
        switch (octal[2]) {
        case 201: /* 躁 */ return "cho";
        case 205: /* 躅 */ return "juk";
        case 207: /* 躇 */ return "chue";
        case 211: /* 躉 */ return "juk";
        case 212: /* 躊 */ return "chau/chau$";
        case 213: /* 躋 */ return "juk";
        case 215: /* 躍 */ return "yeuk";
        case 217: /* 躏 */ return "juk";
        case 220: /* 躐 */ return "juk";
        case 221: /* 躑 */ return "juk";
        case 223: /* 躓 */ return "juk";
        case 224: /* 躔 */ return "juk";
        case 225: /* 躕 */ return "chue";
        case 232: /* 躚 */ return "juk";
        case 234: /* 躜 */ return "juk";
        case 236: /* 躞 */ return "juk";
        case 241: /* 躡 */ return "juk";
        case 245: /* 躥 */ return "chuen";
        case 246: /* 躦 */ return "juk";
        case 252: /* 躪 */ return "juk";
        case 253: /* 身 */ return "san";
        case 254: /* 躬 */ return "gung";
        case 257: /* 躯 */ return "kui";
        case 262: /* 躲 */ return "doh";
        case 272: /* 躺 */ return "tong";
        }
      case 273:
        switch (octal[2]) {
        case 200: /* 軀 */ return "kui";
        case 212: /* 車 */ return "che";
        case 213: /* 軋 */ return "jaat";
        case 214: /* 軌 */ return "gwai";
        case 215: /* 軍 */ return "gwan";
        case 216: /* 軎 */ return "che";
        case 222: /* 軒 */ return "hin";
        case 224: /* 軔 */ return "che";
        case 233: /* 軛 */ return "che";
        case 237: /* 軟 */ return "yuen";
        case 253: /* 軫 */ return "che";
        case 270: /* 軸 */ return "juk";
        case 271: /* 軹 */ return "che";
        case 272: /* 軺 */ return "che";
        case 273: /* 軻 */ return "oh";
        case 274: /* 軼 */ return "dit";
        case 276: /* 軾 */ return "sik";
        }
      case 274:
        switch (octal[2]) {
        case 203: /* 較 */ return "gaau";
        case 205: /* 輅 */ return "che";
        case 207: /* 輇 */ return "che";
        case 211: /* 載 */ return "joi";
        case 212: /* 輊 */ return "che";
        case 222: /* 輒 */ return "che";
        case 224: /* 輔 */ return "foo";
        case 225: /* 輕 */ return "hing";
        case 233: /* 輛 */ return "leung";
        case 234: /* 輜 */ return "che";
        case 235: /* 輝 */ return "fai";
        case 236: /* 輞 */ return "che";
        case 237: /* 輟 */ return "che";
        case 245: /* 輥 */ return "kwan";
        case 251: /* 輩 */ return "booi";
        case 252: /* 輪 */ return "lun";
        case 257: /* 輯 */ return "chap";
        case 263: /* 輳 */ return "che";
        case 270: /* 輸 */ return "sue";
        case 273: /* 輻 */ return "fuk";
        case 276: /* 輾 */ return "jin";
        case 277: /* 輿 */ return "yue";
        }
      case 275:
        switch (octal[2]) {
        case 204: /* 轄 */ return "hat";
        case 205: /* 轅 */ return "yuen";
        case 206: /* 轆 */ return "che";
        case 211: /* 轉 */ return "juen";
        case 215: /* 轍 */ return "chit";
        case 216: /* 轎 */ return "kiu";
        case 224: /* 轔 */ return "lun";
        case 237: /* 轟 */ return "gwang";
        case 241: /* 轡 */ return "bei";
        case 242: /* 轢 */ return "che";
        case 244: /* 轤 */ return "che";
        case 246: /* 车 */ return "che";
        case 247: /* 轧 */ return "jaat";
        case 250: /* 轨 */ return "gwai";
        case 251: /* 轩 */ return "hin";
        case 253: /* 轫 */ return "che";
        case 254: /* 转 */ return "juen";
        case 255: /* 轭 */ return "che";
        case 256: /* 轮 */ return "lun";
        case 257: /* 软 */ return "yuen";
        case 260: /* 轰 */ return "gwang";
        case 261: /* 轱 */ return "che";
        case 262: /* 轲 */ return "oh";
        case 263: /* 轳 */ return "che";
        case 264: /* 轴 */ return "juk";
        case 265: /* 轵 */ return "che";
        case 266: /* 轶 */ return "dit";
        case 267: /* 轷 */ return "che";
        case 270: /* 轸 */ return "che";
        case 271: /* 轹 */ return "che";
        case 272: /* 轺 */ return "che";
        case 273: /* 轻 */ return "hing";
        case 274: /* 轼 */ return "sik";
        case 275: /* 载 */ return "joi";
        case 276: /* 轾 */ return "che";
        case 277: /* 轿 */ return "kiu";
        }
      case 276:
        switch (octal[2]) {
        case 201: /* 辁 */ return "che";
        case 202: /* 辂 */ return "che";
        case 203: /* 较 */ return "gaau";
        case 204: /* 辄 */ return "che";
        case 205: /* 辅 */ return "foo";
        case 206: /* 辆 */ return "leung";
        case 210: /* 辈 */ return "booi";
        case 211: /* 辉 */ return "fai";
        case 212: /* 辊 */ return "kwan";
        case 213: /* 辋 */ return "che";
        case 215: /* 辍 */ return "che";
        case 216: /* 辎 */ return "che";
        case 217: /* 辏 */ return "che";
        case 220: /* 辐 */ return "fuk";
        case 221: /* 辑 */ return "chap";
        case 223: /* 输 */ return "sue";
        case 224: /* 辔 */ return "bei";
        case 225: /* 辕 */ return "yuen";
        case 226: /* 辖 */ return "hat";
        case 227: /* 辗 */ return "jin";
        case 230: /* 辘 */ return "che";
        case 231: /* 辙 */ return "chit";
        case 232: /* 辚 */ return "lun";
        case 233: /* 辛 */ return "san";
        case 234: /* 辜 */ return "goo";
        case 236: /* 辞 */ return "chi";
        case 237: /* 辟 */ return "pik";
        case 243: /* 辣 */ return "laat";
        case 246: /* 辦 */ return "baan";
        case 250: /* 辨 */ return "bin";
        case 251: /* 辩 */ return "bin";
        case 253: /* 辫 */ return "bin";
        case 255: /* 辭 */ return "chi";
        case 256: /* 辮 */ return "bin";
        case 257: /* 辯 */ return "bin";
        case 260: /* 辰 */ return "san";
        case 261: /* 辱 */ return "yuk";
        case 262: /* 農 */ return "nung";
        case 271: /* 边 */ return "bin";
        case 275: /* 辽 */ return "liu";
        case 276: /* 达 */ return "daat";
        }
      case 277:
        switch (octal[2]) {
        case 201: /* 迁 */ return "chin";
        case 202: /* 迂 */ return "yue";
        case 204: /* 迄 */ return "ngat";
        case 205: /* 迅 */ return "sun";
        case 207: /* 过 */ return "gwoh";
        case 210: /* 迈 */ return "maai";
        case 216: /* 迎 */ return "ying";
        case 220: /* 运 */ return "wan";
        case 221: /* 近 */ return "gan";
        case 223: /* 迓 */ return "teng";
        case 224: /* 返 */ return "faan";
        case 225: /* 迕 */ return "teng";
        case 230: /* 还 */ return "waan";
        case 231: /* 这 */ return "je";
        case 233: /* 进 */ return "jun";
        case 234: /* 远 */ return "yuen";
        case 235: /* 违 */ return "wai";
        case 236: /* 连 */ return "lin";
        case 237: /* 迟 */ return "chi";
        case 242: /* 迢 */ return "chiu";
        case 244: /* 迤 */ return "teng";
        case 245: /* 迥 */ return "teng";
        case 246: /* 迦 */ return "teng";
        case 250: /* 迨 */ return "teng";
        case 251: /* 迩 */ return "teng";
        case 252: /* 迪 */ return "dik";
        case 253: /* 迫 */ return "baak";
        case 255: /* 迭 */ return "dit";
        case 256: /* 迮 */ return "teng";
        case 260: /* 述 */ return "sut";
        case 263: /* 迳 */ return "teng";
        case 267: /* 迷 */ return "mai";
        case 270: /* 迸 */ return "bing";
        case 271: /* 迹 */ return "jik";
        case 275: /* 追 */ return "jui";
        }
      }
    case 351:
      switch (octal[1]) {
      case 200:
        switch (octal[2]) {
        case 200: /* 退 */ return "tui";
        case 201: /* 送 */ return "sung";
        case 202: /* 适 */ return "sik";
        case 203: /* 逃 */ return "to";
        case 204: /* 逄 */ return "teng";
        case 205: /* 逅 */ return "hau";
        case 206: /* 逆 */ return "yik";
        case 211: /* 选 */ return "suen";
        case 212: /* 逊 */ return "sun";
        case 213: /* 逋 */ return "teng";
        case 215: /* 逍 */ return "teng";
        case 217: /* 透 */ return "tau";
        case 220: /* 逐 */ return "juk";
        case 221: /* 逑 */ return "teng";
        case 222: /* 递 */ return "dai/toi";
        case 224: /* 途 */ return "to";
        case 225: /* 逕 */ return "teng";
        case 226: /* 逖 */ return "teng";
        case 227: /* 逗 */ return "dau";
        case 231: /* 這 */ return "je";
        case 232: /* 通 */ return "tung";
        case 233: /* 逛 */ return "gwaang/kwaang";
        case 235: /* 逝 */ return "sai";
        case 236: /* 逞 */ return "ching";
        case 237: /* 速 */ return "chuk";
        case 240: /* 造 */ return "jo";
        case 241: /* 逡 */ return "teng";
        case 242: /* 逢 */ return "fung";
        case 243: /* 連 */ return "lin";
        case 246: /* 逦 */ return "teng";
        case 255: /* 逭 */ return "teng";
        case 256: /* 逮 */ return "dai";
        case 257: /* 逯 */ return "teng";
        case 261: /* 週 */ return "jau";
        case 262: /* 進 */ return "jun";
        case 265: /* 逵 */ return "kwai";
        case 266: /* 逶 */ return "teng";
        case 270: /* 逸 */ return "yat";
        case 273: /* 逻 */ return "loh";
        case 274: /* 逼 */ return "bik";
        case 276: /* 逾 */ return "yue";
        }
      case 201:
        switch (octal[2]) {
        case 201: /* 遁 */ return "dun";
        case 202: /* 遂 */ return "sui";
        case 204: /* 遄 */ return "teng";
        case 207: /* 遇 */ return "yue";
        case 212: /* 遊 */ return "yau";
        case 213: /* 運 */ return "wan";
        case 215: /* 遍 */ return "pin";
        case 216: /* 過 */ return "gwoh";
        case 220: /* 遐 */ return "ha";
        case 221: /* 遑 */ return "teng";
        case 222: /* 遒 */ return "teng";
        case 223: /* 道 */ return "do";
        case 224: /* 達 */ return "daat";
        case 225: /* 違 */ return "wai";
        case 227: /* 遗 */ return "wai";
        case 230: /* 遘 */ return "teng";
        case 231: /* 遙 */ return "yiu";
        case 233: /* 遛 */ return "teng";
        case 234: /* 遜 */ return "sun";
        case 236: /* 遞 */ return "dai/toi";
        case 240: /* 遠 */ return "yuen";
        case 242: /* 遢 */ return "taap";
        case 243: /* 遣 */ return "hin";
        case 245: /* 遥 */ return "yiu";
        case 250: /* 遨 */ return "teng";
        case 251: /* 適 */ return "sik";
        case 255: /* 遭 */ return "jo";
        case 256: /* 遮 */ return "je";
        case 262: /* 遲 */ return "chi";
        case 264: /* 遴 */ return "teng";
        case 265: /* 遵 */ return "juen";
        case 267: /* 遷 */ return "chin";
        case 270: /* 選 */ return "suen";
        case 272: /* 遺 */ return "wai";
        case 274: /* 遼 */ return "liu";
        case 275: /* 遽 */ return "teng";
        case 277: /* 避 */ return "bei";
        }
      case 202:
        switch (octal[2]) {
        case 200: /* 邀 */ return "yiu";
        case 201: /* 邁 */ return "maai";
        case 202: /* 邂 */ return "haai";
        case 203: /* 邃 */ return "sui";
        case 204: /* 還 */ return "waan";
        case 207: /* 邇 */ return "teng";
        case 210: /* 邈 */ return "miu";
        case 212: /* 邊 */ return "bin";
        case 213: /* 邋 */ return "laat";
        case 217: /* 邏 */ return "loh";
        case 220: /* 邐 */ return "teng";
        case 221: /* 邑 */ return "yap";
        case 223: /* 邓 */ return "dang";
        case 225: /* 邕 */ return "yung";
        case 227: /* 邗 */ return "yideuh";
        case 231: /* 邙 */ return "yideuh";
        case 233: /* 邛 */ return "yideuh";
        case 235: /* 邝 */ return "yideuh";
        case 241: /* 邡 */ return "yideuh";
        case 242: /* 邢 */ return "ying";
        case 243: /* 那 */ return "na";
        case 246: /* 邦 */ return "bong";
        case 252: /* 邪 */ return "che";
        case 254: /* 邬 */ return "yideuh";
        case 256: /* 邮 */ return "yau";
        case 257: /* 邯 */ return "hon";
        case 260: /* 邰 */ return "yideuh";
        case 261: /* 邱 */ return "yau";
        case 263: /* 邳 */ return "yideuh";
        case 264: /* 邴 */ return "yideuh";
        case 265: /* 邵 */ return "siu";
        case 266: /* 邶 */ return "yideuh";
        case 271: /* 邹 */ return "jau";
        case 272: /* 邺 */ return "yideuh";
        case 273: /* 邻 */ return "lun";
        case 276: /* 邾 */ return "yideuh";
        }
      case 203:
        switch (octal[2]) {
        case 201: /* 郁 */ return "yuk";
        case 204: /* 郄 */ return "yideuh";
        case 205: /* 郅 */ return "yideuh";
        case 207: /* 郇 */ return "yideuh";
        case 212: /* 郊 */ return "gaau";
        case 216: /* 郎 */ return "long";
        case 217: /* 郏 */ return "yideuh";
        case 220: /* 郐 */ return "yideuh";
        case 221: /* 郑 */ return "jeng";
        case 223: /* 郓 */ return "yideuh";
        case 227: /* 郗 */ return "yideuh";
        case 233: /* 郛 */ return "yideuh";
        case 234: /* 郜 */ return "yideuh";
        case 235: /* 郝 */ return "kok";
        case 237: /* 郟 */ return "yideuh";
        case 241: /* 郡 */ return "gwan";
        case 242: /* 郢 */ return "yideuh";
        case 246: /* 郦 */ return "yideuh";
        case 247: /* 郧 */ return "wan";
        case 250: /* 部 */ return "bo";
        case 253: /* 郫 */ return "yideuh";
        case 255: /* 郭 */ return "gwok";
        case 257: /* 郯 */ return "yideuh";
        case 264: /* 郴 */ return "sam";
        case 265: /* 郵 */ return "yau";
        case 270: /* 郸 */ return "daan";
        case 275: /* 都 */ return "do";
        case 276: /* 郾 */ return "yideuh";
        }
      case 204:
        switch (octal[2]) {
        case 202: /* 鄂 */ return "ngok";
        case 204: /* 鄄 */ return "yideuh";
        case 206: /* 鄆 */ return "yideuh";
        case 211: /* 鄉 */ return "heung";
        case 222: /* 鄒 */ return "jau";
        case 224: /* 鄔 */ return "yideuh";
        case 226: /* 鄖 */ return "wan";
        case 231: /* 鄙 */ return "pei";
        case 236: /* 鄞 */ return "yideuh";
        case 242: /* 鄢 */ return "yideuh";
        case 243: /* 鄣 */ return "yideuh";
        case 247: /* 鄧 */ return "dang";
        case 255: /* 鄭 */ return "jeng";
        case 257: /* 鄯 */ return "yideuh";
        case 260: /* 鄰 */ return "lun";
        case 261: /* 鄱 */ return "boh";
        case 262: /* 鄲 */ return "daan";
        case 264: /* 鄴 */ return "yideuh";
        case 266: /* 鄶 */ return "yideuh";
        case 271: /* 鄹 */ return "yideuh";
        case 272: /* 鄺 */ return "yideuh";
        }
      case 205:
        switch (octal[2]) {
        case 203: /* 酃 */ return "yideuh";
        case 206: /* 酆 */ return "yideuh";
        case 210: /* 酈 */ return "yideuh";
        case 211: /* 酉 */ return "yau";
        case 212: /* 酊 */ return "ding";
        case 213: /* 酋 */ return "yau";
        case 214: /* 酌 */ return "jeuk";
        case 215: /* 配 */ return "pooi";
        case 216: /* 酎 */ return "jau";
        case 217: /* 酏 */ return "jau";
        case 220: /* 酐 */ return "jau";
        case 222: /* 酒 */ return "jau";
        case 227: /* 酗 */ return "hung";
        case 232: /* 酚 */ return "fan";
        case 235: /* 酝 */ return "wan";
        case 236: /* 酞 */ return "taai";
        case 241: /* 酡 */ return "jau";
        case 243: /* 酣 */ return "ham";
        case 244: /* 酤 */ return "jau";
        case 245: /* 酥 */ return "so";
        case 251: /* 酩 */ return "ming";
        case 252: /* 酪 */ return "lok";
        case 254: /* 酬 */ return "chau/chau$";
        case 256: /* 酮 */ return "tung";
        case 257: /* 酯 */ return "jau";
        case 260: /* 酰 */ return "jau";
        case 261: /* 酱 */ return "jeung";
        case 262: /* 酲 */ return "jau";
        case 264: /* 酴 */ return "jau";
        case 265: /* 酵 */ return "haau";
        case 266: /* 酶 */ return "mooi";
        case 267: /* 酷 */ return "huk";
        case 270: /* 酸 */ return "suen";
        case 271: /* 酹 */ return "jau";
        case 275: /* 酽 */ return "jau";
        case 276: /* 酾 */ return "jau";
        case 277: /* 酿 */ return "yeung";
        }
      case 206:
        switch (octal[2]) {
        case 205: /* 醅 */ return "jau";
        case 207: /* 醇 */ return "sun";
        case 211: /* 醉 */ return "jui";
        case 213: /* 醋 */ return "cho";
        case 214: /* 醌 */ return "jau";
        case 215: /* 醍 */ return "jau";
        case 220: /* 醐 */ return "jau";
        case 221: /* 醑 */ return "jau";
        case 222: /* 醒 */ return "sing";
        case 232: /* 醚 */ return "mai";
        case 233: /* 醛 */ return "chuen";
        case 234: /* 醜 */ return "chau";
        case 236: /* 醞 */ return "wan";
        case 242: /* 醢 */ return "jau";
        case 243: /* 醣 */ return "tong";
        case 252: /* 醪 */ return "jau";
        case 253: /* 醫 */ return "yi";
        case 254: /* 醬 */ return "jeung";
        case 255: /* 醭 */ return "jau";
        case 256: /* 醮 */ return "jau";
        case 257: /* 醯 */ return "jau";
        case 264: /* 醴 */ return "jau";
        case 265: /* 醵 */ return "jau";
        case 272: /* 醺 */ return "jau";
        }
      case 207:
        switch (octal[2]) {
        case 200: /* 釀 */ return "yeung";
        case 203: /* 釃 */ return "jau";
        case 205: /* 釅 */ return "jau";
        case 207: /* 采 */ return "choi";
        case 211: /* 釉 */ return "yau";
        case 212: /* 释 */ return "sik";
        case 213: /* 釋 */ return "sik";
        case 214: /* 里 */ return "lei/lui";
        case 215: /* 重 */ return "chung/jung";
        case 216: /* 野 */ return "ye";
        case 217: /* 量 */ return "leung";
        case 221: /* 金 */ return "gam";
        case 224: /* 釔 */ return "yuet";
        case 225: /* 釕 */ return "liu";
        case 227: /* 釗 */ return "chiu";
        case 230: /* 釘 */ return "deng";
        case 231: /* 釙 */ return "buk";
        case 234: /* 釜 */ return "foo";
        case 235: /* 針 */ return "jam";
        case 243: /* 釣 */ return "diu";
        case 244: /* 釤 */ return "saam";
        case 247: /* 釧 */ return "chuen";
        case 251: /* 釩 */ return "faan";
        case 265: /* 釵 */ return "chaai";
        case 267: /* 釷 */ return "to";
        case 271: /* 釹 */ return "nui";
        }
      case 210:
        switch (octal[2]) {
        case 200: /* 鈀 */ return "ba";
        case 201: /* 鈁 */ return "fong";
        case 204: /* 鈄 */ return "dau";
        case 211: /* 鈉 */ return "naap";
        case 215: /* 鈍 */ return "dun";
        case 220: /* 鈐 */ return "gam";
        case 221: /* 鈑 */ return "gam";
        case 224: /* 鈔 */ return "chaau";
        case 225: /* 鈕 */ return "nau";
        case 236: /* 鈞 */ return "gwan";
        case 243: /* 鈣 */ return "koi";
        case 245: /* 鈥 */ return "foh";
        case 246: /* 鈦 */ return "taai";
        case 247: /* 鈧 */ return "kong";
        case 256: /* 鈮 */ return "nei";
        case 260: /* 鈰 */ return "si";
        case 263: /* 鈳 */ return "koh";
        case 264: /* 鈴 */ return "ling";
        case 267: /* 鈷 */ return "goo";
        case 270: /* 鈸 */ return "poot";
        case 271: /* 鈹 */ return "pei";
        case 272: /* 鈺 */ return "yuk";
        case 275: /* 鈽 */ return "gam";
        case 276: /* 鈾 */ return "yau";
        case 277: /* 鈿 */ return "din";
        }
      case 211:
        switch (octal[2]) {
        case 200: /* 鉀 */ return "gaap";
        case 205: /* 鉅 */ return "gam";
        case 210: /* 鉈 */ return "ta";
        case 211: /* 鉉 */ return "yuen";
        case 215: /* 鉍 */ return "bit";
        case 221: /* 鉑 */ return "bok";
        case 227: /* 鉗 */ return "kim";
        case 232: /* 鉚 */ return "maau";
        case 233: /* 鉛 */ return "yuen";
        case 236: /* 鉞 */ return "yuet";
        case 244: /* 鉤 */ return "ngau";
        case 246: /* 鉦 */ return "jing";
        case 254: /* 鉬 */ return "muk";
        case 255: /* 鉭 */ return "daan";
        case 264: /* 鉴 */ return "gaam";
        case 270: /* 鉸 */ return "gaau";
        case 272: /* 鉺 */ return "yi";
        case 273: /* 鉻 */ return "lok";
        case 277: /* 鉿 */ return "ha";
        }
      case 212:
        switch (octal[2]) {
        case 200: /* 銀 */ return "ngan";
        case 203: /* 銃 */ return "chung";
        case 205: /* 銅 */ return "tung";
        case 216: /* 銎 */ return "gam";
        case 221: /* 銑 */ return "sin";
        case 223: /* 銓 */ return "chuen";
        case 226: /* 銖 */ return "jue";
        case 230: /* 銘 */ return "ming";
        case 232: /* 銚 */ return "tiu";
        case 234: /* 銜 */ return "haam";
        case 240: /* 銠 */ return "lo";
        case 243: /* 銣 */ return "yue";
        case 245: /* 銥 */ return "yi";
        case 246: /* 銦 */ return "yan";
        case 250: /* 銨 */ return "on";
        case 251: /* 銩 */ return "diu";
        case 252: /* 銪 */ return "yau";
        case 253: /* 銫 */ return "sik";
        case 254: /* 銬 */ return "kaau";
        case 256: /* 銮 */ return "gam";
        case 263: /* 銳 */ return "yui";
        case 267: /* 銷 */ return "siu";
        case 273: /* 銻 */ return "tai";
        case 274: /* 銼 */ return "choh";
        }
      case 213:
        switch (octal[2]) {
        case 201: /* 鋁 */ return "lui";
        case 203: /* 鋃 */ return "gam";
        case 205: /* 鋅 */ return "san";
        case 207: /* 鋇 */ return "booi";
        case 210: /* 鋈 */ return "gam";
        case 214: /* 鋌 */ return "ting";
        case 217: /* 鋏 */ return "gaap";
        case 222: /* 鋒 */ return "fung";
        case 235: /* 鋝 */ return "gam";
        case 237: /* 鋟 */ return "chim";
        case 244: /* 鋤 */ return "choh";
        case 246: /* 鋦 */ return "guk";
        case 250: /* 鋨 */ return "ngoh";
        case 256: /* 鋮 */ return "sing";
        case 257: /* 鋯 */ return "gam";
        case 260: /* 鋰 */ return "lei";
        case 261: /* 鋱 */ return "tik";
        case 270: /* 鋸 */ return "gui";
        case 274: /* 鋼 */ return "gong";
        }
      case 214:
        switch (octal[2]) {
        case 201: /* 錁 */ return "gwoh";
        case 204: /* 錄 */ return "luk";
        case 206: /* 錆 */ return "gam";
        case 210: /* 錈 */ return "gam";
        case 220: /* 錐 */ return "jui";
        case 222: /* 錒 */ return "a";
        case 225: /* 錕 */ return "kwan";
        case 230: /* 錘 */ return "chui";
        case 231: /* 錙 */ return "ji";
        case 232: /* 錚 */ return "jang";
        case 233: /* 錛 */ return "ban";
        case 237: /* 錟 */ return "gam";
        case 240: /* 錠 */ return "ding";
        case 242: /* 錢 */ return "chin";
        case 246: /* 錦 */ return "gam";
        case 250: /* 錨 */ return "miu";
        case 253: /* 錫 */ return "sek/sik";
        case 256: /* 錮 */ return "goo";
        case 257: /* 錯 */ return "choh";
        case 263: /* 錳 */ return "maang";
        case 266: /* 錶 */ return "biu";
        case 270: /* 錸 */ return "gam";
        case 276: /* 錾 */ return "gam";
        }
      case 215:
        switch (octal[2]) {
        case 206: /* 鍆 */ return "moon";
        case 207: /* 鍇 */ return "gam";
        case 213: /* 鍋 */ return "woh";
        case 215: /* 鍍 */ return "do";
        case 224: /* 鍔 */ return "ngok";
        case 233: /* 鍛 */ return "duen";
        case 244: /* 鍤 */ return "gam";
        case 245: /* 鍥 */ return "sit";
        case 252: /* 鍪 */ return "gam";
        case 254: /* 鍬 */ return "chau";
        case 260: /* 鍰 */ return "gam";
        case 265: /* 鍵 */ return "gin";
        case 266: /* 鍶 */ return "si";
        case 272: /* 鍺 */ return "je";
        case 276: /* 鍾 */ return "jung";
        }
      case 216:
        switch (octal[2]) {
        case 202: /* 鎂 */ return "mei";
        case 212: /* 鎊 */ return "bong";
        case 217: /* 鎏 */ return "gam";
        case 226: /* 鎖 */ return "soh";
        case 230: /* 鎘 */ return "gaak";
        case 242: /* 鎢 */ return "woo";
        case 246: /* 鎦 */ return "lau";
        case 247: /* 鎧 */ return "hoi";
        case 252: /* 鎪 */ return "sau";
        case 254: /* 鎬 */ return "go";
        case 256: /* 鎮 */ return "jan";
        case 260: /* 鎰 */ return "yat";
        case 263: /* 鎳 */ return "nip";
        case 265: /* 鎵 */ return "ga";
        }
      case 217:
        switch (octal[2]) {
        case 203: /* 鏃 */ return "juk";
        case 207: /* 鏇 */ return "gam";
        case 210: /* 鏈 */ return "lin";
        case 212: /* 鏊 */ return "gam";
        case 214: /* 鏌 */ return "gam";
        case 215: /* 鏍 */ return "loh/saat";
        case 221: /* 鏑 */ return "dik";
        case 226: /* 鏖 */ return "kwat";
        case 227: /* 鏗 */ return "hang";
        case 230: /* 鏘 */ return "jeung";
        case 234: /* 鏜 */ return "gam";
        case 235: /* 鏝 */ return "gam";
        case 236: /* 鏞 */ return "yung";
        case 237: /* 鏟 */ return "chaan";
        case 241: /* 鏡 */ return "geng";
        case 242: /* 鏢 */ return "biu";
        case 244: /* 鏤 */ return "lau";
        case 250: /* 鏨 */ return "gam";
        case 265: /* 鏵 */ return "wa";
        case 267: /* 鏷 */ return "pok";
        case 271: /* 鏹 */ return "keung";
        case 275: /* 鏽 */ return "sau";
        }
      case 220:
        switch (octal[2]) {
        case 203: /* 鐃 */ return "naau";
        case 213: /* 鐋 */ return "gam";
        case 220: /* 鐐 */ return "liu";
        case 222: /* 鐒 */ return "lo";
        case 223: /* 鐓 */ return "gam";
        case 224: /* 鐔 */ return "gam";
        case 230: /* 鐘 */ return "jung";
        case 231: /* 鐙 */ return "dang";
        case 240: /* 鐠 */ return "po";
        case 253: /* 鐫 */ return "jun";
        case 256: /* 鐮 */ return "lim";
        case 262: /* 鐲 */ return "juk";
        case 263: /* 鐳 */ return "lui";
        case 265: /* 鐵 */ return "tit";
        case 270: /* 鐸 */ return "dok";
        case 272: /* 鐺 */ return "dong";
        case 276: /* 鐾 */ return "gam";
        case 277: /* 鐿 */ return "yi";
        }
      case 221:
        switch (octal[2]) {
        case 204: /* 鑄 */ return "jue";
        case 212: /* 鑊 */ return "wok";
        case 214: /* 鑌 */ return "ban";
        case 222: /* 鑒 */ return "gaam";
        case 240: /* 鑠 */ return "seuk";
        case 243: /* 鑣 */ return "biu";
        case 253: /* 鑫 */ return "gaam";
        case 255: /* 鑭 */ return "laan";
        case 260: /* 鑰 */ return "yeuk";
        case 262: /* 鑲 */ return "seung";
        case 267: /* 鑷 */ return "nip";
        case 274: /* 鑼 */ return "loh";
        case 275: /* 鑽 */ return "juen";
        case 276: /* 鑾 */ return "gam";
        case 277: /* 鑿 */ return "jok";
        }
      case 222:
        switch (octal[2]) {
        case 207: /* 钇 */ return "yuet";
        case 210: /* 针 */ return "jam";
        case 211: /* 钉 */ return "deng";
        case 212: /* 钊 */ return "chiu";
        case 213: /* 钋 */ return "buk";
        case 214: /* 钌 */ return "liu";
        case 215: /* 钍 */ return "to";
        case 216: /* 钎 */ return "chin";
        case 217: /* 钏 */ return "chuen";
        case 220: /* 钐 */ return "saam";
        case 222: /* 钒 */ return "faan";
        case 223: /* 钓 */ return "diu";
        case 224: /* 钔 */ return "moon";
        case 225: /* 钕 */ return "nui";
        case 227: /* 钗 */ return "chaai";
        case 231: /* 钙 */ return "koi";
        case 232: /* 钚 */ return "bat";
        case 233: /* 钛 */ return "taai";
        case 234: /* 钜 */ return "gam";
        case 235: /* 钝 */ return "dun";
        case 236: /* 钞 */ return "chaau";
        case 237: /* 钟 */ return "jung";
        case 240: /* 钠 */ return "naap";
        case 241: /* 钡 */ return "booi";
        case 242: /* 钢 */ return "gong";
        case 243: /* 钣 */ return "gam";
        case 244: /* 钤 */ return "gam";
        case 245: /* 钥 */ return "yeuk";
        case 246: /* 钦 */ return "yam";
        case 247: /* 钧 */ return "gwan";
        case 250: /* 钨 */ return "woo";
        case 251: /* 钩 */ return "ngau";
        case 252: /* 钪 */ return "kong";
        case 253: /* 钫 */ return "fong";
        case 254: /* 钬 */ return "foh";
        case 255: /* 钭 */ return "dau";
        case 256: /* 钮 */ return "nau";
        case 257: /* 钯 */ return "ba";
        case 260: /* 钰 */ return "yuk";
        case 261: /* 钱 */ return "chin";
        case 262: /* 钲 */ return "jing";
        case 263: /* 钳 */ return "kim";
        case 264: /* 钴 */ return "goo";
        case 265: /* 钵 */ return "boot";
        case 266: /* 钶 */ return "koh";
        case 267: /* 钷 */ return "poh";
        case 270: /* 钸 */ return "gam";
        case 271: /* 钹 */ return "poot";
        case 272: /* 钺 */ return "yuet";
        case 273: /* 钻 */ return "juen";
        case 274: /* 钼 */ return "muk";
        case 275: /* 钽 */ return "daan";
        case 276: /* 钾 */ return "gaap";
        case 277: /* 钿 */ return "din";
        }
      case 223:
        switch (octal[2]) {
        case 200: /* 铀 */ return "yau";
        case 201: /* 铁 */ return "tit";
        case 202: /* 铂 */ return "bok";
        case 203: /* 铃 */ return "ling";
        case 204: /* 铄 */ return "seuk";
        case 205: /* 铅 */ return "yuen";
        case 206: /* 铆 */ return "maau";
        case 210: /* 铈 */ return "si";
        case 211: /* 铉 */ return "yuen";
        case 212: /* 铊 */ return "ta";
        case 213: /* 铋 */ return "bit";
        case 214: /* 铌 */ return "nei";
        case 215: /* 铍 */ return "pei";
        case 216: /* 铎 */ return "dok";
        case 220: /* 铐 */ return "kaau";
        case 221: /* 铑 */ return "lo";
        case 222: /* 铒 */ return "yi";
        case 225: /* 铕 */ return "yau";
        case 226: /* 铖 */ return "sing";
        case 227: /* 铗 */ return "gaap";
        case 230: /* 铘 */ return "gam";
        case 231: /* 铙 */ return "naau";
        case 233: /* 铛 */ return "dong";
        case 234: /* 铜 */ return "tung";
        case 235: /* 铝 */ return "lui";
        case 236: /* 铞 */ return "diu";
        case 237: /* 铟 */ return "yan";
        case 240: /* 铠 */ return "hoi";
        case 242: /* 铢 */ return "jue";
        case 243: /* 铣 */ return "sin";
        case 244: /* 铤 */ return "ting";
        case 245: /* 铥 */ return "diu";
        case 247: /* 铧 */ return "wa";
        case 250: /* 铨 */ return "chuen";
        case 252: /* 铪 */ return "ha";
        case 253: /* 铫 */ return "tiu";
        case 254: /* 铬 */ return "lok";
        case 255: /* 铭 */ return "ming";
        case 256: /* 铮 */ return "jang";
        case 257: /* 铯 */ return "sik";
        case 260: /* 铰 */ return "gaau";
        case 261: /* 铱 */ return "yi";
        case 262: /* 铲 */ return "chaan";
        case 263: /* 铳 */ return "chung";
        case 264: /* 铴 */ return "gam";
        case 265: /* 铵 */ return "on";
        case 266: /* 银 */ return "ngan";
        case 267: /* 铷 */ return "yue";
        case 270: /* 铸 */ return "jue";
        case 271: /* 铹 */ return "lo";
        case 272: /* 铺 */ return "po";
        case 274: /* 铼 */ return "gam";
        case 275: /* 铽 */ return "tik";
        case 276: /* 链 */ return "lin";
        case 277: /* 铿 */ return "hang";
        }
      case 224:
        switch (octal[2]) {
        case 200: /* 销 */ return "siu";
        case 201: /* 锁 */ return "soh";
        case 202: /* 锂 */ return "lei";
        case 203: /* 锃 */ return "jang";
        case 204: /* 锄 */ return "choh";
        case 205: /* 锅 */ return "woh";
        case 206: /* 锆 */ return "gam";
        case 207: /* 锇 */ return "ngoh";
        case 210: /* 锈 */ return "sau";
        case 211: /* 锉 */ return "choh";
        case 212: /* 锊 */ return "gam";
        case 213: /* 锋 */ return "fung";
        case 214: /* 锌 */ return "san";
        case 215: /* 锍 */ return "gam";
        case 216: /* 锎 */ return "hoi";
        case 217: /* 锏 */ return "gaan";
        case 220: /* 锐 */ return "yui";
        case 221: /* 锑 */ return "tai";
        case 222: /* 锒 */ return "gam";
        case 223: /* 锓 */ return "chim";
        case 224: /* 锔 */ return "guk";
        case 225: /* 锕 */ return "a";
        case 226: /* 锖 */ return "gam";
        case 227: /* 锗 */ return "je";
        case 230: /* 锘 */ return "nok";
        case 231: /* 错 */ return "choh";
        case 232: /* 锚 */ return "miu";
        case 233: /* 锛 */ return "ban";
        case 235: /* 锝 */ return "dak";
        case 236: /* 锞 */ return "gwoh";
        case 237: /* 锟 */ return "kwan";
        case 241: /* 锡 */ return "sek/sik";
        case 242: /* 锢 */ return "goo";
        case 243: /* 锣 */ return "loh";
        case 244: /* 锤 */ return "chui";
        case 245: /* 锥 */ return "jui";
        case 246: /* 锦 */ return "gam";
        case 250: /* 锨 */ return "hin";
        case 251: /* 锩 */ return "gam";
        case 252: /* 锪 */ return "gam";
        case 253: /* 锫 */ return "pooi";
        case 254: /* 锬 */ return "gam";
        case 255: /* 锭 */ return "ding";
        case 256: /* 键 */ return "gin";
        case 257: /* 锯 */ return "gui";
        case 260: /* 锰 */ return "maang";
        case 261: /* 锱 */ return "ji";
        case 262: /* 锲 */ return "sit";
        case 264: /* 锴 */ return "gam";
        case 265: /* 锵 */ return "jeung";
        case 266: /* 锶 */ return "si";
        case 267: /* 锷 */ return "ngok";
        case 270: /* 锸 */ return "gam";
        case 271: /* 锹 */ return "chau";
        case 272: /* 锺 */ return "jung";
        case 273: /* 锻 */ return "duen";
        case 274: /* 锼 */ return "sau";
        case 276: /* 锾 */ return "gam";
        case 277: /* 锿 */ return "oi";
        }
      case 225:
        switch (octal[2]) {
        case 200: /* 镀 */ return "do";
        case 201: /* 镁 */ return "mei";
        case 202: /* 镂 */ return "lau";
        case 204: /* 镄 */ return "fai";
        case 205: /* 镅 */ return "mei";
        case 206: /* 镆 */ return "gam";
        case 207: /* 镇 */ return "jan";
        case 211: /* 镉 */ return "gaak";
        case 212: /* 镊 */ return "nip";
        case 214: /* 镌 */ return "jun";
        case 215: /* 镍 */ return "nip";
        case 216: /* 镎 */ return "na";
        case 217: /* 镏 */ return "lau";
        case 220: /* 镐 */ return "go";
        case 221: /* 镑 */ return "bong";
        case 222: /* 镒 */ return "yat";
        case 223: /* 镓 */ return "ga";
        case 224: /* 镔 */ return "ban";
        case 226: /* 镖 */ return "biu";
        case 227: /* 镗 */ return "gam";
        case 230: /* 镘 */ return "gam";
        case 231: /* 镙 */ return "loh/saat";
        case 233: /* 镛 */ return "yung";
        case 234: /* 镜 */ return "geng";
        case 235: /* 镝 */ return "dik";
        case 236: /* 镞 */ return "juk";
        case 237: /* 镟 */ return "gam";
        case 241: /* 镡 */ return "gam";
        case 242: /* 镢 */ return "kuet";
        case 243: /* 镣 */ return "liu";
        case 244: /* 镤 */ return "pok";
        case 245: /* 镥 */ return "lo";
        case 246: /* 镦 */ return "gam";
        case 247: /* 镧 */ return "laan";
        case 250: /* 镨 */ return "po";
        case 251: /* 镩 */ return "chuen";
        case 252: /* 镪 */ return "keung";
        case 253: /* 镫 */ return "dang";
        case 254: /* 镬 */ return "wok";
        case 255: /* 镭 */ return "lui";
        case 257: /* 镯 */ return "juk";
        case 260: /* 镰 */ return "lim";
        case 261: /* 镱 */ return "yi";
        case 262: /* 镲 */ return "cha";
        case 263: /* 镳 */ return "biu";
        case 266: /* 镶 */ return "seung";
        case 267: /* 長 */ return "cheung/jeung";
        case 277: /* 长 */ return "cheung/jeung";
        }
      case 226:
        switch (octal[2]) {
        case 200: /* 門 */ return "moon";
        case 202: /* 閂 */ return "saan";
        case 203: /* 閃 */ return "sim";
        case 206: /* 閆 */ return "moon";
        case 211: /* 閉 */ return "bai";
        case 213: /* 開 */ return "hoi";
        case 214: /* 閌 */ return "moon";
        case 216: /* 閎 */ return "moon";
        case 217: /* 閏 */ return "yun";
        case 221: /* 閑 */ return "haan";
        case 222: /* 閒 */ return "haan";
        case 223: /* 間 */ return "gaan";
        case 224: /* 閔 */ return "moon";
        case 230: /* 閘 */ return "jaap";
        case 241: /* 閡 */ return "ngoi";
        case 243: /* 閣 */ return "gok";
        case 245: /* 閥 */ return "fat";
        case 250: /* 閨 */ return "gwai";
        case 251: /* 閩 */ return "man";
        case 253: /* 閫 */ return "moon";
        case 254: /* 閬 */ return "moon";
        case 255: /* 閭 */ return "moon";
        case 261: /* 閱 */ return "yuet";
        case 266: /* 閶 */ return "moon";
        case 271: /* 閹 */ return "yim";
        case 273: /* 閻 */ return "yim";
        case 274: /* 閼 */ return "moon";
        case 275: /* 閽 */ return "moon";
        case 276: /* 閾 */ return "moon";
        case 277: /* 閿 */ return "moon";
        }
      case 227:
        switch (octal[2]) {
        case 203: /* 闃 */ return "moon";
        case 210: /* 闈 */ return "moon";
        case 212: /* 闊 */ return "foot";
        case 213: /* 闋 */ return "moon";
        case 214: /* 闌 */ return "laan";
        case 220: /* 闐 */ return "moon";
        case 224: /* 闔 */ return "moon";
        case 226: /* 闖 */ return "chong";
        case 234: /* 關 */ return "gwaan";
        case 236: /* 闞 */ return "moon";
        case 241: /* 闡 */ return "chin";
        case 245: /* 闥 */ return "moon";
        case 250: /* 门 */ return "moon";
        case 251: /* 闩 */ return "saan";
        case 252: /* 闪 */ return "sim";
        case 253: /* 闫 */ return "moon";
        case 255: /* 闭 */ return "bai";
        case 256: /* 问 */ return "man";
        case 257: /* 闯 */ return "chong";
        case 260: /* 闰 */ return "yun";
        case 261: /* 闱 */ return "moon";
        case 262: /* 闲 */ return "haan";
        case 263: /* 闳 */ return "moon";
        case 264: /* 间 */ return "gaan";
        case 265: /* 闵 */ return "moon";
        case 266: /* 闶 */ return "moon";
        case 267: /* 闷 */ return "moon";
        case 270: /* 闸 */ return "jaap";
        case 271: /* 闹 */ return "naau";
        case 272: /* 闺 */ return "gwai";
        case 273: /* 闻 */ return "man";
        case 274: /* 闼 */ return "moon";
        case 275: /* 闽 */ return "man";
        case 276: /* 闾 */ return "moon";
        }
      case 230:
        switch (octal[2]) {
        case 200: /* 阀 */ return "fat";
        case 201: /* 阁 */ return "gok";
        case 202: /* 阂 */ return "ngoi";
        case 203: /* 阃 */ return "moon";
        case 204: /* 阄 */ return "moon";
        case 205: /* 阅 */ return "yuet";
        case 206: /* 阆 */ return "moon";
        case 210: /* 阈 */ return "moon";
        case 211: /* 阉 */ return "yim";
        case 212: /* 阊 */ return "moon";
        case 213: /* 阋 */ return "moon";
        case 214: /* 阌 */ return "moon";
        case 215: /* 阍 */ return "moon";
        case 216: /* 阎 */ return "yim";
        case 217: /* 阏 */ return "moon";
        case 220: /* 阐 */ return "chin";
        case 221: /* 阑 */ return "laan";
        case 222: /* 阒 */ return "moon";
        case 224: /* 阔 */ return "foot";
        case 225: /* 阕 */ return "moon";
        case 226: /* 阖 */ return "moon";
        case 227: /* 阗 */ return "moon";
        case 232: /* 阚 */ return "moon";
        case 234: /* 阜 */ return "fau";
        case 237: /* 队 */ return "dui";
        case 241: /* 阡 */ return "chin";
        case 242: /* 阢 */ return "yi";
        case 252: /* 阪 */ return "baan";
        case 256: /* 阮 */ return "yuen";
        case 261: /* 阱 */ return "jeng";
        case 262: /* 防 */ return "fong";
        case 263: /* 阳 */ return "yeung";
        case 264: /* 阴 */ return "yam";
        case 265: /* 阵 */ return "jan";
        case 266: /* 阶 */ return "gaai";
        case 273: /* 阻 */ return "joh";
        case 274: /* 阼 */ return "yi";
        case 275: /* 阽 */ return "yi";
        case 277: /* 阿 */ return "a";
        }
      case 231:
        switch (octal[2]) {
        case 200: /* 陀 */ return "toh";
        case 202: /* 陂 */ return "yi";
        case 204: /* 附 */ return "foo";
        case 205: /* 际 */ return "jai";
        case 206: /* 陆 */ return "luk";
        case 207: /* 陇 */ return "lung";
        case 210: /* 陈 */ return "chan";
        case 211: /* 陉 */ return "yi";
        case 213: /* 陋 */ return "lau";
        case 214: /* 陌 */ return "mak";
        case 215: /* 降 */ return "gong/hong";
        case 220: /* 限 */ return "haan";
        case 224: /* 陔 */ return "yi";
        case 225: /* 陕 */ return "sim";
        case 230: /* 陘 */ return "yi";
        case 233: /* 陛 */ return "bai/bok";
        case 235: /* 陝 */ return "sim";
        case 237: /* 陟 */ return "yi";
        case 241: /* 陡 */ return "dau";
        case 242: /* 院 */ return "yuen";
        case 243: /* 陣 */ return "jan";
        case 244: /* 除 */ return "chui";
        case 247: /* 陧 */ return "yi";
        case 250: /* 陨 */ return "wan";
        case 251: /* 险 */ return "him";
        case 252: /* 陪 */ return "pooi";
        case 254: /* 陬 */ return "yi";
        case 260: /* 陰 */ return "yam";
        case 262: /* 陲 */ return "yi";
        case 263: /* 陳 */ return "chan";
        case 264: /* 陴 */ return "yideuh";
        case 265: /* 陵 */ return "ling";
        case 266: /* 陶 */ return "to";
        case 267: /* 陷 */ return "ham/hei";
        case 270: /* 陸 */ return "luk";
        case 275: /* 陽 */ return "yeung";
        }
      case 232:
        switch (octal[2]) {
        case 205: /* 隅 */ return "yue";
        case 206: /* 隆 */ return "lung";
        case 210: /* 隈 */ return "yideuh";
        case 211: /* 隉 */ return "yi";
        case 212: /* 隊 */ return "dui";
        case 213: /* 隋 */ return "chui";
        case 215: /* 隍 */ return "yideuh";
        case 216: /* 階 */ return "gaai";
        case 217: /* 随 */ return "chui";
        case 220: /* 隐 */ return "yan";
        case 224: /* 隔 */ return "gaak";
        case 225: /* 隕 */ return "wan";
        case 227: /* 隗 */ return "yideuh";
        case 230: /* 隘 */ return "aai";
        case 231: /* 隙 */ return "kwik";
        case 233: /* 際 */ return "jai";
        case 234: /* 障 */ return "jeung";
        case 247: /* 隧 */ return "sui";
        case 250: /* 隨 */ return "chui";
        case 252: /* 險 */ return "him";
        case 260: /* 隰 */ return "yideuh";
        case 261: /* 隱 */ return "yan";
        case 264: /* 隴 */ return "lung";
        case 266: /* 隶 */ return "dai";
        case 270: /* 隸 */ return "dai";
        case 273: /* 隻 */ return "jek";
        case 276: /* 难 */ return "naan";
        }
      case 233:
        switch (octal[2]) {
        case 200: /* 雀 */ return "jeuk";
        case 201: /* 雁 */ return "ngaan";
        case 204: /* 雄 */ return "hung";
        case 205: /* 雅 */ return "nga";
        case 206: /* 集 */ return "jaap";
        case 207: /* 雇 */ return "goo";
        case 211: /* 雉 */ return "chi";
        case 214: /* 雌 */ return "chi";
        case 215: /* 雍 */ return "yung";
        case 216: /* 雎 */ return "jui";
        case 217: /* 雏 */ return "choh";
        case 225: /* 雕 */ return "diu";
        case 226: /* 雖 */ return "sui";
        case 231: /* 雙 */ return "seung";
        case 233: /* 雛 */ return "choh";
        case 234: /* 雜 */ return "jaap";
        case 236: /* 雞 */ return "gai";
        case 242: /* 離 */ return "lei";
        case 243: /* 難 */ return "naan";
        case 250: /* 雨 */ return "yue";
        case 251: /* 雩 */ return "yue";
        case 252: /* 雪 */ return "suet";
        case 257: /* 雯 */ return "man";
        case 262: /* 雲 */ return "wan";
        case 266: /* 零 */ return "ling";
        case 267: /* 雷 */ return "lui";
        case 271: /* 雹 */ return "bok";
        case 273: /* 電 */ return "din";
        case 276: /* 雾 */ return "mo";
        }
      case 234:
        switch (octal[2]) {
        case 200: /* 需 */ return "sui";
        case 201: /* 霁 */ return "jai";
        case 204: /* 霄 */ return "siu";
        case 206: /* 霆 */ return "ting";
        case 207: /* 震 */ return "jan";
        case 210: /* 霈 */ return "pooi";
        case 211: /* 霉 */ return "mooi";
        case 215: /* 霍 */ return "fok";
        case 216: /* 霎 */ return "saap";
        case 217: /* 霏 */ return "fei";
        case 223: /* 霓 */ return "ngai";
        case 226: /* 霖 */ return "lam";
        case 234: /* 霜 */ return "seung";
        case 236: /* 霞 */ return "ha";
        case 247: /* 霧 */ return "mo";
        case 252: /* 霪 */ return "yam";
        case 255: /* 霭 */ return "oi";
        case 260: /* 霰 */ return "sin";
        case 262: /* 露 */ return "lo";
        case 270: /* 霸 */ return "ba";
        case 271: /* 霹 */ return "pik";
        case 275: /* 霽 */ return "jai";
        case 276: /* 霾 */ return "mei";
        }
      case 235:
        switch (octal[2]) {
        case 204: /* 靄 */ return "oi";
        case 210: /* 靈 */ return "ling";
        case 222: /* 青 */ return "ching";
        case 223: /* 靓 */ return "leng";
        case 226: /* 靖 */ return "jing";
        case 231: /* 静 */ return "jing";
        case 232: /* 靚 */ return "leng";
        case 233: /* 靛 */ return "din";
        case 234: /* 靜 */ return "jing";
        case 236: /* 非 */ return "fei";
        case 240: /* 靠 */ return "kaau";
        case 241: /* 靡 */ return "mei";
        case 242: /* 面 */ return "min";
        case 251: /* 革 */ return "gaak";
        case 263: /* 靳 */ return "gan";
        case 264: /* 靴 */ return "heuh";
        case 266: /* 靶 */ return "ba";
        case 274: /* 靼 */ return "daan";
        }
      case 236:
        switch (octal[2]) {
        case 205: /* 鞅 */ return "yeung";
        case 213: /* 鞋 */ return "haai";
        case 215: /* 鞍 */ return "on";
        case 217: /* 鞏 */ return "gung";
        case 221: /* 鞑 */ return "daat";
        case 222: /* 鞒 */ return "gaak";
        case 224: /* 鞔 */ return "gaak";
        case 230: /* 鞘 */ return "saau";
        case 240: /* 鞠 */ return "guk";
        case 243: /* 鞣 */ return "gaak";
        case 253: /* 鞫 */ return "gaak";
        case 255: /* 鞭 */ return "bin";
        case 257: /* 鞯 */ return "gaak";
        case 262: /* 鞲 */ return "gaak";
        case 264: /* 鞴 */ return "gaak";
        }
      case 237:
        switch (octal[2]) {
        case 201: /* 韁 */ return "si";
        case 203: /* 韃 */ return "daat";
        case 211: /* 韉 */ return "gaak";
        case 213: /* 韋 */ return "wai";
        case 214: /* 韌 */ return "ngan";
        case 223: /* 韓 */ return "hon";
        case 234: /* 韜 */ return "to";
        case 246: /* 韦 */ return "wai";
        case 247: /* 韧 */ return "ngan";
        case 251: /* 韩 */ return "hon";
        case 254: /* 韬 */ return "to";
        case 255: /* 韭 */ return "gau";
        case 263: /* 音 */ return "yam";
        case 265: /* 韵 */ return "wan";
        case 266: /* 韶 */ return "siu";
        case 273: /* 韻 */ return "wan";
        case 277: /* 響 */ return "heung";
        }
      case 240:
        switch (octal[2]) {
        case 201: /* 頁 */ return "yip";
        case 202: /* 頂 */ return "ding";
        case 203: /* 頃 */ return "king";
        case 205: /* 項 */ return "hong";
        case 206: /* 順 */ return "sun";
        case 207: /* 頇 */ return "hon";
        case 210: /* 須 */ return "so/sui";
        case 212: /* 頊 */ return "yuk";
        case 214: /* 頌 */ return "jung";
        case 216: /* 頎 */ return "kei";
        case 217: /* 頏 */ return "hong";
        case 220: /* 預 */ return "yue";
        case 221: /* 頑 */ return "waan";
        case 222: /* 頒 */ return "baan";
        case 223: /* 頓 */ return "dun";
        case 227: /* 頗 */ return "poh";
        case 230: /* 領 */ return "ling";
        case 234: /* 頜 */ return "hap";
        case 241: /* 頡 */ return "kit";
        case 244: /* 頤 */ return "yi";
        case 246: /* 頦 */ return "hoi";
        case 255: /* 頭 */ return "tau";
        case 260: /* 頰 */ return "gaap";
        case 267: /* 頷 */ return "ham";
        case 270: /* 頸 */ return "geng";
        case 271: /* 頹 */ return "tui";
        case 273: /* 頻 */ return "pan";
        }
      case 241:
        switch (octal[2]) {
        case 206: /* 顆 */ return "gwoh";
        case 214: /* 題 */ return "tai";
        case 215: /* 額 */ return "ngaak";
        case 216: /* 顎 */ return "ngok";
        case 217: /* 顏 */ return "ngaan";
        case 223: /* 顓 */ return "juen";
        case 230: /* 願 */ return "yuen";
        case 231: /* 顙 */ return "song";
        case 233: /* 顛 */ return "din";
        case 236: /* 類 */ return "lui";
        case 242: /* 顢 */ return "moon";
        case 245: /* 顥 */ return "ho";
        case 247: /* 顧 */ return "goo";
        case 253: /* 顫 */ return "chin";
        case 257: /* 顯 */ return "hin";
        case 261: /* 顱 */ return "lo";
        case 263: /* 顳 */ return "nip";
        case 264: /* 顴 */ return "kuen";
        case 265: /* 页 */ return "yip";
        case 266: /* 顶 */ return "ding";
        case 267: /* 顷 */ return "king";
        case 270: /* 顸 */ return "hon";
        case 271: /* 项 */ return "hong";
        case 272: /* 顺 */ return "sun";
        case 273: /* 须 */ return "so/sui";
        case 274: /* 顼 */ return "yuk";
        case 275: /* 顽 */ return "waan";
        case 276: /* 顾 */ return "goo";
        case 277: /* 顿 */ return "dun";
        }
      case 242:
        switch (octal[2]) {
        case 200: /* 颀 */ return "kei";
        case 201: /* 颁 */ return "baan";
        case 202: /* 颂 */ return "jung";
        case 203: /* 颃 */ return "hong";
        case 204: /* 预 */ return "yue";
        case 205: /* 颅 */ return "lo";
        case 206: /* 领 */ return "ling";
        case 207: /* 颇 */ return "poh";
        case 210: /* 颈 */ return "geng";
        case 211: /* 颉 */ return "kit";
        case 212: /* 颊 */ return "gaap";
        case 214: /* 颌 */ return "hap";
        case 215: /* 颍 */ return "wing";
        case 217: /* 颏 */ return "hoi";
        case 220: /* 颐 */ return "yi";
        case 221: /* 频 */ return "pan";
        case 223: /* 颓 */ return "tui";
        case 224: /* 颔 */ return "ham";
        case 226: /* 颖 */ return "wing";
        case 227: /* 颗 */ return "gwoh";
        case 230: /* 题 */ return "tai";
        case 232: /* 颚 */ return "ngok";
        case 233: /* 颛 */ return "juen";
        case 234: /* 颜 */ return "ngaan";
        case 235: /* 额 */ return "ngaak";
        case 236: /* 颞 */ return "nip";
        case 237: /* 颟 */ return "moon";
        case 240: /* 颠 */ return "din";
        case 241: /* 颡 */ return "song";
        case 242: /* 颢 */ return "ho";
        case 244: /* 颤 */ return "chin";
        case 245: /* 颥 */ return "yue";
        case 247: /* 颧 */ return "kuen";
        case 250: /* 風 */ return "fung";
        case 256: /* 颮 */ return "fung";
        case 257: /* 颯 */ return "jaap";
        case 266: /* 颶 */ return "gui";
        case 274: /* 颼 */ return "fung";
        }
      case 243:
        switch (octal[2]) {
        case 204: /* 飄 */ return "piu";
        case 206: /* 飆 */ return "fung";
        case 216: /* 风 */ return "fung";
        case 221: /* 飑 */ return "fung";
        case 222: /* 飒 */ return "jaap";
        case 223: /* 飓 */ return "gui";
        case 225: /* 飕 */ return "fung";
        case 230: /* 飘 */ return "piu";
        case 231: /* 飙 */ return "fung";
        case 232: /* 飚 */ return "fung";
        case 233: /* 飛 */ return "fei";
        case 236: /* 飞 */ return "fei";
        case 237: /* 食 */ return "sik";
        case 242: /* 飢 */ return "gei";
        case 250: /* 飨 */ return "sik";
        case 251: /* 飩 */ return "sik";
        case 252: /* 飪 */ return "sik";
        case 253: /* 飫 */ return "sik";
        case 255: /* 飭 */ return "sik";
        case 257: /* 飯 */ return "faan";
        case 262: /* 飲 */ return "yam";
        case 264: /* 飴 */ return "sik";
        case 274: /* 飼 */ return "ji";
        case 275: /* 飽 */ return "baau";
        case 276: /* 飾 */ return "sik";
        }
      case 244:
        switch (octal[2]) {
        case 203: /* 餃 */ return "gaau";
        case 205: /* 餅 */ return "beng";
        case 211: /* 餉 */ return "heung/sik";
        case 212: /* 養 */ return "yeung";
        case 214: /* 餌 */ return "nei";
        case 215: /* 餍 */ return "sik";
        case 220: /* 餐 */ return "chaan";
        case 221: /* 餑 */ return "sik";
        case 222: /* 餒 */ return "noi";
        case 223: /* 餓 */ return "ngoh";
        case 230: /* 餘 */ return "sik/yue";
        case 233: /* 餛 */ return "sik";
        case 236: /* 餞 */ return "jin";
        case 241: /* 餡 */ return "haam";
        case 250: /* 館 */ return "gang/goon";
        case 256: /* 餮 */ return "tim";
        case 263: /* 餳 */ return "sik";
        case 274: /* 餼 */ return "sik";
        case 276: /* 餾 */ return "lau";
        case 277: /* 餿 */ return "sik";
        }
      case 245:
        switch (octal[2]) {
        case 203: /* 饃 */ return "sik";
        case 205: /* 饅 */ return "maan";
        case 210: /* 饈 */ return "sik";
        case 211: /* 饉 */ return "sik";
        case 213: /* 饋 */ return "gwai";
        case 214: /* 饌 */ return "sik";
        case 224: /* 饔 */ return "sik";
        case 225: /* 饕 */ return "ho";
        case 227: /* 饗 */ return "sik";
        case 234: /* 饜 */ return "sik";
        case 236: /* 饞 */ return "chaam";
        case 245: /* 饥 */ return "gei";
        case 247: /* 饧 */ return "sik";
        case 250: /* 饨 */ return "sik";
        case 251: /* 饩 */ return "sik";
        case 252: /* 饪 */ return "sik";
        case 253: /* 饫 */ return "sik";
        case 254: /* 饬 */ return "sik";
        case 255: /* 饭 */ return "faan";
        case 256: /* 饮 */ return "yam";
        case 257: /* 饯 */ return "jin";
        case 260: /* 饰 */ return "sik";
        case 261: /* 饱 */ return "baau";
        case 262: /* 饲 */ return "ji";
        case 264: /* 饴 */ return "sik";
        case 265: /* 饵 */ return "nei";
        case 267: /* 饷 */ return "heung/sik";
        case 272: /* 饺 */ return "gaau";
        case 274: /* 饼 */ return "beng";
        case 275: /* 饽 */ return "sik";
        case 277: /* 饿 */ return "ngoh";
        }
      case 246:
        switch (octal[2]) {
        case 200: /* 馀 */ return "sik";
        case 201: /* 馁 */ return "noi";
        case 204: /* 馄 */ return "sik";
        case 205: /* 馅 */ return "haam";
        case 206: /* 馆 */ return "gang/goon";
        case 207: /* 馇 */ return "sik";
        case 210: /* 馈 */ return "gwai";
        case 212: /* 馊 */ return "sik";
        case 213: /* 馋 */ return "chaam";
        case 215: /* 馍 */ return "sik";
        case 217: /* 馏 */ return "lau";
        case 220: /* 馐 */ return "sik";
        case 221: /* 馑 */ return "sik";
        case 222: /* 馒 */ return "maan";
        case 223: /* 馓 */ return "sik";
        case 224: /* 馔 */ return "sik";
        case 225: /* 馕 */ return "sik";
        case 226: /* 首 */ return "sau";
        case 227: /* 馗 */ return "kwai";
        case 231: /* 香 */ return "heung";
        case 245: /* 馥 */ return "fuk";
        case 250: /* 馨 */ return "hing";
        case 254: /* 馬 */ return "ma";
        case 255: /* 馭 */ return "yue";
        case 256: /* 馮 */ return "fung";
        case 261: /* 馱 */ return "toh";
        case 263: /* 馳 */ return "chi";
        case 264: /* 馴 */ return "sun";
        }
      case 247:
        switch (octal[2]) {
        case 201: /* 駁 */ return "bok";
        case 220: /* 駐 */ return "jue";
        case 221: /* 駑 */ return "ma";
        case 222: /* 駒 */ return "kui";
        case 224: /* 駔 */ return "ma";
        case 225: /* 駕 */ return "ga";
        case 230: /* 駘 */ return "ma";
        case 231: /* 駙 */ return "foo";
        case 233: /* 駛 */ return "si";
        case 235: /* 駝 */ return "toh";
        case 237: /* 駟 */ return "ma";
        case 242: /* 駢 */ return "ping";
        case 255: /* 駭 */ return "hoi";
        case 261: /* 駱 */ return "lok";
        case 277: /* 駿 */ return "jun";
        }
      case 250:
        switch (octal[2]) {
        case 201: /* 騁 */ return "ping";
        case 205: /* 騅 */ return "ma";
        case 215: /* 騍 */ return "ma";
        case 216: /* 騎 */ return "ke";
        case 217: /* 騏 */ return "ma";
        case 226: /* 騖 */ return "ma";
        case 231: /* 騙 */ return "pin";
        case 255: /* 騭 */ return "ma";
        case 256: /* 騮 */ return "lau";
        case 260: /* 騰 */ return "tang";
        case 266: /* 騶 */ return "ma";
        case 267: /* 騷 */ return "so";
        case 270: /* 騸 */ return "ma";
        case 276: /* 騾 */ return "lui";
        }
      case 251:
        switch (octal[2]) {
        case 200: /* 驀 */ return "mak";
        case 201: /* 驁 */ return "ma";
        case 202: /* 驂 */ return "ma";
        case 203: /* 驃 */ return "ma";
        case 204: /* 驄 */ return "ma";
        case 205: /* 驅 */ return "kui";
        case 212: /* 驊 */ return "ma";
        case 215: /* 驍 */ return "hiu";
        case 217: /* 驏 */ return "ma";
        case 225: /* 驕 */ return "giu";
        case 227: /* 驗 */ return "yim";
        case 232: /* 驚 */ return "geng/ging";
        case 233: /* 驛 */ return "yik";
        case 237: /* 驟 */ return "jaau";
        case 242: /* 驢 */ return "lo";
        case 244: /* 驤 */ return "ma";
        case 245: /* 驥 */ return "ma";
        case 252: /* 驪 */ return "lai";
        case 254: /* 马 */ return "ma";
        case 255: /* 驭 */ return "yue";
        case 256: /* 驮 */ return "toh";
        case 257: /* 驯 */ return "sun";
        case 260: /* 驰 */ return "chi";
        case 261: /* 驱 */ return "kui";
        case 263: /* 驳 */ return "bok";
        case 264: /* 驴 */ return "lo";
        case 265: /* 驵 */ return "ma";
        case 266: /* 驶 */ return "si";
        case 267: /* 驷 */ return "ma";
        case 270: /* 驸 */ return "foo";
        case 271: /* 驹 */ return "kui";
        case 272: /* 驺 */ return "ma";
        case 273: /* 驻 */ return "jue";
        case 274: /* 驼 */ return "toh";
        case 275: /* 驽 */ return "ma";
        case 276: /* 驾 */ return "ga";
        case 277: /* 驿 */ return "yik";
        }
      case 252:
        switch (octal[2]) {
        case 200: /* 骀 */ return "ma";
        case 201: /* 骁 */ return "hiu";
        case 202: /* 骂 */ return "ma";
        case 204: /* 骄 */ return "giu";
        case 205: /* 骅 */ return "ma";
        case 206: /* 骆 */ return "lok";
        case 207: /* 骇 */ return "hoi";
        case 210: /* 骈 */ return "ping";
        case 212: /* 骊 */ return "lai";
        case 213: /* 骋 */ return "ping";
        case 214: /* 验 */ return "yim";
        case 217: /* 骏 */ return "jun";
        case 220: /* 骐 */ return "ma";
        case 221: /* 骑 */ return "ke";
        case 222: /* 骒 */ return "ma";
        case 223: /* 骓 */ return "ma";
        case 226: /* 骖 */ return "ma";
        case 227: /* 骗 */ return "pin";
        case 230: /* 骘 */ return "ma";
        case 232: /* 骚 */ return "so";
        case 233: /* 骛 */ return "ma";
        case 234: /* 骜 */ return "ma";
        case 235: /* 骝 */ return "lau";
        case 237: /* 骟 */ return "ma";
        case 240: /* 骠 */ return "ma";
        case 241: /* 骡 */ return "lui";
        case 242: /* 骢 */ return "ma";
        case 243: /* 骣 */ return "ma";
        case 244: /* 骤 */ return "jaau";
        case 245: /* 骥 */ return "ma";
        case 247: /* 骧 */ return "ma";
        case 250: /* 骨 */ return "gwat";
        case 257: /* 骯 */ return "ong";
        case 260: /* 骰 */ return "gwat";
        case 261: /* 骱 */ return "kwat";
        case 266: /* 骶 */ return "kwat";
        case 267: /* 骷 */ return "foo";
        case 270: /* 骸 */ return "haai";
        case 272: /* 骺 */ return "kwat";
        case 274: /* 骼 */ return "gaak";
        }
      case 253:
        switch (octal[2]) {
        case 200: /* 髀 */ return "kwat";
        case 201: /* 髁 */ return "kwat";
        case 202: /* 髂 */ return "kwat";
        case 205: /* 髅 */ return "lau";
        case 213: /* 髋 */ return "kwat";
        case 214: /* 髌 */ return "kwat";
        case 217: /* 髏 */ return "lau";
        case 221: /* 髑 */ return "kwat";
        case 223: /* 髓 */ return "sui";
        case 224: /* 體 */ return "tai";
        case 225: /* 髕 */ return "kwat";
        case 226: /* 髖 */ return "kwat";
        case 230: /* 高 */ return "go";
        case 237: /* 髟 */ return "faat";
        case 241: /* 髡 */ return "faat";
        case 246: /* 髦 */ return "faat";
        case 253: /* 髫 */ return "faat";
        case 255: /* 髭 */ return "faat";
        case 256: /* 髮 */ return "faat";
        case 257: /* 髯 */ return "faat";
        case 271: /* 髹 */ return "faat";
        case 273: /* 髻 */ return "faat";
        }
      case 254:
        switch (octal[2]) {
        case 203: /* 鬃 */ return "jung";
        case 206: /* 鬆 */ return "chung/sung";
        case 210: /* 鬈 */ return "faat";
        case 217: /* 鬏 */ return "faat/yue";
        case 223: /* 鬓 */ return "faat";
        case 237: /* 鬟 */ return "faat";
        case 242: /* 鬢 */ return "faat";
        case 243: /* 鬣 */ return "kwat";
        case 245: /* 鬥 */ return "dau";
        case 247: /* 鬧 */ return "naau";
        case 256: /* 鬮 */ return "moon";
        case 261: /* 鬱 */ return "yuk";
        case 262: /* 鬲 */ return "gaak";
        case 273: /* 鬻 */ return "yuk";
        case 274: /* 鬼 */ return "gwai";
        }
      case 255:
        switch (octal[2]) {
        case 201: /* 魁 */ return "fooi";
        case 202: /* 魂 */ return "wan";
        case 203: /* 魃 */ return "gwai";
        case 204: /* 魄 */ return "paak";
        case 205: /* 魅 */ return "mooi";
        case 207: /* 魇 */ return "gwai";
        case 210: /* 魈 */ return "gwai";
        case 211: /* 魉 */ return "gwai";
        case 215: /* 魍 */ return "gwai";
        case 216: /* 魎 */ return "gwai";
        case 217: /* 魏 */ return "ngai";
        case 221: /* 魑 */ return "gwai";
        case 224: /* 魔 */ return "moh";
        case 230: /* 魘 */ return "gwai";
        case 232: /* 魚 */ return "yue";
        case 257: /* 魯 */ return "lo";
        case 264: /* 魴 */ return "yue";
        case 267: /* 魷 */ return "yau";
        }
      case 256:
        switch (octal[2]) {
        case 220: /* 鮐 */ return "yue";
        case 221: /* 鮑 */ return "baau";
        case 222: /* 鮒 */ return "yue";
        case 232: /* 鮚 */ return "yue";
        case 236: /* 鮞 */ return "yue";
        case 252: /* 鮪 */ return "yue";
        case 253: /* 鮫 */ return "yue";
        case 255: /* 鮭 */ return "yue";
        case 256: /* 鮮 */ return "sin";
        }
      case 257:
        switch (octal[2]) {
        case 200: /* 鯀 */ return "yue";
        case 201: /* 鯁 */ return "yue";
        case 207: /* 鯇 */ return "waan";
        case 211: /* 鯉 */ return "lei";
        case 212: /* 鯊 */ return "sa";
        case 224: /* 鯔 */ return "yue";
        case 226: /* 鯖 */ return "yue";
        case 227: /* 鯗 */ return "yue";
        case 233: /* 鯛 */ return "yue";
        case 241: /* 鯡 */ return "yue";
        case 242: /* 鯢 */ return "yue";
        case 244: /* 鯤 */ return "yue";
        case 247: /* 鯧 */ return "yue";
        case 250: /* 鯨 */ return "king";
        case 252: /* 鯪 */ return "leng";
        case 253: /* 鯫 */ return "yue";
        case 260: /* 鯰 */ return "yue";
        case 275: /* 鯽 */ return "jik";
        }
      case 260:
        switch (octal[2]) {
        case 210: /* 鰈 */ return "yue";
        case 211: /* 鰉 */ return "yue";
        case 215: /* 鰍 */ return "yue";
        case 222: /* 鰒 */ return "yue";
        case 223: /* 鰓 */ return "soi";
        case 243: /* 鰣 */ return "yue";
        case 245: /* 鰥 */ return "yue";
        case 250: /* 鰨 */ return "yue";
        case 251: /* 鰩 */ return "yue";
        case 255: /* 鰭 */ return "kei";
        case 261: /* 鰱 */ return "yue";
        case 263: /* 鰳 */ return "yue";
        case 267: /* 鰷 */ return "yue";
        case 271: /* 鰹 */ return "yue";
        case 273: /* 鰻 */ return "maan";
        case 276: /* 鰾 */ return "yue";
        }
      case 261:
        switch (octal[2]) {
        case 210: /* 鱈 */ return "yue";
        case 211: /* 鱉 */ return "bit";
        case 215: /* 鱍 */ return "yue";
        case 222: /* 鱒 */ return "yue";
        case 224: /* 鱔 */ return "yue";
        case 226: /* 鱖 */ return "yue";
        case 227: /* 鱗 */ return "lun";
        case 230: /* 鱘 */ return "cham";
        case 237: /* 鱟 */ return "hau";
        case 247: /* 鱧 */ return "yue";
        case 255: /* 鱭 */ return "yue";
        case 267: /* 鱷 */ return "yue";
        case 270: /* 鱸 */ return "lo";
        case 272: /* 鱺 */ return "yue";
        case 274: /* 鱼 */ return "yue";
        case 277: /* 鱿 */ return "yau";
        }
      case 262:
        switch (octal[2]) {
        case 201: /* 鲁 */ return "lo";
        case 202: /* 鲂 */ return "yue";
        case 205: /* 鲅 */ return "yue";
        case 206: /* 鲆 */ return "yue";
        case 207: /* 鲇 */ return "yue";
        case 210: /* 鲈 */ return "lo";
        case 213: /* 鲋 */ return "yue";
        case 215: /* 鲍 */ return "baau";
        case 216: /* 鲎 */ return "hau";
        case 220: /* 鲐 */ return "yue";
        case 221: /* 鲑 */ return "yue";
        case 222: /* 鲒 */ return "yue";
        case 224: /* 鲔 */ return "yue";
        case 225: /* 鲕 */ return "yue";
        case 232: /* 鲚 */ return "yue";
        case 233: /* 鲛 */ return "yue";
        case 234: /* 鲜 */ return "sin";
        case 236: /* 鲞 */ return "yue";
        case 237: /* 鲟 */ return "cham";
        case 240: /* 鲠 */ return "yue";
        case 241: /* 鲡 */ return "yue";
        case 242: /* 鲢 */ return "yue";
        case 243: /* 鲣 */ return "yue";
        case 244: /* 鲤 */ return "lei";
        case 245: /* 鲥 */ return "yue";
        case 246: /* 鲦 */ return "yue";
        case 247: /* 鲧 */ return "yue";
        case 250: /* 鲨 */ return "sa";
        case 251: /* 鲩 */ return "waan";
        case 253: /* 鲫 */ return "jik";
        case 255: /* 鲭 */ return "yue";
        case 256: /* 鲮 */ return "leng";
        case 260: /* 鲰 */ return "yue";
        case 261: /* 鲱 */ return "yue";
        case 262: /* 鲲 */ return "yue";
        case 263: /* 鲳 */ return "yue";
        case 264: /* 鲴 */ return "yue";
        case 265: /* 鲵 */ return "yue";
        case 266: /* 鲶 */ return "yue";
        case 267: /* 鲷 */ return "yue";
        case 270: /* 鲸 */ return "king";
        case 272: /* 鲺 */ return "yue";
        case 273: /* 鲻 */ return "yue";
        case 274: /* 鲼 */ return "yue";
        case 275: /* 鲽 */ return "yue";
        }
      case 263:
        switch (octal[2]) {
        case 203: /* 鳃 */ return "soi";
        case 204: /* 鳄 */ return "yue";
        case 205: /* 鳅 */ return "yue";
        case 206: /* 鳆 */ return "yue";
        case 207: /* 鳇 */ return "yue";
        case 212: /* 鳊 */ return "yue";
        case 213: /* 鳋 */ return "yue";
        case 215: /* 鳍 */ return "kei";
        case 216: /* 鳎 */ return "yue";
        case 217: /* 鳏 */ return "yue";
        case 220: /* 鳐 */ return "yue";
        case 223: /* 鳓 */ return "yue";
        case 224: /* 鳔 */ return "yue";
        case 225: /* 鳕 */ return "yue";
        case 226: /* 鳖 */ return "bit";
        case 227: /* 鳗 */ return "maan";
        case 230: /* 鳘 */ return "yue";
        case 231: /* 鳙 */ return "yue";
        case 234: /* 鳜 */ return "yue";
        case 235: /* 鳝 */ return "yue";
        case 236: /* 鳞 */ return "lun";
        case 237: /* 鳟 */ return "yue";
        case 242: /* 鳢 */ return "yue";
        case 245: /* 鳥 */ return "niu";
        case 251: /* 鳩 */ return "kau";
        case 263: /* 鳳 */ return "fung";
        case 264: /* 鳴 */ return "ming";
        case 266: /* 鳶 */ return "yuen";
        }
      case 264:
        switch (octal[2]) {
        case 206: /* 鴆 */ return "jam";
        case 207: /* 鴇 */ return "bo";
        case 211: /* 鴉 */ return "a";
        case 225: /* 鴕 */ return "toh";
        case 233: /* 鴛 */ return "yuen";
        case 235: /* 鴝 */ return "niu";
        case 237: /* 鴟 */ return "niu";
        case 243: /* 鴣 */ return "goo";
        case 246: /* 鴦 */ return "yeung";
        case 250: /* 鴨 */ return "aap";
        case 257: /* 鴯 */ return "niu";
        case 260: /* 鴰 */ return "niu";
        case 273: /* 鴻 */ return "hung";
        case 277: /* 鴿 */ return "gap";
        }
      case 265:
        switch (octal[2]) {
        case 202: /* 鵂 */ return "niu";
        case 221: /* 鵑 */ return "guen";
        case 222: /* 鵒 */ return "niu";
        case 223: /* 鵓 */ return "niu";
        case 234: /* 鵜 */ return "niu";
        case 235: /* 鵝 */ return "ngoh";
        case 240: /* 鵠 */ return "niu";
        case 241: /* 鵡 */ return "mo";
        case 252: /* 鵪 */ return "ngam";
        case 254: /* 鵬 */ return "paang";
        case 257: /* 鵯 */ return "niu";
        case 262: /* 鵲 */ return "jeuk";
        }
      case 266:
        switch (octal[2]) {
        case 207: /* 鶇 */ return "niu";
        case 211: /* 鶉 */ return "niu";
        case 230: /* 鶘 */ return "niu";
        case 232: /* 鶚 */ return "niu";
        case 251: /* 鶩 */ return "niu";
        case 257: /* 鶯 */ return "ang";
        case 264: /* 鶴 */ return "hok";
        case 273: /* 鶻 */ return "kwat";
        case 274: /* 鶼 */ return "niu";
        }
      case 267:
        switch (octal[2]) {
        case 202: /* 鷂 */ return "niu";
        case 223: /* 鷓 */ return "je";
        case 227: /* 鷗 */ return "au";
        case 231: /* 鷙 */ return "niu";
        case 232: /* 鷚 */ return "niu";
        case 245: /* 鷥 */ return "niu";
        case 246: /* 鷦 */ return "niu";
        case 257: /* 鷯 */ return "niu";
        case 262: /* 鷲 */ return "niu";
        case 264: /* 鷴 */ return "niu";
        case 270: /* 鷸 */ return "niu";
        case 271: /* 鷹 */ return "ying";
        case 272: /* 鷺 */ return "lo";
        }
      case 270:
        switch (octal[2]) {
        case 225: /* 鸕 */ return "niu";
        case 232: /* 鸚 */ return "ying";
        case 233: /* 鸛 */ return "goon";
        case 235: /* 鸝 */ return "niu";
        case 236: /* 鸞 */ return "niu";
        case 237: /* 鸟 */ return "niu";
        case 240: /* 鸠 */ return "kau";
        case 241: /* 鸡 */ return "gai";
        case 242: /* 鸢 */ return "yuen";
        case 243: /* 鸣 */ return "ming";
        case 245: /* 鸥 */ return "au";
        case 246: /* 鸦 */ return "a";
        case 250: /* 鸨 */ return "bo";
        case 251: /* 鸩 */ return "jam";
        case 252: /* 鸪 */ return "goo";
        case 253: /* 鸫 */ return "niu";
        case 254: /* 鸬 */ return "niu";
        case 255: /* 鸭 */ return "aap";
        case 257: /* 鸯 */ return "yeung";
        case 261: /* 鸱 */ return "niu";
        case 262: /* 鸲 */ return "niu";
        case 263: /* 鸳 */ return "yuen";
        case 265: /* 鸵 */ return "toh";
        case 266: /* 鸶 */ return "niu";
        case 267: /* 鸷 */ return "niu";
        case 270: /* 鸸 */ return "niu";
        case 271: /* 鸹 */ return "niu";
        case 272: /* 鸺 */ return "niu";
        case 275: /* 鸽 */ return "gap";
        case 276: /* 鸾 */ return "niu";
        case 277: /* 鸿 */ return "hung";
        }
      case 271:
        switch (octal[2]) {
        case 201: /* 鹁 */ return "niu";
        case 202: /* 鹂 */ return "niu";
        case 203: /* 鹃 */ return "guen";
        case 204: /* 鹄 */ return "niu";
        case 205: /* 鹅 */ return "ngoh";
        case 206: /* 鹆 */ return "niu";
        case 207: /* 鹇 */ return "niu";
        case 210: /* 鹈 */ return "niu";
        case 211: /* 鹉 */ return "mo";
        case 212: /* 鹊 */ return "jeuk";
        case 213: /* 鹋 */ return "niu";
        case 214: /* 鹌 */ return "ngam";
        case 216: /* 鹎 */ return "niu";
        case 217: /* 鹏 */ return "paang";
        case 221: /* 鹑 */ return "niu";
        case 225: /* 鹕 */ return "niu";
        case 227: /* 鹗 */ return "niu";
        case 230: /* 鹘 */ return "kwat";
        case 232: /* 鹚 */ return "niu";
        case 233: /* 鹛 */ return "mei";
        case 234: /* 鹜 */ return "niu";
        case 236: /* 鹞 */ return "niu";
        case 243: /* 鹣 */ return "niu";
        case 244: /* 鹤 */ return "hok";
        case 246: /* 鹦 */ return "ying";
        case 247: /* 鹧 */ return "je";
        case 250: /* 鹨 */ return "niu";
        case 251: /* 鹩 */ return "niu";
        case 252: /* 鹪 */ return "niu";
        case 253: /* 鹫 */ return "niu";
        case 254: /* 鹬 */ return "niu";
        case 255: /* 鹭 */ return "lo";
        case 260: /* 鹰 */ return "ying";
        case 261: /* 鹱 */ return "niu";
        case 263: /* 鹳 */ return "goon";
        case 265: /* 鹵 */ return "lo";
        case 274: /* 鹼 */ return "gaan";
        case 275: /* 鹽 */ return "yim";
        case 277: /* 鹿 */ return "luk";
        }
      case 272:
        switch (octal[2]) {
        case 202: /* 麂 */ return "gei";
        case 210: /* 麈 */ return "jue";
        case 213: /* 麋 */ return "mei";
        case 222: /* 麒 */ return "kei";
        case 223: /* 麓 */ return "luk";
        case 227: /* 麗 */ return "lai";
        case 235: /* 麝 */ return "se";
        case 237: /* 麟 */ return "lun";
        case 245: /* 麥 */ return "mak";
        case 246: /* 麦 */ return "mak";
        case 265: /* 麵 */ return "min";
        case 273: /* 麻 */ return "ma";
        case 274: /* 麼 */ return "moh";
        case 275: /* 麽 */ return "moh";
        case 276: /* 麾 */ return "moh";
        }
      case 273:
        switch (octal[2]) {
        case 203: /* 黃 */ return "wong";
        case 204: /* 黄 */ return "wong";
        case 215: /* 黍 */ return "sue";
        case 216: /* 黎 */ return "lai";
        case 217: /* 黏 */ return "nim";
        case 221: /* 黑 */ return "hak";
        case 224: /* 黔 */ return "kim";
        case 230: /* 默 */ return "mak";
        case 233: /* 黛 */ return "doi";
        case 234: /* 黜 */ return "chut";
        case 235: /* 黝 */ return "yau";
        case 236: /* 點 */ return "dim";
        case 237: /* 黟 */ return "yi";
        case 240: /* 黠 */ return "kit";
        case 242: /* 黢 */ return "chut";
        case 245: /* 黥 */ return "king";
        case 247: /* 黧 */ return "lai";
        case 250: /* 黨 */ return "dong";
        case 251: /* 黩 */ return "duk";
        case 252: /* 黪 */ return "chaam";
        case 257: /* 黯 */ return "am";
        case 262: /* 黲 */ return "chaam";
        case 267: /* 黷 */ return "duk";
        }
      case 274:
        switch (octal[2]) {
        case 216: /* 鼎 */ return "ding";
        case 223: /* 鼓 */ return "goo";
        case 231: /* 鼙 */ return "to";
        case 240: /* 鼠 */ return "sue";
        case 242: /* 鼢 */ return "fan";
        case 254: /* 鼬 */ return "yau";
        case 257: /* 鼯 */ return "ng";
        case 264: /* 鼴 */ return "yin";
        case 267: /* 鼷 */ return "hai";
        case 271: /* 鼹 */ return "yin";
        case 273: /* 鼻 */ return "bei";
        case 275: /* 鼽 */ return "gau";
        case 276: /* 鼾 */ return "hon";
        }
      case 275:
        switch (octal[2]) {
        case 204: /* 齄 */ return "cha";
        case 212: /* 齊 */ return "chai";
        case 213: /* 齋 */ return "jaai";
        case 220: /* 齐 */ return "chai";
        case 222: /* 齒 */ return "chi";
        case 224: /* 齔 */ return "chan";
        case 231: /* 齙 */ return "baau";
        case 234: /* 齜 */ return "ji";
        case 237: /* 齟 */ return "jui";
        case 240: /* 齠 */ return "tiu";
        case 241: /* 齡 */ return "ling";
        case 246: /* 齦 */ return "ngan";
        case 252: /* 齪 */ return "chuk";
        case 254: /* 齬 */ return "mei/yue";
        case 262: /* 齲 */ return "yue";
        case 267: /* 齷 */ return "ak";
        case 277: /* 齿 */ return "chi";
        }
      case 276:
        switch (octal[2]) {
        case 200: /* 龀 */ return "chan";
        case 203: /* 龃 */ return "jui";
        case 204: /* 龄 */ return "ling";
        case 205: /* 龅 */ return "baau";
        case 206: /* 龆 */ return "tiu";
        case 207: /* 龇 */ return "ji";
        case 210: /* 龈 */ return "ngan";
        case 211: /* 龉 */ return "yue";
        case 212: /* 龊 */ return "chuk";
        case 213: /* 龋 */ return "yue";
        case 214: /* 龌 */ return "ak";
        case 215: /* 龍 */ return "lung";
        case 220: /* 龐 */ return "pong";
        case 224: /* 龔 */ return "gung";
        case 231: /* 龙 */ return "lung";
        case 232: /* 龚 */ return "gung";
        case 234: /* 龜 */ return "gwai";
        case 237: /* 龟 */ return "gwai";
        case 240: /* 龠 */ return "yeuk";
        }
      }
    }
    return null;
  }

}
