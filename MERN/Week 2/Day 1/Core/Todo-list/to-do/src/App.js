import React, { useState} from 'react'
import './App.css';



function App() {
const [tasks,settasks]= useState([]);
const[task,setTask] = useState("")
const createTask  =(e)=> {
  e.preventDefault();

  
  settasks([...tasks,{content:task,statu: false}]);
  console.log(tasks)
}

const deleteTask=(index)=>{
  settasks(tasks.filter((t,id)=> id!= index));
}

const toggle =(index) =>{
  const copie=[...tasks]
  copie[index].statu= !copie[index].statu
  settasks(copie)
  console.log(copie[index].statu)
}



  return (
    <div className="App">
      <form onSubmit={createTask}>
      <input type="text"  onChange={ (e) => setTask(e.target.value)}/>
      <button>add</button>
      </form>
      <br />

      <div className='task'>
        {tasks.map( (t,index) =>( 
        <div>
          <p id='task' style={ {textDecoration: t.statu ? "line-through" : "none" }}>{t.content}</p>
          <input type="checkbox" onClick={()=> toggle(index) } />
          <button onClick={()=>deleteTask(index)} >delete</button>
        </div>))}
      </div>
    </div>
  );
}

export default App;
