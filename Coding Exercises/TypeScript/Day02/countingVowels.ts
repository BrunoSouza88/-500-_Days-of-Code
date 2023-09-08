class Exercise {
  static countVowels(str: string): number {
      return str.replace(/[^aeiouAEIOU]/g, '').length;
  }
}
