function areAnagrams(str1: string, str2: string): boolean {
  str1 = str1.replace(/\s/g, '').toLowerCase();
  str2 = str2.replace(/\s/g, '').toLowerCase();

  if (str1.length !== str2.length) {
      return false;
  }

  const charArray1 = str1.split('');
  const charArray2 = str2.split('');

  charArray1.sort();
  charArray2.sort();

  return charArray1.join('') === charArray2.join('');
}
