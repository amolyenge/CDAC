function getMessage() {
  return new Promise(resolve => {
    setTimeout(() => resolve("Message received!"), 2000);
  });
}

async function displayMessage() {
  console.log("Waiting for message...");
  const msg = await getMessage(); // waits here
  console.log(msg);
}

displayMessage();


// -------------------------------------------------------------------------------

function delay(ms) {
  return new Promise(resolve => setTimeout(resolve, ms));
}

async function runSteps() {
  console.log("Step 1");
  await delay(1000);
  console.log("Step 2");
  await delay(1000);
  console.log("Step 3");
}

runSteps();
