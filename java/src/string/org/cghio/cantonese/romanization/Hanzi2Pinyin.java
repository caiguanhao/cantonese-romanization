package org.cghio.cantonese.romanization;

public class Hanzi2Pinyin {

  /**
   * Returns Cantonese Pinyin of a Chinese character.
   * @param character the Chinese character to convert
   */
  public static String fromChar(String character) {
    if (character == null || character.isEmpty()) return null;

    String pinyin = Hanzi2PinyinData1.fromChar(character);
    if (pinyin == null) pinyin = Hanzi2PinyinData2.fromChar(character);
    return pinyin;
  }

}
