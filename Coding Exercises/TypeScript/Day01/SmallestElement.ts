function findSmallestElement(arr: number[]): number {
    let smallest: number = Number.POSITIVE_INFINITY;

    for (let num of arr) {
        if (num < smallest) {
            smallest = num;
        }
    }

    return smallest;
}

function findSmallestElement(arr: number[]): number {
    return arr.reduce((smallest, num) => num < smallest ? num : smallest, Number.POSITIVE_INFINITY);
}