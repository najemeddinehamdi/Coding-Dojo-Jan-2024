import axios from 'axios'
import React, { useState } from 'react'
import { useNavigate } from 'react-router-dom'



const CreateProduct = () => {
    const [title, setTitle] = useState("")
    const [price, setPrice] = useState()
    const [description, setDescription] = useState("")


    const SubmitHandler = (e) => {
        e.preventDefault()
        axios.post("http://localhost:3000/product/create", {
            title: title,
            price: price,
            description: description,
        })
            .then((res) => {
                console.log("++++++")
            })
            .catch((err) => {
                console.log(err)
            })
    }

    return (
        <div className="App">
            <h1>Product Manager :</h1>
            <form onSubmit={SubmitHandler}>
                title : <input type="text" value={title} onChange={(e) => { setTitle(e.target.value) }} /> <br />
                price : <input type="number" value={price} onChange={(e) => { setPrice(e.target.value) }} /> <br />
                description: <input type="text" value={description} onChange={(e) => { setDescription(e.target.value) }} />
                <br />
                <button>create</button>
            </form>
        </div>
    );
}

export default CreateProduct ;