let arr = [12, 34, 56, 78, 99, 21, 32, 1, 5, 10]

function callbk(x) {
    console.log("SEE THIS ", x)
}
arr.forEach(callbk)
arr.forEach((x) => console.log(x))

let sqrarr = arr.map((e) => e * e)

console.log("origianl array ", arr)
console.log("square array ", sqrarr)

let arr2 =
    ["red", "green", "blue", "yellow"]
 
console.log(arr2.map((ele) =>
    ele.substring(0, 2).toUpperCase()))

let oddnumbers =
    arr.filter((e) => { return e % 2 != 0 })
console.log(oddnumbers)