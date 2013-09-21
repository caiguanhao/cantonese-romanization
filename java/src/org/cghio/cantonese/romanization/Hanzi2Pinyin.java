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
    if (pinyin == null) pinyin = Hanzi2PinyinData2.fromChar(octal);
    if (pinyin == null) pinyin = Hanzi2PinyinData3.fromChar(octal);
    return pinyin;
  }

}
