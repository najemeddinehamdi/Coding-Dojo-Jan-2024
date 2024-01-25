//Predict 1: What will the console.log state when this function is called?
function myBirthYearFunc(){
    console.log("I was born in" + 1980);
}
myBirthYearFunc();
// 1. i was born in 1980
____________________________________________
//Predict 2: If we needed to send a birth year to the function, we would tell the function "hey, we're gonna send you a variable called birthYearInput." We do that by adding the parameter name into the parentheses. See below for an example.

// If this function is called with the argument 1980, what would the console.log state?
function myBirthYearFunc(birthYearInput){
    console.log("I was born in" + birthYearInput);
}
myBirthYearFunc(1980);
// 2. i was born in 1980
______________________________________________________
//Predict 3: Let's try it again. If var num1 = 10 and var num2 = 20, what would the various console.logs state?
function add(num1, num2){
    console.log("Summing Numbers!");
    console.log("num1 is: " + num1);
    console.log("num2 is: " + num2);
    var sum = num1 + num2;
    console.log(sum);
}
add(10, 20);
// 3. Summing Numbers! ,num1 is: 10, num12 is: 20; 30 .
