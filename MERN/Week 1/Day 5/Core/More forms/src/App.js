import React, { useState } from 'react';
import './App.css';

const Form = (props) => {
  const [firstName, setFirstName] = useState("");
  const [lastName, setLastName] = useState("");
  const [email, setEmail] = useState("");
  const [password, setPassword] = useState("");
  const [Yourformdata, setYourformdata] = useState(null);
  const [errorMessage, setErrorMessage] = useState("");

  const createUser = (e) => {
    e.preventDefault();
    if (firstName.length<2){
      setErrorMessage("first name must be 2 characters");
      return;
    }else if(lastName.length<2){
      setErrorMessage("last name must be 2 charachters");
      return;
    }else if(email.length<2){
      setErrorMessage("email must be 2 charachters");
      return;
    }else if(password.length<8){
      setErrorMessage("passsword must be 8 charachters");
      return;
    }
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
        {firstName.length<2 ? "firstname must be 2 characters" : ""}
        </div>
        <div>
        <label>Last name:</label>
        <input type="text" onChange={(e) => setLastName(e.target.value)} value={lastName} />
        {lastName.length<2 ? "last name must be 2 charachters" : ""}
        </div>
        <div>
        <label>Email:</label>
        <input type="email" onChange={(e) => setEmail(e.target.value)} value={email} />
        {email.length <2 ? "email must be 2 charachters" : ""}
        </div>
        <div>
        <label>Password:</label>
        <input type="password" onChange={(e) => setPassword(e.target.value)} value={password} />
        {password.length <8 ? "password must be 8 charachters" : ""}
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