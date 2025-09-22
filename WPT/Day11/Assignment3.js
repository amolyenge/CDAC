const http = require('http');
const server = http.createServer((req, res) => {
  res.writeHead(200, { 'Content-Type': 'text/plain' });

  res.end('Hello my name is Amol !!!!!!!!!!!!!!\n');
});

server.listen(3000, () => {
  console.log('Server is started on http://localhost:3000/');
});
