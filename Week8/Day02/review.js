// REVIEW

// global varuable
var varVariable = "Hi"
// standard variable we can change
let letVariable = 234
//
const constVariable = true


// data types
/**
 * Number
 * String
 * Boolean
 * Null
 * Undefined
 * BigInt
 * Symbol
 * 
 * Object
 * Array (still actually an object)
 * 
 */

// arrays can include ANY types in any order -- clear difference from Java
let myArray = [ 'Biff', 123, true, null, undefined, 990n, Symbol('key'), {name: 'Lois'}, [123, 456, 789] ];

let my2DArray = [ [1, 2, 3], [4, 5, 6], [7, 8, 9] ];

console.log(my2DArray[1][2]);

// objects
let myObject = {
    name: 'My Name',
    age: 123,
    favoriteSongs: ['Albuquerque', 'Mr. Bojangles'],
    favoriteColors: ['Black', 'Forest Green'],
    favoritePerson: {
        name: 'Ambrose Burnsides',
        alive: false
    }
}

// three ways to print to the console
// remember the semicolons are optional, if each line of code is on its own line
console.log(myObject.favoriteSongs[1] + ' ' + myObject.favoritePerson.alive)
console.log(myObject.favoriteSongs[1], myObject.favoritePerson.alive)
console.log(`My second favorite song is "${myObject.favoriteSongs[1]}," and is AB alive? ${myObject.favoritePerson.alive}`)
console.log('First...'); console.log('... and second.') // can separate on the same line with a semicolon

// creating a function
// no return type, no typing of parameters
function myFunction(x, y, z) {
    // var aaa gets hoisted to the top, no matter how buried it is, prints undefined here because it is not yet initialized
    if (true) {
        if (true) {
            if (true) {
                while (true) {
                    // this creates a function-scoped (global for the function) variable
                    var aaa = 3;
                    break;;
                }
            }
        }
    }
    // still accessible throughout the function, even though the block in which it was created is gone
    console.log(aaa)
    // moral of the story, don't use var
}

myFunction();

function rectangleArea(height, width) {
    console.log(height * width);
}

rectangleArea(2, 6);
rectangleArea(4);
rectangleArea();
rectangleArea(undefined, 6);