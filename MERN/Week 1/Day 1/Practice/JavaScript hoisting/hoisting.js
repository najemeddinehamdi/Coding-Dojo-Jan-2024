//! exp 1

console.log(example);
var example = "I'm the example!";  

// prediction   undefined
// output ==> undefined 


//! exp 2

var needle = 'haystack';
test();
function test(){
    var needle = 'magnet';
    console.log(needle);
}
// prediction   magnet
// output ==> magnet



//! exp 3

var brendan = 'super cool';
function print(){
    brendan = 'only okay';
    console.log(brendan);
}
console.log(brendan);

// prediction   super cool
// output ==> super cool


//! exp 4
var food = 'chicken';
console.log(food);
eat();
function eat(){
    food = 'half-chicken';
    console.log(food);
    var food = 'gone';
}
// prediction   chicken   half-chiken
// output ==> chicken   half-chiken


//! exp 5
mean();
console.log(food);
var mean = function() {
    food = "chicken";
    console.log(food);
    var food = "fish";
    console.log(food);
}
console.log(food);

//there is no function "mean"
//output : error


//! exp6
console.log(genre);
var genre = "disco";
rewind();
function rewind() {
    genre = "rock";
    console.log(genre);
    var genre = "r&b";
    console.log(genre);
}
console.log(genre);
// prediction   undefined  rock  r&b  disco 
// output ==> undefined  rock  r&b  disco 


//! exp 7
dojo = "san jose";
console.log(dojo);
learn();
function learn() {
    dojo = "seattle";
    console.log(dojo);
    var dojo = "burbank";
    console.log(dojo);
}
console.log(dojo);
// prediction san jose seattle burbank san jose
// output ==> san jose  seattle  burbank  san jose


//! exp 8
console.log(makeDojo("Chicago", 65));
console.log(makeDojo("Berkeley", 0));
function makeDojo(name, students){
    const dojo = {};
    dojo.name = name;
    dojo.students = students;
    if(dojo.students > 50){
        dojo.hiring = true;
    }
    else if(dojo.students <= 0){
        dojo = "closed for now";
    }
    return dojo;
}
// prediction  error :We can't reassign a value to a constant variable
// output ==> error :Assignment to constant variable.

