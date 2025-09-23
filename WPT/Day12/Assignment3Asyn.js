const fs = require('fs');

// Write data asynchronously
fs.writeFile('example_async.txt', 'Hello, this is asynchronous write!', (writeErr) => {
  if (writeErr) {
    return console.error('Write error:', writeErr);
  }
  console.log('File written asynchronously.');

  // Read data asynchronously
  fs.readFile('example_async.txt', 'utf8', (readErr, data) => {
    if (readErr) {
      return console.error('Read error:', readErr);
    }
    console.log('Asynchronous read data:', data);
  });
});
