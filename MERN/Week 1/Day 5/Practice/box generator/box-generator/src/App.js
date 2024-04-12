
import './App.css';
import React, { useState } from 'react';


const App=()=>{
const [color,setcolor]= useState("");
const [box ,setbox]= useState(["red"]);
// console.log({color})
const handlesubmit = (e) => {
  e.preventDefault();
  setbox([...box,color])
  console.log(box);
}
  return (
    <div>
      <form onSubmit={(e)=>handlesubmit(e)}>
        <div>enter a color <input type="text" onChange={(e)=>setcolor(e.target.value)} value={color}/></div>
        <button>add</button>
      </form>
      <div className="color-box-container">
        {box.map((c,i) => <div className="color-box" key={i} style={{backgroundColor: c }}  ></div>)}
      </div>
    </div>
      ) ;
    };

export default App;
