/**
 * In JS, there IS NO function overloading
 * 
 * BUT, we can sort of quasi-overload a function using default parameters and having parameters depend on one another
 */

function sum(a = 2, b = 3) {
    console.log(a);
    console.log(b);
    return a + b;
}

// here, both default values are used
console.log(sum());
// here, 6 goes in as a (the first parameter), and the default value is used for b (the second parameter)
console.log(sum(6));
// here, hboth my parameters are assigned new values
console.log(sum(10, 20));
// what if I feed in undefined
console.log(sum(undefined, 6));


// let's create a function for rectangular area
// height times width

// in our input parameters, we set the second to equal th first, in the case where we want to find the area of a square
function area(height, width = height) {
    return height * width;
}