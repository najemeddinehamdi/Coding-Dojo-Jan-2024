import axios from 'axios'
import React, { useEffect, useState } from 'react'
import { useParams } from 'react-router-dom'


function OneProduct() {
    const [product, setproduct] = useState({})

    const { id } = useParams()
    useEffect(() => {
        axios.get("http://localhost:3000/api/product/" + id)
            .then((res) => {
                console.log(res.data)
                setproduct(res.data)
            }).catch((err) => {
                console.log(err)
            })
}, [])



  return (
    <div>
        <h1>{product.title}</h1>
        <h3>{product.price}</h3>
        <p>{product.description}</p>
    </div>
  )
}

export default OneProduct