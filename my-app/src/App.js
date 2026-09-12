import './App.css';
import Navbar from './components/Navbar';
import TextForm from './components/TextForm';
import HeroSection from './components/HeroSectiontemp';
import Footer from './components/footer';

const App = () => {
  return (
    <>
      <Navbar title="My App" aboutus="aboutdeveloper" />
      <main className="container">
        <HeroSection />
        <TextForm heading="Contact Us" emailLabel="Your Email" text="Your Message" />
        <Footer />
      </main>
    </>
  );
};

export default App;