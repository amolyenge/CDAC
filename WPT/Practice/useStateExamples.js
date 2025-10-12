// Object Example

import { useState } from "react";

function ObjExample(){
    const[user , setUser] = useState(
       { name:"",
        age:"",
        city:""
       } 
    );

    return(
        <div>
            <input placeholder="Name" value={user.name} onChange={(e) => setUser({ ...user, name: e.target.value })}/><br></br>
            <input placeholder="Age" value={user.age} onChange={(e)=>setUser({...user,age:e.target.value})}/><br></br>
            <input placeholder="City" value={user.city} onChange={(e)=>setUser({...user,city:e.target.value})}/>
            <h3>
                  {user.name && user.age && user.city ? `${user.name} (${user.age}) from ${user.city}`: "Enter your details"}
            </h3>
        </div>
    )
}
export default ObjExample;

// ========================================================================================================================================================================================================

// Counter

import React , {useState} from'react';

function Counter(){
    const[count , setCount] = useState(0);

    return(
        <div>
            <p>Count : {count}</p>
            <button onClick = {()=>setCount(count + 1)}>Increment</button>
            <button onClick={()=>setCount(count - 1)}>Decrement</button>
            <button onClick={()=>setCount(0)}>Reset</button>
        </div>
    )
}

export default Counter;

// ========================================================================================================================================================================================================

//Text

import { useState } from "react";

function TextInfo(){
   const[name , setName] = useState("");

   return (
    <div style={{textAlign : "center" , marginTop:"50px"}}>
    <p>Enter your Name: </p>
    <input type="text" value={name} onChange={(e)=>setName(e.target.value)}></input>
    <p>Hello {name}</p>
    </div>
   )
}

export default TextInfo;

// ========================================================================================================================================================================================================
// button toggle

import React , {useState} from 'react';
function ToggelButton(){
   const[isOn , setOn] = useState(false);

   return(
     <div style={{textAlign:"center" , marginTop:"50px"}}>
        <p>Light is {isOn ? "💡 ON" : " 🌑 OFF"}</p>
        <button onClick={()=>setOn(!isOn)}>Toggle</button>
     </div>
   )
}

export default ToggelButton;
