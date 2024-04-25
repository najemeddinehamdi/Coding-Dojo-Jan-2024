import axios from 'axios'
import React, { useEffect, useState } from 'react'
import { useNavigate, useParams ,Link} from 'react-router-dom'

function Edit() {
    const [name, setName] = useState("")
    const [errors, setErrors] = useState([]);
    const { id } = useParams()
    const nav = useNavigate()
    useEffect(() => {
        axios.get("http://localhost:8000/api/author/" + id)
            .then((res) => {
                console.log(res.data)
                setName(res.data.name)
            }).catch((err) => {
                console.log(err)
            })
    }, [])

    const SubmitHandler = (e) => {
        e.preventDefault()
        axios.patch("http://localhost:8000/api/author/" + id, {
            name
        })
            .then((res) => {
                console.log("✅✅✅✅✅")
                nav("/")
            })
            .catch((err) => {
                const errorRes = err.response.data.errors;
                const errArray = []
                for (const key of Object.keys(errorRes)) {
                    errArray.push(errorRes[key].message)
                }
                setErrors(errArray)
            })
    }
    return (
        <div className='container'>
            <h1>Favourite author</h1>
            <Link to={"/"}></Link>
            <h2>edit this author</h2>
            <form onSubmit={SubmitHandler}>
                {errors.map((err, i) => (
                    <p key={i} className='text-danger'>{err}</p>
                ))}
                <label className="label-control">Name:</label>
                <input value={name} type="text" className='form-control' onChange={(e) => { setName(e.target.value) }} />
                <br />
                <br />
                <button className='btn btn-success'>edit</button>
                <Link to={"/"} className='btn btn-danger'>cancel</Link>
            </form>
        </div>
    )
}

export default Edit