package org.cghio.cantonese.romanization;

public class Hanzi2Pinyin {

  /**
   * Returns Cantonese Pinyin of a Chinese character.
   * @param character the Chinese character to convert
   */
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
    if (pinyin == null) pinyin = Hanzi2PinyinData2.fromChar(decimal);
    return pinyin;
  }

}
