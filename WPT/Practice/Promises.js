// Basic

const myPromise = new Promise((resolve, reject) => {
  let success = true;
  if (success) resolve("Promise resolved successfully!");
  else reject("Promise rejected!");
});

myPromise
  .then(result => console.log(result))
  .catch(error => console.error(error));

// ------------------------------------------------------------------------------------

const delayedPromise = new Promise((resolve, reject) => {
  setTimeout(() => {
    resolve("Data fetched after 2 seconds");
  }, 2000);
});

delayedPromise.then(msg => console.log(msg));


// --------------------------------------------------------------------------------------

new Promise((resolve, reject) => {
  resolve(5);
})
  .then(num => num * 2)
  .then(num => num + 10)
  .then(result => console.log("Final result:", result));
