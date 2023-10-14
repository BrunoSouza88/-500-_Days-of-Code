function distributeChocolates(chocolates: number[], numChildren: number): number[] {
  const numChocolates: number = chocolates.length;
  const chocolatesPerChild: number = Math.floor(numChocolates / numChildren);
  const distribution: number[] = Array(numChildren).fill(chocolatesPerChild);
  const chocolatesLeft: number = numChocolates % numChildren;
  for (let i = 0; i < chocolatesLeft; i++) {
      distribution[i]++;
  }
  return distribution;
}
