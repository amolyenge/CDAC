const express = require('express');

const app = express();

app.get('/',(req,res)=>{
    res.send("Hello from home page");
});

app.get('/about',(req,res)=>{
    res.send("Hello from About page");
});

app.get('/api',(req,res) =>{
    const user = {id:1, name:"Amol", role:"Dev"};
    res.status(200).json(user);
})

app.use((req,res) =>{
    res.status(404).send('Page not Found');
});

app.listen(3000,()=>{
    console.log("server Started ....");
});

// create folder
// create index.js
// npm init
// npm install express
// to run node index.js
