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

export default FetchUsers;

//=================================================================================================================================================================================================

// fetch only on button click
import React, { useState } from "react";

function FetchOnClick() {
  const [user, setUser] = useState(null);

  const fetchUser = async () => {
    const res = await fetch("https://jsonplaceholder.typicode.com/users/1");
    const data = await res.json();
    setUser(data);
  };

  return (
    <div>
      <button onClick={fetchUser}>Get User</button>
      {user && (
        <div>
          <h3>{user.name}</h3>
          <p>{user.email}</p>
        </div>
      )}
    </div>
  );
}

export default FetchOnClick;
