function alwaysHungry(arr) {
    for(var i=0;i<arr.length;i++){
        if (arr[i] === "food"){
            console.log("yummy");
        }
        else
        console.log("I'm hungry")
    }   
}

alwaysHungry([3.14, "food", "pie", true, "food"]);
// this should console log "yummy", "yummy"
alwaysHungry([4, 1, 5, 7, 2]);
// this should console log "I'm hungry"


//high pass filter
function highPass(arr, cutoff) {
    var filteredArr = arr.filter(function(item) {
        return item > cutoff;
    });
    return filteredArr;
}

var result = highPass([6, 8, 3, 10, -2, 5, 9], 5);
console.log(result);// we expect back [6, 8, 10, 9]


//better than average
function betterThanAverage(arr) {
    var sum = 0;
    for (var i = 0; i < arr.length; i++) {
        sum += arr[i];
    }
    
    var average = sum / arr.length;

    var count = 0;
    for (var i = 0; i < arr.length; i++) {
        if (arr[i] > average) {
            count++;
        }
    }

    return count;
}

var result = betterThanAverage([6, 8, 3, 10, -2, 5, 9]);
console.log(result); 



//array revese
function reverse(arr) {
    var reversedArr = [];
    for (var i = arr.length - 1; i >= 0; i--) {
        reversedArr.push(arr[i]);
    }
    return reversedArr;
}

var result = reverse(["a", "b", "c", "d", "e"]);
console.log(result);  // we expect back ["e", "d", "c", "b", "a"]



//fibonacci array
function fibonacciArray(n) {
    var fibArr = [0, 1];
    
    for (var i = 2; i < n; i++) {
        var nextFib = fibArr[i - 1] + fibArr[i - 2];
        
        fibArr.push(nextFib);
    }
    
    return fibArr;
}

var result = fibonacciArray(10);
console.log(result); // we expect back [0, 1, 1, 2, 3, 5, 8, 13, 21, 34]


