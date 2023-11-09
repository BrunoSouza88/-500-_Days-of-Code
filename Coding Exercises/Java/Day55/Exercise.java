package Java.Day55;

public class Exercise {
    
  public static boolean isAbundant(int num) {
      if (num <= 0) {
          throw new IllegalArgumentException("Input number must be a positive integer");
      }

      int sumOfDivisors = 1;

      for (int i = 2; i * i <= num; i++) {
          if (num % i == 0) {
              sumOfDivisors += i;
              if (i != num / i) {
                  sumOfDivisors += num / i;
              }
          }
      }

      return sumOfDivisors > num;
  }

  public static void main(String[] args) {
      System.out.println(isAbundant(12));
      System.out.println(isAbundant(15));
      System.out.println(isAbundant(18));
      System.out.println(isAbundant(28));
  }
}
