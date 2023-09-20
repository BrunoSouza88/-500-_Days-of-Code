package Java.Day14;

public class Exercise {
  public static int[] separateEvenOdd(int[] arr) {
      if (arr == null || arr.length <= 1) {
          return arr;
      }
      
      int left = 0;
      int right = arr.length - 1;
      
      while (left < right) {
          while (arr[left] % 2 == 0 && left < right) {
              left++;
          }
        
          while (arr[right] % 2 != 0 && left < right) {
              right--;
          }
      
          int temp = arr[left];
          arr[left] = arr[right];
          arr[right] = temp;

          left++;
          right--;
      }
      
      return arr;
  }
}