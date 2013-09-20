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
    switch (octal[0]) {
    case 344:
      switch (octal[1]) {
      case 270:
        switch (octal[2]) {
        case 200: /* 一 */ return "yat";
        case 201: /* 丁 */ return "ding";
        case 203: /* 七 */ return "chat";
        case 207: /* 万 */ return "maan";
        case 210: /* 丈 */ return "jeung";
        case 211: /* 三 */ return "saam";
        case 212: /* 上 */ return "seung";
        case 213: /* 下 */ return "ha";
        case 215: /* 不 */ return "bat";
        case 216: /* 与 */ return "yue";
        case 220: /* 丐 */ return "koi";
        case 221: /* 丑 */ return "chau";
        case 223: /* 专 */ return "juen";
        case 224: /* 且 */ return "che";
        case 225: /* 丕 */ return "pei";
        case 226: /* 世 */ return "sai";
        case 230: /* 丘 */ return "yau";
        case 231: /* 丙 */ return "bing";
        case 232: /* 业 */ return "yip";
        case 233: /* 丛 */ return "chung";
        case 234: /* 东 */ return "dung";
        case 235: /* 丝 */ return "si";
        case 236: /* 丞 */ return "sing";
        case 237: /* 丟 */ return "diu";
        case 242: /* 丢 */ return "diu";
        case 244: /* 两 */ return "leung";
        case 245: /* 严 */ return "yim";
        case 246: /* 並 */ return "bing";
        case 247: /* 丧 */ return "song";
        case 250: /* 丨 */ return "sue";
        case 252: /* 个 */ return "goh";
        case 253: /* 丫 */ return "a";
        case 255: /* 中 */ return "jung";
        case 260: /* 丰 */ return "fung";
        case 262: /* 串 */ return "chuen";
        case 264: /* 临 */ return "lam";
        case 270: /* 丸 */ return "yuen";
        case 271: /* 丹 */ return "daan";
        case 272: /* 为 */ return "wai";
        case 273: /* 主 */ return "jue";
        case 275: /* 丽 */ return "lai";
        case 276: /* 举 */ return "gui";
        case 277: /* 丿 */ return "pit";
        }
      case 271:
        switch (octal[2]) {
        case 203: /* 乃 */ return "naai";
        case 205: /* 久 */ return "gau";
        case 210: /* 么 */ return "moh";
        case 211: /* 义 */ return "yi";
        case 213: /* 之 */ return "ji";
        case 214: /* 乌 */ return "woo";
        case 215: /* 乍 */ return "ja";
        case 216: /* 乎 */ return "foo";
        case 217: /* 乏 */ return "fat";
        case 220: /* 乐 */ return "lok/ngok";
        case 222: /* 乒 */ return "ping";
        case 223: /* 乓 */ return "bam";
        case 224: /* 乔 */ return "kiu";
        case 226: /* 乖 */ return "gwaai";
        case 230: /* 乘 */ return "sing";
        case 231: /* 乙 */ return "yuet";
        case 234: /* 乜 */ return "mat";
        case 235: /* 九 */ return "gau";
        case 236: /* 乞 */ return "hat";
        case 237: /* 也 */ return "ya";
        case 240: /* 习 */ return "jaap";
        case 241: /* 乡 */ return "heung";
        case 246: /* 书 */ return "sue";
        case 260: /* 买 */ return "maai";
        case 261: /* 乱 */ return "luen";
        case 263: /* 乳 */ return "yue";
        case 276: /* 乾 */ return "gon";
        }
      case 272:
        switch (octal[2]) {
        case 202: /* 亂 */ return "luen";
        case 206: /* 了 */ return "liu";
        case 210: /* 予 */ return "yue";
        case 211: /* 争 */ return "jaang";
        case 213: /* 事 */ return "si";
        case 214: /* 二 */ return "yi";
        case 215: /* 亍 */ return "chuk";
        case 216: /* 于 */ return "yue";
        case 217: /* 亏 */ return "kwai";
        case 221: /* 云 */ return "wan";
        case 222: /* 互 */ return "woo";
        case 224: /* 五 */ return "ng";
        case 225: /* 井 */ return "jeng";
        case 230: /* 亘 */ return "woon";
        case 231: /* 亙 */ return "woon";
        case 232: /* 亚 */ return "a";
        case 233: /* 些 */ return "se";
        case 236: /* 亞 */ return "a";
        case 237: /* 亟 */ return "gik";
        case 241: /* 亡 */ return "mong";
        case 242: /* 亢 */ return "kong/mei";
        case 244: /* 交 */ return "gaau";
        case 245: /* 亥 */ return "hoi";
        case 246: /* 亦 */ return "yik";
        case 247: /* 产 */ return "chaan";
        case 250: /* 亨 */ return "hang";
        case 251: /* 亩 */ return "mau";
        case 253: /* 享 */ return "heung";
        case 254: /* 京 */ return "ging";
        case 255: /* 亭 */ return "ting";
        case 256: /* 亮 */ return "leung";
        case 262: /* 亲 */ return "chan";
        case 272: /* 人 */ return "yan";
        case 277: /* 亿 */ return "yik";
        }
      case 273:
        switch (octal[2]) {
        case 200: /* 什 */ return "sam";
        case 201: /* 仁 */ return "yan";
        case 202: /* 仂 */ return "lak";
        case 203: /* 仃 */ return "ding";
        case 204: /* 仄 */ return "jak";
        case 205: /* 仅 */ return "gan";
        case 206: /* 仆 */ return "buk/puk";
        case 207: /* 仇 */ return "sau";
        case 211: /* 仉 */ return "jeung";
        case 212: /* 今 */ return "gam";
        case 213: /* 介 */ return "gaai";
        case 215: /* 仍 */ return "ying";
        case 216: /* 从 */ return "chung";
        case 221: /* 仑 */ return "lun";
        case 223: /* 仓 */ return "chong";
        case 224: /* 仔 */ return "jai";
        case 225: /* 仕 */ return "si";
        case 226: /* 他 */ return "ta";
        case 227: /* 仗 */ return "jeung";
        case 230: /* 付 */ return "foo";
        case 231: /* 仙 */ return "sin";
        case 235: /* 仝 */ return "tung";
        case 236: /* 仞 */ return "yan";
        case 237: /* 仟 */ return "chin";
        case 241: /* 仡 */ return "ngat";
        case 243: /* 代 */ return "doi";
        case 244: /* 令 */ return "ling";
        case 245: /* 以 */ return "yi";
        case 250: /* 仨 */ return "sa";
        case 252: /* 仪 */ return "yi";
        case 253: /* 仫 */ return "muk";
        case 254: /* 们 */ return "moon";
        case 260: /* 仰 */ return "yeung";
        case 262: /* 仲 */ return "jung";
        case 263: /* 仳 */ return "pei";
        case 265: /* 仵 */ return "ng";
        case 266: /* 件 */ return "gin";
        case 267: /* 价 */ return "ga";
        case 273: /* 任 */ return "yam";
        case 275: /* 份 */ return "fan";
        case 277: /* 仿 */ return "fong";
        }
      case 274:
        switch (octal[2]) {
        case 201: /* 企 */ return "kei";
        case 211: /* 伉 */ return "kong";
        case 212: /* 伊 */ return "yi";
        case 215: /* 伍 */ return "ng";
        case 216: /* 伎 */ return "gei";
        case 217: /* 伏 */ return "fuk";
        case 220: /* 伐 */ return "fat";
        case 221: /* 休 */ return "yau";
        case 227: /* 众 */ return "jung";
        case 230: /* 优 */ return "yau";
        case 231: /* 伙 */ return "foh";
        case 232: /* 会 */ return "wooi";
        case 233: /* 伛 */ return "yue";
        case 237: /* 伟 */ return "wai";
        case 240: /* 传 */ return "chuen/juen";
        case 242: /* 伢 */ return "nga";
        case 244: /* 伤 */ return "seung";
        case 245: /* 伥 */ return "jeung";
        case 246: /* 伦 */ return "lun";
        case 247: /* 伧 */ return "chong";
        case 252: /* 伪 */ return "ngai";
        case 253: /* 伫 */ return "chue";
        case 257: /* 伯 */ return "baak";
        case 260: /* 估 */ return "goo";
        case 262: /* 伲 */ return "yan";
        case 264: /* 伴 */ return "boon";
        case 266: /* 伶 */ return "ling";
        case 270: /* 伸 */ return "san";
        case 272: /* 伺 */ return "ji";
        case 274: /* 似 */ return "chi";
        case 275: /* 伽 */ return "ke";
        }
      case 275:
        switch (octal[2]) {
        case 203: /* 佃 */ return "tin";
        case 206: /* 但 */ return "daan";
        case 207: /* 佇 */ return "chue";
        case 210: /* 佈 */ return "bo";
        case 215: /* 位 */ return "wai";
        case 216: /* 低 */ return "dai";
        case 217: /* 住 */ return "jue";
        case 220: /* 佐 */ return "joh";
        case 221: /* 佑 */ return "yau";
        case 223: /* 体 */ return "tai";
        case 224: /* 佔 */ return "jim";
        case 225: /* 何 */ return "hoh";
        case 227: /* 佗 */ return "toh";
        case 230: /* 佘 */ return "se";
        case 231: /* 余 */ return "yue";
        case 232: /* 佚 */ return "yat";
        case 233: /* 佛 */ return "fat";
        case 234: /* 作 */ return "jok";
        case 235: /* 佝 */ return "kui";
        case 236: /* 佞 */ return "ning";
        case 240: /* 你 */ return "nei";
        case 242: /* 佢 */ return "kui";
        case 243: /* 佣 */ return "yung";
        case 244: /* 佤 */ return "nga";
        case 245: /* 佥 */ return "chim/tung";
        case 247: /* 佧 */ return "ka";
        case 251: /* 佩 */ return "pooi";
        case 254: /* 佬 */ return "lo";
        case 257: /* 佯 */ return "yeung";
        case 260: /* 佰 */ return "baak";
        case 263: /* 佳 */ return "gaai";
        case 264: /* 佴 */ return "yi";
        case 266: /* 佶 */ return "gat";
        case 273: /* 佻 */ return "tiu";
        case 274: /* 佼 */ return "gaau";
        case 276: /* 佾 */ return "yat";
        case 277: /* 使 */ return "si";
        }
      case 276:
        switch (octal[2]) {
        case 203: /* 侃 */ return "hon";
        case 204: /* 侄 */ return "jat";
        case 206: /* 來 */ return "loi";
        case 210: /* 侈 */ return "chi";
        case 211: /* 侉 */ return "kwa";
        case 213: /* 例 */ return "lai";
        case 215: /* 侍 */ return "si";
        case 217: /* 侏 */ return "jue";
        case 221: /* 侑 */ return "yau";
        case 224: /* 侔 */ return "mau";
        case 226: /* 侖 */ return "lun";
        case 227: /* 侗 */ return "dung";
        case 233: /* 供 */ return "gung";
        case 235: /* 依 */ return "yi";
        case 240: /* 侠 */ return "hap";
        case 243: /* 侣 */ return "lui";
        case 245: /* 侥 */ return "hiu";
        case 246: /* 侦 */ return "jing";
        case 247: /* 侧 */ return "jak";
        case 250: /* 侨 */ return "kiu";
        case 251: /* 侩 */ return "kooi";
        case 252: /* 侪 */ return "chaai";
        case 254: /* 侬 */ return "nung";
        case 256: /* 侮 */ return "mo";
        case 257: /* 侯 */ return "hau";
        case 265: /* 侵 */ return "cham";
        case 266: /* 侶 */ return "lui";
        case 277: /* 便 */ return "bin/pin";
        }
      case 277:
        switch (octal[2]) {
        case 201: /* 俁 */ return "yan";
        case 202: /* 係 */ return "hai";
        case 203: /* 促 */ return "chuk";
        case 204: /* 俄 */ return "ngoh";
        case 205: /* 俅 */ return "kau";
        case 216: /* 俎 */ return "joh";
        case 217: /* 俏 */ return "chiu";
        case 220: /* 俐 */ return "lei";
        case 221: /* 俑 */ return "yung";
        case 227: /* 俗 */ return "juk";
        case 230: /* 俘 */ return "foo";
        case 232: /* 俚 */ return "lei";
        case 234: /* 俜 */ return "ping";
        case 235: /* 保 */ return "bo";
        case 236: /* 俞 */ return "yue";
        case 237: /* 俟 */ return "ji";
        case 240: /* 俠 */ return "hap";
        case 241: /* 信 */ return "sun";
        case 243: /* 俣 */ return "yan";
        case 246: /* 俦 */ return "chau";
        case 250: /* 俨 */ return "yim";
        case 251: /* 俩 */ return "leung";
        case 252: /* 俪 */ return "lai";
        case 255: /* 俭 */ return "gim";
        case 256: /* 修 */ return "sau";
        case 257: /* 俯 */ return "foo";
        case 261: /* 俱 */ return "kui";
        case 263: /* 俳 */ return "paai";
        case 270: /* 俸 */ return "fung";
        case 272: /* 俺 */ return "aan";
        case 276: /* 俾 */ return "bei";
        }
      }
    case 345:
      switch (octal[1]) {
      case 200:
        switch (octal[2]) {
        case 200: /* 倀 */ return "jeung";
        case 206: /* 倆 */ return "leung";
        case 211: /* 倉 */ return "chong";
        case 213: /* 個 */ return "goh";
        case 214: /* 倌 */ return "goon";
        case 215: /* 倍 */ return "pooi";
        case 217: /* 倏 */ return "suk";
        case 221: /* 們 */ return "moon";
        case 222: /* 倒 */ return "do";
        case 224: /* 倔 */ return "wat";
        case 230: /* 倘 */ return "tong";
        case 231: /* 候 */ return "hau";
        case 232: /* 倚 */ return "yi";
        case 234: /* 倜 */ return "tik";
        case 237: /* 借 */ return "je";
        case 241: /* 倡 */ return "cheung";
        case 245: /* 倥 */ return "hung";
        case 246: /* 倦 */ return "guen";
        case 250: /* 倨 */ return "gui";
        case 251: /* 倩 */ return "sin";
        case 252: /* 倪 */ return "ngai";
        case 253: /* 倫 */ return "lun";
        case 254: /* 倬 */ return "cheuk";
        case 255: /* 倭 */ return "woh";
        case 256: /* 倮 */ return "loh";
        case 272: /* 债 */ return "jaai";
        case 274: /* 值 */ return "jik";
        case 276: /* 倾 */ return "king";
        }
      case 201:
        switch (octal[2]) {
        case 203: /* 偃 */ return "yan";
        case 207: /* 假 */ return "ga";
        case 210: /* 偈 */ return "gai";
        case 211: /* 偉 */ return "wai";
        case 214: /* 偌 */ return "ye";
        case 216: /* 偎 */ return "wai";
        case 217: /* 偏 */ return "pin";
        case 225: /* 偕 */ return "gaai";
        case 232: /* 做 */ return "jo";
        case 234: /* 停 */ return "ting";
        case 245: /* 健 */ return "gin";
        case 254: /* 偬 */ return "jung";
        case 264: /* 側 */ return "jak";
        case 265: /* 偵 */ return "jing";
        case 266: /* 偶 */ return "ngau";
        case 267: /* 偷 */ return "tau";
        case 273: /* 偻 */ return "lau";
        case 275: /* 偽 */ return "ngai";
        case 276: /* 偾 */ return "fan";
        case 277: /* 偿 */ return "seung";
        }
      case 202:
        switch (octal[2]) {
        case 200: /* 傀 */ return "faai";
        case 205: /* 傅 */ return "foo";
        case 210: /* 傈 */ return "lut";
        case 215: /* 傍 */ return "pong";
        case 221: /* 傑 */ return "git";
        case 226: /* 傖 */ return "chong";
        case 231: /* 備 */ return "bei";
        case 243: /* 傣 */ return "taai";
        case 245: /* 傥 */ return "tong";
        case 247: /* 傧 */ return "ban";
        case 250: /* 储 */ return "chue";
        case 251: /* 傩 */ return "noh";
        case 254: /* 催 */ return "chui";
        case 255: /* 傭 */ return "yung";
        case 257: /* 傯 */ return "jung";
        case 262: /* 傲 */ return "ngo";
        case 263: /* 傳 */ return "chuen/juen";
        case 264: /* 傴 */ return "yue";
        case 265: /* 債 */ return "jaai";
        case 267: /* 傷 */ return "seung";
        case 272: /* 傺 */ return "chai";
        case 273: /* 傻 */ return "soh";
        case 276: /* 傾 */ return "king";
        }
      case 203:
        switch (octal[2]) {
        case 202: /* 僂 */ return "lau";
        case 205: /* 僅 */ return "gan";
        case 211: /* 僉 */ return "chim/tung";
        case 217: /* 像 */ return "jeung";
        case 221: /* 僑 */ return "kiu";
        case 225: /* 僕 */ return "buk/puk";
        case 226: /* 僖 */ return "hei";
        case 232: /* 僚 */ return "liu";
        case 245: /* 僥 */ return "hiu";
        case 246: /* 僦 */ return "jau";
        case 247: /* 僧 */ return "jang";
        case 250: /* 僨 */ return "fan";
        case 254: /* 僬 */ return "jiu";
        case 255: /* 僭 */ return "chim";
        case 256: /* 僮 */ return "tung";
        case 263: /* 僳 */ return "lut/suk";
        case 265: /* 僵 */ return "geung";
        case 271: /* 價 */ return "ga";
        case 273: /* 僻 */ return "pik";
        }
      case 204:
        switch (octal[2]) {
        case 200: /* 儀 */ return "yi";
        case 202: /* 儂 */ return "nung";
        case 204: /* 億 */ return "yik";
        case 206: /* 儆 */ return "ging";
        case 207: /* 儇 */ return "yan";
        case 210: /* 儈 */ return "kooi";
        case 211: /* 儉 */ return "gim";
        case 213: /* 儋 */ return "daam";
        case 220: /* 儐 */ return "ban";
        case 222: /* 儒 */ return "yue";
        case 224: /* 儔 */ return "chau";
        case 225: /* 儕 */ return "chaai";
        case 237: /* 償 */ return "seung";
        case 241: /* 儡 */ return "lui";
        case 252: /* 優 */ return "yau";
        case 262: /* 儲 */ return "chue";
        case 267: /* 儷 */ return "lai";
        case 272: /* 儺 */ return "noh";
        case 273: /* 儻 */ return "tong";
        case 274: /* 儼 */ return "yim";
        case 277: /* 儿 */ return "yi";
        }
      case 205:
        switch (octal[2]) {
        case 200: /* 兀 */ return "ngat";
        case 201: /* 允 */ return "wan";
        case 203: /* 元 */ return "yuen";
        case 204: /* 兄 */ return "hing";
        case 205: /* 充 */ return "chung";
        case 206: /* 兆 */ return "siu";
        case 207: /* 兇 */ return "hung";
        case 210: /* 先 */ return "sin";
        case 211: /* 光 */ return "gwong";
        case 213: /* 克 */ return "hak";
        case 214: /* 兌 */ return "dui";
        case 215: /* 免 */ return "min";
        case 221: /* 兑 */ return "dui";
        case 222: /* 兒 */ return "yi";
        case 224: /* 兔 */ return "to";
        case 226: /* 兖 */ return "yin";
        case 227: /* 兗 */ return "yin";
        case 232: /* 党 */ return "dong";
        case 234: /* 兜 */ return "dau";
        case 242: /* 兢 */ return "ging";
        case 245: /* 入 */ return "yap";
        case 247: /* 內 */ return "noi";
        case 250: /* 全 */ return "chuen";
        case 251: /* 兩 */ return "leung";
        case 253: /* 八 */ return "baat";
        case 254: /* 公 */ return "gung";
        case 255: /* 六 */ return "luk";
        case 256: /* 兮 */ return "hai";
        case 260: /* 兰 */ return "laan";
        case 261: /* 共 */ return "gung";
        case 263: /* 关 */ return "gwaan";
        case 264: /* 兴 */ return "hing";
        case 265: /* 兵 */ return "bing";
        case 266: /* 其 */ return "kei";
        case 267: /* 具 */ return "gui";
        case 270: /* 典 */ return "din";
        case 271: /* 兹 */ return "ji";
        case 273: /* 养 */ return "yeung";
        case 274: /* 兼 */ return "gim";
        case 275: /* 兽 */ return "sau";
        }
      case 206:
        switch (octal[2]) {
        case 200: /* 冀 */ return "kei";
        case 205: /* 内 */ return "noi";
        case 207: /* 冇 */ return "mo";
        case 210: /* 冈 */ return "gong";
        case 211: /* 冉 */ return "yim";
        case 212: /* 冊 */ return "chaak";
        case 214: /* 册 */ return "chaak";
        case 215: /* 再 */ return "joi";
        case 221: /* 冑 */ return "jau";
        case 222: /* 冒 */ return "mo";
        case 225: /* 冕 */ return "min";
        case 227: /* 冗 */ return "yung";
        case 231: /* 写 */ return "se";
        case 233: /* 军 */ return "gwan";
        case 234: /* 农 */ return "nung";
        case 240: /* 冠 */ return "goon";
        case 242: /* 冢 */ return "chung";
        case 244: /* 冤 */ return "yuen";
        case 245: /* 冥 */ return "ming";
        case 252: /* 冪 */ return "maan/mok";
        case 254: /* 冬 */ return "dung";
        case 257: /* 冯 */ return "fung";
        case 260: /* 冰 */ return "bing";
        case 261: /* 冱 */ return "woo";
        case 262: /* 冲 */ return "chung";
        case 263: /* 决 */ return "kuet";
        case 265: /* 况 */ return "fong";
        case 266: /* 冶 */ return "ye";
        case 267: /* 冷 */ return "laang";
        case 273: /* 冻 */ return "dung";
        case 274: /* 冼 */ return "sin";
        case 275: /* 冽 */ return "lit";
        }
      case 207:
        switch (octal[2]) {
        case 200: /* 净 */ return "jeng";
        case 204: /* 凄 */ return "chai";
        case 206: /* 准 */ return "jun";
        case 207: /* 凇 */ return "sung";
        case 211: /* 凉 */ return "leung";
        case 213: /* 凋 */ return "diu";
        case 214: /* 凌 */ return "ling";
        case 215: /* 凍 */ return "dung";
        case 217: /* 减 */ return "gaam";
        case 221: /* 凑 */ return "chau";
        case 233: /* 凛 */ return "lam/lei";
        case 234: /* 凜 */ return "lam/lei";
        case 235: /* 凝 */ return "ying";
        case 240: /* 几 */ return "gei";
        case 241: /* 凡 */ return "faan";
        case 244: /* 凤 */ return "fung";
        }
      }
    }
    return null;
  }

}
