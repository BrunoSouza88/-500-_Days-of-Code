public class Exercise {
  public static int countNumberOfDigits(int num) {

      if (num == 0) {
          return 1;
      }

      int count = 0;

      if (num < 0) {
          num = -num;
      }
      
      while (num > 0) {
          num = num / 10;
          count++;
      }

      return count;
  }
}
