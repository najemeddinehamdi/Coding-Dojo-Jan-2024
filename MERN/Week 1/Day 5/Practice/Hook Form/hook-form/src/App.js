import React, { useState } from 'react';
import './App.css';

const Form = (props) => {
  const [firstName, setFirstName] = useState("");
  const [lastName, setLastName] = useState("");
  const [email, setEmail] = useState("");
  const [password, setPassword] = useState("");
  const [Yourformdata, setYourformdata] = useState(null);

  const createUser = (e) => {
    e.preventDefault();
    const newUser = { firstName, lastName, email, password };
    setYourformdata(newUser); 
    setFirstName("");
    setLastName("");
    setEmail("");
    setPassword("");
  };

  return (
    <div className="App">
      <form onSubmit={createUser}>
        <div>
        <label>First name:</label>
        <input type="text" onChange={(e) => setFirstName(e.target.value)} value={firstName}/>
        </div>
        <div>
        <label>Last name:</label>
        <input type="text" onChange={(e) => setLastName(e.target.value)} value={lastName} />
        </div>
        <div>
        <label>Email:</label>
        <input type="email" onChange={(e) => setEmail(e.target.value)} value={email} />
        </div>
        <div>
        <label>Password:</label>
        <input type="password" onChange={(e) => setPassword(e.target.value)} value={password} />
        </div>
        <div>
        <label>Confirm password:</label>
        <input type="password" />
        </div>
        <button type="submit">Submit</button>
      </form>
      {Yourformdata && (
        <div className='Yourformdata'>
          <h2>Your form data:</h2>
          <p>First Name: {Yourformdata.firstName}</p>
          <p>Last Name: {Yourformdata.lastName}</p>
          <p>Email: {Yourformdata.email}</p>
          <p>Password: {Yourformdata.password}</p>
        </div>
      )}
    </div>
  );
}

function App() {
  return (
    <div className="App">
      <Form />
    </div>
  );
}

export default App;