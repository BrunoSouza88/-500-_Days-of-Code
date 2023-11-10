function areEqual(arg1: any, arg2: any): boolean {
  if (arg1 === null && arg2 === null) {
      return true;
  }

  if ((arg1 === null && arg2 !== null) || (arg1 !== null && arg2 === null)) {
      return false;
  }

  return arg1 === arg2;
}

