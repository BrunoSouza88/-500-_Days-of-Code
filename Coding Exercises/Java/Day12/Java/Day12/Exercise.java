package Java.Day12;

public class Exercise {
  public static int countDigitFrequency(long number, int digit) {
      int count = 0;

      while (number != 0) {
          int lastDigit = (int)(number % 10);

          if (lastDigit == digit) {
              count++;
          }

          number /= 10;
      }

      return count;
  }
}
