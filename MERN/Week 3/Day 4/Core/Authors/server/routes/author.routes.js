const authorControllers = require("../controllers/author.controller")


module.exports = (app) => {
        //? =========== READ ALL ==========
        app.get("/api/author", authorControllers.findAll);
        //? =========== CREATE ==========
        app.post("/api/author/new", authorControllers.create);
        //? =========== READ ONE ==========
        app.get('/api/author/:id', authorControllers.getOne);
        //? =========== UPDATE ==========
        app.patch('/api/author/:id', authorControllers.update);        
        //? =========== DELETE ==========
        app.delete('/api/author/:id', authorControllers.delete);
}