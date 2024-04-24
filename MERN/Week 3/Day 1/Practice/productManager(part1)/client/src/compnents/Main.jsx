import React, { useEffect, useState } from 'react'
import axios from "axios"
import { Link } from 'react-router-dom'

const Main = () => {

    const [Product, setAllProducts] = useState([])

    useEffect(() => {
    axios.get("http://localhost:3000/api/Products")
        .then((res) => {
            setAllProducts(res.data);
            console.log(Product); // Log the updated state after setting the products
        })
        .catch(err => {
            console.log(err);
        });
}, []);
    const deleteProduct = (productID) => {
        axios.delete("http://localhost:3000/api/Product/" + productID)
            .then((res) => {
                const filteredProducts = Product.filter((oneProduct) => oneProduct._id !== productID);
                setAllProducts(filteredProducts);
            })
            .catch(err => {
                console.log(err);
            });
    };
    

    return (
        <div>
            <h3>All Product</h3>

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
    )}


export default Main