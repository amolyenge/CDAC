const fs = require('fs');

try {
  // Write data to a file synchronously
  fs.writeFileSync('example.txt', 'Hello, this is synchronous write!');

  // Read data from the file synchronously
  const data = fs.readFileSync('example.txt', 'utf8');
  console.log('Synchronous read data:', data);
} catch (err) {
  console.error('Error:', err);
}
