// npm install axios  ---- to use axios


import React, {useState , useEffect} from "react";
import axios from "axios";

function AxiosExample1(){
    const[users , setUsers] = useState([]);
    const[loading , setLoading] = useState(true);
    const[error , setError] = useState(null);

    useEffect(()=>{
        async function fetchData(){
            try{
                const response = await axios.get("https://jsonplaceholder.typicode.com/users");
                setUsers(response.data);
            }catch(err){
               setError("Failed to fetch Data");
               console.log(err);
            }finally{
               setLoading(false);
            }
        }
        fetchData();
     },[]);

     if(loading) return <h3>Loading.......</h3>;
     if(error) return <h3 style={{textAlign:"center"}}>{error}</h3>

     return(
        <div>
             <h2>Users: </h2>
             <ul>
                {users.map((u) =>(
                    <li key={u.id}>
                        <p>Name : {u.name}</p>
                        <p>UserName : {u.username}</p>
                        <p>Email: {u.email}</p>
                        <p>===============================================================================================================</p>
                    </li>
                ))}
             </ul>
        </div>
     )
}

export default AxiosExample1;


//============================================================================================================================================================================

// fetch only on click of button
// npm install axios  ---- to use axios

import React,{useState } from "react";
import axios from "axios";

function AxiosExample2(){
    const[users,setUsers] = useState([]);
    const[loading , setLoading]= useState(true);
    const[error,setError] = useState(null);

    async function fetchData(){
            const response = await axios.get("https://jsonplaceholder.typicode.com/users");
            setUsers(response.data);
    }
 

    return(
        <div>
        <button onClick={fetchData}>Load Users.</button>
        <h3>Users : </h3>
        <ul>
            {users.map((u)=>(
                <li key={u.id}>
                    <p>Name: {u.name}</p>
                    <p>UserName: {u.username}</p>
                    <p>Email: {u.email}</p>
                    <p>===================================================================================================</p>
                </li>
            ))}
        </ul>
        </div>
    )
}

export default AxiosExample2;
