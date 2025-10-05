//--------------------------------------------------------

//Basic

function greet(name, callback) {
  console.log("Hello, " + name);
  callback();
}

function sayBye() {
  console.log("Goodbye!");
}

greet("Amol", sayBye);


//-------------------------------------------------------------------------------------------------

function calculate(a, b, operation) {
  return operation(a, b);
}

function add(x, y) { return x + y; }
function multiply(x, y) { return x * y; }

console.log(calculate(4, 2, add));      // 6
console.log(calculate(4, 2, multiply)); // 8


// -----------------------------------------------------------------------------------------------

// setTimeout

function fetchData(callback) {
  console.log("Fetching data...");

  setTimeout(() => {
    console.log("Data fetched!");
    callback({ name: "Amol", age: 23 });
  }, 2000);
}

fetchData(function(data) {
  console.log("Received data:", data);
});


// -------------------------------------------------------------------

// set Time out

console.log("Start");

setTimeout(() => {
  console.log("This message appears after 3 seconds!");
}, 3000);  // 3000 milliseconds = 3 seconds

console.log("End");
