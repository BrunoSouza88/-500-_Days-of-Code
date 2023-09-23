package Java.Day15;

public class Exercise {
  public static int countCapitalLetters(String str) {
      int count = 0;

      for (int i = 0; i < str.length(); i++) {
          char c = str.charAt(i);

          if (Character.isUpperCase(c)) {
              count += 1;
          }
      }

      return count;
  }
}