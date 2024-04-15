import React from 'react';
import Tabs from './components/tap1';
import './App.css'

const DataTabs =[
  {label: 'tab1', content : <div>This is tab 1 content</div>},
  {label: 'tab2', content : <div>This is tab 2 content</div>},
  {label: 'tab3', content : <div>This is tab 3 content</div>},
];

function App() {
  return (
    <div className="App">
      <Tabs items={DataTabs} />
    </div>
  );
}

export default App;
