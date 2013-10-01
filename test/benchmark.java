import org.cghio.cantonese.romanization.Hanzi2Pinyin;
import org.cghio.cantonese.romanization.Pinyin2Hanzi;

public class benchmark {

  private static int max = 7;
  private static int[] colwidths = { max + 3, 7, 7, 8 };
  private static String[] colnames = { "Times", "H->P", "P->H", "H<->P" };

  public static void main(String[] args) {
    // warm up
    run1(1);
    run2(1);
    run3(1);

    System.out.println(print(colnames));
    for (int i = 0; i < max; i++) {
      int times = (int) Math.pow(10, i);
      long[] time1 = run1(times);
      long[] time2 = run2(times);
      long[] time3 = run3(times);
      System.out.println(print(new String[]{
        times + "",
        time1[1] - time1[0] + "",
        time2[1] - time2[0] + "",
        time3[1] - time3[0] + ""
      }));
    }
  }

  private static long[] run1(int times) {
    long startTime = System.currentTimeMillis();
    for (int i = 0; i < times; i++) {
      try {
        Hanzi2Pinyin.fromChar("龠");
      } catch (Exception e) {
        e.printStackTrace();
      }
    }
    long stopTime = System.currentTimeMillis();
    return new long[] { startTime, stopTime };
  }

  private static long[] run2(int times) {
    long startTime = System.currentTimeMillis();
    for (int i = 0; i < times; i++) {
      try {
        Pinyin2Hanzi.fromPinyin("yung");
      } catch (Exception e) {
        e.printStackTrace();
      }
    }
    long stopTime = System.currentTimeMillis();
    return new long[] { startTime, stopTime };
  }

  private static long[] run3(int times) {
    long startTime = System.currentTimeMillis();
    for (int i = 0; i < times; i++) {
      try {
        Hanzi2Pinyin.fromChar("龠");
        Pinyin2Hanzi.fromPinyin("yung");
      } catch (Exception e) {
        e.printStackTrace();
      }
    }
    long stopTime = System.currentTimeMillis();
    return new long[] { startTime, stopTime };
  }

  private static String print(String[] names) {
    String output = "";
    for (int i = 0; i < colwidths.length; i++) {
      output += String.format("%-" + colwidths[i] + "s", names[i]);
    }
    return output;
  }

}
