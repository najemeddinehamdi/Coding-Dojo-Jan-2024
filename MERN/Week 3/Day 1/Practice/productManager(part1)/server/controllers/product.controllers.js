const product = require("../models/product.model")



module.exports = {
        //? =========== READ ALL ==========
        Allproducts: (req,res) => {
            // db.products.find()
            product.find()
                .then((allproducts) => {
                    console.log(allproducts)
                    res.json(allproducts)
            
                }).catch((err) => {
                    console.log(err)
                    res.status(400).json()
            })
    },
        //? =========== READ ONE ==========
    findOneSingleproduct : (req, res) => {
        product.findOne({ _id: req.params.id })
            .then(oneSingleproduct => {
                res.json(oneSingleproduct);
            })
            .catch((err) => {
                res.json(err);
            });
    },
        //? =========== CREATE ==========
        Createproduct : (req, res) => {
        product.create(req.body)
        .then((Createdproduct) => {
                    console.log(Createdproduct)
                    res.status(200).json(Createdproduct)
                }).catch((err) => {
                res.status(400).json(err)
            })
        },
            //? =========== UPDATE ==========
        updateExistingproduct : (req, res) => {
            product.findOneAndUpdate({ _id: req.params.id }, req.body, { new: true, runValidators: true })
                .then(updatedproduct => {
                    res.json(updatedproduct);
                })
                .catch((err) => {
                    res.json(err);
                });
        },

        //? =========== DELETE ==========
        deleteAnExistingproduct : (req, res) => {
            product.deleteOne({ _id: req.params.id })
                .then(result => {
                    res.json(result);
                })
                .catch((err) => {
                    res.json(err);
                });
        }

}