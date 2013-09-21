package org.cghio.cantonese.romanization;

public class Hanzi2PinyinData1 {

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
        case 255: /* 凭 */ return "pang";
        case 257: /* 凯 */ return "hoi";
        case 260: /* 凰 */ return "wong";
        case 261: /* 凱 */ return "hoi";
        case 263: /* 凳 */ return "dang";
        case 266: /* 凶 */ return "hung";
        case 270: /* 凸 */ return "dat";
        case 271: /* 凹 */ return "lap";
        case 272: /* 出 */ return "chut";
        case 273: /* 击 */ return "gik";
        case 275: /* 函 */ return "haam";
        case 277: /* 凿 */ return "jok";
        }
      case 210:
        switch (octal[2]) {
        case 200: /* 刀 */ return "do";
        case 201: /* 刁 */ return "diu";
        case 203: /* 刃 */ return "yan";
        case 206: /* 分 */ return "fan";
        case 207: /* 切 */ return "chit";
        case 210: /* 刈 */ return "ngaai";
        case 212: /* 刊 */ return "hon";
        case 215: /* 刍 */ return "choh";
        case 216: /* 刎 */ return "man";
        case 221: /* 刑 */ return "ying";
        case 222: /* 划 */ return "waak";
        case 226: /* 刖 */ return "yuk";
        case 227: /* 列 */ return "lit";
        case 230: /* 刘 */ return "lau";
        case 231: /* 则 */ return "jak";
        case 232: /* 刚 */ return "gong";
        case 233: /* 创 */ return "chong";
        case 235: /* 初 */ return "choh";
        case 240: /* 删 */ return "saan";
        case 244: /* 判 */ return "poon";
        case 245: /* 別 */ return "bit";
        case 250: /* 刨 */ return "paau";
        case 251: /* 利 */ return "lei";
        case 252: /* 刪 */ return "saan";
        case 253: /* 别 */ return "bit";
        case 255: /* 刭 */ return "ging";
        case 256: /* 刮 */ return "gwaat";
        case 260: /* 到 */ return "do";
        case 263: /* 刳 */ return "foo";
        case 266: /* 制 */ return "jai";
        case 267: /* 刷 */ return "chaat";
        case 270: /* 券 */ return "guen";
        case 271: /* 刹 */ return "saat";
        case 272: /* 刺 */ return "chi";
        case 273: /* 刻 */ return "hak";
        case 275: /* 刽 */ return "kooi";
        case 277: /* 刿 */ return "gwai";
        }
      case 211:
        switch (octal[2]) {
        case 200: /* 剀 */ return "hoi";
        case 201: /* 剁 */ return "doh";
        case 202: /* 剂 */ return "jai";
        case 203: /* 剃 */ return "tai";
        case 204: /* 剄 */ return "ging";
        case 207: /* 則 */ return "jak";
        case 212: /* 削 */ return "seuk";
        case 214: /* 剌 */ return "la";
        case 215: /* 前 */ return "chin";
        case 216: /* 剎 */ return "saat";
        case 220: /* 剐 */ return "gwa";
        case 221: /* 剑 */ return "gim";
        case 224: /* 剔 */ return "tik";
        case 226: /* 剖 */ return "fau";
        case 233: /* 剛 */ return "gong";
        case 234: /* 剜 */ return "woon";
        case 235: /* 剝 */ return "mok";
        case 236: /* 剞 */ return "gei";
        case 241: /* 剡 */ return "yim";
        case 245: /* 剥 */ return "mok";
        case 247: /* 剧 */ return "kek";
        case 251: /* 剩 */ return "sing";
        case 252: /* 剪 */ return "jin";
        case 256: /* 剮 */ return "gwa";
        case 257: /* 副 */ return "foo";
        case 262: /* 割 */ return "got";
        case 264: /* 剴 */ return "hoi";
        case 265: /* 創 */ return "chong";
        case 275: /* 剽 */ return "piu";
        case 277: /* 剿 */ return "jiu";
        }
      case 212:
        switch (octal[2]) {
        case 201: /* 劁 */ return "jiu";
        case 202: /* 劂 */ return "kuet";
        case 203: /* 劃 */ return "waak";
        case 207: /* 劇 */ return "kek";
        case 210: /* 劈 */ return "pek";
        case 211: /* 劉 */ return "lau";
        case 212: /* 劊 */ return "kooi";
        case 214: /* 劌 */ return "gwai";
        case 215: /* 劍 */ return "gim";
        case 220: /* 劐 */ return "wok";
        case 221: /* 劑 */ return "jai";
        case 223: /* 劓 */ return "yi";
        case 233: /* 力 */ return "lik";
        case 235: /* 劝 */ return "huen";
        case 236: /* 办 */ return "baan";
        case 237: /* 功 */ return "gung";
        case 240: /* 加 */ return "ga";
        case 241: /* 务 */ return "mo";
        case 243: /* 劣 */ return "luet";
        case 250: /* 动 */ return "dung";
        case 251: /* 助 */ return "joh";
        case 252: /* 努 */ return "no";
        case 253: /* 劫 */ return "gip";
        case 261: /* 励 */ return "lai";
        case 262: /* 劲 */ return "ging";
        case 263: /* 劳 */ return "lo";
        case 276: /* 劾 */ return "hat";
        case 277: /* 势 */ return "sai";
        }
      case 213:
        switch (octal[2]) {
        case 201: /* 勁 */ return "ging";
        case 203: /* 勃 */ return "boot";
        case 207: /* 勇 */ return "yung";
        case 211: /* 勉 */ return "min";
        case 213: /* 勋 */ return "guen";
        case 222: /* 勒 */ return "lak";
        case 225: /* 動 */ return "dung";
        case 230: /* 勘 */ return "ham";
        case 231: /* 務 */ return "mo";
        case 233: /* 勛 */ return "guen";
        case 235: /* 勝 */ return "sing";
        case 236: /* 勞 */ return "lo";
        case 237: /* 募 */ return "mo";
        case 242: /* 勢 */ return "sai";
        case 244: /* 勤 */ return "kan";
        case 265: /* 勵 */ return "lai";
        case 270: /* 勸 */ return "huen";
        case 272: /* 勺 */ return "cheuk";
        case 273: /* 勻 */ return "wan";
        case 276: /* 勾 */ return "ngau";
        case 277: /* 勿 */ return "mat";
        }
      case 214:
        switch (octal[2]) {
        case 200: /* 匀 */ return "wan";
        case 205: /* 包 */ return "baau";
        case 206: /* 匆 */ return "chung";
        case 210: /* 匈 */ return "hung";
        case 215: /* 匍 */ return "po";
        case 220: /* 匐 */ return "fuk";
        case 225: /* 匕 */ return "bei";
        case 226: /* 化 */ return "fa";
        case 227: /* 北 */ return "bak";
        case 231: /* 匙 */ return "chi/si";
        case 235: /* 匝 */ return "saap";
        case 240: /* 匠 */ return "jeung";
        case 241: /* 匡 */ return "hong";
        case 243: /* 匣 */ return "hap";
        case 246: /* 匦 */ return "gwai";
        case 252: /* 匪 */ return "fei";
        case 255: /* 匭 */ return "gwai";
        case 256: /* 匮 */ return "gwai";
        case 257: /* 匯 */ return "wooi";
        case 261: /* 匱 */ return "gwai";
        case 271: /* 匹 */ return "pat";
        case 272: /* 区 */ return "kui";
        case 273: /* 医 */ return "yi";
        case 276: /* 匾 */ return "bin";
        case 277: /* 匿 */ return "nik";
        }
      case 215:
        switch (octal[2]) {
        case 200: /* 區 */ return "kui";
        case 201: /* 十 */ return "sap";
        case 203: /* 千 */ return "chin";
        case 205: /* 卅 */ return "sa";
        case 207: /* 升 */ return "sing";
        case 210: /* 午 */ return "ng";
        case 211: /* 卉 */ return "wai";
        case 212: /* 半 */ return "boon";
        case 216: /* 华 */ return "wa";
        case 217: /* 协 */ return "hip";
        case 221: /* 卑 */ return "bei";
        case 222: /* 卒 */ return "jut";
        case 223: /* 卓 */ return "cheuk";
        case 224: /* 協 */ return "hip";
        case 225: /* 单 */ return "daan";
        case 226: /* 卖 */ return "maai";
        case 227: /* 南 */ return "naam";
        case 232: /* 博 */ return "bok";
        case 234: /* 卜 */ return "baak/buk";
        case 236: /* 卞 */ return "bin";
        case 237: /* 卟 */ return "buk";
        case 240: /* 占 */ return "jim";
        case 241: /* 卡 */ return "ka";
        case 242: /* 卢 */ return "lo";
        case 244: /* 卤 */ return "lo";
        case 246: /* 卦 */ return "gwa";
        case 247: /* 卧 */ return "ngoh";
        case 253: /* 卫 */ return "wai";
        case 257: /* 卯 */ return "maau";
        case 260: /* 印 */ return "yan";
        case 261: /* 危 */ return "ngai";
        case 263: /* 即 */ return "jik";
        case 264: /* 却 */ return "keuk";
        case 265: /* 卵 */ return "lun";
        case 267: /* 卷 */ return "guen";
        case 270: /* 卸 */ return "se";
        case 273: /* 卻 */ return "keuk";
        case 277: /* 卿 */ return "hing";
        }
      case 216:
        switch (octal[2]) {
        case 202: /* 厂 */ return "chong";
        case 204: /* 厄 */ return "ak";
        case 205: /* 厅 */ return "teng";
        case 206: /* 历 */ return "lik";
        case 211: /* 厉 */ return "lai";
        case 213: /* 压 */ return "aat";
        case 214: /* 厌 */ return "yim";
        case 225: /* 厕 */ return "chi";
        case 230: /* 厘 */ return "lei";
        case 232: /* 厚 */ return "hau";
        case 237: /* 原 */ return "yuen";
        case 242: /* 厢 */ return "seung";
        case 245: /* 厥 */ return "kuet";
        case 246: /* 厦 */ return "ha";
        case 250: /* 厨 */ return "chue";
        case 251: /* 厩 */ return "gau";
        case 255: /* 厭 */ return "yim";
        case 256: /* 厮 */ return "si";
        case 262: /* 厲 */ return "lai";
        case 273: /* 去 */ return "hui";
        case 277: /* 县 */ return "yuen";
        }
      case 217:
        switch (octal[2]) {
        case 201: /* 叁 */ return "saam";
        case 202: /* 参 */ return "chaam";
        case 203: /* 參 */ return "chaam/saam";
        case 210: /* 又 */ return "yau";
        case 211: /* 叉 */ return "cha";
        case 212: /* 及 */ return "kap";
        case 213: /* 友 */ return "yau";
        case 214: /* 双 */ return "seung";
        case 215: /* 反 */ return "faan";
        case 221: /* 发 */ return "faat";
        case 224: /* 叔 */ return "suk";
        case 226: /* 取 */ return "chui";
        case 227: /* 受 */ return "sau";
        case 230: /* 变 */ return "bin";
        case 231: /* 叙 */ return "jui";
        case 233: /* 叛 */ return "boon";
        case 237: /* 叟 */ return "sau";
        case 240: /* 叠 */ return "dip";
        case 242: /* 叢 */ return "chung";
        case 243: /* 口 */ return "hau";
        case 244: /* 古 */ return "goo";
        case 245: /* 句 */ return "gui";
        case 246: /* 另 */ return "ling";
        case 250: /* 叨 */ return "to";
        case 251: /* 叩 */ return "kau";
        case 252: /* 只 */ return "jek/ji";
        case 253: /* 叫 */ return "giu";
        case 254: /* 召 */ return "jiu";
        case 255: /* 叭 */ return "ba";
        case 256: /* 叮 */ return "ding";
        case 257: /* 可 */ return "hoh";
        case 260: /* 台 */ return "toi";
        case 261: /* 叱 */ return "chik";
        case 262: /* 史 */ return "si";
        case 263: /* 右 */ return "yau";
        case 265: /* 叵 */ return "poh";
        case 266: /* 叶 */ return "yip";
        case 267: /* 号 */ return "ho";
        case 270: /* 司 */ return "si";
        case 271: /* 叹 */ return "taan";
        case 273: /* 叻 */ return "lek";
        case 274: /* 叼 */ return "diu";
        case 275: /* 叽 */ return "gei";
        }
      case 220:
        switch (octal[2]) {
        case 201: /* 吁 */ return "yue";
        case 203: /* 吃 */ return "hek";
        case 204: /* 各 */ return "gok";
        case 206: /* 吆 */ return "yiu";
        case 210: /* 合 */ return "hap";
        case 211: /* 吉 */ return "gat";
        case 212: /* 吊 */ return "diu";
        case 214: /* 同 */ return "tung";
        case 215: /* 名 */ return "ming";
        case 216: /* 后 */ return "hau";
        case 217: /* 吏 */ return "lei";
        case 220: /* 吐 */ return "to";
        case 221: /* 向 */ return "heung";
        case 222: /* 吒 */ return "ja";
        case 223: /* 吓 */ return "haak";
        case 225: /* 吕 */ return "lui";
        case 226: /* 吖 */ return "a";
        case 227: /* 吗 */ return "ma";
        case 233: /* 君 */ return "gwan";
        case 235: /* 吝 */ return "lun";
        case 236: /* 吞 */ return "tan";
        case 237: /* 吟 */ return "yam";
        case 240: /* 吠 */ return "fai";
        case 241: /* 吡 */ return "bei";
        case 243: /* 吣 */ return "cham";
        case 246: /* 否 */ return "fau";
        case 247: /* 吧 */ return "ba";
        case 250: /* 吨 */ return "dun";
        case 251: /* 吩 */ return "fan";
        case 253: /* 含 */ return "ham";
        case 254: /* 听 */ return "ting";
        case 255: /* 吭 */ return "hong";
        case 256: /* 吮 */ return "suen";
        case 257: /* 启 */ return "kai";
        case 261: /* 吱 */ return "ji";
        case 262: /* 吲 */ return "yan";
        case 263: /* 吳 */ return "ng";
        case 264: /* 吴 */ return "ng";
        case 265: /* 吵 */ return "chaau";
        case 266: /* 吶 */ return "naap";
        case 270: /* 吸 */ return "kap";
        case 271: /* 吹 */ return "chui";
        case 273: /* 吻 */ return "man";
        case 274: /* 吼 */ return "haau";
        case 276: /* 吾 */ return "ng";
        }
      case 221:
        switch (octal[2]) {
        case 200: /* 呀 */ return "a";
        case 202: /* 呂 */ return "lui";
        case 203: /* 呃 */ return "ngak";
        case 206: /* 呆 */ return "daai/ngoi";
        case 210: /* 呈 */ return "ching";
        case 212: /* 告 */ return "go";
        case 213: /* 呋 */ return "foo";
        case 216: /* 呎 */ return "chek";
        case 220: /* 呐 */ return "naap";
        case 222: /* 呒 */ return "mo";
        case 223: /* 呓 */ return "ngai";
        case 224: /* 呔 */ return "taai";
        case 225: /* 呕 */ return "au";
        case 226: /* 呖 */ return "lik";
        case 227: /* 呗 */ return "baai";
        case 230: /* 员 */ return "yuen";
        case 231: /* 呙 */ return "hau";
        case 233: /* 呛 */ return "cheung";
        case 234: /* 呜 */ return "woo";
        case 242: /* 呢 */ return "ne";
        case 244: /* 呤 */ return "ling";
        case 246: /* 呦 */ return "yau";
        case 250: /* 周 */ return "jau";
        case 261: /* 呱 */ return "gwa";
        case 262: /* 呲 */ return "chi";
        case 263: /* 味 */ return "mei";
        case 265: /* 呵 */ return "hoh";
        case 266: /* 呶 */ return "naau";
        case 267: /* 呷 */ return "haap";
        case 270: /* 呸 */ return "pei";
        case 273: /* 呻 */ return "san";
        case 274: /* 呼 */ return "foo";
        case 275: /* 命 */ return "ming";
        }
      case 222:
        switch (octal[2]) {
        case 200: /* 咀 */ return "jui";
        case 201: /* 咁 */ return "gam";
        case 202: /* 咂 */ return "jaap";
        case 204: /* 咄 */ return "chuet";
        case 206: /* 咆 */ return "paau";
        case 213: /* 咋 */ return "ja";
        case 214: /* 和 */ return "woh";
        case 216: /* 咎 */ return "gau";
        case 217: /* 咏 */ return "wing";
        case 220: /* 咐 */ return "foo";
        case 222: /* 咒 */ return "jau";
        case 224: /* 咔 */ return "ka";
        case 225: /* 咕 */ return "goo";
        case 226: /* 咖 */ return "ka";
        case 231: /* 咙 */ return "lung";
        case 232: /* 咚 */ return "dung";
        case 233: /* 咛 */ return "ning";
        case 235: /* 咝 */ return "si";
        case 243: /* 咣 */ return "hau";
        case 244: /* 咤 */ return "ja";
        case 246: /* 咦 */ return "yi";
        case 247: /* 咧 */ return "le";
        case 250: /* 咨 */ return "ji";
        case 251: /* 咩 */ return "me";
        case 252: /* 咪 */ return "mai/mi";
        case 253: /* 咫 */ return "chi";
        case 254: /* 咬 */ return "ngaau";
        case 255: /* 咭 */ return "kaat";
        case 257: /* 咯 */ return "loh";
        case 261: /* 咱 */ return "ja";
        case 263: /* 咳 */ return "kat";
        case 264: /* 咴 */ return "hau";
        case 270: /* 咸 */ return "haam";
        case 273: /* 咻 */ return "jip/yau";
        case 275: /* 咽 */ return "yin";
        case 277: /* 咿 */ return "yi";
        }
      case 223:
        switch (octal[2]) {
        case 200: /* 哀 */ return "oi";
        case 201: /* 品 */ return "ban";
        case 202: /* 哂 */ return "chan";
        case 204: /* 哄 */ return "hung";
        case 206: /* 哆 */ return "che";
        case 207: /* 哇 */ return "wa";
        case 210: /* 哈 */ return "ha";
        case 211: /* 哉 */ return "joi";
        case 214: /* 哌 */ return "hau";
        case 215: /* 响 */ return "heung";
        case 216: /* 哎 */ return "aai";
        case 217: /* 哏 */ return "gan";
        case 220: /* 哐 */ return "hong";
        case 221: /* 哑 */ return "a";
        case 222: /* 哒 */ return "hau";
        case 223: /* 哓 */ return "hiu";
        case 224: /* 哔 */ return "bat";
        case 225: /* 哕 */ return "yuet";
        case 227: /* 哗 */ return "wa";
        case 231: /* 哙 */ return "faai";
        case 232: /* 哚 */ return "doh";
        case 234: /* 哜 */ return "chai";
        case 235: /* 哝 */ return "nung";
        case 236: /* 哞 */ return "mo";
        case 237: /* 哟 */ return "yoh";
        case 241: /* 員 */ return "yuen";
        case 245: /* 哥 */ return "goh";
        case 246: /* 哦 */ return "ngoh";
        case 247: /* 哧 */ return "chi";
        case 250: /* 哨 */ return "saau";
        case 251: /* 哩 */ return "lei";
        case 252: /* 哪 */ return "na";
        case 255: /* 哭 */ return "huk";
        case 256: /* 哮 */ return "haau";
        case 262: /* 哲 */ return "jit";
        case 263: /* 哳 */ return "jaat";
        case 272: /* 哺 */ return "bo";
        case 274: /* 哼 */ return "hang";
        case 275: /* 哽 */ return "gang";
        }
      case 224:
        switch (octal[2]) {
        case 201: /* 唁 */ return "yin";
        case 204: /* 唄 */ return "baai";
        case 206: /* 唆 */ return "soh";
        case 207: /* 唇 */ return "sun";
        case 211: /* 唉 */ return "aai";
        case 217: /* 唏 */ return "hei";
        case 220: /* 唐 */ return "tong";
        case 221: /* 唑 */ return "joh";
        case 224: /* 唔 */ return "m/ng";
        case 233: /* 唛 */ return "mak";
        case 240: /* 唠 */ return "lo";
        case 242: /* 唢 */ return "soh";
        case 243: /* 唣 */ return "jo";
        case 244: /* 唤 */ return "woon";
        case 247: /* 唧 */ return "jek";
        case 252: /* 唪 */ return "fung";
        case 254: /* 唬 */ return "foo";
        case 256: /* 售 */ return "sau";
        case 257: /* 唯 */ return "wai";
        case 260: /* 唰 */ return "chaat";
        case 261: /* 唱 */ return "cheung";
        case 263: /* 唳 */ return "lui";
        case 267: /* 唷 */ return "yoh";
        case 274: /* 唼 */ return "hau";
        case 276: /* 唾 */ return "toh";
        case 277: /* 唿 */ return "fat";
        }
      case 225:
        switch (octal[2]) {
        case 201: /* 啁 */ return "jau";
        case 203: /* 啃 */ return "hang";
        case 204: /* 啄 */ return "deuk";
        case 206: /* 商 */ return "seung";
        case 211: /* 啉 */ return "lam";
        case 212: /* 啊 */ return "a";
        case 217: /* 問 */ return "man";
        case 220: /* 啐 */ return "chui";
        case 225: /* 啕 */ return "to";
        case 226: /* 啖 */ return "daam";
        case 234: /* 啜 */ return "chuet/juet";
        case 236: /* 啞 */ return "a";
        case 237: /* 啟 */ return "kai";
        case 241: /* 啡 */ return "fe";
        case 244: /* 啤 */ return "be";
        case 245: /* 啥 */ return "se";
        case 246: /* 啦 */ return "la";
        case 247: /* 啧 */ return "jaak";
        case 252: /* 啪 */ return "paak";
        case 255: /* 啭 */ return "juen";
        case 256: /* 啮 */ return "ngit";
        case 265: /* 啵 */ return "boh";
        case 266: /* 啶 */ return "hau";
        case 267: /* 啷 */ return "long";
        case 270: /* 啸 */ return "siu";
        case 273: /* 啻 */ return "chi";
        case 274: /* 啼 */ return "tai";
        case 276: /* 啾 */ return "jau";
        }
      case 226:
        switch (octal[2]) {
        case 200: /* 喀 */ return "hak";
        case 201: /* 喁 */ return "yung";
        case 202: /* 喂 */ return "wai";
        case 203: /* 喃 */ return "naam";
        case 204: /* 善 */ return "sin";
        case 207: /* 喇 */ return "la";
        case 210: /* 喈 */ return "gaai";
        case 211: /* 喉 */ return "hau";
        case 212: /* 喊 */ return "haam";
        case 213: /* 喋 */ return "dip";
        case 216: /* 喎 */ return "woh";
        case 217: /* 喏 */ return "noh";
        case 221: /* 喑 */ return "yam";
        case 224: /* 喔 */ return "oh";
        case 230: /* 喘 */ return "chuen";
        case 231: /* 喙 */ return "fooi";
        case 232: /* 喚 */ return "woon";
        case 234: /* 喜 */ return "hei";
        case 235: /* 喝 */ return "hot";
        case 237: /* 喟 */ return "wai";
        case 247: /* 喧 */ return "huen";
        case 252: /* 喪 */ return "song";
        case 254: /* 喬 */ return "kiu";
        case 256: /* 單 */ return "daan";
        case 261: /* 喱 */ return "lei";
        case 262: /* 喲 */ return "yoh";
        case 263: /* 喳 */ return "cha";
        case 265: /* 喵 */ return "miu";
        case 267: /* 喷 */ return "pan";
        case 271: /* 喹 */ return "fooi";
        case 273: /* 喻 */ return "yue";
        case 275: /* 喽 */ return "lau";
        case 276: /* 喾 */ return "guk";
        }
      case 227:
        switch (octal[2]) {
        case 204: /* 嗄 */ return "sa";
        case 205: /* 嗅 */ return "chau/chau#";
        case 206: /* 嗆 */ return "cheung";
        case 211: /* 嗉 */ return "so";
        case 214: /* 嗌 */ return "aai";
        case 215: /* 嗍 */ return "sok";
        case 216: /* 嗎 */ return "ma";
        case 221: /* 嗑 */ return "haap";
        case 222: /* 嗒 */ return "daat";
        case 223: /* 嗓 */ return "song";
        case 224: /* 嗔 */ return "jan";
        case 226: /* 嗖 */ return "sau";
        case 232: /* 嗚 */ return "woo";
        case 234: /* 嗜 */ return "si";
        case 235: /* 嗝 */ return "gaak";
        case 237: /* 嗟 */ return "je";
        case 241: /* 嗡 */ return "yung";
        case 243: /* 嗣 */ return "ji";
        case 244: /* 嗤 */ return "chi";
        case 245: /* 嗥 */ return "ho";
        case 246: /* 嗦 */ return "soh";
        case 250: /* 嗨 */ return "hoi";
        case 251: /* 嗩 */ return "soh";
        case 252: /* 嗪 */ return "hau";
        case 253: /* 嗫 */ return "jip";
        case 254: /* 嗬 */ return "hoh";
        case 257: /* 嗯 */ return "ng";
        case 262: /* 嗲 */ return "de";
        case 263: /* 嗳 */ return "aai";
        case 265: /* 嗵 */ return "tung";
        case 266: /* 嗶 */ return "bat";
        case 267: /* 嗷 */ return "sok";
        case 275: /* 嗽 */ return "sau";
        case 276: /* 嗾 */ return "juk";
        }
      case 230:
        switch (octal[2]) {
        case 200: /* 嘀 */ return "dik";
        case 201: /* 嘁 */ return "chik";
        case 206: /* 嘆 */ return "taan";
        case 210: /* 嘈 */ return "cho";
        case 211: /* 嘉 */ return "ga";
        case 214: /* 嘌 */ return "piu";
        case 215: /* 嘍 */ return "lau";
        case 216: /* 嘎 */ return "ga";
        case 224: /* 嘔 */ return "au";
        case 226: /* 嘖 */ return "jaak";
        case 227: /* 嘗 */ return "seung";
        case 230: /* 嘘 */ return "hui";
        case 233: /* 嘛 */ return "ma";
        case 234: /* 嘜 */ return "mak";
        case 236: /* 嘞 */ return "lak";
        case 237: /* 嘟 */ return "do";
        case 243: /* 嘣 */ return "bang";
        case 244: /* 嘤 */ return "ying";
        case 247: /* 嘧 */ return "hau";
        case 251: /* 嘩 */ return "wa";
        case 254: /* 嘬 */ return "chuet/juet";
        case 255: /* 嘭 */ return "paang";
        case 256: /* 嘮 */ return "lo";
        case 257: /* 嘯 */ return "siu";
        case 260: /* 嘰 */ return "gei";
        case 261: /* 嘱 */ return "juk";
        case 262: /* 嘲 */ return "jaau";
        case 264: /* 嘴 */ return "jui";
        case 265: /* 嘵 */ return "hiu";
        case 266: /* 嘶 */ return "si";
        case 270: /* 嘸 */ return "mo";
        case 271: /* 嘹 */ return "liu";
        case 273: /* 嘻 */ return "hei";
        case 277: /* 嘿 */ return "hei";
        }
      case 231:
        switch (octal[2]) {
        case 214: /* 噌 */ return "jang";
        case 215: /* 噍 */ return "jiu";
        case 216: /* 噎 */ return "yit";
        case 223: /* 噓 */ return "hui";
        case 224: /* 噔 */ return "dang";
        case 227: /* 噗 */ return "pok";
        case 230: /* 噘 */ return "kuet";
        case 231: /* 噙 */ return "kam";
        case 234: /* 噜 */ return "lo";
        case 240: /* 噠 */ return "hau";
        case 242: /* 噢 */ return "oh";
        case 244: /* 噤 */ return "gam";
        case 245: /* 噥 */ return "nung";
        case 246: /* 噦 */ return "yuet";
        case 250: /* 器 */ return "hei";
        case 251: /* 噩 */ return "ok";
        case 252: /* 噪 */ return "cho";
        case 253: /* 噫 */ return "yi";
        case 254: /* 噬 */ return "sai";
        case 257: /* 噯 */ return "aai";
        case 261: /* 噱 */ return "keuk";
        case 262: /* 噲 */ return "faai";
        case 264: /* 噴 */ return "pan";
        case 266: /* 噶 */ return "ga";
        case 270: /* 噸 */ return "dun";
        case 273: /* 噻 */ return "sak";
        case 274: /* 噼 */ return "hau";
        }
      case 232:
        switch (octal[2]) {
        case 200: /* 嚀 */ return "ning";
        case 205: /* 嚅 */ return "yue";
        case 206: /* 嚆 */ return "ho";
        case 207: /* 嚇 */ return "haak";
        case 214: /* 嚌 */ return "chai";
        case 216: /* 嚎 */ return "ho";
        case 217: /* 嚏 */ return "tai";
        case 223: /* 嚓 */ return "chaat";
        case 225: /* 嚕 */ return "lo";
        case 231: /* 嚙 */ return "ngit";
        case 243: /* 嚣 */ return "hiu";
        case 245: /* 嚥 */ return "yin";
        case 246: /* 嚦 */ return "lik";
        case 250: /* 嚨 */ return "lung";
        case 257: /* 嚯 */ return "hau";
        case 263: /* 嚳 */ return "guk";
        case 264: /* 嚴 */ return "yim";
        case 266: /* 嚶 */ return "ying";
        case 267: /* 嚷 */ return "yeung";
        case 274: /* 嚼 */ return "jeuk";
        }
      case 233:
        switch (octal[2]) {
        case 200: /* 囀 */ return "juen";
        case 201: /* 囁 */ return "jip";
        case 202: /* 囂 */ return "hiu";
        case 210: /* 囈 */ return "ngai";
        case 211: /* 囉 */ return "loh";
        case 212: /* 囊 */ return "nong";
        case 221: /* 囑 */ return "juk";
        case 224: /* 囔 */ return "nong";
        case 232: /* 囚 */ return "chau/chau$";
        case 233: /* 四 */ return "sei";
        case 235: /* 囝 */ return "wai";
        case 236: /* 回 */ return "wooi";
        case 240: /* 因 */ return "yan";
        case 241: /* 囡 */ return "wai";
        case 242: /* 团 */ return "tuen";
        case 244: /* 囤 */ return "tuen";
        case 252: /* 囪 */ return "chung";
        case 253: /* 囫 */ return "wai";
        case 255: /* 园 */ return "yuen";
        case 260: /* 困 */ return "kwan";
        case 261: /* 囱 */ return "chung";
        case 264: /* 围 */ return "wai";
        case 265: /* 囵 */ return "wai";
        case 271: /* 囹 */ return "wai";
        case 272: /* 固 */ return "goo";
        case 275: /* 国 */ return "gwok";
        case 276: /* 图 */ return "to";
        case 277: /* 囿 */ return "wai";
        }
      case 234:
        switch (octal[2]) {
        case 203: /* 圃 */ return "po";
        case 204: /* 圄 */ return "wai";
        case 206: /* 圆 */ return "yuen";
        case 207: /* 圇 */ return "wai";
        case 210: /* 圈 */ return "huen";
        case 211: /* 圉 */ return "wai";
        case 212: /* 圊 */ return "wai";
        case 213: /* 國 */ return "gwok";
        case 215: /* 圍 */ return "wai";
        case 222: /* 園 */ return "yuen";
        case 223: /* 圓 */ return "yuen";
        case 226: /* 圖 */ return "to";
        case 230: /* 團 */ return "tuen";
        case 234: /* 圜 */ return "wai";
        case 237: /* 土 */ return "to";
        case 243: /* 圣 */ return "sing";
        case 250: /* 在 */ return "joi";
        case 251: /* 圩 */ return "to";
        case 252: /* 圪 */ return "to";
        case 254: /* 圬 */ return "to";
        case 255: /* 圭 */ return "gwai";
        case 256: /* 圮 */ return "to";
        case 257: /* 圯 */ return "to";
        case 260: /* 地 */ return "dei";
        case 263: /* 圳 */ return "jan";
        case 271: /* 圹 */ return "to";
        case 272: /* 场 */ return "cheung";
        case 273: /* 圻 */ return "to";
        case 276: /* 圾 */ return "saap";
        }
      case 235:
        switch (octal[2]) {
        case 200: /* 址 */ return "ji";
        case 202: /* 坂 */ return "baan";
        case 207: /* 均 */ return "gwan";
        case 212: /* 坊 */ return "fong";
        case 214: /* 坌 */ return "to";
        case 215: /* 坍 */ return "taap";
        case 216: /* 坎 */ return "ham";
        case 217: /* 坏 */ return "waai";
        case 220: /* 坐 */ return "joh";
        case 221: /* 坑 */ return "haang";
        case 227: /* 块 */ return "faai";
        case 232: /* 坚 */ return "gin";
        case 233: /* 坛 */ return "taan";
        case 234: /* 坜 */ return "to";
        case 235: /* 坝 */ return "ba";
        case 236: /* 坞 */ return "o";
        case 237: /* 坟 */ return "fan";
        case 240: /* 坠 */ return "jui";
        case 241: /* 坡 */ return "boh";
        case 244: /* 坤 */ return "kwan";
        case 246: /* 坦 */ return "taan";
        case 250: /* 坨 */ return "to";
        case 251: /* 坩 */ return "to";
        case 252: /* 坪 */ return "ping";
        case 253: /* 坫 */ return "to";
        case 255: /* 坭 */ return "to";
        case 257: /* 坯 */ return "pooi";
        case 263: /* 坳 */ return "to";
        case 266: /* 坶 */ return "to";
        case 267: /* 坷 */ return "hoh";
        case 273: /* 坻 */ return "to";
        case 274: /* 坼 */ return "to";
        }
      case 236:
        switch (octal[2]) {
        case 202: /* 垂 */ return "sui";
        case 203: /* 垃 */ return "laap";
        case 204: /* 垄 */ return "lung";
        case 205: /* 垅 */ return "to";
        case 206: /* 垆 */ return "to";
        case 213: /* 型 */ return "ying";
        case 214: /* 垌 */ return "to";
        case 222: /* 垒 */ return "lui";
        case 223: /* 垓 */ return "to";
        case 233: /* 垛 */ return "doh";
        case 240: /* 垠 */ return "to";
        case 241: /* 垡 */ return "to";
        case 242: /* 垢 */ return "gau";
        case 243: /* 垣 */ return "woon";
        case 244: /* 垤 */ return "to";
        case 246: /* 垦 */ return "han";
        case 247: /* 垧 */ return "to";
        case 251: /* 垩 */ return "ok";
        case 253: /* 垫 */ return "din";
        case 255: /* 垭 */ return "to";
        case 256: /* 垮 */ return "kwa";
        case 262: /* 垲 */ return "to";
        case 264: /* 垴 */ return "to";
        case 270: /* 垸 */ return "to";
        }
      case 237:
        switch (octal[2]) {
        case 203: /* 埃 */ return "aai";
        case 213: /* 埋 */ return "maai";
        case 216: /* 城 */ return "sing";
        case 217: /* 埏 */ return "to";
        case 222: /* 埒 */ return "to";
        case 224: /* 埔 */ return "bo";
        case 225: /* 埕 */ return "to";
        case 230: /* 埘 */ return "to";
        case 231: /* 埙 */ return "to";
        case 232: /* 埚 */ return "to";
        case 235: /* 埝 */ return "to";
        case 237: /* 域 */ return "wik";
        case 240: /* 埠 */ return "fau";
        case 241: /* 埡 */ return "to";
        case 244: /* 埤 */ return "to";
        case 255: /* 埭 */ return "to";
        case 257: /* 埯 */ return "to";
        case 264: /* 埴 */ return "to";
        case 267: /* 執 */ return "jap";
        case 270: /* 埸 */ return "to";
        case 271: /* 培 */ return "pooi";
        case 272: /* 基 */ return "gei";
        case 275: /* 埽 */ return "to";
        }
      case 240:
        switch (octal[2]) {
        case 200: /* 堀 */ return "to";
        case 202: /* 堂 */ return "tong";
        case 205: /* 堅 */ return "gin";
        case 206: /* 堆 */ return "dui";
        case 207: /* 堇 */ return "gan";
        case 212: /* 堊 */ return "ok";
        case 213: /* 堋 */ return "to";
        case 215: /* 堍 */ return "to";
        case 221: /* 堑 */ return "chim";
        case 225: /* 堕 */ return "doh";
        case 231: /* 堙 */ return "to";
        case 235: /* 堝 */ return "to";
        case 236: /* 堞 */ return "to";
        case 240: /* 堠 */ return "to";
        case 241: /* 堡 */ return "bo";
        case 244: /* 堤 */ return "tai";
        case 252: /* 堪 */ return "ham";
        case 257: /* 堯 */ return "yiu";
        case 260: /* 堰 */ return "yin";
        case 261: /* 報 */ return "bo";
        case 264: /* 場 */ return "cheung";
        case 265: /* 堵 */ return "do";
        }
      case 241:
        switch (octal[2]) {
        case 204: /* 塄 */ return "to";
        case 212: /* 塊 */ return "faai";
        case 214: /* 塌 */ return "taap";
        case 215: /* 塍 */ return "yuk";
        case 217: /* 塏 */ return "to";
        case 221: /* 塑 */ return "so";
        case 222: /* 塒 */ return "to";
        case 224: /* 塔 */ return "taap";
        case 227: /* 塗 */ return "to";
        case 230: /* 塘 */ return "tong";
        case 232: /* 塚 */ return "chung";
        case 236: /* 塞 */ return "choi/sak";
        case 242: /* 塢 */ return "o";
        case 244: /* 塤 */ return "to";
        case 245: /* 塥 */ return "to";
        case 253: /* 填 */ return "tin";
        case 254: /* 塬 */ return "to";
        case 265: /* 塵 */ return "chan";
        case 271: /* 塹 */ return "chim";
        case 276: /* 塾 */ return "suk";
        }
      case 242:
        switch (octal[2]) {
        case 200: /* 墀 */ return "to";
        case 201: /* 墁 */ return "to";
        case 203: /* 境 */ return "ging";
        case 205: /* 墅 */ return "sui";
        case 211: /* 墉 */ return "to";
        case 212: /* 墊 */ return "din";
        case 221: /* 墑 */ return "seung";
        case 222: /* 墒 */ return "seung";
        case 223: /* 墓 */ return "mo";
        case 231: /* 墙 */ return "cheung";
        case 232: /* 墚 */ return "to";
        case 234: /* 墜 */ return "jui";
        case 236: /* 增 */ return "jang";
        case 237: /* 墟 */ return "hui";
        case 250: /* 墨 */ return "mak";
        case 251: /* 墩 */ return "dun";
        case 256: /* 墮 */ return "doh";
        case 263: /* 墳 */ return "fan";
        case 274: /* 墼 */ return "to";
        case 276: /* 墾 */ return "han";
        }
      case 243:
        switch (octal[2]) {
        case 201: /* 壁 */ return "bik";
        case 205: /* 壅 */ return "to";
        case 207: /* 壇 */ return "taan";
        case 221: /* 壑 */ return "kok";
        case 223: /* 壓 */ return "aat";
        case 225: /* 壕 */ return "ho";
        case 230: /* 壘 */ return "lui";
        case 231: /* 壙 */ return "to";
        case 232: /* 壚 */ return "to";
        case 236: /* 壞 */ return "waai";
        case 237: /* 壟 */ return "lung";
        case 242: /* 壢 */ return "to";
        case 244: /* 壤 */ return "yeung";
        case 251: /* 壩 */ return "ba";
        case 253: /* 士 */ return "si";
        case 254: /* 壬 */ return "yam";
        case 256: /* 壮 */ return "jong";
        case 257: /* 壯 */ return "jong";
        case 260: /* 声 */ return "seng/sing";
        case 263: /* 壳 */ return "hok";
        case 266: /* 壶 */ return "woo";
        case 271: /* 壹 */ return "yat";
        case 272: /* 壺 */ return "woo";
        case 275: /* 壽 */ return "sau";
        }
      case 244:
        switch (octal[2]) {
        case 204: /* 处 */ return "chue";
        case 207: /* 备 */ return "bei";
        case 215: /* 复 */ return "fuk";
        case 217: /* 夏 */ return "ha";
        case 225: /* 夕 */ return "jik";
        case 226: /* 外 */ return "ngoi";
        case 231: /* 夙 */ return "suk";
        case 232: /* 多 */ return "doh";
        case 234: /* 夜 */ return "ye";
        case 237: /* 够 */ return "gau";
        case 240: /* 夠 */ return "gau";
        case 242: /* 夢 */ return "mung";
        case 247: /* 大 */ return "daai";
        case 251: /* 天 */ return "tin";
        case 252: /* 太 */ return "taai";
        case 253: /* 夫 */ return "foo";
        case 255: /* 夭 */ return "yiu";
        case 256: /* 央 */ return "yeung";
        case 257: /* 夯 */ return "haang";
        case 261: /* 失 */ return "sat";
        case 264: /* 头 */ return "tau";
        case 267: /* 夷 */ return "yi";
        case 270: /* 夸 */ return "kwa";
        case 271: /* 夹 */ return "gaap";
        case 272: /* 夺 */ return "duet";
        case 276: /* 夾 */ return "gaap";
        }
      case 245:
        switch (octal[2]) {
        case 204: /* 奄 */ return "yim";
        case 207: /* 奇 */ return "kei";
        case 210: /* 奈 */ return "noi";
        case 211: /* 奉 */ return "fung";
        case 213: /* 奋 */ return "fan";
        case 216: /* 奎 */ return "fooi";
        case 217: /* 奏 */ return "jau";
        case 221: /* 契 */ return "kai";
        case 224: /* 奔 */ return "ban";
        case 225: /* 奕 */ return "yik";
        case 226: /* 奖 */ return "jeung";
        case 227: /* 套 */ return "to";
        case 232: /* 奚 */ return "hai";
        case 240: /* 奠 */ return "din";
        case 242: /* 奢 */ return "che/saan";
        case 245: /* 奥 */ return "o";
        case 247: /* 奧 */ return "o";
        case 252: /* 奪 */ return "duet";
        case 256: /* 奮 */ return "fan";
        case 263: /* 女 */ return "nui";
        case 264: /* 奴 */ return "no";
        case 266: /* 奶 */ return "naai";
        case 270: /* 奸 */ return "gaan";
        case 271: /* 她 */ return "ta";
        case 275: /* 好 */ return "ho";
        }
      case 246:
        switch (octal[2]) {
        case 201: /* 妁 */ return "cheuk";
        case 202: /* 如 */ return "yue";
        case 203: /* 妃 */ return "fei";
        case 204: /* 妄 */ return "mong";
        case 206: /* 妆 */ return "jong";
        case 207: /* 妇 */ return "foo";
        case 210: /* 妈 */ return "ma";
        case 212: /* 妊 */ return "yam";
        case 215: /* 妍 */ return "yin";
        case 222: /* 妒 */ return "do";
        case 223: /* 妓 */ return "gei";
        case 226: /* 妖 */ return "yiu";
        case 227: /* 妗 */ return "kam";
        case 231: /* 妙 */ return "miu";
        case 235: /* 妝 */ return "jong";
        case 236: /* 妞 */ return "nau";
        case 243: /* 妣 */ return "bei";
        case 244: /* 妤 */ return "yue";
        case 245: /* 妥 */ return "toh";
        case 250: /* 妨 */ return "fong";
        case 251: /* 妩 */ return "mo";
        case 252: /* 妪 */ return "gui";
        case 253: /* 妫 */ return "nui";
        case 256: /* 妮 */ return "nei";
        case 257: /* 妯 */ return "juk";
        case 262: /* 妲 */ return "taan";
        case 271: /* 妹 */ return "mooi";
        case 273: /* 妻 */ return "chai";
        case 276: /* 妾 */ return "chip";
        }
      case 247:
        switch (octal[2]) {
        case 206: /* 姆 */ return "mo";
        case 212: /* 姊 */ return "ji";
        case 213: /* 始 */ return "chi";
        case 215: /* 姍 */ return "saan";
        case 220: /* 姐 */ return "je";
        case 221: /* 姑 */ return "goo";
        case 222: /* 姒 */ return "chi";
        case 223: /* 姓 */ return "sing";
        case 224: /* 委 */ return "wai";
        case 227: /* 姗 */ return "saan";
        case 230: /* 姘 */ return "ping";
        case 232: /* 姚 */ return "yiu";
        case 234: /* 姜 */ return "geung";
        case 235: /* 姝 */ return "jue";
        case 243: /* 姣 */ return "haau";
        case 245: /* 姥 */ return "lo";
        case 250: /* 姨 */ return "yi";
        case 254: /* 姬 */ return "gei";
        case 271: /* 姹 */ return "nui";
        case 273: /* 姻 */ return "yan";
        case 277: /* 姿 */ return "ji";
        }
      case 250:
        switch (octal[2]) {
        case 201: /* 威 */ return "wai";
        case 203: /* 娃 */ return "wa";
        case 204: /* 娄 */ return "lau";
        case 205: /* 娅 */ return "nui";
        case 206: /* 娆 */ return "yiu";
        case 207: /* 娇 */ return "giu";
        case 210: /* 娈 */ return "luen";
        case 211: /* 娉 */ return "ping";
        case 214: /* 娌 */ return "lei";
        case 221: /* 娑 */ return "soh";
        case 223: /* 娓 */ return "mei";
        case 230: /* 娘 */ return "neung";
        case 233: /* 娛 */ return "yue";
        case 234: /* 娜 */ return "na";
        case 237: /* 娟 */ return "guen";
        case 240: /* 娠 */ return "san";
        case 243: /* 娣 */ return "tai";
        case 245: /* 娥 */ return "ngoh";
        case 251: /* 娩 */ return "min";
        case 261: /* 娱 */ return "yue";
        case 262: /* 娲 */ return "woh";
        case 264: /* 娴 */ return "haan";
        case 266: /* 娶 */ return "chui";
        case 274: /* 娼 */ return "cheung";
        }
      case 251:
        switch (octal[2]) {
        case 200: /* 婀 */ return "oh";
        case 201: /* 婁 */ return "lau";
        case 206: /* 婆 */ return "poh";
        case 211: /* 婉 */ return "yuen";
        case 212: /* 婊 */ return "biu";
        case 225: /* 婕 */ return "nui";
        case 232: /* 婚 */ return "fan";
        case 242: /* 婢 */ return "pei";
        case 246: /* 婦 */ return "foo";
        case 247: /* 婧 */ return "nui";
        case 252: /* 婪 */ return "laam";
        case 255: /* 婭 */ return "nui";
        case 264: /* 婴 */ return "ying";
        case 265: /* 婵 */ return "sim";
        case 266: /* 婶 */ return "sam";
        case 267: /* 婷 */ return "ting";
        case 272: /* 婺 */ return "nui";
        case 277: /* 婿 */ return "sai";
        }
      case 252:
        switch (octal[2]) {
        case 222: /* 媒 */ return "mooi";
        case 232: /* 媚 */ return "mei";
        case 233: /* 媛 */ return "nui";
        case 247: /* 媧 */ return "woh";
        case 252: /* 媪 */ return "nui";
        case 257: /* 媯 */ return "nui";
        case 262: /* 媲 */ return "nui";
        case 263: /* 媳 */ return "sik";
        case 265: /* 媵 */ return "yuk";
        case 270: /* 媸 */ return "nui";
        case 274: /* 媼 */ return "nui";
        case 275: /* 媽 */ return "ma";
        case 276: /* 媾 */ return "kau";
        }
      case 253:
        switch (octal[2]) {
        case 201: /* 嫁 */ return "ga";
        case 202: /* 嫂 */ return "so";
        case 211: /* 嫉 */ return "jat";
        case 214: /* 嫌 */ return "yim";
        case 222: /* 嫒 */ return "oi";
        case 224: /* 嫔 */ return "ban";
        case 226: /* 嫖 */ return "piu";
        case 227: /* 嫗 */ return "gui";
        case 230: /* 嫘 */ return "nui";
        case 234: /* 嫜 */ return "nui";
        case 240: /* 嫠 */ return "nui";
        case 241: /* 嫡 */ return "dik";
        case 243: /* 嫣 */ return "yin";
        case 246: /* 嫦 */ return "seung";
        case 251: /* 嫩 */ return "nuen";
        case 253: /* 嫫 */ return "nui";
        case 261: /* 嫱 */ return "nui";
        case 265: /* 嫵 */ return "mo";
        case 273: /* 嫻 */ return "haan";
        }
      case 254:
        switch (octal[2]) {
        case 210: /* 嬈 */ return "yiu";
        case 211: /* 嬉 */ return "hei";
        case 213: /* 嬋 */ return "sim";
        case 214: /* 嬌 */ return "giu";
        case 226: /* 嬖 */ return "nui";
        case 227: /* 嬗 */ return "nui";
        case 231: /* 嬙 */ return "nui";
        case 241: /* 嬡 */ return "oi";
        case 244: /* 嬤 */ return "moh";
        case 252: /* 嬪 */ return "ban";
        case 260: /* 嬰 */ return "ying";
        case 262: /* 嬲 */ return "nau";
        case 264: /* 嬴 */ return "ying";
        case 267: /* 嬷 */ return "moh";
        case 270: /* 嬸 */ return "sam";
        }
      case 255:
        switch (octal[2]) {
        case 200: /* 孀 */ return "seung";
        case 214: /* 孌 */ return "luen";
        case 220: /* 子 */ return "ji";
        case 221: /* 孑 */ return "kit";
        case 223: /* 孓 */ return "kuet";
        case 224: /* 孔 */ return "hung";
        case 225: /* 孕 */ return "yan";
        case 227: /* 字 */ return "ji";
        case 230: /* 存 */ return "chuen";
        case 231: /* 孙 */ return "suen";
        case 232: /* 孚 */ return "foo";
        case 233: /* 孛 */ return "boot";
        case 234: /* 孜 */ return "ji";
        case 235: /* 孝 */ return "haau";
        case 237: /* 孟 */ return "maang";
        case 243: /* 季 */ return "gwai";
        case 244: /* 孤 */ return "goo";
        case 246: /* 学 */ return "hok";
        case 251: /* 孩 */ return "haai";
        case 252: /* 孪 */ return "luen";
        case 253: /* 孫 */ return "suen";
        case 260: /* 孰 */ return "suk";
        case 265: /* 孵 */ return "foo";
        case 270: /* 學 */ return "hok";
        case 272: /* 孺 */ return "yue";
        case 275: /* 孽 */ return "yip";
        case 277: /* 孿 */ return "luen";
        }
      case 256:
        switch (octal[2]) {
        case 201: /* 宁 */ return "ning";
        case 203: /* 它 */ return "ta";
        case 205: /* 宅 */ return "jaak";
        case 207: /* 宇 */ return "yue";
        case 210: /* 守 */ return "sau";
        case 211: /* 安 */ return "on";
        case 213: /* 宋 */ return "sung";
        case 214: /* 完 */ return "yuen";
        case 217: /* 宏 */ return "wang";
        case 227: /* 宗 */ return "jung";
        case 230: /* 官 */ return "goon";
        case 231: /* 宙 */ return "jau";
        case 232: /* 定 */ return "ding";
        case 233: /* 宛 */ return "yuen";
        case 234: /* 宜 */ return "yi";
        case 235: /* 宝 */ return "bo";
        case 236: /* 实 */ return "sat";
        case 240: /* 宠 */ return "chung";
        case 241: /* 审 */ return "sam";
        case 242: /* 客 */ return "haak";
        case 243: /* 宣 */ return "suen";
        case 244: /* 室 */ return "sat";
        case 246: /* 宦 */ return "waan";
        case 252: /* 宪 */ return "hin";
        case 253: /* 宫 */ return "gung";
        case 256: /* 宮 */ return "gung";
        case 260: /* 宰 */ return "joi";
        case 263: /* 害 */ return "hoi";
        case 264: /* 宴 */ return "yin";
        case 265: /* 宵 */ return "siu";
        case 266: /* 家 */ return "ga";
        case 271: /* 容 */ return "yung";
        case 275: /* 宽 */ return "foon";
        case 276: /* 宾 */ return "ban";
        case 277: /* 宿 */ return "suk";
        }
      case 257:
        switch (octal[2]) {
        case 202: /* 寂 */ return "jik";
        case 204: /* 寄 */ return "gei";
        case 205: /* 寅 */ return "yan";
        case 206: /* 密 */ return "mat";
        case 207: /* 寇 */ return "kau";
        case 214: /* 富 */ return "foo";
        case 220: /* 寐 */ return "mei";
        case 222: /* 寒 */ return "hon";
        case 223: /* 寓 */ return "yue";
        case 235: /* 寝 */ return "cham";
        case 236: /* 寞 */ return "mok";
        case 237: /* 察 */ return "chaat";
        case 241: /* 寡 */ return "gwa";
        case 242: /* 寢 */ return "cham";
        case 245: /* 寥 */ return "liu";
        case 246: /* 實 */ return "sat";
        case 247: /* 寧 */ return "ning";
        case 250: /* 寨 */ return "jaai";
        case 251: /* 審 */ return "sam";
        case 253: /* 寫 */ return "se";
        case 254: /* 寬 */ return "foon";
        case 265: /* 寵 */ return "chung";
        case 266: /* 寶 */ return "bo";
        case 270: /* 寸 */ return "chuen";
        case 271: /* 对 */ return "dui";
        case 272: /* 寺 */ return "ji";
        case 273: /* 寻 */ return "cham";
        case 274: /* 导 */ return "do";
        }
      case 260:
        switch (octal[2]) {
        case 201: /* 封 */ return "fung";
        case 204: /* 射 */ return "se";
        case 206: /* 将 */ return "jeung";
        case 207: /* 將 */ return "jeung";
        case 210: /* 專 */ return "juen";
        case 211: /* 尉 */ return "wai";
        case 212: /* 尊 */ return "juen";
        case 213: /* 尋 */ return "cham";
        case 215: /* 對 */ return "dui";
        case 216: /* 導 */ return "do";
        case 217: /* 小 */ return "siu";
        case 221: /* 少 */ return "siu";
        case 224: /* 尔 */ return "yi";
        case 226: /* 尖 */ return "jim";
        case 230: /* 尘 */ return "chan";
        case 232: /* 尚 */ return "seung";
        case 235: /* 尝 */ return "seung";
        case 244: /* 尤 */ return "yau";
        case 247: /* 尧 */ return "yiu";
        case 254: /* 尬 */ return "gaai";
        case 261: /* 就 */ return "jau";
        case 264: /* 尴 */ return "gaam";
        case 267: /* 尷 */ return "gaam";
        case 270: /* 尸 */ return "si";
        case 271: /* 尹 */ return "wan";
        case 272: /* 尺 */ return "chek";
        case 274: /* 尼 */ return "nei";
        case 275: /* 尽 */ return "jun";
        case 276: /* 尾 */ return "mei";
        case 277: /* 尿 */ return "niu";
        }
      case 261:
        switch (octal[2]) {
        case 200: /* 局 */ return "guk";
        case 201: /* 屁 */ return "pei";
        case 202: /* 层 */ return "chang";
        case 205: /* 居 */ return "gui";
        case 206: /* 屆 */ return "gaai";
        case 210: /* 屈 */ return "wat";
        case 211: /* 屉 */ return "tai";
        case 212: /* 届 */ return "gaai";
        case 213: /* 屋 */ return "uk";
        case 215: /* 屍 */ return "si";
        case 216: /* 屎 */ return "si";
        case 217: /* 屏 */ return "ping";
        case 221: /* 屑 */ return "sit";
        case 225: /* 展 */ return "jin";
        case 234: /* 屜 */ return "tai";
        case 236: /* 属 */ return "suk";
        case 240: /* 屠 */ return "to";
        case 241: /* 屡 */ return "lui";
        case 242: /* 屢 */ return "lui";
        case 244: /* 層 */ return "chang";
        case 245: /* 履 */ return "lei";
        case 254: /* 屬 */ return "suk";
        case 257: /* 屯 */ return "tuen";
        case 261: /* 山 */ return "saan";
        case 271: /* 屹 */ return "ngat";
        case 277: /* 屿 */ return "jui/yue";
        }
      case 262:
        switch (octal[2]) {
        case 201: /* 岁 */ return "sui";
        case 202: /* 岂 */ return "hei";
        case 210: /* 岈 */ return "saan";
        case 215: /* 岍 */ return "saan";
        case 220: /* 岐 */ return "kei";
        case 221: /* 岑 */ return "sam";
        case 224: /* 岔 */ return "cha";
        case 226: /* 岖 */ return "kui";
        case 227: /* 岗 */ return "gong";
        case 230: /* 岘 */ return "saan";
        case 231: /* 岙 */ return "saan";
        case 232: /* 岚 */ return "naam";
        case 233: /* 岛 */ return "do";
        case 234: /* 岜 */ return "saan";
        case 241: /* 岡 */ return "gong";
        case 242: /* 岢 */ return "saan";
        case 243: /* 岣 */ return "saan";
        case 251: /* 岩 */ return "ngaam";
        case 253: /* 岫 */ return "saan";
        case 254: /* 岬 */ return "saan";
        case 255: /* 岭 */ return "ling";
        case 261: /* 岱 */ return "doi";
        case 263: /* 岳 */ return "ngok";
        case 265: /* 岵 */ return "saan";
        case 267: /* 岷 */ return "saan";
        case 270: /* 岸 */ return "ngon";
        case 275: /* 岽 */ return "saan";
        case 277: /* 岿 */ return "gwai";
        }
      case 263:
        switch (octal[2]) {
        case 201: /* 峁 */ return "saan";
        case 204: /* 峄 */ return "saan";
        case 213: /* 峋 */ return "saan";
        case 222: /* 峒 */ return "saan";
        case 231: /* 峙 */ return "si";
        case 241: /* 峡 */ return "haap";
        case 244: /* 峤 */ return "saan";
        case 245: /* 峥 */ return "jang";
        case 246: /* 峦 */ return "luen";
        case 250: /* 峨 */ return "ngoh";
        case 252: /* 峪 */ return "yue";
        case 255: /* 峭 */ return "chiu";
        case 260: /* 峰 */ return "fung";
        case 264: /* 峴 */ return "saan";
        case 266: /* 島 */ return "do";
        case 273: /* 峻 */ return "jun";
        case 275: /* 峽 */ return "haap";
        }
      case 264:
        switch (octal[2]) {
        case 202: /* 崂 */ return "lo";
        case 203: /* 崃 */ return "saan";
        case 206: /* 崆 */ return "saan";
        case 207: /* 崇 */ return "sung";
        case 215: /* 崍 */ return "saan";
        case 216: /* 崎 */ return "kei";
        case 224: /* 崔 */ return "chui";
        case 226: /* 崖 */ return "ngaai";
        case 227: /* 崗 */ return "gong";
        case 233: /* 崛 */ return "saan";
        case 236: /* 崞 */ return "saan";
        case 242: /* 崢 */ return "jang";
        case 244: /* 崤 */ return "saan";
        case 246: /* 崦 */ return "saan";
        case 247: /* 崧 */ return "saan";
        case 251: /* 崩 */ return "bang";
        case 255: /* 崭 */ return "jaam";
        case 256: /* 崮 */ return "saan";
        case 263: /* 崳 */ return "saan";
        case 264: /* 崴 */ return "saan";
        case 275: /* 崽 */ return "saan";
        case 276: /* 崾 */ return "saan";
        }
      case 265:
        switch (octal[2]) {
        case 207: /* 嵇 */ return "woh";
        case 212: /* 嵊 */ return "saan";
        case 213: /* 嵋 */ return "mei";
        case 214: /* 嵌 */ return "ham";
        case 220: /* 嵐 */ return "naam";
        case 230: /* 嵘 */ return "wing";
        case 233: /* 嵛 */ return "saan";
        case 235: /* 嵝 */ return "saan";
        case 251: /* 嵩 */ return "sung";
        case 253: /* 嵫 */ return "saan";
        case 254: /* 嵬 */ return "kwai";
        case 257: /* 嵯 */ return "saan";
        case 264: /* 嵴 */ return "saan";
        }
      case 266:
        switch (octal[2]) {
        case 201: /* 嶁 */ return "saan";
        case 202: /* 嶂 */ return "saan";
        case 204: /* 嶄 */ return "jaam";
        case 207: /* 嶇 */ return "kui";
        case 227: /* 嶗 */ return "lo";
        case 231: /* 嶙 */ return "saan";
        case 235: /* 嶝 */ return "saan";
        case 240: /* 嶠 */ return "saan";
        case 247: /* 嶧 */ return "saan";
        case 267: /* 嶷 */ return "saan";
        case 270: /* 嶸 */ return "wing";
        case 272: /* 嶺 */ return "ling";
        case 274: /* 嶼 */ return "jui/yue";
        }
      case 267:
        switch (octal[2]) {
        case 205: /* 巅 */ return "din";
        case 213: /* 巋 */ return "gwai";
        case 215: /* 巍 */ return "ngai";
        case 222: /* 巒 */ return "luen";
        case 224: /* 巔 */ return "din";
        case 226: /* 巖 */ return "ngaam";
        case 233: /* 巛 */ return "si";
        case 235: /* 川 */ return "chuen";
        case 236: /* 州 */ return "jau";
        case 241: /* 巡 */ return "chun";
        case 242: /* 巢 */ return "chaau";
        case 245: /* 工 */ return "gung";
        case 246: /* 左 */ return "joh";
        case 247: /* 巧 */ return "haau";
        case 250: /* 巨 */ return "gui";
        case 251: /* 巩 */ return "gung";
        case 253: /* 巫 */ return "mo";
        case 256: /* 差 */ return "cha";
        case 261: /* 己 */ return "gei";
        case 262: /* 已 */ return "yi";
        case 263: /* 巳 */ return "ji";
        case 264: /* 巴 */ return "ba";
        case 267: /* 巷 */ return "hong";
        case 276: /* 巾 */ return "gan";
        }
      case 270:
        switch (octal[2]) {
        case 201: /* 币 */ return "bai";
        case 202: /* 市 */ return "si";
        case 203: /* 布 */ return "bo";
        case 205: /* 帅 */ return "sui";
        case 206: /* 帆 */ return "faan";
        case 210: /* 师 */ return "si";
        case 214: /* 希 */ return "hei";
        case 217: /* 帏 */ return "gan";
        case 220: /* 帐 */ return "jeung";
        case 221: /* 帑 */ return "gan";
        case 224: /* 帔 */ return "gan";
        case 225: /* 帕 */ return "paak";
        case 226: /* 帖 */ return "tip";
        case 230: /* 帘 */ return "lim";
        case 231: /* 帙 */ return "gan";
        case 232: /* 帚 */ return "jau";
        case 233: /* 帛 */ return "baak";
        case 234: /* 帜 */ return "chi";
        case 235: /* 帝 */ return "dai";
        case 245: /* 帥 */ return "sui";
        case 246: /* 带 */ return "daai";
        case 247: /* 帧 */ return "jing";
        case 253: /* 師 */ return "si";
        case 255: /* 席 */ return "jik";
        case 256: /* 帮 */ return "bong";
        case 261: /* 帱 */ return "gan";
        case 263: /* 帳 */ return "jeung";
        case 266: /* 帶 */ return "daai";
        case 270: /* 常 */ return "seung";
        case 273: /* 帻 */ return "gan";
        case 274: /* 帼 */ return "gan";
        case 275: /* 帽 */ return "mo";
        }
      case 271:
        switch (octal[2]) {
        case 200: /* 幀 */ return "jing";
        case 202: /* 幂 */ return "maan/mok";
        case 203: /* 幃 */ return "gan";
        case 204: /* 幄 */ return "gan";
        case 205: /* 幅 */ return "fuk";
        case 214: /* 幌 */ return "fong";
        case 224: /* 幔 */ return "gan";
        case 225: /* 幕 */ return "mok";
        case 227: /* 幗 */ return "gan";
        case 230: /* 幘 */ return "gan";
        case 233: /* 幛 */ return "gan";
        case 236: /* 幞 */ return "gan";
        case 237: /* 幟 */ return "chi";
        case 241: /* 幡 */ return "gan";
        case 242: /* 幢 */ return "dung";
        case 243: /* 幣 */ return "bai";
        case 253: /* 幫 */ return "bong";
        case 254: /* 幬 */ return "gan";
        case 262: /* 干 */ return "gon";
        case 263: /* 平 */ return "ping";
        case 264: /* 年 */ return "nin";
        case 266: /* 并 */ return "bing";
        case 270: /* 幸 */ return "hang";
        case 271: /* 幹 */ return "gon";
        case 273: /* 幻 */ return "waan";
        case 274: /* 幼 */ return "yau";
        case 275: /* 幽 */ return "yau";
        case 276: /* 幾 */ return "gei";
        case 277: /* 广 */ return "gwong";
        }
      case 272:
        switch (octal[2]) {
        case 204: /* 庄 */ return "jong";
        case 206: /* 庆 */ return "hing";
        case 207: /* 庇 */ return "bei";
        case 212: /* 床 */ return "chong";
        case 217: /* 序 */ return "jui";
        case 220: /* 庐 */ return "lo";
        case 223: /* 库 */ return "foo";
        case 224: /* 应 */ return "ying";
        case 225: /* 底 */ return "dai";
        case 227: /* 店 */ return "dim";
        case 231: /* 庙 */ return "miu";
        case 232: /* 庚 */ return "gang";
        case 234: /* 府 */ return "foo";
        case 236: /* 庞 */ return "pong";
        case 237: /* 废 */ return "fai";
        case 246: /* 度 */ return "do";
        case 247: /* 座 */ return "joh";
        case 253: /* 庫 */ return "foo";
        case 255: /* 庭 */ return "ting";
        case 265: /* 庵 */ return "ngam";
        case 266: /* 庶 */ return "sue";
        case 267: /* 康 */ return "hong";
        case 270: /* 庸 */ return "yung";
        }
      case 273:
        switch (octal[2]) {
        case 201: /* 廁 */ return "chi";
        case 202: /* 廂 */ return "seung";
        case 204: /* 廄 */ return "gau";
        case 210: /* 廈 */ return "ha";
        case 211: /* 廉 */ return "lim";
        case 212: /* 廊 */ return "long";
        case 223: /* 廓 */ return "gwok";
        case 226: /* 廖 */ return "liu";
        case 232: /* 廚 */ return "chue";
        case 235: /* 廝 */ return "si";
        case 237: /* 廟 */ return "miu";
        case 240: /* 廠 */ return "chong";
        case 242: /* 廢 */ return "fai";
        case 243: /* 廣 */ return "gwong";
        case 254: /* 廬 */ return "lo";
        case 263: /* 廳 */ return "teng";
        case 266: /* 延 */ return "yin";
        case 267: /* 廷 */ return "ting";
        case 272: /* 建 */ return "gin";
        }
      case 274:
        switch (octal[2]) {
        case 200: /* 开 */ return "hoi";
        case 202: /* 异 */ return "yi";
        case 203: /* 弃 */ return "hei";
        case 204: /* 弄 */ return "lung";
        case 210: /* 弈 */ return "yik";
        case 212: /* 弊 */ return "bai";
        case 217: /* 式 */ return "sik";
        case 221: /* 弑 */ return "si";
        case 222: /* 弒 */ return "si";
        case 223: /* 弓 */ return "gung";
        case 225: /* 引 */ return "yan";
        case 227: /* 弗 */ return "fat";
        case 230: /* 弘 */ return "wang";
        case 233: /* 弛 */ return "chi";
        case 237: /* 弟 */ return "dai";
        case 240: /* 张 */ return "jeung";
        case 245: /* 弥 */ return "nei";
        case 246: /* 弦 */ return "yin";
        case 251: /* 弩 */ return "no";
        case 255: /* 弭 */ return "mei";
        case 257: /* 弯 */ return "waan";
        case 261: /* 弱 */ return "yeuk";
        case 265: /* 張 */ return "jeung";
        case 267: /* 強 */ return "keung";
        case 271: /* 弹 */ return "daan";
        case 272: /* 强 */ return "keung";
        case 274: /* 弼 */ return "bat";
        }
      case 275:
        switch (octal[2]) {
        case 210: /* 彈 */ return "daan";
        case 214: /* 彌 */ return "nei";
        case 216: /* 彎 */ return "waan";
        case 222: /* 归 */ return "gwai";
        case 223: /* 当 */ return "dong";
        case 225: /* 录 */ return "luk";
        case 227: /* 彗 */ return "sui";
        case 235: /* 彝 */ return "yi";
        case 236: /* 彞 */ return "yi";
        case 242: /* 形 */ return "ying";
        case 244: /* 彤 */ return "tung";
        case 245: /* 彥 */ return "yin";
        case 246: /* 彦 */ return "yin";
        case 251: /* 彩 */ return "choi";
        case 252: /* 彪 */ return "biu";
        case 254: /* 彬 */ return "ban";
        case 255: /* 彭 */ return "paang";
        case 260: /* 彰 */ return "jeung";
        case 261: /* 影 */ return "ying";
        case 267: /* 彷 */ return "fong/gan";
        case 271: /* 役 */ return "yik";
        case 273: /* 彻 */ return "chit";
        case 274: /* 彼 */ return "bei";
        }
      case 276:
        switch (octal[2]) {
        case 200: /* 往 */ return "wong";
        case 201: /* 征 */ return "jing";
        case 202: /* 徂 */ return "cho";
        case 204: /* 径 */ return "ging";
        case 205: /* 待 */ return "doi";
        case 207: /* 徇 */ return "sun";
        case 210: /* 很 */ return "han";
        case 211: /* 徉 */ return "yeung";
        case 212: /* 徊 */ return "wooi";
        case 213: /* 律 */ return "lut";
        case 214: /* 後 */ return "hau";
        case 220: /* 徐 */ return "chui";
        case 221: /* 徑 */ return "ging";
        case 222: /* 徒 */ return "to";
        case 225: /* 徕 */ return "loi";
        case 227: /* 得 */ return "dak";
        case 230: /* 徘 */ return "pooi";
        case 231: /* 徙 */ return "saai";
        case 234: /* 徜 */ return "seung";
        case 236: /* 從 */ return "chung";
        case 240: /* 徠 */ return "loi";
        case 241: /* 御 */ return "yue";
        case 250: /* 徨 */ return "wong";
        case 251: /* 復 */ return "fuk";
        case 252: /* 循 */ return "chun";
        case 255: /* 徭 */ return "yiu";
        case 256: /* 微 */ return "mei";
        case 265: /* 徵 */ return "jing";
        case 267: /* 德 */ return "dak";
        case 271: /* 徹 */ return "chit";
        case 274: /* 徼 */ return "yiu";
        case 275: /* 徽 */ return "fai";
        }
      case 277:
        switch (octal[2]) {
        case 203: /* 心 */ return "sam";
        case 205: /* 必 */ return "bit";
        case 206: /* 忆 */ return "yik";
        case 211: /* 忉 */ return "sam";
        case 214: /* 忌 */ return "gei";
        case 215: /* 忍 */ return "yan";
        case 217: /* 忏 */ return "sam";
        case 220: /* 忐 */ return "taan";
        case 221: /* 忑 */ return "tik";
        case 226: /* 忖 */ return "sam";
        case 227: /* 志 */ return "ji";
        case 230: /* 忘 */ return "mong";
        case 231: /* 忙 */ return "mong";
        case 240: /* 忠 */ return "jung";
        case 241: /* 忡 */ return "sam";
        case 244: /* 忤 */ return "sam";
        case 247: /* 忧 */ return "yau";
        case 252: /* 忪 */ return "sam";
        case 253: /* 快 */ return "faai";
        case 255: /* 忭 */ return "sam";
        case 256: /* 忮 */ return "sam";
        case 261: /* 忱 */ return "sam";
        case 265: /* 念 */ return "nim";
        case 270: /* 忸 */ return "sam";
        case 273: /* 忻 */ return "yan";
        case 275: /* 忽 */ return "fat";
        case 276: /* 忾 */ return "sam";
        case 277: /* 忿 */ return "fan";
        }
      }
    case 346:
      switch (octal[1]) {
      case 200:
        switch (octal[2]) {
        case 200: /* 怀 */ return "waai";
        case 201: /* 态 */ return "taai";
        case 202: /* 怂 */ return "sung";
        case 203: /* 怃 */ return "sam";
        case 204: /* 怄 */ return "sam";
        case 205: /* 怅 */ return "jeung";
        case 206: /* 怆 */ return "sam";
        case 212: /* 怊 */ return "sam";
        case 215: /* 怍 */ return "sam";
        case 216: /* 怎 */ return "jam";
        case 217: /* 怏 */ return "sam";
        case 222: /* 怒 */ return "no";
        case 224: /* 怔 */ return "jing";
        case 225: /* 怕 */ return "pa";
        case 226: /* 怖 */ return "bo";
        case 231: /* 怙 */ return "sam";
        case 233: /* 怛 */ return "sam";
        case 234: /* 怜 */ return "lin";
        case 235: /* 思 */ return "si";
        case 241: /* 怡 */ return "yi";
        case 245: /* 急 */ return "gap";
        case 246: /* 怦 */ return "sam";
        case 247: /* 性 */ return "sing";
        case 250: /* 怨 */ return "yuen";
        case 251: /* 怩 */ return "sam";
        case 252: /* 怪 */ return "gwaai";
        case 253: /* 怫 */ return "sam";
        case 257: /* 怯 */ return "hip";
        case 265: /* 怵 */ return "sam";
        case 273: /* 总 */ return "jung";
        case 277: /* 怿 */ return "sam";
        }
      case 201:
        switch (octal[2]) {
        case 201: /* 恁 */ return "sam";
        case 202: /* 恂 */ return "sam";
        case 203: /* 恃 */ return "chi";
        case 206: /* 恆 */ return "hang";
        case 213: /* 恋 */ return "luen";
        case 215: /* 恍 */ return "fong";
        case 220: /* 恐 */ return "hung";
        case 222: /* 恒 */ return "hang";
        case 225: /* 恕 */ return "sue";
        case 231: /* 恙 */ return "yeung";
        case 232: /* 恚 */ return "sam";
        case 235: /* 恝 */ return "sam";
        case 242: /* 恢 */ return "fooi";
        case 243: /* 恣 */ return "sam/si";
        case 244: /* 恤 */ return "sut";
        case 245: /* 恥 */ return "chi";
        case 247: /* 恧 */ return "sam";
        case 250: /* 恨 */ return "han";
        case 251: /* 恩 */ return "yan";
        case 253: /* 恫 */ return "dung";
        case 254: /* 恬 */ return "tim";
        case 255: /* 恭 */ return "gung";
        case 257: /* 息 */ return "sik";
        case 263: /* 恳 */ return "han";
        case 266: /* 恶 */ return "ok";
        case 270: /* 恸 */ return "sam";
        case 271: /* 恹 */ return "sam";
        case 272: /* 恺 */ return "sam";
        case 273: /* 恻 */ return "chaak";
        case 274: /* 恼 */ return "no";
        case 275: /* 恽 */ return "sam";
        case 277: /* 恿 */ return "yung";
        }
      case 202:
        switch (octal[2]) {
        case 203: /* 悃 */ return "sam";
        case 204: /* 悄 */ return "chiu";
        case 205: /* 悅 */ return "yuet";
        case 211: /* 悉 */ return "sik";
        case 214: /* 悌 */ return "sam";
        case 215: /* 悍 */ return "hon";
        case 222: /* 悒 */ return "sam";
        case 224: /* 悔 */ return "fooi";
        case 226: /* 悖 */ return "boot/sam";
        case 232: /* 悚 */ return "sam";
        case 233: /* 悛 */ return "sam";
        case 235: /* 悝 */ return "sam";
        case 237: /* 悟 */ return "ng";
        case 240: /* 悠 */ return "yau";
        case 243: /* 患 */ return "waan";
        case 246: /* 悦 */ return "yuet";
        case 250: /* 您 */ return "nei";
        case 253: /* 悫 */ return "sam";
        case 254: /* 悬 */ return "yuen";
        case 255: /* 悭 */ return "sam";
        case 257: /* 悯 */ return "man";
        case 261: /* 悱 */ return "sam";
        case 262: /* 悲 */ return "bei";
        case 264: /* 悴 */ return "sam";
        case 265: /* 悵 */ return "jeung";
        case 266: /* 悶 */ return "moon";
        case 270: /* 悸 */ return "gwai";
        case 273: /* 悻 */ return "sam";
        case 274: /* 悼 */ return "do";
        }
      case 203:
        switch (octal[2]) {
        case 205: /* 情 */ return "ching";
        case 206: /* 惆 */ return "sam";
        case 212: /* 惊 */ return "ging";
        case 213: /* 惋 */ return "yuen";
        case 221: /* 惑 */ return "waak";
        case 225: /* 惕 */ return "tik";
        case 230: /* 惘 */ return "sam";
        case 232: /* 惚 */ return "sam";
        case 234: /* 惜 */ return "sik";
        case 235: /* 惝 */ return "sam";
        case 237: /* 惟 */ return "wai";
        case 240: /* 惠 */ return "wai/woo";
        case 241: /* 惡 */ return "ok";
        case 246: /* 惦 */ return "tim";
        case 247: /* 惧 */ return "gui";
        case 250: /* 惨 */ return "chaam";
        case 251: /* 惩 */ return "ching";
        case 253: /* 惫 */ return "bei";
        case 254: /* 惬 */ return "sam";
        case 255: /* 惭 */ return "chaam";
        case 256: /* 惮 */ return "daan";
        case 257: /* 惯 */ return "gwaan";
        case 260: /* 惰 */ return "doh";
        case 261: /* 惱 */ return "no";
        case 262: /* 惲 */ return "sam";
        case 263: /* 想 */ return "seung";
        case 264: /* 惴 */ return "sam";
        case 266: /* 惶 */ return "wong";
        case 271: /* 惹 */ return "ye";
        case 272: /* 惺 */ return "sing";
        case 273: /* 惻 */ return "chaak";
        }
      case 204:
        switch (octal[2]) {
        case 200: /* 愀 */ return "sam";
        case 201: /* 愁 */ return "sau";
        case 206: /* 愆 */ return "sam";
        case 210: /* 愈 */ return "yue";
        case 211: /* 愉 */ return "yue";
        case 215: /* 愍 */ return "sam";
        case 216: /* 愎 */ return "sam";
        case 217: /* 意 */ return "yi";
        case 225: /* 愕 */ return "ok";
        case 232: /* 愚 */ return "yue";
        case 233: /* 愛 */ return "oi";
        case 234: /* 愜 */ return "sam";
        case 237: /* 感 */ return "gam";
        case 240: /* 愠 */ return "sam";
        case 243: /* 愣 */ return "sam";
        case 244: /* 愤 */ return "fan";
        case 246: /* 愦 */ return "sam";
        case 247: /* 愧 */ return "kwai";
        case 250: /* 愨 */ return "sam";
        case 253: /* 愫 */ return "sam";
        case 264: /* 愴 */ return "sam";
        case 267: /* 愷 */ return "sam";
        case 276: /* 愾 */ return "sam";
        case 277: /* 愿 */ return "yuen";
        }
      case 205:
        switch (octal[2]) {
        case 210: /* 慈 */ return "chi";
        case 212: /* 慊 */ return "sam";
        case 213: /* 態 */ return "taai";
        case 214: /* 慌 */ return "fong";
        case 215: /* 慍 */ return "sam";
        case 216: /* 慎 */ return "san";
        case 221: /* 慑 */ return "sip";
        case 225: /* 慕 */ return "mo";
        case 230: /* 慘 */ return "chaam";
        case 232: /* 慚 */ return "chaam";
        case 235: /* 慝 */ return "sam";
        case 237: /* 慟 */ return "sam";
        case 242: /* 慢 */ return "maan";
        case 243: /* 慣 */ return "gwaan";
        case 247: /* 慧 */ return "wai";
        case 250: /* 慨 */ return "koi";
        case 252: /* 慪 */ return "sam";
        case 253: /* 慫 */ return "sung";
        case 256: /* 慮 */ return "lui";
        case 260: /* 慰 */ return "wai";
        case 263: /* 慳 */ return "sam";
        case 265: /* 慵 */ return "sam";
        case 266: /* 慶 */ return "hing";
        case 267: /* 慷 */ return "hong";
        }
      case 206:
        switch (octal[2]) {
        case 202: /* 憂 */ return "yau";
        case 212: /* 憊 */ return "bei";
        case 213: /* 憋 */ return "bit";
        case 216: /* 憎 */ return "jang";
        case 220: /* 憐 */ return "lin";
        case 221: /* 憑 */ return "pang";
        case 222: /* 憒 */ return "sam";
        case 224: /* 憔 */ return "sam";
        case 232: /* 憚 */ return "daan";
        case 235: /* 憝 */ return "sam";
        case 244: /* 憤 */ return "fan";
        case 247: /* 憧 */ return "sam";
        case 250: /* 憨 */ return "ham";
        case 251: /* 憩 */ return "tim";
        case 253: /* 憫 */ return "man";
        case 254: /* 憬 */ return "sam";
        case 256: /* 憮 */ return "sam";
        case 262: /* 憲 */ return "hin";
        case 266: /* 憶 */ return "yik";
        case 267: /* 憷 */ return "sam";
        case 276: /* 憾 */ return "ham";
        }
      case 207:
        switch (octal[2]) {
        case 202: /* 懂 */ return "dung";
        case 207: /* 懇 */ return "han";
        case 210: /* 懈 */ return "haai";
        case 211: /* 應 */ return "ying";
        case 212: /* 懊 */ return "o";
        case 213: /* 懋 */ return "sam";
        case 214: /* 懌 */ return "sam";
        case 215: /* 懍 */ return "sam";
        case 221: /* 懑 */ return "sam";
        case 222: /* 懒 */ return "laan";
        case 224: /* 懔 */ return "sam";
        case 243: /* 懣 */ return "sam";
        case 246: /* 懦 */ return "noh";
        case 250: /* 懨 */ return "sam";
        case 262: /* 懲 */ return "ching";
        case 265: /* 懵 */ return "mung";
        case 266: /* 懶 */ return "laan";
        case 267: /* 懷 */ return "waai";
        case 270: /* 懸 */ return "yuen";
        case 272: /* 懺 */ return "sam";
        case 274: /* 懼 */ return "gui";
        case 276: /* 懾 */ return "sip";
        case 277: /* 懿 */ return "yi";
        }
      case 210:
        switch (octal[2]) {
        case 200: /* 戀 */ return "luen";
        case 206: /* 戆 */ return "sam";
        case 207: /* 戇 */ return "sam";
        case 210: /* 戈 */ return "gwoh";
        case 212: /* 戊 */ return "mo";
        case 213: /* 戋 */ return "jin";
        case 214: /* 戌 */ return "sut";
        case 215: /* 戍 */ return "sue";
        case 216: /* 戎 */ return "yung";
        case 217: /* 戏 */ return "hei";
        case 220: /* 成 */ return "sing";
        case 221: /* 我 */ return "ngoh";
        case 222: /* 戒 */ return "gaai";
        case 224: /* 戔 */ return "jin";
        case 225: /* 戕 */ return "cheung";
        case 226: /* 或 */ return "waak";
        case 227: /* 戗 */ return "gwoh";
        case 230: /* 战 */ return "jin";
        case 232: /* 戚 */ return "chik";
        case 233: /* 戛 */ return "gwoh";
        case 237: /* 戟 */ return "gik";
        case 241: /* 戡 */ return "gwoh";
        case 242: /* 戢 */ return "gwoh";
        case 244: /* 戤 */ return "gwoh";
        case 245: /* 戥 */ return "dang";
        case 247: /* 戧 */ return "gwoh";
        case 251: /* 戩 */ return "gwoh";
        case 252: /* 截 */ return "jit";
        case 254: /* 戬 */ return "gwoh";
        case 256: /* 戮 */ return "luk";
        case 260: /* 戰 */ return "jin";
        case 262: /* 戲 */ return "hei";
        case 263: /* 戳 */ return "cheuk";
        case 264: /* 戴 */ return "daai";
        case 266: /* 戶 */ return "woo";
        case 267: /* 户 */ return "woo";
        case 275: /* 戽 */ return "foo";
        case 276: /* 戾 */ return "lui";
        case 277: /* 房 */ return "fong";
        }
      case 211:
        switch (octal[2]) {
        case 200: /* 所 */ return "soh";
        case 201: /* 扁 */ return "bin";
        case 203: /* 扃 */ return "gwing";
        case 207: /* 扇 */ return "sin";
        case 210: /* 扈 */ return "woo";
        case 211: /* 扉 */ return "fei";
        case 213: /* 手 */ return "sau";
        case 215: /* 才 */ return "choi";
        case 216: /* 扎 */ return "jaat";
        case 221: /* 扑 */ return "pok";
        case 222: /* 扒 */ return "pa";
        case 223: /* 打 */ return "da";
        case 224: /* 扔 */ return "wing";
        case 230: /* 托 */ return "tok";
        case 233: /* 扛 */ return "gong";
        case 243: /* 扣 */ return "kau";
        case 246: /* 扦 */ return "chin";
        case 247: /* 执 */ return "jap";
        case 251: /* 扩 */ return "kong";
        case 252: /* 扪 */ return "sau";
        case 253: /* 扫 */ return "so";
        case 254: /* 扬 */ return "yeung";
        case 255: /* 扭 */ return "nau";
        case 256: /* 扮 */ return "baan";
        case 257: /* 扯 */ return "che";
        case 260: /* 扰 */ return "yiu";
        case 263: /* 扳 */ return "paan";
        case 266: /* 扶 */ return "foo";
        case 271: /* 批 */ return "pai";
        case 274: /* 扼 */ return "ak";
        case 276: /* 找 */ return "jaau";
        case 277: /* 承 */ return "sing";
        }
      case 212:
        switch (octal[2]) {
        case 200: /* 技 */ return "gei";
        case 204: /* 抄 */ return "chaau";
        case 211: /* 抉 */ return "kuet";
        case 212: /* 把 */ return "ba";
        case 221: /* 抑 */ return "yik";
        case 222: /* 抒 */ return "sue";
        case 223: /* 抓 */ return "jaau";
        case 225: /* 投 */ return "tau";
        case 226: /* 抖 */ return "dau";
        case 227: /* 抗 */ return "kong";
        case 230: /* 折 */ return "jit";
        case 232: /* 抚 */ return "foo";
        case 233: /* 抛 */ return "paau";
        case 237: /* 抟 */ return "sau";
        case 240: /* 抠 */ return "gau";
        case 241: /* 抡 */ return "lun";
        case 242: /* 抢 */ return "cheung";
        case 244: /* 护 */ return "woo";
        case 245: /* 报 */ return "bo";
        case 250: /* 抨 */ return "ping";
        case 253: /* 披 */ return "pei";
        case 254: /* 抬 */ return "toi";
        case 261: /* 抱 */ return "po";
        case 265: /* 抵 */ return "dai";
        case 271: /* 抹 */ return "moot";
        case 273: /* 抻 */ return "sau";
        case 274: /* 押 */ return "aat";
        case 275: /* 抽 */ return "chau/chau!/chau$";
        case 277: /* 抿 */ return "man";
        }
      case 213:
        switch (octal[2]) {
        case 202: /* 拂 */ return "fat";
        case 204: /* 拄 */ return "jue";
        case 205: /* 担 */ return "daam";
        case 206: /* 拆 */ return "chaak";
        case 207: /* 拇 */ return "mo";
        case 210: /* 拈 */ return "nim";
        case 211: /* 拉 */ return "laai";
        case 212: /* 拊 */ return "sau";
        case 213: /* 拋 */ return "paau";
        case 214: /* 拌 */ return "poon";
        case 215: /* 拍 */ return "paak";
        case 216: /* 拎 */ return "ling";
        case 220: /* 拐 */ return "gwaai";
        case 222: /* 拒 */ return "kui";
        case 223: /* 拓 */ return "tok";
        case 224: /* 拔 */ return "bat";
        case 226: /* 拖 */ return "toh";
        case 227: /* 拗 */ return "aau";
        case 230: /* 拘 */ return "kui";
        case 231: /* 拙 */ return "chuet";
        case 232: /* 拚 */ return "sau";
        case 233: /* 招 */ return "jiu";
        case 234: /* 拜 */ return "baai";
        case 237: /* 拟 */ return "yi";
        case 242: /* 拢 */ return "lung";
        case 243: /* 拣 */ return "gaan";
        case 245: /* 拥 */ return "yung";
        case 246: /* 拦 */ return "laan";
        case 250: /* 拨 */ return "boot";
        case 251: /* 择 */ return "jaak";
        case 254: /* 括 */ return "gwaat/koot";
        case 255: /* 拭 */ return "sik";
        case 256: /* 拮 */ return "sau";
        case 257: /* 拯 */ return "ching";
        case 261: /* 拱 */ return "gung";
        case 263: /* 拳 */ return "kuen";
        case 264: /* 拴 */ return "chuen";
        case 266: /* 拶 */ return "sau";
        case 267: /* 拷 */ return "haau";
        case 274: /* 拼 */ return "ping";
        case 275: /* 拽 */ return "yai";
        case 276: /* 拾 */ return "sap";
        case 277: /* 拿 */ return "na";
        }
      case 214:
        switch (octal[2]) {
        case 201: /* 持 */ return "chi";
        case 202: /* 挂 */ return "gwa";
        case 207: /* 指 */ return "ji";
        case 210: /* 挈 */ return "sau";
        case 211: /* 按 */ return "on";
        case 216: /* 挎 */ return "kwa";
        case 221: /* 挑 */ return "tiu";
        case 226: /* 挖 */ return "waat";
        case 232: /* 挚 */ return "ji";
        case 233: /* 挛 */ return "luen";
        case 235: /* 挝 */ return "cha";
        case 236: /* 挞 */ return "daat";
        case 237: /* 挟 */ return "hip";
        case 240: /* 挠 */ return "naau";
        case 241: /* 挡 */ return "dong";
        case 242: /* 挢 */ return "sau";
        case 243: /* 挣 */ return "jaang";
        case 244: /* 挤 */ return "jai";
        case 245: /* 挥 */ return "fai";
        case 250: /* 挨 */ return "aai";
        case 252: /* 挪 */ return "na";
        case 253: /* 挫 */ return "choh";
        case 257: /* 振 */ return "jan";
        case 262: /* 挲 */ return "sau";
        case 271: /* 挹 */ return "sau";
        case 272: /* 挺 */ return "ting";
        case 275: /* 挽 */ return "waan";
        case 276: /* 挾 */ return "hip";
        }
      case 215:
        switch (octal[2]) {
        case 202: /* 捂 */ return "ng";
        case 203: /* 捃 */ return "sau";
        case 205: /* 捅 */ return "tung";
        case 206: /* 捆 */ return "kwan";
        case 211: /* 捉 */ return "juk";
        case 213: /* 捋 */ return "lip";
        case 214: /* 捌 */ return "baat";
        case 215: /* 捍 */ return "hon";
        case 216: /* 捎 */ return "saau";
        case 217: /* 捏 */ return "nip";
        case 220: /* 捐 */ return "guen";
        case 225: /* 捕 */ return "bo";
        case 236: /* 捞 */ return "lo";
        case 237: /* 损 */ return "suen";
        case 241: /* 捡 */ return "gaan";
        case 242: /* 换 */ return "woon";
        case 243: /* 捣 */ return "do";
        case 247: /* 捧 */ return "pung";
        case 250: /* 捨 */ return "se";
        case 251: /* 捩 */ return "sau";
        case 253: /* 捫 */ return "sau";
        case 255: /* 捭 */ return "sau";
        case 256: /* 据 */ return "gui";
        case 261: /* 捱 */ return "ngaai";
        case 266: /* 捶 */ return "chui";
        case 267: /* 捷 */ return "gin/jit";
        case 272: /* 捺 */ return "sau";
        case 273: /* 捻 */ return "nip";
        }
      case 216:
        switch (octal[2]) {
        case 200: /* 掀 */ return "hin";
        case 202: /* 掂 */ return "dim";
        case 203: /* 掃 */ return "so";
        case 204: /* 掄 */ return "lun";
        case 207: /* 掇 */ return "chuet/juet";
        case 210: /* 授 */ return "sau";
        case 211: /* 掉 */ return "diu";
        case 212: /* 掊 */ return "sau";
        case 214: /* 掌 */ return "jeung";
        case 216: /* 掎 */ return "sau";
        case 217: /* 掏 */ return "to";
        case 220: /* 掐 */ return "haap";
        case 222: /* 排 */ return "paai";
        case 226: /* 掖 */ return "yik";
        case 230: /* 掘 */ return "gwat";
        case 231: /* 掙 */ return "jaang";
        case 233: /* 掛 */ return "gwa";
        case 240: /* 掠 */ return "leuk";
        case 241: /* 採 */ return "choi";
        case 242: /* 探 */ return "taam";
        case 243: /* 掣 */ return "jai";
        case 245: /* 接 */ return "jip";
        case 247: /* 控 */ return "hung";
        case 250: /* 推 */ return "tui";
        case 251: /* 掩 */ return "yim";
        case 252: /* 措 */ return "cho";
        case 254: /* 掬 */ return "sau";
        case 255: /* 掭 */ return "sau";
        case 256: /* 掮 */ return "sau";
        case 260: /* 掰 */ return "sau";
        case 263: /* 掳 */ return "lo";
        case 264: /* 掴 */ return "sau";
        case 267: /* 掷 */ return "jaak";
        case 270: /* 掸 */ return "daan";
        case 272: /* 掺 */ return "chaam";
        case 274: /* 掼 */ return "sau";
        case 276: /* 掾 */ return "sau";
        }
      case 217:
        switch (octal[2]) {
        case 200: /* 揀 */ return "gaan";
        case 204: /* 揄 */ return "sau";
        case 206: /* 揆 */ return "sau";
        case 211: /* 揉 */ return "yau";
        case 215: /* 揍 */ return "jau";
        case 216: /* 揎 */ return "sau";
        case 217: /* 描 */ return "miu";
        case 220: /* 提 */ return "tai";
        case 222: /* 插 */ return "chaap";
        case 226: /* 揖 */ return "yap";
        case 232: /* 揚 */ return "yeung";
        case 233: /* 換 */ return "woon";
        case 236: /* 揞 */ return "sau";
        case 240: /* 揠 */ return "sau";
        case 241: /* 握 */ return "ak";
        case 243: /* 揣 */ return "chuen";
        case 251: /* 揩 */ return "haai";
        case 252: /* 揪 */ return "jau";
        case 255: /* 揭 */ return "kit";
        case 256: /* 揮 */ return "fai";
        case 262: /* 揲 */ return "sau";
        case 264: /* 援 */ return "woon";
        case 266: /* 揶 */ return "sau";
        case 270: /* 揸 */ return "ja";
        case 275: /* 揽 */ return "laam";
        case 277: /* 揿 */ return "sau";
        }
      case 220:
        switch (octal[2]) {
        case 200: /* 搀 */ return "chaam";
        case 201: /* 搁 */ return "gok";
        case 202: /* 搂 */ return "lau";
        case 205: /* 搅 */ return "gaau";
        case 214: /* 搌 */ return "sau";
        case 215: /* 損 */ return "suen";
        case 217: /* 搏 */ return "bok";
        case 220: /* 搐 */ return "chuk";
        case 223: /* 搓 */ return "choh";
        case 224: /* 搔 */ return "so";
        case 226: /* 搖 */ return "yiu";
        case 227: /* 搗 */ return "do";
        case 233: /* 搛 */ return "sau";
        case 234: /* 搜 */ return "sau";
        case 236: /* 搞 */ return "gaau";
        case 240: /* 搠 */ return "sau";
        case 241: /* 搡 */ return "sau";
        case 246: /* 搦 */ return "sau";
        case 252: /* 搪 */ return "tong";
        case 254: /* 搬 */ return "boon";
        case 255: /* 搭 */ return "daap";
        case 265: /* 搵 */ return "wan";
        case 266: /* 搶 */ return "cheung";
        case 272: /* 携 */ return "kwai";
        case 275: /* 搽 */ return "cha";
        }
      case 221:
        switch (octal[2]) {
        case 201: /* 摁 */ return "sau";
        case 204: /* 摄 */ return "sip";
        case 205: /* 摅 */ return "sau";
        case 206: /* 摆 */ return "baai";
        case 207: /* 摇 */ return "yiu";
        case 210: /* 摈 */ return "ban";
        case 212: /* 摊 */ return "taan";
        case 221: /* 摑 */ return "sau";
        case 222: /* 摒 */ return "sau";
        case 224: /* 摔 */ return "sut";
        case 230: /* 摘 */ return "jaak";
        case 234: /* 摜 */ return "sau";
        case 236: /* 摞 */ return "sau";
        case 237: /* 摟 */ return "lau";
        case 247: /* 摧 */ return "chui";
        case 251: /* 摩 */ return "moh";
        case 255: /* 摭 */ return "sau";
        case 257: /* 摯 */ return "ji";
        case 263: /* 摳 */ return "gau";
        case 266: /* 摶 */ return "sau";
        case 270: /* 摸 */ return "moh";
        case 271: /* 摹 */ return "mo";
        case 273: /* 摻 */ return "chaam";
        }
      case 222:
        switch (octal[2]) {
        case 202: /* 撂 */ return "liu";
        case 204: /* 撄 */ return "sau";
        case 205: /* 撅 */ return "kit";
        case 207: /* 撇 */ return "pit";
        case 210: /* 撈 */ return "lo";
        case 220: /* 撐 */ return "chaang";
        case 221: /* 撑 */ return "chaang";
        case 222: /* 撒 */ return "saat";
        case 223: /* 撓 */ return "naau";
        case 225: /* 撕 */ return "si";
        case 226: /* 撖 */ return "sau";
        case 231: /* 撙 */ return "sau";
        case 236: /* 撞 */ return "jong";
        case 237: /* 撟 */ return "sau";
        case 243: /* 撣 */ return "daan";
        case 244: /* 撤 */ return "chit";
        case 245: /* 撥 */ return "boot";
        case 251: /* 撩 */ return "liu";
        case 253: /* 撫 */ return "foo";
        case 254: /* 撬 */ return "kiu";
        case 255: /* 播 */ return "boh";
        case 256: /* 撮 */ return "chuet";
        case 260: /* 撰 */ return "jaan";
        case 262: /* 撲 */ return "pok";
        case 263: /* 撳 */ return "sau";
        case 265: /* 撵 */ return "lin";
        case 267: /* 撷 */ return "sau";
        case 270: /* 撸 */ return "sau";
        case 272: /* 撺 */ return "sau";
        case 273: /* 撻 */ return "daat";
        case 274: /* 撼 */ return "ham";
        case 276: /* 撾 */ return "cha";
        case 277: /* 撿 */ return "gaan";
        }
      case 223:
        switch (octal[2]) {
        case 200: /* 擀 */ return "sau";
        case 201: /* 擁 */ return "yung";
        case 202: /* 擂 */ return "lui";
        case 204: /* 擄 */ return "lo";
        case 205: /* 擅 */ return "sin";
        case 207: /* 擇 */ return "jaak";
        case 212: /* 擊 */ return "gik";
        case 213: /* 擋 */ return "dong";
        case 215: /* 操 */ return "cho";
        case 216: /* 擎 */ return "king";
        case 220: /* 擐 */ return "sau";
        case 222: /* 擒 */ return "kam";
        case 224: /* 擔 */ return "daam";
        case 227: /* 擗 */ return "sau";
        case 230: /* 擘 */ return "sau";
        case 232: /* 據 */ return "gui";
        case 236: /* 擞 */ return "so";
        case 240: /* 擠 */ return "jai";
        case 242: /* 擢 */ return "sau";
        case 244: /* 擤 */ return "sau";
        case 246: /* 擦 */ return "chaat";
        case 254: /* 擬 */ return "yi";
        case 257: /* 擯 */ return "ban";
        case 261: /* 擱 */ return "gok";
        case 262: /* 擲 */ return "jaak";
        case 264: /* 擴 */ return "kong";
        case 267: /* 擷 */ return "sau";
        case 272: /* 擺 */ return "baai";
        case 273: /* 擻 */ return "so";
        case 274: /* 擼 */ return "sau";
        case 276: /* 擾 */ return "yiu";
        }
      case 224:
        switch (octal[2]) {
        case 200: /* 攀 */ return "paan";
        case 204: /* 攄 */ return "sau";
        case 206: /* 攆 */ return "lin";
        case 211: /* 攉 */ return "sau";
        case 217: /* 攏 */ return "lung";
        case 222: /* 攒 */ return "juen";
        case 224: /* 攔 */ return "laan";
        case 226: /* 攖 */ return "sau";
        case 230: /* 攘 */ return "yeung";
        case 231: /* 攙 */ return "chaam";
        case 233: /* 攛 */ return "sau";
        case 234: /* 攜 */ return "kwai";
        case 235: /* 攝 */ return "sip";
        case 242: /* 攢 */ return "juen";
        case 243: /* 攣 */ return "luen";
        case 244: /* 攤 */ return "taan";
        case 245: /* 攥 */ return "sau";
        case 252: /* 攪 */ return "gaau";
        case 253: /* 攫 */ return "fok";
        case 254: /* 攬 */ return "laam";
        case 256: /* 攮 */ return "sau";
        case 257: /* 支 */ return "ji";
        case 266: /* 收 */ return "sau";
        case 270: /* 攸 */ return "yau";
        case 271: /* 改 */ return "goi";
        case 273: /* 攻 */ return "gung";
        case 276: /* 放 */ return "fong";
        case 277: /* 政 */ return "jing";
        }
      case 225:
        switch (octal[2]) {
        case 205: /* 故 */ return "goo";
        case 210: /* 效 */ return "haau";
        case 211: /* 敉 */ return "mei";
        case 214: /* 敌 */ return "dik";
        case 217: /* 敏 */ return "man";
        case 221: /* 救 */ return "gau";
        case 225: /* 敕 */ return "chik";
        case 226: /* 敖 */ return "ngo";
        case 227: /* 敗 */ return "baai";
        case 230: /* 敘 */ return "jui";
        case 231: /* 教 */ return "gaau";
        case 233: /* 敛 */ return "lim";
        case 235: /* 敝 */ return "bai";
        case 236: /* 敞 */ return "chong";
        case 242: /* 敢 */ return "gam";
        case 243: /* 散 */ return "saan";
        case 246: /* 敦 */ return "dun";
        case 253: /* 敫 */ return "giu";
        case 254: /* 敬 */ return "ging";
        case 260: /* 数 */ return "so";
        case 262: /* 敲 */ return "haau";
        case 264: /* 整 */ return "jing";
        case 265: /* 敵 */ return "dik";
        case 267: /* 敷 */ return "foo";
        case 270: /* 數 */ return "so";
        }
      case 226:
        switch (octal[2]) {
        case 202: /* 斂 */ return "lim";
        case 203: /* 斃 */ return "bai";
        case 207: /* 文 */ return "man";
        case 213: /* 斋 */ return "jaai";
        case 214: /* 斌 */ return "ban";
        case 220: /* 斐 */ return "fei";
        case 221: /* 斑 */ return "baan";
        case 227: /* 斗 */ return "dau";
        case 231: /* 料 */ return "liu";
        case 233: /* 斛 */ return "gok";
        case 234: /* 斜 */ return "che";
        case 237: /* 斟 */ return "jam";
        case 241: /* 斡 */ return "goon";
        case 244: /* 斤 */ return "gan";
        case 245: /* 斥 */ return "chik";
        case 247: /* 斧 */ return "foo";
        case 251: /* 斩 */ return "jaam";
        case 253: /* 斫 */ return "sek";
        case 254: /* 斬 */ return "jaam";
        case 255: /* 断 */ return "duen";
        case 257: /* 斯 */ return "si";
        case 260: /* 新 */ return "san";
        case 267: /* 斷 */ return "duen";
        case 271: /* 方 */ return "fong";
        case 274: /* 於 */ return "yue";
        case 275: /* 施 */ return "si";
        }
      case 227:
        switch (octal[2]) {
        case 201: /* 旁 */ return "pong";
        case 203: /* 旃 */ return "fong";
        case 204: /* 旄 */ return "fong";
        case 205: /* 旅 */ return "lui";
        case 206: /* 旆 */ return "fong";
        case 213: /* 旋 */ return "suen";
        case 214: /* 旌 */ return "fong";
        case 216: /* 旎 */ return "nei";
        case 217: /* 族 */ return "juk";
        case 222: /* 旒 */ return "fong";
        case 226: /* 旖 */ return "yi";
        case 227: /* 旗 */ return "kei";
        case 240: /* 无 */ return "mo";
        case 242: /* 既 */ return "gei";
        case 245: /* 日 */ return "yat";
        case 246: /* 旦 */ return "daan";
        case 247: /* 旧 */ return "gau";
        case 250: /* 旨 */ return "ji";
        case 251: /* 早 */ return "jo";
        case 254: /* 旬 */ return "chun";
        case 255: /* 旭 */ return "yuk";
        case 256: /* 旮 */ return "yat";
        case 257: /* 旯 */ return "yat";
        case 260: /* 旰 */ return "yat";
        case 261: /* 旱 */ return "hon";
        case 266: /* 时 */ return "si";
        case 267: /* 旷 */ return "kong/kwong";
        case 272: /* 旺 */ return "wong";
        }
      case 230:
        switch (octal[2]) {
        case 200: /* 昀 */ return "yat";
        case 202: /* 昂 */ return "ngong";
        case 203: /* 昃 */ return "yat";
        case 206: /* 昆 */ return "kwan";
        case 212: /* 昊 */ return "ho";
        case 214: /* 昌 */ return "cheung";
        case 216: /* 明 */ return "ming";
        case 217: /* 昏 */ return "fan";
        case 223: /* 易 */ return "yi/yik";
        case 224: /* 昔 */ return "sik";
        case 225: /* 昕 */ return "yat";
        case 231: /* 昙 */ return "yat";
        case 235: /* 昝 */ return "yat";
        case 237: /* 星 */ return "sing";
        case 240: /* 映 */ return "ying";
        case 245: /* 春 */ return "chun";
        case 247: /* 昧 */ return "mooi";
        case 250: /* 昨 */ return "jok";
        case 255: /* 昭 */ return "chiu";
        case 257: /* 是 */ return "si";
        case 261: /* 昱 */ return "yuk";
        case 264: /* 昴 */ return "maau";
        case 265: /* 昵 */ return "yat";
        case 266: /* 昶 */ return "yat";
        case 274: /* 昼 */ return "jau";
        case 276: /* 显 */ return "hin";
        }
      case 231:
        switch (octal[2]) {
        case 201: /* 晁 */ return "yat";
        case 202: /* 時 */ return "si";
        case 203: /* 晃 */ return "fong";
        case 211: /* 晉 */ return "jun";
        case 213: /* 晋 */ return "jun";
        case 214: /* 晌 */ return "heung";
        case 217: /* 晏 */ return "aan";
        case 222: /* 晒 */ return "saai";
        case 223: /* 晓 */ return "hiu";
        case 224: /* 晔 */ return "yat";
        case 225: /* 晕 */ return "wan";
        case 226: /* 晖 */ return "fai";
        case 227: /* 晗 */ return "yat";
        case 232: /* 晚 */ return "maan";
        case 235: /* 晝 */ return "jau";
        case 237: /* 晟 */ return "yat";
        case 241: /* 晡 */ return "yat";
        case 244: /* 晤 */ return "ng";
        case 246: /* 晦 */ return "fooi";
        case 250: /* 晨 */ return "san";
        case 256: /* 普 */ return "po";
        case 257: /* 景 */ return "ging";
        case 260: /* 晰 */ return "sik";
        case 264: /* 晴 */ return "ching";
        case 266: /* 晶 */ return "jing";
        case 267: /* 晷 */ return "yat";
        case 272: /* 智 */ return "ji";
        case 276: /* 晾 */ return "long";
        }
      case 232:
        switch (octal[2]) {
        case 202: /* 暂 */ return "jaam";
        case 204: /* 暄 */ return "yat";
        case 207: /* 暇 */ return "ha";
        case 210: /* 暈 */ return "wan";
        case 211: /* 暉 */ return "fai";
        case 214: /* 暌 */ return "yat";
        case 220: /* 暐 */ return "mei";
        case 221: /* 暑 */ return "sue";
        case 226: /* 暖 */ return "nuen";
        case 227: /* 暗 */ return "am";
        case 235: /* 暝 */ return "yat";
        case 242: /* 暢 */ return "cheung";
        case 253: /* 暫 */ return "jaam";
        case 256: /* 暮 */ return "mo";
        case 261: /* 暱 */ return "yat";
        case 264: /* 暴 */ return "bo";
        case 271: /* 暹 */ return "chim";
        case 276: /* 暾 */ return "yat";
        }
      case 233:
        switch (octal[2]) {
        case 204: /* 曄 */ return "yat";
        case 207: /* 曇 */ return "yat";
        case 211: /* 曉 */ return "hiu";
        case 231: /* 曙 */ return "chue";
        case 233: /* 曛 */ return "yat";
        case 234: /* 曜 */ return "yiu";
        case 235: /* 曝 */ return "bo";
        case 240: /* 曠 */ return "kong/kwong";
        case 246: /* 曦 */ return "hei";
        case 251: /* 曩 */ return "yat";
        case 254: /* 曬 */ return "saai";
        case 260: /* 曰 */ return "yeuk";
        case 262: /* 曲 */ return "kuk";
        case 263: /* 曳 */ return "yai";
        case 264: /* 更 */ return "gang";
        case 267: /* 曷 */ return "yat";
        case 270: /* 書 */ return "sue";
        case 271: /* 曹 */ return "cho";
        case 274: /* 曼 */ return "maan";
        case 276: /* 曾 */ return "chang/jang";
        case 277: /* 替 */ return "tai";
        }
      case 234:
        switch (octal[2]) {
        case 200: /* 最 */ return "jui";
        case 203: /* 會 */ return "wooi";
        case 210: /* 月 */ return "yuet";
        case 211: /* 有 */ return "yau";
        case 212: /* 朊 */ return "yuk";
        case 213: /* 朋 */ return "pang";
        case 215: /* 服 */ return "fuk";
        case 220: /* 朐 */ return "yuk";
        case 224: /* 朔 */ return "sok";
        case 225: /* 朕 */ return "yuk";
        case 227: /* 朗 */ return "long";
        case 233: /* 望 */ return "mong";
        case 235: /* 朝 */ return "chiu/jiu";
        case 237: /* 期 */ return "kei";
        case 246: /* 朦 */ return "mung";
        case 247: /* 朧 */ return "lung";
        case 250: /* 木 */ return "muk";
        case 252: /* 未 */ return "mei";
        case 253: /* 末 */ return "moot";
        case 254: /* 本 */ return "boon";
        case 255: /* 札 */ return "jaat";
        case 257: /* 术 */ return "sut";
        case 261: /* 朱 */ return "jue";
        case 264: /* 朴 */ return "pok";
        case 265: /* 朵 */ return "deuh/doh";
        case 272: /* 机 */ return "gei";
        case 275: /* 朽 */ return "nau";
        }
      case 235:
        switch (octal[2]) {
        case 200: /* 杀 */ return "saat";
        case 202: /* 杂 */ return "jaap";
        case 203: /* 权 */ return "kuen";
        case 206: /* 杆 */ return "gon";
        case 210: /* 杈 */ return "muk";
        case 211: /* 杉 */ return "chaam";
        case 214: /* 杌 */ return "muk";
        case 216: /* 李 */ return "lei";
        case 217: /* 杏 */ return "hang";
        case 220: /* 材 */ return "choi";
        case 221: /* 村 */ return "chuen";
        case 223: /* 杓 */ return "muk";
        case 226: /* 杖 */ return "jeung";
        case 234: /* 杜 */ return "do";
        case 236: /* 杞 */ return "gei";
        case 237: /* 束 */ return "chuk";
        case 240: /* 杠 */ return "gong";
        case 241: /* 条 */ return "tiu";
        case 245: /* 来 */ return "loi";
        case 250: /* 杨 */ return "yeung";
        case 251: /* 杩 */ return "muk";
        case 252: /* 杪 */ return "muk";
        case 255: /* 杭 */ return "hong";
        case 257: /* 杯 */ return "booi";
        case 260: /* 杰 */ return "git";
        case 261: /* 東 */ return "dung";
        case 262: /* 杲 */ return "yat";
        case 263: /* 杳 */ return "miu";
        case 265: /* 杵 */ return "muk";
        case 267: /* 杷 */ return "pa";
        case 274: /* 杼 */ return "muk";
        case 276: /* 松 */ return "chung/sung";
        case 277: /* 板 */ return "baan";
        }
      case 236:
        switch (octal[2]) {
        case 201: /* 极 */ return "gik";
        case 204: /* 构 */ return "kau";
        case 207: /* 枇 */ return "pei";
        case 211: /* 枉 */ return "wong";
        case 213: /* 枋 */ return "fong";
        case 220: /* 析 */ return "sik";
        case 225: /* 枕 */ return "jam";
        case 227: /* 林 */ return "lam";
        case 230: /* 枘 */ return "muk";
        case 232: /* 枚 */ return "mooi";
        case 234: /* 果 */ return "gwoh";
        case 235: /* 枝 */ return "ji";
        case 236: /* 枞 */ return "muk";
        case 242: /* 枢 */ return "sue";
        case 243: /* 枣 */ return "jo";
        case 245: /* 枥 */ return "muk";
        case 247: /* 枧 */ return "muk";
        case 250: /* 枨 */ return "muk";
        case 252: /* 枪 */ return "cheung";
        case 253: /* 枫 */ return "fung";
        case 255: /* 枭 */ return "muk";
        case 257: /* 枯 */ return "foo/jun";
        case 260: /* 枰 */ return "muk";
        case 263: /* 枳 */ return "muk";
        case 265: /* 枵 */ return "muk";
        case 266: /* 架 */ return "ga";
        case 267: /* 枷 */ return "ga";
        case 270: /* 枸 */ return "muk";
        }
      case 237:
        switch (octal[2]) {
        case 201: /* 柁 */ return "muk";
        case 203: /* 柃 */ return "muk";
        case 204: /* 柄 */ return "beng";
        case 217: /* 柏 */ return "paak";
        case 220: /* 某 */ return "mau";
        case 221: /* 柑 */ return "gam";
        case 222: /* 柒 */ return "chat";
        case 223: /* 染 */ return "yim";
        case 224: /* 柔 */ return "yau";
        case 230: /* 柘 */ return "muk";
        case 231: /* 柙 */ return "muk";
        case 232: /* 柚 */ return "muk";
        case 234: /* 柜 */ return "gwai";
        case 235: /* 柝 */ return "muk";
        case 236: /* 柞 */ return "jok";
        case 240: /* 柠 */ return "ning";
        case 242: /* 柢 */ return "muk";
        case 245: /* 查 */ return "cha";
        case 251: /* 柩 */ return "muk";
        case 254: /* 柬 */ return "gaan";
        case 257: /* 柯 */ return "oh";
        case 260: /* 柰 */ return "noi";
        case 261: /* 柱 */ return "chue";
        case 263: /* 柳 */ return "lau";
        case 264: /* 柴 */ return "chaai";
        case 265: /* 柵 */ return "saan";
        case 275: /* 柽 */ return "muk";
        case 277: /* 柿 */ return "chi";
        }
      case 240:
        switch (octal[2]) {
        case 200: /* 栀 */ return "muk";
        case 205: /* 栅 */ return "saan";
        case 207: /* 标 */ return "biu";
        case 210: /* 栈 */ return "jaan";
        case 211: /* 栉 */ return "muk";
        case 212: /* 栊 */ return "muk";
        case 213: /* 栋 */ return "dung";
        case 214: /* 栌 */ return "muk";
        case 216: /* 栎 */ return "muk";
        case 217: /* 栏 */ return "laan";
        case 221: /* 树 */ return "sue";
        case 223: /* 栓 */ return "chuen";
        case 226: /* 栖 */ return "chai";
        case 227: /* 栗 */ return "lut";
        case 235: /* 栝 */ return "muk";
        case 241: /* 校 */ return "haau";
        case 251: /* 栩 */ return "hui";
        case 252: /* 株 */ return "jue";
        case 262: /* 栲 */ return "muk";
        case 263: /* 栳 */ return "muk";
        case 267: /* 样 */ return "yeung";
        case 270: /* 核 */ return "hat";
        case 271: /* 根 */ return "gan";
        case 274: /* 格 */ return "gaak";
        case 275: /* 栽 */ return "choi";
        case 276: /* 栾 */ return "muk";
        }
      case 241:
        switch (octal[2]) {
        case 200: /* 桀 */ return "git";
        case 201: /* 桁 */ return "muk";
        case 202: /* 桂 */ return "gwai";
        case 203: /* 桃 */ return "to";
        case 204: /* 桄 */ return "muk";
        case 205: /* 桅 */ return "wai";
        case 206: /* 框 */ return "kwaang";
        case 210: /* 案 */ return "on";
        case 211: /* 桉 */ return "muk";
        case 212: /* 桊 */ return "muk";
        case 214: /* 桌 */ return "cheuk";
        case 216: /* 桎 */ return "muk";
        case 220: /* 桐 */ return "tung";
        case 221: /* 桑 */ return "song";
        case 223: /* 桓 */ return "woon";
        case 224: /* 桔 */ return "gat";
        case 225: /* 桕 */ return "muk";
        case 240: /* 桠 */ return "muk";
        case 241: /* 桡 */ return "muk";
        case 242: /* 桢 */ return "muk";
        case 243: /* 档 */ return "dong";
        case 244: /* 桤 */ return "muk";
        case 245: /* 桥 */ return "kiu";
        case 246: /* 桦 */ return "muk";
        case 247: /* 桧 */ return "muk";
        case 250: /* 桨 */ return "jeung";
        case 251: /* 桩 */ return "jong";
        case 253: /* 桫 */ return "muk";
        case 264: /* 桴 */ return "muk";
        case 266: /* 桶 */ return "tung";
        case 267: /* 桷 */ return "muk";
        case 277: /* 桿 */ return "gon";
        }
      case 242:
        switch (octal[2]) {
        case 201: /* 梁 */ return "leung";
        case 203: /* 梃 */ return "muk";
        case 205: /* 梅 */ return "mooi";
        case 206: /* 梆 */ return "bong";
        case 217: /* 梏 */ return "muk";
        case 223: /* 梓 */ return "muk";
        case 224: /* 梔 */ return "muk";
        case 227: /* 梗 */ return "gang";
        case 235: /* 條 */ return "tiu";
        case 237: /* 梟 */ return "muk";
        case 242: /* 梢 */ return "saau";
        case 246: /* 梦 */ return "mung";
        case 247: /* 梧 */ return "ng";
        case 250: /* 梨 */ return "lei";
        case 255: /* 梭 */ return "soh";
        case 257: /* 梯 */ return "tai";
        case 260: /* 械 */ return "haai";
        case 263: /* 梳 */ return "soh";
        case 265: /* 梵 */ return "faan";
        }
      case 243:
        switch (octal[2]) {
        case 200: /* 检 */ return "gim";
        case 202: /* 棂 */ return "muk";
        case 204: /* 棄 */ return "hei";
        case 211: /* 棉 */ return "min";
        case 213: /* 棋 */ return "kei";
        case 215: /* 棍 */ return "gwan";
        case 222: /* 棒 */ return "paang";
        case 225: /* 棕 */ return "jung";
        case 226: /* 棖 */ return "muk";
        case 227: /* 棗 */ return "jo";
        case 230: /* 棘 */ return "gik";
        case 232: /* 棚 */ return "paang";
        case 237: /* 棟 */ return "dung";
        case 240: /* 棠 */ return "tong";
        case 243: /* 棣 */ return "muk";
        case 247: /* 棧 */ return "jaan";
        case 256: /* 森 */ return "sam";
        case 260: /* 棰 */ return "muk";
        case 261: /* 棱 */ return "ling";
        case 262: /* 棲 */ return "chai";
        case 265: /* 棵 */ return "gwoh";
        case 271: /* 棹 */ return "muk";
        case 272: /* 棺 */ return "goon";
        case 274: /* 棼 */ return "muk";
        }
      case 244:
        switch (octal[2]) {
        case 201: /* 椁 */ return "muk";
        case 205: /* 椅 */ return "yi";
        case 213: /* 椋 */ return "muk";
        case 215: /* 植 */ return "jik";
        case 216: /* 椎 */ return "jui";
        case 217: /* 椏 */ return "muk";
        case 220: /* 椐 */ return "muk";
        case 222: /* 椒 */ return "jiu";
        case 237: /* 椟 */ return "muk";
        case 240: /* 椠 */ return "muk";
        case 255: /* 椭 */ return "toh";
        case 260: /* 椰 */ return "ye";
        case 264: /* 椴 */ return "muk";
        case 275: /* 椽 */ return "yuen";
        case 277: /* 椿 */ return "chun";
        }
      case 245:
        switch (octal[2]) {
        case 202: /* 楂 */ return "muk";
        case 212: /* 楊 */ return "yeung";
        case 223: /* 楓 */ return "fung";
        case 224: /* 楔 */ return "sit";
        case 227: /* 楗 */ return "muk";
        case 232: /* 楚 */ return "choh";
        case 235: /* 楝 */ return "muk";
        case 236: /* 楞 */ return "ling";
        case 240: /* 楠 */ return "muk";
        case 250: /* 楨 */ return "muk";
        case 253: /* 楫 */ return "muk";
        case 255: /* 業 */ return "yip";
        case 256: /* 楮 */ return "muk";
        case 261: /* 楱 */ return "muk";
        case 265: /* 極 */ return "gik";
        case 267: /* 楷 */ return "kaai";
        case 270: /* 楸 */ return "muk";
        case 274: /* 楼 */ return "lau";
        }
      case 246:
        switch (octal[2]) {
        case 200: /* 榀 */ return "muk";
        case 202: /* 概 */ return "koi";
        case 204: /* 榄 */ return "muk";
        case 206: /* 榆 */ return "yue";
        case 207: /* 榇 */ return "muk";
        case 210: /* 榈 */ return "muk";
        case 211: /* 榉 */ return "muk";
        case 220: /* 榐 */ return "sau";
        case 224: /* 榔 */ return "long";
        case 225: /* 榕 */ return "yung";
        case 230: /* 榘 */ return "muk";
        case 234: /* 榜 */ return "bong";
        case 250: /* 榨 */ return "ja";
        case 252: /* 榪 */ return "muk";
        case 255: /* 榭 */ return "je";
        case 256: /* 榮 */ return "wing";
        case 264: /* 榴 */ return "lau";
        case 267: /* 榷 */ return "kok";
        case 277: /* 榿 */ return "muk";
        }
      case 247:
        switch (octal[2]) {
        case 213: /* 構 */ return "kau";
        case 214: /* 槌 */ return "muk";
        case 215: /* 槍 */ return "cheung";
        case 216: /* 槎 */ return "muk";
        case 220: /* 槐 */ return "wai";
        case 223: /* 槓 */ return "gong";
        case 233: /* 槛 */ return "laam";
        case 247: /* 槧 */ return "muk";
        case 250: /* 槨 */ return "muk";
        case 263: /* 槳 */ return "jeung";
        case 275: /* 槽 */ return "cho";
        }
      case 250:
        switch (octal[2]) {
        case 201: /* 樁 */ return "jong";
        case 202: /* 樂 */ return "lok/ngok";
        case 205: /* 樅 */ return "muk";
        case 212: /* 樊 */ return "faan";
        case 221: /* 樑 */ return "leung";
        case 223: /* 樓 */ return "lau";
        case 231: /* 標 */ return "biu";
        case 236: /* 樞 */ return "sue";
        case 237: /* 樟 */ return "jeung";
        case 241: /* 模 */ return "mo";
        case 243: /* 樣 */ return "yeung";
        case 252: /* 横 */ return "waang";
        case 261: /* 樱 */ return "ying";
        case 271: /* 樹 */ return "sue";
        case 272: /* 樺 */ return "muk";
        case 275: /* 樽 */ return "jun";
        }
      case 251:
        switch (octal[2]) {
        case 207: /* 橇 */ return "hiu";
        case 210: /* 橈 */ return "muk";
        case 213: /* 橋 */ return "kiu";
        case 231: /* 橙 */ return "chaang";
        case 237: /* 機 */ return "gei";
        case 241: /* 橡 */ return "jeung";
        case 242: /* 橢 */ return "toh";
        case 253: /* 橫 */ return "waang";
        case 261: /* 橱 */ return "chue";
        case 271: /* 橹 */ return "lo";
        }
      case 252:
        switch (octal[2]) {
        case 200: /* 檀 */ return "taan";
        case 201: /* 檁 */ return "muk";
        case 204: /* 檄 */ return "kiu";
        case 211: /* 檉 */ return "muk";
        case 224: /* 檔 */ return "dong";
        case 234: /* 檜 */ return "muk";
        case 242: /* 檢 */ return "gim";
        case 251: /* 檩 */ return "muk";
        case 254: /* 檬 */ return "mung";
        case 267: /* 檷 */ return "nei";
        case 270: /* 檸 */ return "ning";
        case 273: /* 檻 */ return "laam";
        }
      case 253:
        switch (octal[2]) {
        case 203: /* 櫃 */ return "gwai";
        case 223: /* 櫓 */ return "lo";
        case 232: /* 櫚 */ return "muk";
        case 233: /* 櫛 */ return "muk";
        case 235: /* 櫝 */ return "muk";
        case 237: /* 櫟 */ return "muk";
        case 245: /* 櫥 */ return "chue";
        case 250: /* 櫨 */ return "muk";
        case 252: /* 櫪 */ return "muk";
        case 254: /* 櫬 */ return "muk";
        case 263: /* 櫳 */ return "muk";
        case 270: /* 櫸 */ return "muk";
        case 272: /* 櫺 */ return "muk";
        case 273: /* 櫻 */ return "ying";
        }
      case 254:
        switch (octal[2]) {
        case 204: /* 欄 */ return "laan";
        case 212: /* 權 */ return "kuen";
        case 222: /* 欒 */ return "muk";
        case 226: /* 欖 */ return "muk";
        case 240: /* 欠 */ return "him";
        case 241: /* 次 */ return "chi";
        case 242: /* 欢 */ return "foon";
        case 243: /* 欣 */ return "yan";
        case 244: /* 欤 */ return "him";
        case 247: /* 欧 */ return "au";
        case 262: /* 欲 */ return "yuk";
        case 267: /* 欷 */ return "him";
        case 271: /* 欹 */ return "him";
        case 272: /* 欺 */ return "hei";
        case 275: /* 欽 */ return "yam";
        case 276: /* 款 */ return "foon";
        }
      case 255:
        switch (octal[2]) {
        case 203: /* 歃 */ return "him";
        case 206: /* 歆 */ return "yam";
        case 207: /* 歇 */ return "hit";
        case 211: /* 歉 */ return "hip";
        case 214: /* 歌 */ return "goh";
        case 220: /* 歐 */ return "au";
        case 231: /* 歙 */ return "him";
        case 237: /* 歟 */ return "him";
        case 241: /* 歡 */ return "foon";
        case 242: /* 止 */ return "ji";
        case 243: /* 正 */ return "jing";
        case 244: /* 此 */ return "chi";
        case 245: /* 步 */ return "bo";
        case 246: /* 武 */ return "mo";
        case 252: /* 歪 */ return "waai";
        case 262: /* 歲 */ return "sui";
        case 267: /* 歷 */ return "lik";
        case 270: /* 歸 */ return "gwai";
        case 271: /* 歹 */ return "daai";
        case 273: /* 死 */ return "sei";
        case 274: /* 歼 */ return "chin";
        case 277: /* 歿 */ return "moot";
        }
      case 256:
        switch (octal[2]) {
        case 201: /* 殁 */ return "moot";
        case 202: /* 殂 */ return "cho";
        case 203: /* 殃 */ return "yeung";
        case 204: /* 殄 */ return "tim";
        case 206: /* 殆 */ return "toi";
        case 207: /* 殇 */ return "seung";
        case 211: /* 殉 */ return "sun";
        case 212: /* 殊 */ return "sue";
        case 213: /* 残 */ return "chaan";
        case 215: /* 殍 */ return "piu";
        case 222: /* 殒 */ return "wan";
        case 223: /* 殓 */ return "lim";
        case 226: /* 殖 */ return "jik";
        case 230: /* 殘 */ return "chaan";
        case 232: /* 殚 */ return "sim";
        case 233: /* 殛 */ return "gik";
        case 236: /* 殞 */ return "wan";
        case 241: /* 殡 */ return "ban";
        case 244: /* 殤 */ return "seung";
        case 252: /* 殪 */ return "yi";
        case 253: /* 殫 */ return "sim";
        case 256: /* 殮 */ return "lim";
        case 257: /* 殯 */ return "ban";
        case 262: /* 殲 */ return "chin";
        case 264: /* 殴 */ return "au";
        case 265: /* 段 */ return "duen";
        case 267: /* 殷 */ return "yan";
        case 272: /* 殺 */ return "saat";
        case 274: /* 殼 */ return "hok";
        case 277: /* 殿 */ return "din";
        }
      case 257:
        switch (octal[2]) {
        case 200: /* 毀 */ return "wai";
        case 201: /* 毁 */ return "wai";
        case 205: /* 毅 */ return "ngai";
        case 206: /* 毆 */ return "au";
        case 213: /* 毋 */ return "mo";
        case 215: /* 母 */ return "mo";
        case 217: /* 每 */ return "mooi";
        case 222: /* 毒 */ return "duk";
        case 223: /* 毓 */ return "yuk";
        case 224: /* 比 */ return "bei";
        case 225: /* 毕 */ return "bat";
        case 226: /* 毖 */ return "bei";
        case 227: /* 毗 */ return "bei";
        case 231: /* 毙 */ return "bai";
        case 233: /* 毛 */ return "mo";
        case 241: /* 毡 */ return "jin";
        case 252: /* 毪 */ return "mo";
        case 253: /* 毫 */ return "ho";
        case 257: /* 毯 */ return "jin";
        case 263: /* 毳 */ return "mo";
        case 265: /* 毵 */ return "mo";
        case 271: /* 毹 */ return "mo";
        case 275: /* 毽 */ return "mo";
        case 277: /* 毿 */ return "mo";
        }
      case 260:
        switch (octal[2]) {
        case 205: /* 氅 */ return "mo";
        case 206: /* 氆 */ return "mo";
        case 207: /* 氇 */ return "mo";
        case 210: /* 氈 */ return "jin";
        case 214: /* 氌 */ return "mo";
        case 215: /* 氍 */ return "mo";
        case 217: /* 氏 */ return "si";
        case 220: /* 氐 */ return "dai";
        case 221: /* 民 */ return "man";
        case 223: /* 氓 */ return "man";
        case 224: /* 气 */ return "hei";
        case 225: /* 氕 */ return "pit";
        case 226: /* 氖 */ return "naai";
        case 230: /* 氘 */ return "do";
        case 231: /* 氙 */ return "sin";
        case 232: /* 氚 */ return "chuen";
        case 233: /* 氛 */ return "fan";
        case 237: /* 氟 */ return "fat";
        case 241: /* 氡 */ return "dung";
        case 242: /* 氢 */ return "hing";
        case 243: /* 氣 */ return "hei";
        case 244: /* 氤 */ return "yan";
        case 246: /* 氦 */ return "hoi";
        case 247: /* 氧 */ return "yeung";
        case 250: /* 氨 */ return "on";
        case 251: /* 氩 */ return "a";
        case 252: /* 氪 */ return "hak";
        case 253: /* 氫 */ return "hing";
        case 254: /* 氬 */ return "a";
        case 256: /* 氮 */ return "daam";
        case 257: /* 氯 */ return "luk";
        case 260: /* 氰 */ return "ching";
        case 262: /* 氲 */ return "wan";
        case 263: /* 氳 */ return "wan";
        case 264: /* 水 */ return "sui";
        case 270: /* 永 */ return "wing";
        case 275: /* 氽 */ return "tan";
        }
      case 261:
        switch (octal[2]) {
        case 201: /* 汁 */ return "jap";
        case 202: /* 求 */ return "kau";
        case 206: /* 汆 */ return "chuen/tan";
        case 207: /* 汇 */ return "wooi";
        case 211: /* 汉 */ return "hon";
        case 220: /* 汐 */ return "jik";
        case 225: /* 汕 */ return "saan";
        case 227: /* 汗 */ return "hon";
        case 233: /* 汛 */ return "sun";
        case 235: /* 汝 */ return "yue";
        case 236: /* 汞 */ return "hung";
        case 237: /* 江 */ return "gong";
        case 240: /* 池 */ return "chi";
        case 241: /* 污 */ return "woo";
        case 244: /* 汤 */ return "tong";
        case 251: /* 汩 */ return "mik";
        case 252: /* 汪 */ return "wong";
        case 260: /* 汰 */ return "taai";
        case 262: /* 汲 */ return "kap";
        case 264: /* 汴 */ return "bin";
        case 271: /* 汹 */ return "hung";
        case 272: /* 決 */ return "kuet";
        case 275: /* 汽 */ return "hei";
        case 276: /* 汾 */ return "fan";
        }
      case 262:
        switch (octal[2]) {
        case 201: /* 沁 */ return "cham";
        case 202: /* 沂 */ return "yi";
        case 203: /* 沃 */ return "yuk";
        case 210: /* 沈 */ return "sam";
        case 211: /* 沉 */ return "cham";
        case 217: /* 沏 */ return "chit";
        case 220: /* 沐 */ return "muk";
        case 222: /* 沒 */ return "moot";
        case 223: /* 沓 */ return "daap";
        case 226: /* 沖 */ return "chung";
        case 231: /* 沙 */ return "sa";
        case 233: /* 沛 */ return "pooi";
        case 237: /* 沟 */ return "kau";
        case 241: /* 没 */ return "moot";
        case 244: /* 沤 */ return "au";
        case 245: /* 沥 */ return "lik";
        case 246: /* 沦 */ return "lun";
        case 247: /* 沧 */ return "chong";
        case 252: /* 沪 */ return "woo";
        case 253: /* 沫 */ return "moot";
        case 256: /* 沮 */ return "jui";
        case 261: /* 沱 */ return "toh";
        case 263: /* 河 */ return "hoh";
        case 270: /* 沸 */ return "fai";
        case 271: /* 油 */ return "yau";
        case 273: /* 治 */ return "ji";
        case 274: /* 沼 */ return "jiu";
        case 275: /* 沽 */ return "goo";
        case 276: /* 沾 */ return "jim";
        case 277: /* 沿 */ return "yuen";
        }
      case 263:
        switch (octal[2]) {
        case 201: /* 況 */ return "fong";
        case 204: /* 泄 */ return "sit";
        case 205: /* 泅 */ return "chau/chau$";
        case 211: /* 泉 */ return "chuen";
        case 212: /* 泊 */ return "bok";
        case 214: /* 泌 */ return "bei";
        case 225: /* 法 */ return "faat";
        case 233: /* 泛 */ return "faan";
        case 236: /* 泞 */ return "ning";
        case 241: /* 泡 */ return "ning/paau";
        case 242: /* 波 */ return "boh";
        case 243: /* 泣 */ return "yap";
        case 245: /* 泥 */ return "nai";
        case 250: /* 注 */ return "jue";
        case 252: /* 泪 */ return "lui";
        case 257: /* 泯 */ return "man";
        case 260: /* 泰 */ return "taai";
        case 263: /* 泳 */ return "wing";
        case 265: /* 泵 */ return "bam";
        case 273: /* 泻 */ return "se";
        case 274: /* 泼 */ return "poot";
        case 275: /* 泽 */ return "jaak";
        }
      case 264:
        switch (octal[2]) {
        case 201: /* 洁 */ return "git";
        case 213: /* 洋 */ return "yeung";
        case 222: /* 洒 */ return "sa";
        case 227: /* 洗 */ return "sai";
        case 233: /* 洛 */ return "lok";
        case 236: /* 洞 */ return "dung";
        case 245: /* 津 */ return "jun";
        case 252: /* 洪 */ return "hung";
        case 261: /* 洱 */ return "nei";
        case 262: /* 洲 */ return "jau";
        case 266: /* 洶 */ return "hung";
        case 273: /* 活 */ return "woot";
        case 274: /* 洼 */ return "ding/wa";
        case 275: /* 洽 */ return "hap";
        case 276: /* 派 */ return "paai";
        }
      }
    case 357:
      switch (octal[1]) {
      case 277:
        switch (octal[2]) {
        case 275: /* ��� */ return "kei";
        }
      }
    }
    return null;
  }

}
