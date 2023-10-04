function calculateBMI(weight: number, height: number): number {
  if (weight <= 0 || height <= 0) {
      throw new Error("height and weight should be greater than 0");
  }
  
  const bmiCalculated: number = weight / (height * height);
  
  return bmiCalculated;
}
