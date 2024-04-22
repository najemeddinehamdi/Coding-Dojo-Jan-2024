const express = require("express")
const app = express()

app.use(express.json(), express.urlencoded({ extended: true }));


require("dotenv").config()

require("./Config/mongoose.config")
const PORT = process.env.PORT

const AllJokesRoutes = require("./routes/joke.routes")
AllJokesRoutes(app)

app.listen(PORT, () => {
    console.log(`Connecting to our server with success to this PORT : ${PORT}  🌴🌴🌴🌴`)
})