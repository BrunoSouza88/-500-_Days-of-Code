class Brother {
  constructor(public name: string, public age: number) {}
}

function findYoungestBrother(brothers: Brother[]): Brother | null {
  if (brothers.length === 0) {
    return null;
  }

  let youngest = brothers[0];

  for (const brother of brothers.slice(1)) {
    if (brother.age < youngest.age) {
      youngest = brother;
    }
  }

  return youngest;
}
