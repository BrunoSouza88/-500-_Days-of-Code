package Java.Day59;

public class Exercise {
    
  public static double calculateSimpleInterest(double principal, double rate, double time) {
      if (principal < 0 || rate < 0 || time < 0) {
          throw new IllegalArgumentException("Inputs must be non-negative");
      }

      double simpleInterest = (principal * rate * time) / 100.0;

      return simpleInterest;
  }
}
