//How do we know we need a loop here?
//We know we need a loop because a repetitive action is taking place (running miles)
//What's the starting point of the loop?
//the starting point is "0"
//When should the loop stop?
//the loop should stop on "6"
//How will the loop know when to stop?
//We will know when to stop when we have run 6 mile
//What's incrementing for each iteration of the loop?
//Miles is incrementing by one each iteration
//What variables do we need?
//variables "miles"
for(var miles=0; miles<=6;miles++){
    if(miles%2 == 0){
        if(miles !== 0){
            console.log("we are on mile=" + miles);
            console.log("here is a candy");
        }
    }
}