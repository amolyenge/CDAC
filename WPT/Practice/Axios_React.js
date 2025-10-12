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

export default FetchUsers;
