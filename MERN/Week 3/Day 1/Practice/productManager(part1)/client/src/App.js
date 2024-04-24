import { Link, Route, Routes, useNavigate } from 'react-router-dom';
import './App.css';
import  CreateProduct  from '../src/compnents/CreateProduct';

function App() {
  return (
    <div className="App">
      <Routes> 

        <Route path="/product/create" element={<CreateProduct />} />

      </Routes>

    </div>
  );
}

export default App;