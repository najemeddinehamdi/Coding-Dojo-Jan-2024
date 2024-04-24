const productControllers = require("../controllers/product.controllers")


module.exports = (app) => {
    //? =========== READ ALL ==========
    app.get("/api/products", productControllers.Allproducts);
    //? =========== CREATE ==========
    app.post("/api/product/create", productControllers.Createproduct);
    // //? =========== READ ONE ==========
    // app.get('/api/products/:id', productControllers);
    // //? =========== UPDATE ==========
    // app.patch('/api/products/:id', productControllers);        
    // //? =========== DELETE ==========
    // app.delete('/api/products/:id', productControllers);
    

}