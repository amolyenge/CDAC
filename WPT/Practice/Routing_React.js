//=================================================================================================================================================================
//Home.js

import React from "react";
function Home() {
  return <h2>🏠 Welcome to the Home Page</h2>;
}

//=================================================================================================================================================================
//About.js

import React from "react";
function About() {
  return <h2>ℹ️ This is the About Page</h2>;
}

//=================================================================================================================================================================
//Contact.js

import React from "react";
function Contact() {
  return <h2>ℹ️ This is the Contact Page</h2>;
}

//=================================================================================================================================================================
//App.js
// npm install react-router-dom  -- to use routers

import React from "react";
import { BrowserRouter as Router, Routes, Route, Link } from "react-router-dom";
function App() {
  return (
    <Router>
      <div style={{ textAlign: "center" }}>
        <h1>React Routing Example</h1>

        {/* Navigation Links */}
        <nav>
          <Link to="/" style={{ margin: "10px" }}>Home</Link>
          <Link to="/about" style={{ margin: "10px" }}>About</Link>
          <Link to="/contact" style={{ margin: "10px" }}>Contact</Link>
        </nav>

        <hr />

        {/* Define Routes */}
        <Routes>
          <Route path="/" element={<Home />} />
          <Route path="/about" element={<About />} />
          <Route path="/contact" element={<Contact />} />
        </Routes>
      </div>
    </Router>
  );
}

export default App;
