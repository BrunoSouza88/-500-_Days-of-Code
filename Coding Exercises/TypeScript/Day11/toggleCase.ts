function toggleCase(s: string): string {
  let toggledString = "";
  for (let i = 0; i < s.length; i++) {
      const char = s.charAt(i);

      if (char.toUpperCase() === char) {
          toggledString += char.toLowerCase();
      } else if (char.toLowerCase() === char) {
          toggledString += char.toUpperCase();
      } else {
          toggledString += char;
      }
  }
  return toggledString;
}
