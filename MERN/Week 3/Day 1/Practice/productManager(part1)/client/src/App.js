import { Link, Route, Routes, useNavigate } from 'react-router-dom';
import './App.css';
import  CreateProduct  from '../src/compnents/CreateProduct';
import OneProduct from './compnents/OneProduct';
import Main from './compnents/Main';
import UpdateProduct from './compnents/Update';

function App() {
  return (
    <div className="App">
      <Routes> 

        <Route path="/products" element={<CreateProduct />} />
        <Route path="/product/:id" element={<OneProduct />} />
        <Route path="/" element={<CreateProduct />} />
        <Route path="/product/:id/update" element={<UpdateProduct/>} />


      </Routes>

    </div>
  );
}

export default App;