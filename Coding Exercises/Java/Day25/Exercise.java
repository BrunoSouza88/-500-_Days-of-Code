package Java.Day25;

public class Exercise {
  public static double calculateBMI(double weight, double height){
      
      if (weight <= 0 || height <= 0) {
          throw new IllegalArgumentException("height and weight should be greater than 0");
      }
      
      double BMICalculated = weight / (height * height);
      
      return BMICalculated;
  }
}