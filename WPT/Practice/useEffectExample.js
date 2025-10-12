import React, { useState, useEffect } from "react";

function Example1() {
  const [count, setCount] = useState(0);

  useEffect(() => {
    console.log("useEffect ran");
  }); // no dependency array

  return (
    <div>
      <h1>{count}</h1>
      <button onClick={() => setCount(count + 1)}>Increment</button>
    </div>
  );
}

export default Example1;

//=========================================================================================================================================

  import React, { useState, useEffect } from "react";

function Example2() {
  const [count, setCount] = useState(0);

  useEffect(() => {
    console.log("Component mounted!");
  }, []); // runs only once after first render

  return (
    <div>
      <h1>{count}</h1>
      <button onClick={() => setCount(count + 1)}>Increment</button>
    </div>
  );
}

export default Example2;


//====================================================================================================================================================

  import React, { useState, useEffect } from "react";

function Example3() {
  const [count, setCount] = useState(0);
  const [name, setName] = useState("Amol");

  useEffect(() => {
    console.log(`Count changed to ${count}`);
  }, [count]); // runs when count changes

  return (
    <div>
      <h1>{count}</h1>
      <button onClick={() => setCount(count + 1)}>Increment Count</button>
      <input value={name} onChange={(e) => setName(e.target.value)} />
    </div>
  );
}

export default Example3;

//=======================================================================================================================================================

  // fetching data IMP

  import React, { useState, useEffect } from "react";

function FetchUsers() {
  const [users, setUsers] = useState([]);

  useEffect(() => {
    async function fetchData() {
      const response = await fetch("https://jsonplaceholder.typicode.com/users");
      const data = await response.json();
      setUsers(data);
    }

    fetchData();
  }, []); // only once

  return (
    <div>
      <h2>Users:</h2>
      <ul>
        {users.map((u) => (
          <li key={u.id}>{u.name}</li>
        ))}
      </ul>
    </div>
  );
}

export default FetchUsers;


//=================================================================================================================================================================

  // fetching data with axios

  import React, { useState, useEffect } from "react";
import axios from "axios"; // ✅ import axios

function FetchUsers() {
  const [users, setUsers] = useState([]);
  const [loading, setLoading] = useState(true); // optional: loading state
  const [error, setError] = useState(null); // optional: error state

  useEffect(() => {
    async function fetchData() {
      try {
        // Axios automatically parses JSON, so no need for response.json()
        const response = await axios.get("https://jsonplaceholder.typicode.com/users");
        setUsers(response.data);
      } catch (err) {
        setError("Failed to fetch users 😢");
        console.error(err);
      } finally {
        setLoading(false);
      }
    }

    fetchData();
  }, []);

  // Optional UI states
  if (loading) return <h3>Loading...</h3>;
  if (error) return <h3 style={{ color: "red" }}>{error}</h3>;

  return (
    <div style={{ textAlign: "center" }}>
      <h2>Users:</h2>
      <ul>
        {users.map((u) => (
          <li key={u.id}>{u.name}</li>
        ))}
      </ul>
    </div>
  );
}

export default FetchUsers;


//==============================================================================================================================================================


 import React, { useState, useEffect } from "react";

function UserDetails() {
  const [userId, setUserId] = useState(1);
  const [user, setUser] = useState(null);

  useEffect(() => {
    async function fetchUser() {
      const response = await fetch(`https://jsonplaceholder.typicode.com/users/${userId}`);
      const data = await response.json();
      setUser(data);
    }
    fetchUser();
  }, [userId]); // run whenever userId changes

  return (
    <div>
      <button onClick={() => setUserId((prev) => prev + 1)}>Next User</button>
      <h2>User ID: {userId}</h2>
      {user && (
        <p>
          <b>{user.name}</b> ({user.email})
        </p>
      )}
    </div>
  );
}

export default UserDetails;
//==============================================================================================================================================================

import React, { useState, useEffect } from "react";

function Timer() {
  const [seconds, setSeconds] = useState(0);

  useEffect(() => {
    const timer = setInterval(() => {
      setSeconds((prev) => prev + 1);
    }, 1000);

    return () => clearInterval(timer); // cleanup when unmount
  }, []); // run once

  return <h1>Timer: {seconds}s</h1>;
}

export default Timer;
