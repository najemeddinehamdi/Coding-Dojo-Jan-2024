import React, { useState } from 'react';

const NewComponent = (props) => {
    const[num, setNum]= useState(props.age);
    return (
        <div>
            <h1>{props.lastName}, {props.firstName}</h1>
            <p>Age: {num}</p>
            <p>Hair Color: {props.hairColor}</p>
            <button  onClick={()=> setNum(num +1)}>Birthday Button for {props.firstName}</button>
        </div>
    );
}

export default NewComponent;
