//create a function called pizzaOven that return a (pizza) object.
function pizzaOven(crustType,sauceType,cheeses,toppings){
    var pizza={};
    pizza.crustType=crustType;
    pizza.sauceType=sauceType;
    pizza.cheeses=cheeses;
    pizza.toppings=toppings;
    return pizza;
}
//create a pizza with : "deep dish", "traditional", ["mozzarella"],and["pepperoni","sausage"]

pizza={
    crustType:"deep dish",
    sauceType:"traditional",
    cheeses:["mozzarella"],
    toppings:["pepperoni","sausage"],
}
console.log(pizza);
//create a pizza with :"hand tossed","marinara",["mozzarella","feta"],and["mushrooms","olives","onions"]

pizza={
    crustType:"hand tossed",
    sauceType:"marinara",
    cheeses:["mozzarella","feta"],
    toppings:["mushrooms","olives","onions"],
}
console.log(pizza);

//create 2 more pizza with any toppings we like 
pizza1={
    curstType:"Crispy Delights",
    sauceType:"white sauce",
    cheeses:["cheddar","Aged Havarti"],
    toppings:["olives","potato"],
}
console.log(pizza1);

pizza2={
    curstType:" A Puffy and Toasty Crust",
    sauceType:"white sauce",
    cheeses:["cheddar","mozzarela"],
    toppings:["mustard","potato"],
}
console.log(pizza2);

//bonus challenge: create a function called randomPizza that uses Math.random() to create a random pizza.
var crustTypes = [
    "deep dish",
    "hand tossed",
    "thin and crispy",
    "cauliflower",
    "gluten free",
    "hawaiian bread"
];

var sauceTypes = [
    "traditional",
    "marinara",
    "bbq",
    "white sauce",
    "nacho cheese",
    "tikka masala"
];

var cheeses = [
    "mozzarella",
    "cheddar",
    "feta",
    "swiss cheese",
    "blue cheese",
    "goat cheese",
    "provolone",
    "parmesan",
    "vegan cheese"
];

var toppings = [
    "pepperoni",
    "sausage",
    "chicken",
    "corn",
    "olives",
    "bell peppers",
    "onions",
    "mushrooms",
    "anchovies"
];

function randomRange(max, min) {
    return Math.floor(Math.random() * max - min) + min;
}

function randomPick(arr) {
    var i = Math.floor(arr.length * Math.random());
    return arr[i];
}

function randomPizza() {
    var pizza = {};
    pizza.crustType = randomPick(crustTypes);
    pizza.sauceType = randomPick(sauceTypes);
    pizza.cheeses = [];
    pizza.toppings = [];
    for(var i=0; i<randomRange(5, 1); i++) {
        pizza.cheeses.push(randomPick(cheeses));
    }
    for(var i=0; i<randomRange(4, 0); i++) {
        pizza.toppings.push(randomPick(toppings));
    }
    return pizza;
}

console.log(randomPizza());