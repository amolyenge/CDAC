const http = require('http');

const server = http.createServer((req , res) =>{
   res.setHeader('Content-Type','text/plain');
   
   if(req.url === '/'){
      res.writeHead(200);
      res.end('<h1>Welcome to Home page</h1>');
   }else if(req.url === '/about'){
    res.writeHead(200);
    res.end('<h1>Welcome to about page</h1>');
   }else{
     res.writeHead(404);
     res.end('<h1>404 Not Found</h1>');
   }
});

server.listen(3000,() =>{
    console.log("server started on http://localhost:3000");
})

//-----------------------------------------------------------------------------------------------------

// object showing

const http = require('http');

const server = http.createServer((req,res) =>{
    res.setHeader('Content-Type','application/json');

    if(req.url === '/api'){
        const data = {
            message:"Hello Amol",
            status:"success",
            time: new Date().toLocaleDateString()
        };

        res.writeHead(200);
        res.end(JSON.stringify(data));
    }else{
        res.writeHead(404);
        res.end(JSON.stringify({error: 'Page not Found'}));
    }
});

server.listen(3000,()=>{
    console.log("Server started");
});
