import {Routes,Route } from 'react-router-dom'
import './App.css';
import List from './components/List';
import Create from './components/Create';
import Edit from './components/Edit';
import Show from './components/Show';

function App() {
  return (
    <div className="App">
      <Routes>
        <Route path='/' element={<List/>}/>
        <Route path='/author/new' element={<Create/>}/>
        <Route path='/author/edit/:id' element={<Edit/>}/>
        <Route path='/author/:id' element={<Show/>}/>
      </Routes>
    </div>
  );
}

export default App;
