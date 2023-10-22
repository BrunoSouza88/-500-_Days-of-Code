function repeatSentence(sentence: string): string {
  let result = "";

  for (let index = 0; index < 3; index++) {
      result += sentence;
      if (index < 2) {
          result += " ";
      }
  }

  return result.trim();
}
