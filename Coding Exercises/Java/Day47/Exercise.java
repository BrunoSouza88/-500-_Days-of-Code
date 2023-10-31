public class Exercise {
  public static int findGreatestFactor(int num){
      int greatestFactor = 1;
      
      for (int i = 2; i < num; i++) {
          if (num % i == 0) {
              greatestFactor = i;
          }
      }
      
      return greatestFactor;
  }
}
