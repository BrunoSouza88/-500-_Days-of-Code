public class Exercise {
  public static int[] distributeChocolates(int[] chocolates, int numChildren) {

      int numChocolates = chocolates.length;

      int chocolatesPerChild = numChocolates / numChildren;

      int[] distribution = new int[numChildren];

      int chocolatesLeft = numChocolates;
      for (int i = 0; i < numChildren; i++) {
          distribution[i] = chocolatesPerChild;
          chocolatesLeft -= chocolatesPerChild;
      }

      for (int i = 0; i < chocolatesLeft; i++) {
          distribution[i] += 1;
      }

      return distribution;
  }
}
