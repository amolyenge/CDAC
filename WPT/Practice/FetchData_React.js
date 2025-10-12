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
