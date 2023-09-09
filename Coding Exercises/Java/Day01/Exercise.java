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

  public static void main(String[] args) {
    int[] arr = {5, 2, 9, 1, 5, 6};
    
    int smallest = findSmallestElement(arr);

    System.out.println("Smallest element in the array: " + smallest);
}
}