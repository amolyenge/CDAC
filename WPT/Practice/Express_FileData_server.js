const fs = require('fs');
const express = require('express');

const app = express();
app.use(express.json());

const DATA_FILE = './titanic-parquet.json';

function readData(){
    const data = fs.readFileSync(DATA_FILE);
    return JSON.parse(data);
}

function writeData(data){
    fs.writeFileSync(DATA_FILE,JSON.stringify(data.null,2));
}

app.get('/users',(req,res)=>{
    const users = readData();
    res.json(users);
})

