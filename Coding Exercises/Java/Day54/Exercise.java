package Java.Day54;

public class Exercise {
    
  public static boolean isHarshadNumber(int n) {
      if (n <= 0) {
          return false;
      }

      int sum = 0;
      int originalN = n;
      while (n > 0) {
          int digit = n % 10;
          sum += digit;
          n /= 10;
      }

      return originalN % sum == 0;
  }
}
