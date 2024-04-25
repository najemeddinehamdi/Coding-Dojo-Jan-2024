import axios from 'axios'
import React, { useEffect, useState } from 'react'
import { Link, useNavigate } from 'react-router-dom'



const List = () => {
    const [author, setauthor] = useState([])
    const nav=useNavigate()
    useEffect(() => {
        axios.get("http://localhost:8000/api/author")
            .then((res) => {
                console.log(res.data)
                setauthor(res.data)
            }).catch((err) => {
                console.log(err)
            });
},[])

const Deleteauthor = (id) => {
    axios.delete(`http://localhost:8000/api/author/${id}`)
        .then((res) => {
            console.log(author)
            const Filteredauthor = author.filter((c) => {
                return c._id !== id
            })
            setauthor(Filteredauthor)

        }).catch(err => {
            console.log(err)
        })
}

  return (
    <div className='container'>
        <h1>Favourite author</h1>
        <Link to={"/author/new"}>add an author</Link>
        <table className='table'>
            <thead>
                <tr>
                    <th>Author</th>
                    <th>action:</th>
                </tr>
            </thead>
            <tbody>
                {author.map(c =>(
                    <tr key={c._id}>
                        <td><Link to={`/author/${c._id}`}>{c.name}</Link> </td>
                        <td>
                            <button className='btn btn-primary' onClick={()=>nav(`/author/edit/${c._id}`)}>Edit</button>
                            <button className='btn btn-danger'  onClick={() => { Deleteauthor(c._id) }}>Delete</button>
                        </td>
                    </tr>
                ))}
            </tbody>
        </table>
    </div>
  )
}

export default List