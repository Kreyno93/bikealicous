import React from 'react';
import logo from './bike-logo.png';
import './App.css';
import AddBike from "./components/AddBike";

function App() {
    return (
        <div className="App">
            <header className="App-header">
                <img src={logo} className="App-logo" alt="logo"/> Bikealicious
            </header>
            <AddBike/>
        </div>
    );
}

export default App;
