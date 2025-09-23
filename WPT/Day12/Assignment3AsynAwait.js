const fs = require('fs').promises;

async function fileOps() {
  try {
    await fs.writeFile('example_async_await.txt', 'Hello from async/await!');
    const data = await fs.readFile('example_async_await.txt', 'utf8');
    console.log('Async/Await read data:', data);
  } catch (err) {
    console.error('Error:', err);
  }
}

fileOps();
