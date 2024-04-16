
import './App.css';
import { useState } from 'react';
import axios from 'axios'

function App() {
  const [pokemon, setPokemon] = useState([]);

  const axiosPokemon = () => {
    axios.get("https://pokeapi.co/api/v2/pokemon?limit=100000&offset=0")
      .then((res) => {
        setPokemon(res.data.results)
        console.log(res)})
        
      .catch((err)=>{
        console.log(err)
      })  
  };

  return (
    <div className="App">
      <button onClick={axiosPokemon}>Fetch Pokemon</button>
      <hr />
      
      <ul>
        {pokemon.map(pok => (
          <li>{pok.name}</li>
        ))}
      </ul>
    </div>
  );
}

export default App;
