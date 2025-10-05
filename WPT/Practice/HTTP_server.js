const http = require('http');

const server = http.createServer((req , res) =>{
     res.writeHead(200,{'Content-Type':'text/plain'});
     res.end("Hello From node js Server");
});

server.listen(3000,() =>{
    console.log("server started on http://localhost:3000");
});
