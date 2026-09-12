import React, { useState } from 'react'

export default function TextForm(props) {
    const [text, setText] = useState('Enter your text..');

  const handleUpClick = (e) => {
    e.preventDefault(); // Prevents page refresh
    let newText = text.toUpperCase();
    setText(newText);// this updates the state with the new uppercase text
  };

  const handleOnChange = (event) => {
    setText(event.target.value);// this updates the state with the new value from the textarea
  };
  return (
    <div>
      <form>
        <h1>{props.heading}</h1>
  <div className="mb-3">
    <label htmlFor="exampleInputEmail1" className="form-label">{props.emailLabel}</label>
    <input type="email" className="form-control" id="exampleInputEmail1" aria-describedby="emailHelp"/>
    <div id="emailHelp" className="form-text">We'll never share your email with anyone else.</div>
  </div>
  <div className="mb-3">
    <label htmlFor="exampleInputPassword1" className="form-label">Password</label>
    <input type="password" className="form-control" id="exampleInputPassword1"/>
  </div>
  <div className="mb-3">
    <label htmlFor="exampleFormControlTextarea1" className="form-label">{props.text}</label>
    <textarea className="form-control" id="exampleFormControlTextarea1" rows="4" value={text} onChange={handleOnChange}></textarea>
  </div>
  <button type="submit" className="btn btn-primary me-3" >Submit</button>
  <button className="btn btn-primary" onClick={handleUpClick} >convert to uppercase</button>
  <div className="mb-3 form-check">
    <input type="checkbox" className="form-check-input" id="exampleCheck1"/>
    <label className="form-check-label" htmlFor="exampleCheck1">Check me out</label>
  </div>
  <button type="submit" className="btn btn-primary">Submit</button>
</form>
    </div>
  )
}
