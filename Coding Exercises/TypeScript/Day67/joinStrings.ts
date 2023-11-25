function joinStrings(str1: string, str2: string): string {
  if (str1 === null || str2 === null) {
      throw new Error("Input strings cannot be null");
  }

  const result: string = str1 + str2;

  return result;
}
