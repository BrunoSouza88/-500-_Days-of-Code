public class Exercise {
  public static int[] findFirstAndLast(int[] arr, int target) {
      int[] result = {-1, -1};
      for (int i = 0; i < arr.length; i++) {
          if (arr[i] == target) {
              result[0] = i;
              break;
          }
      }
      for (int i = arr.length - 1; i >= 0; i--) {
          if (arr[i] == target) {
              result[1] = i;
              break;
          }
      }
      
      return result;
  }
}
