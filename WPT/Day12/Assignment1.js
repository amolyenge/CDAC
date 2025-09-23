const http = require('http');
const url = require('url');

const server = http.createServer((req, res) => {
  const parsedUrl = url.parse(req.url, true);
  const query = parsedUrl.query;

  const fName = query.fName || 'Guest';
  const html = `
    <!DOCTYPE html>
    <html>
    <head>
      <title>Greeting Page</title>
    </head>
    <body>
      <h1>Hello ${fName}</h1>
    </body>
    </html>
  `;

  res.writeHead(200, { 'Content-Type': 'text/html' });
  res.end(html);
});

server.listen(3000, () => {
  console.log('Server running at http://localhost:3000/');
});

//http://localhost:3000/?fName=ABC&lName=XYZ
