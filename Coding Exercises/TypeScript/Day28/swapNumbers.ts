function swapNumbers(a: number, b: number): number[] {
  a = a + b;
  b = a - b;
  a = a - b;
  const result: number[] = [a, b];
  return result;
}

const x: number = 5;
const y: number = 10;

const swapped: number[] = swapNumbers(x, y);

console.log(`Valores trocados: x = ${swapped[0]}, y = ${swapped[1]}`);
