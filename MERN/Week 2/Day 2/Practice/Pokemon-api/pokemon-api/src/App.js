
import './App.css';
import { useState } from 'react';

function App() {
  const [pokemon, setPokemon] = useState([]);

  const fetchPokemon = () => {
    fetch("https://pokeapi.co/api/v2/pokemon")
      .then(response => {
        return response.json();
      })
      .then(jsonResponse => {
        console.log(jsonResponse);
        setPokemon(jsonResponse.results);
      })
      .catch(err => {
        console.log(err);
      });
  };

  return (
    <div className="App">
      <button onClick={fetchPokemon}>Fetch Pokemon</button>
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
