function generateMultiplicationTable(num: number): void {
  for (let index = 1; index <= 10; index++) {
      const result = num * index;
      console.log(`${num} x ${index} = ${result}`);
  }
}
