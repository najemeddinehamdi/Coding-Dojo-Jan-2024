const mongoose =require('mongoose')
const authorschema = new mongoose.Schema({
    name:{
        type:String,
        required: [true,"{PATH} is required"],
        minlength:[3, "{PATH} must have at least 3"]
    }
},{timestamps: true});

module.exports.author= mongoose.model("author", authorschema)