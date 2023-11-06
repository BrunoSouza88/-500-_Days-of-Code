public class Exercise {
    
  public static int findThirdAngle(int angle1, int angle2) {
      if (angle1 <= 0 || angle2 <= 0 || angle1 + angle2 >= 180) {
          throw new IllegalArgumentException("Invalid input: These angles do not form a valid triangle.");
      }
      
      int totalAngle = 180;
      int thirdAngle = totalAngle - angle1 - angle2;
      
      return thirdAngle;
  }
}
