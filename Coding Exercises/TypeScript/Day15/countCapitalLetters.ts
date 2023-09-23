function countCapitalLetters(str: string): number {
  let count: number = 0;

  for (let i = 0; i < str.length; i++) {
      const c: string = str.charAt(i);

      if (c === c.toUpperCase()) {
          count += 1;
      }
  }

  return count;
}
