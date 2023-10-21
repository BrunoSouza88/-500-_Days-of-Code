package Java.Day40;

public class Exercise {
  public static int iterativeSum(int n) {
      int sum = 0;
      
      for (int i = 1; i <= n; i++) {
          sum += i;
      }

      return sum;
  }

  public static int recursiveSum(int n) {
      if (n <= 1) {
          return n;
      } else {
          return n + recursiveSum(n - 1);
      }
  }

}
