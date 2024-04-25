const {author} =require("../models/author.model")

module.exports.findAll=(req,res) =>{
    author.find({})
    .then(obj=> res.json(obj))
    .catch(err=> res.json(err))
}

module.exports.create=(req,res) =>{
    author.create(req.body)
    .then((obj)=>res.json(obj))
    .catch((err)=>{
        res.status(400).json(err)
    })
}

module.exports.update= (req, res) => {
    author.findOneAndUpdate({ _id: req.params.id }, req.body, { new: true, runValidators: true })
    .then((obj)=>res.json(obj))
    .catch((err)=>{
        res.status(400).json(err)
    })
}

module.exports.getOne= (req, res) => {
    author.findOne({ _id: req.params.id })
    .then((obj)=>res.json(obj))
    .catch(err=> res.json(err))
}

module.exports.delete= (req, res) => {
    author.deleteOne({ _id: req.params.id })
    .then((obj)=>res.json(obj))
    .catch(err=> res.json(err))
}