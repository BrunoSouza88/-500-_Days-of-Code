package Java.Day46;

public class Exercise {
  public static boolean isArmstrongNumber(int num){

      int originalNumber, remainder, result = 0, n = 0;

      originalNumber = num;

      while (originalNumber != 0) {
          originalNumber /= 10;
          n++;
      }

      originalNumber = num;

      while (originalNumber != 0) {
          remainder = originalNumber % 10;
          result += Math.pow(remainder, n);
          originalNumber /= 10;
      }

      return result == num;
  }
}
