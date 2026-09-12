import './App.css';
import Navbar from './components/Navbar';
import Textform from './components/TextForm';


function App() {
  return (
   <>
     <Navbar title="My App" aboutus="aboutdeveloper"/>
  <div className="container">
    <Textform heading="Contact Us" emailLabel="Your Email" text="Your Message"   />
  </div>
   </>
  );
}

export default App;
