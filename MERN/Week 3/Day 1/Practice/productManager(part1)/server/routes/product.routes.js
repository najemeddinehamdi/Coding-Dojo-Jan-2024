const productControllers = require("../controllers/product.controllers")


module.exports = (app) => {
    //? =========== READ ALL ==========
    app.get("/api/products", productControllers.Allproducts);
    //? =========== CREATE ==========
    app.post("/api/product/create", productControllers.Createproduct);
    // //? =========== READ ONE ==========
    app.get('/api/product/:id', productControllers.findOneSingleproduct);
    // //? =========== UPDATE ==========
    app.patch('/api/products/update/:id', productControllers.updateExistingproduct);        
    // //? =========== DELETE ==========
    app.delete('/api/product/:id', productControllers.deleteAnExistingproduct);
    

}