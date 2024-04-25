import React, { useState } from 'react'
import axios from 'axios'
import { useNavigate, Link } from 'react-router-dom'

const Create = () => {
    const [name, setName] = useState("");
    const [errors, setErrors] = useState([]);
    const nav = useNavigate()
    const SubmitHandler = (e) => {
        e.preventDefault()
        axios.post("http://localhost:8000/api/author/new", {
            name: name,
        })
            .then((res) => {
                console.log("✅✅✅✅✅")
                nav("/")
            })
            .catch((err) => {
                const errorRes =err.response.data.errors;
                const errArray=[]
                for(const key of Object.keys(errorRes)){
                    errArray.push(errorRes[key].message)
                }
                setErrors(errArray)
            })
    }
    return (
        <div className='container'>
            <h1>Favourite author</h1>
            <Link to={"/"}>Home</Link>
            <h3>add a new author</h3>
            <form onSubmit={SubmitHandler}>
                {errors.map((err,i)=>(
                    <p key={i} className='text-danger'>{err}</p>
                ))}
                <label className="label-control">Name:</label>
                <input value={name} type="text" className='form-control' onChange={(e) => { setName(e.target.value) }}/>
                <br />
                <br />
                <button className='btn btn-success'>create</button>
                <Link to={"/"} className='btn btn-danger'>cancel</Link>
            </form>
        </div>
    )
}

export default Create