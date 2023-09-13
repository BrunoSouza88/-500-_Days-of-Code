function removeSpaces(input: string): string {
  return input.replace(/ /g, '');
}

// Using split and join
// function removeSpaces(input: string): string {
//   return input.split(' ').join('');
// }

// Using a loop:
// function removeSpaces(input: string): string {
//   let result = '';
//   for (const char of input) {
//       if (char !== ' ') {
//           result += char;
//       }
//   }
//   return result;
// }