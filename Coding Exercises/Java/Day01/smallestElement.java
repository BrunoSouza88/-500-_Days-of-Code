public class Exercise {
  public static int findSmallestElement(int[] arr) {
    int smallest = Integer.MAX_VALUE;

    for (int i = 0; i < arr.length; i++) {
      if (arr[i] < smallest) {
        smallest = arr[i];
      }
    }

    return smallest;
  }
}