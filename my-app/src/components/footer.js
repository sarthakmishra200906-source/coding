import React from 'react';
import './footer.css';

const Footer = () => {
  return (
    <footer className="footer bg-dark text-white py-5">
      <div className="container-fluid">
        <div className="row">
          <div className="col-md-4">
            <h5>About TextFlow</h5>
            <p>Transform and optimize your text with powerful tools. Perfect for learning React and building practical projects.</p>
          </div>
          <div className="col-md-4">
            <h5>Quick Links</h5>
            <ul className="list-unstyled">
              <li><a href="/" className="text-white-50 text-decoration-none">Home</a></li>
              <li><a href="/" className="text-white-50 text-decoration-none">Features</a></li>
              <li><a href="/" className="text-white-50 text-decoration-none">About</a></li>
              <li><a href="/" className="text-white-50 text-decoration-none">Contact</a></li>
            </ul>
          </div>
          <div className="col-md-4">
            <h5>Follow Us</h5>
            <a href="/" className="text-white-50 me-3 text-decoration-none">Facebook</a>
            <a href="/" className="text-white-50 me-3 text-decoration-none">Twitter</a>
            <a href="/" className="text-white-50 text-decoration-none">LinkedIn</a>
          </div>
        </div>
        <hr className="bg-white-50 my-4" />
        <div className="text-center">
          <p className="mb-0">&copy; 2025 TextFlow. All Rights Reserved. | Learning React</p>
        </div>
      </div>
    </footer>
  );
};

export default Footer;