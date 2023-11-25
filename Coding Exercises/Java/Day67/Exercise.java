package Java.Day67;

public class Exercise {

  public static String joinStrings(String str1, String str2) {
      if (str1 == null || str2 == null) {
          throw new IllegalArgumentException("Input strings cannot be null");
      }

      String result = str1 + str2;

      return result;
  }
}
