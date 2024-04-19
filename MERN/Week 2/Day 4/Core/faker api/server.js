const express = require("express");
const app = express();
const port = 8000;

const {faker} = require('@faker-js/faker');


app.get("/api/users/new", (req, res) => {
    const newUser = {
        name: faker.person.firstName(),
        email: faker.internet.email(),
        password: faker.internet.password(),
    };
    console.log(newUser);
    res.json(newUser);
});


app.get("/api/companies/new", (req, res) => {
    const newCompany = {
        name: faker.company.name(),
        id: faker.database.mongodbObjectId(),
        location: faker.location.city(),
    };
    res.json(newCompany);
});


app.get("/api/user/company", (req, res) => {
    const newUser = {
        name: faker.person.firstName(),
        email: faker.internet.email(),
        password: faker.internet.password(),
    };

    const newCompany = {
        name: faker.company.name(),
        id: faker.database.mongodbObjectId(),
        location: faker.location.city(),
    };

    const data = {
        user: newUser,
        company: newCompany
    };

    res.json(data);
});


app.listen(port, () => {
    console.log(`Server is running on port ${port}`);
});




















