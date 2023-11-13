function areaOfCircle(radius: number): number {
  if (radius < 0) {
      throw new Error("Radius cannot be negative");
  }

  const area: number = Math.PI * radius ** 2;
  return area;
}
