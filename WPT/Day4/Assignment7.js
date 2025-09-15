// 1) Function to find largest element by using for loop

function largestElement(arr) {
    let largestNum = arr[0];
    for (let i = 1; i < arr.length; i++) {
        if (arr[i] > largestNum) {
            largestNum = arr[i];
        }
    }
    return largestNum;
}

const num1 = [10, 15, 18, 20, 23];
const result = largestElement(num1);

console.log("The largest element in the array is:" + result);


// Function to get largest element from array by foreach loop
const array = [10, 15, 18, 20, 23];
let largest = array[0];

array.forEach(element => {
    if (element > largest) {
        largest = element;
    }
});

console.log("Largest element:", largest);


// Function to find largest lement using sort
function findLargest(arr) {

    arr.sort((a, b) => a - b);

    return arr[arr.length - 1];
}                                                                           

let arr = [10, 15, 18, 20, 23];
console.log("Largest element in the array is:", findLargest(arr));
