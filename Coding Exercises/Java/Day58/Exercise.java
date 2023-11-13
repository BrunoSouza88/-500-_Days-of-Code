public class Exercise {

  public static double areaOfCircle(double radius) {
      if (radius < 0) {
          throw new IllegalArgumentException("Radius cannot be negative");
      }

      double area = Math.PI * Math.pow(radius, 2);
      return area;
  }
}
