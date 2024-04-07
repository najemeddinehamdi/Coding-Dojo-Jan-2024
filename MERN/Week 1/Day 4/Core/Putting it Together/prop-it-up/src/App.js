import React from 'react';
import './App.css';
import NewComponent from './components/newcomponent';


const personCard =[
  {firstName:"joe",lastName:"doe",age:45,hairColor:"Black"},
  {firstName:"john",lastName:"smith",age:88,hairColor:"Brown"},
  {firstName:"Millard",lastName:"Fillmore",age:50,hairColor:"Brown"},
  {firstName:"maria",lastName:"smith",age:62,hairColor:"Brown"}
];


function App() {
  return (
    <div className="App">
      {personCard.map(person=>{
        return<NewComponent firstName={person.firstName} lastName={person.lastName} age={person.age}  hairColor={person.hairColor}/>
      })}
    </div>
  );
}

export default App;