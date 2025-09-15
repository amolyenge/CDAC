function findLargest(arr) {

    arr.sort((a, b) => a - b);

    return arr[arr.length - 1];
}

let arr = [10, 5, 20, 8];
console.log("Largest element in the array is:", findLargest(arr));


console.log("reduce")
function largestElement(arr) {
    return arr.reduce
        ((largest, current) =>
            (current > largest ? current : largest),
            arr[0]);
}

let num1 = [10, 15, 38, 20, 13];
console.log(largestElement(num1));