function convertFahrenheitToCelsius(fahrenheit: number): number {
  const FAHRENHEIT_TO_CELSIUS: number = 5.0 / 9.0;
  const celsius: number = (fahrenheit - 32) * FAHRENHEIT_TO_CELSIUS;
  return celsius;
}
