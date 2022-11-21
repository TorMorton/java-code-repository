// DECLARE AND INITIALIZE YOUR VARIABLES BEFORE YOU USE THEM

/**
 * Three scopes in JS
 * 
 * Global scope -- accessible anywhere within the file
 * Function scope -- accessible anywhere within a function
 * Block scope -- accessible anywhere within a code block, i.e. {}
 * 
 */

// Global scoped variable

// In 2022, we generally say DO NOT USE VAR!!

// variable declaration, do not designate a type
globale = "global";
// can redefine a variable with any type we wish
global = 56;
global = true;

// with var, we can redeclare the same variable
// can't do this in Java

console.log(global);
var global = "still global";
console.log(global);

// function-scoped variable
function functionScope() {
    var global = 78;
    console.log(global);
}

functionScope();
console.log(global);

/**
 *  DOWNSIDES TO USING VAR
 * 
 * 1. Function/global-scoping leads to some strange and unpredictable interactions
 * 2. The idea of redeclaring a variable doesn't exist in other languages, so it's a little weird
 * 
 */

/**
 * WHAT ARE THE ALTERNATIVES?
 * 
 * let
 * -- let is similar to var in that I CAN redefine the variable's value
 * -- let x = 10; x = "Joe", x = true;
 * -- I can not redeclare the variable
 * -- let x = 10; let x = 11; not allowed
 * 
 * const
 * -- const is similar to final in Java
 * -- once I intialize the value, I cannot change ti
 * -- if the value is an Object, I can change its properties
 */

let firstName = "Susan";
console.log(firstName);
//cannot redeclare with let
// let firstName = Michelle
firstName = "Michelle";
console.log(firstName);
firstName = false;
console.log(firstName);

console.log();

const lastName = "McTevish";
console.log(lastName);
// cannot redeclare
// const lastName = "Brown"
// cannot give a new value either
// lastName = "Brown";

const newPerson = {
    firstName: "Larry",
    lastName: "David",
    age: 73,
    temperament: "cantankerous"
}

console.log(newPerson);

//newPerson = {
//   firstName: "Jerry",
//   lastName: "Seinfeld"
//}

newPerson.firstName = "Jerry";
newPerson.lastName = "Seinfeld";

console.log(newPerson);

console.log();

// Hoisting and its issues

function hoistingTestVar() {
    // the declaration of x is "hoisted" to the top of the scope (function) but is not intialized with a value
    console.log(x);
    var x = 10;
    console.log(x);
}

hoistingTestVar();

console.log();

function hoistingTestLet() {
    // the declaration of x is "hoisted" to the top of the scope (function) but is not intialized with a value
    //console.log(x);
    let x = 11;
    console.log(x);
}

hoistingTestLet();

console.log();

// various scopes
function scopes () {
    let y = 10;
    console.log("Inside functions, before block: " + y);
    if (true) {
        let y = 30;
        console.log("Inside block: " + y);
    }
    console.log("Inside function, after block: " + y);
}

scopes();

console.log("After function: " + y);
