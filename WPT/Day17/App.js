import { BrowserRouter as Router, Routes, Route, Link } from 'react-router-dom';
import WithCallBack from './callBackAssignment'
import PrevCallBack from './callbackwithPrev'
import Component1 from './UseContextAssignment'
import Component2 from './UseContextAssignment'
import Home from './Home'
import AboutUs from './AboutUs'
import Contact from './Contact'
import Counter from './Counter';

function App() {
  return (
    <>
          {/* <WithCallBack/> */}
          {/* <PrevCallBack/> */}
          {/* <Component1/> */}
          {/* <Component2/> */}


    <Router>
      <div>
        <nav style={{ marginBottom: '20px' , backgroundColor: 'blueviolet' }}>
          <Link to="/" style={{ marginRight: '10px', color:'white' ,  marginLeft: '80px' }}>Home</Link>
          <Link to="/about" style={{ marginRight: '10px',  color: 'white' ,  marginLeft: '80px'}}>About Us</Link>
          <Link to="/contact" style={{color: 'white' , marginLeft: '80px'}}>Contact</Link>
          <Link to="/counter" style={{color: 'white' , marginLeft: '80px'}}>Counter</Link>
        </nav>
{/* 
        <button ><Link to="/">Home</Link></button>
        <button ><Link to="/about">About</Link></button>
        <button ><Link to="/contact">Contact</Link></button>
        <button ><Link to="/counter">Counter</Link></button> */}

        <Routes>
          <Route path="/" element={<Home />} />
          <Route path="/about" element={<AboutUs />} />
          <Route path="/contact" element={<Contact />} />
          <Route path="/counter" element={<Counter />} />
        </Routes>
      </div>
    </Router>
    </>
  );
}

export default App;
