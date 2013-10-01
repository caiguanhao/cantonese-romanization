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
    String[] string_array = code.split("(?<=\\G.{6})");
    if (string_array.length > 2) return null;
    int[] int_array = new int[string_array.length];
    for (int i = 0; i < int_array.length; i++) {
      int_array[i] = Integer.parseInt(string_array[i]);
    }

    int[] hanzi = Pinyin2HanziData1.fromPinyin(int_array);
    if (hanzi == null) hanzi = Pinyin2HanziData2.fromPinyin(int_array);
    return hanzi;
  }

}
