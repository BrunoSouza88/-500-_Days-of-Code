class Exercise {
  private static readonly MILES_IN_A_KILOMETER: number = 0.621371;

  static kilometersToMiles(kilometers: number): number {
      return kilometers * Exercise.MILES_IN_A_KILOMETER;
  }
}
