import axios from 'axios'
import React, { useEffect, useState } from 'react'
import { useNavigate, useParams } from 'react-router-dom'

const UpdateProduct = () => {
    const [title, setTitle] = useState("")
    const [Price, setPrice] = useState(0)
    const [description, setdescription] = useState("")
    const nav = useNavigate()
    const [Product, setProduct] = useState({})
    const { id } = useParams()
    useEffect(() => {
        axios.get("http://localhost:3000/api/product/" + id)
            .then((res) => {
                console.log(res.data)
                setTitle(res.data.title)
                setPrice(res.data.Price)
                setdescription(res.data.description)
            }).catch((err) => {
                console.log(err)
            })
    }, [])
    const UpdateHandler = (e) => {
        e.preventDefault()
        axios.patch("http://localhost:3000/api/products/update/" + id, {
            title,
            Price,
            description,
        })
            .then((res) => {
                console.log("✅✅✅✅✅")
                nav("/products")
            })
            .catch((err) => {
                console.log(err)
            })
    }




    return (
        <>
            <h3> Update Product</h3>
            <form onSubmit={UpdateHandler}>

                title :
                <input value={title} type="text" onChange={(e) => { setTitle(e.target.value) }} />
                <br />
                price :
                <input value={Price} type="number" onChange={(e) => { setPrice(e.target.value) }} />
                <br />
                Description :
                <input value={description} type="text" onChange={(e) => { setdescription(e.target.value) }} />
                <br />


                <br />
                <button>Update Product</button>


            </form>


        </>
    )
}

export default UpdateProduct