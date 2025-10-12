import React,{useState , useEffect} from "react";

function FetchExample1(){
    const[users , setUsers] = useState([]);

    useEffect(()=>{
      async function fetchData(){
        const response = await fetch("https://jsonplaceholder.typicode.com/users");
        const data = await response.json();
        setUsers(data);
      }
      fetchData();
    },[]);

    return(
      <div>
        <h3>Users : </h3>
         <ul>
            {users.map((u)=>(
                <li key={u.id}>
                    <p>Name : {u.name}</p>
                    <p>UserName : {u.username}</p>
                    <p>Email : {u.email}</p>
                    <p>=====================================================================</p>
                </li>
            ))}
         </ul>
      </div>
    );
}

export default FetchExample1;

//=================================================================================================================================================================================================

// fetch only on button click
import React,{useState} from "react";

function FetchExample2(){
    const[users , setUsers] = useState([]);

    async function fetchData(){
        const response = await fetch("https://jsonplaceholder.typicode.com/users");
        const data = await response.json();
        setUsers(data);
    };

  
    return(
        <div>
            <button onClick={fetchData}>Load Data</button>
            <h3>Users : </h3>
            <ul>
                {users.map((u)=>(
                    <li key={u.id}>
                        <p>Name : {u.name}</p>
                        <p>UserName : {u.username}</p>
                        <p>Email : {u.email}</p>
                        <p>===========================================================================================</p>
                    </li>
                ))}
            </ul>
        </div>
    )
}

export default FetchExample2;
