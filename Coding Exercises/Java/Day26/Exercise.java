public class Exercise {
  private static final double FAHRENHEIT_TO_CELSIUS = 5.0 / 9.0;

  public static double convertFahrenheitToCelsius(double fahrenheit) {
      double celsius = (fahrenheit - 32) * FAHRENHEIT_TO_CELSIUS;

      return celsius;
  }
}
