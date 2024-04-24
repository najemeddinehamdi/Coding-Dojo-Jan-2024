import React, { useEffect, useState } from 'react'
import axios from "axios"
import { Link } from 'react-router-dom'

const Main = () => {

    const [Product, setAllProducts] = useState([])

    useEffect(() => {
        axios.get("http://localhost:3000/api/Products")
            .then((res) => {
                setAllProducts(res.data)

                console.log(Product)

            }).catch(err => {
                console.log(err)
            })
    }, [])
    // console.log(Product)

    const deleteProduct = (productID) => {
        axios.delete("http://localhost:3000/api/Product/" + productID)
            .then((res) => {
                console.log(Product)
                const Filteredproduct = Product.filter((oneProduct) => {
                    return oneProduct._id !== productID
                })
                setAllProducts(Filteredproduct)

            }).catch(err => {
                console.log(err)
            })
    }

    return (
        <div>
            <h3>All Product</h3>
            {/* {JSON.stringify(Product)} */}
            {
                Product.map((oneProduct) => {
                    return (
                        <div key={oneProduct._id}>
                            <Link to={"/Product/" + oneProduct._id}>
                                <h4>{oneProduct.title}</h4>
                            </Link>
                            <Link to={`/Product/${oneProduct._id}/update`}>Update</Link>
                            <button onClick={() => { deleteProduct(oneProduct._id) }}>Delete</button>
                        </div>
                    )
                })
            }

        </div>
    )
}

export default Main