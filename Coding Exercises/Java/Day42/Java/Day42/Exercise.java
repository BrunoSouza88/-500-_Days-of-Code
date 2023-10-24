package Java.Day42;

public class Exercise {
  public static String repeatSentence(String sentence) {
      String result = "";

      for (int index = 0; index < 3; index++) {
          result += sentence;
          if (index < 2) {
              result += " ";
          }
      }

      return result.trim();
  }
}
