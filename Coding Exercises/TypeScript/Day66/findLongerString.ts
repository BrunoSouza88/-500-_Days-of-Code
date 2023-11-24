function findLongerString(str1: string, str2: string): string {
  if (str1 === null || str2 === null) {
      throw new Error("Input strings cannot be null");
  }

  const length1: number = str1.length;
  const length2: number = str2.length;

  if (length1 > length2) {
      return str1;
  } else if (length2 > length1) {
      return str2;
  } else {
      return "Both strings are of equal length";
  }
}
