const express = require('express');
const app = express();
const port = 3000;

const todos = [
  { id: 1, task: 'Do the laundry', done: false },
  { id: 2, task: 'Finish homework', done: true },
  { id: 3, task: 'Buy groceries', done: false }
];

app.get('/todos', (req, res) => {
  res.json(todos);
});


app.get('/todos/:id', (req, res) => {
  const id = parseInt(req.params.id);
  const todo = todos.find(t => t.id === id);

  if (!todo) {
    return res.status(404).send('<h1>Todo not found</h1>');
  }

  res.send(`
    <h1>Todo Details</h1>
    <p><strong>ID:</strong> ${todo.id}</p>
    <p><strong>Task:</strong> ${todo.task}</p>
    <p><strong>Done:</strong> ${todo.done ? 'Yes' : 'No'}</p>
    <a href="/todos">Back to all todos</a>
  `);
});

app.listen(port, () => {
  console.log(`Server is running at http://localhost:${port}`);
});


// Visit http://localhost:3000/todos — you'll see JSON array of todos.

// Visit http://localhost:3000/todos/2 — you'll see HTML page with todo of id 2.