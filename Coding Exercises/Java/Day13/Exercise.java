package Java.Day13;

public class Exercise {
  public static void separateZeroAndOne(int[] arr) {

      int countZeros = 0;

      for (int i = 0; i < arr.length; i++) {
          if (arr[i] == 0) {
              countZeros++;
          }
      }

      for (int i = 0; i < countZeros; i++) {
          arr[i] = 0;
      }

      for (int i = countZeros; i < arr.length; i++) {
          arr[i] = 1;
      }
  }
}
