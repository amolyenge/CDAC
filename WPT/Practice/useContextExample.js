// App.js
import React, { createContext, useState } from "react";
import Child from "./Child";



// 1️⃣ Create the context
export const UserContext = createContext();

function App() {
  const [user, setUser] = useState("Amol Yenge");

  return (
    // 2️⃣ Provide the context value
    <UserContext.Provider value={user}>
      <div style={{ textAlign: "center", marginTop: "50px" }}>
        <h1>🌐 React Context API Example</h1>
        <Child />
      </div>
    </UserContext.Provider>
  );
}

export default App;

//===================================================================================================================================================

// Child.js
import React from "react";
import GrandChild from "./GrandChild";

function Child() {
  return (
    <div style={{ border: "2px solid gray", padding: "20px", margin: "20px" }}>
      <h2>👶 Child Component</h2>
      <GrandChild />
    </div>
  );
}

export default Child;

//=======================================================================================================================================================

// GrandChild.js
import React, { useContext } from "react";
import { UserContext } from "./App"; // import context

function GrandChild() {
  const user = useContext(UserContext); // consume context

  return (
    <div style={{ border: "2px solid blue", padding: "20px", margin: "20px" }}>
      <h3>👦 GrandChild Component</h3>
      <p>User from Context: <b>{user}</b></p>
    </div>
  );
}

export default GrandChild;
