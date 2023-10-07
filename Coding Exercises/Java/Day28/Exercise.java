package Java.Day28;

public class Exercise {
  public static int[] swapNumbers(int a, int b) {
      a = a + b;

      b = a - b;

      a = a - b;

      int[] result = {a, b};

      return result;
  }
}
