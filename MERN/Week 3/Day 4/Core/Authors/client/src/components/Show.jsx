import axios from 'axios'
import React, { useEffect, useState } from 'react'
import { useParams ,useNavigate} from 'react-router-dom'



function Show() {
    const [author, setauthor] = useState({})
    const { id } = useParams()
    const nav=useNavigate()
    useEffect(() => {
        axios.get("http://localhost:8000/api/author/" + id)
            .then((res) => {
                console.log(res.data)
                setauthor(res.data)
            }).catch((err) => {
                console.log(err)
            })
    }
, [id])
  return (
    <div className='container'>
            <h4>Name: {author.name}</h4>
            <button className='btn btn-secondary' onClick={()=> nav('/')}>Home</button>
    </div>
  )
}

export default Show