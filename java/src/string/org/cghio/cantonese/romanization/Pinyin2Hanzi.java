package org.cghio.cantonese.romanization;

public class Pinyin2Hanzi {

  /**
   * Returns a array of char code of Chinese characters to a Cantonese Pinyin.
   * @param the string of a Cantonese Pinyin
   */
  public static int[] fromPinyin(String pinyin) {
    if (pinyin == null || pinyin.isEmpty()) return null;

    int[] hanzi = Pinyin2HanziData1.fromPinyin(pinyin);
    if (hanzi == null) hanzi = Pinyin2HanziData2.fromPinyin(pinyin);
    return hanzi;
  }

}
