
// get data
async function getPost() {
  try {
    const response = await fetch("https://jsonplaceholder.typicode.com/posts/1");
    const data = await response.json();
    console.log(data);
  } catch (error) {
    console.error("Error:", error);
  }
}

getPost();

// --------------------------------------------------------------------------------------------------------------

// post data

fetch("https://jsonplaceholder.typicode.com/posts", {
  method: "POST",
  headers: { "Content-Type": "application/json" },
  body: JSON.stringify({
    title: "New Post",
    body: "Learning Fetch API!",
    userId: 1
  })
})
  .then(response => response.json())
  .then(data => console.log("Created:", data))
  .catch(error => console.error("Error:", error));

// ------------------------------------------------------------------------------------------------------------------

// PUT (update)
fetch("https://jsonplaceholder.typicode.com/posts/1", {
  method: "PUT",
  headers: { "Content-Type": "application/json" },
  body: JSON.stringify({ title: "Updated title" })
});

// --------------------------------------------------------------------------------------------------------------------

// DELETE
fetch("https://jsonplaceholder.typicode.com/posts/1", {
  method: "DELETE"
});
