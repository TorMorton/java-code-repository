// this is a one line JavaScript comment

/**
 * This is a multi-line JavaScript comment
 * I can keep pressing enter...
 * and just keep going.
 */

/**
 * A brief history of JavaScript
 * 
 * JavaScript was written in 1995 by a guy names Brandon Eich
 * Famously, it was written in only 10 days
 * Was made specifically for the web browser
 * Originally was going to be called Mocha to link it with Java, which was popular at the time
 * Has many Java like features and syntax and can be considered "scripting version of Java"
 * The name Mocha still lives on as a JS library
 * 
 * JavaScript, as opposed to Java is NOT a strongly-typed language
 * -- you do not have to indicate what type of data a variable holds
 * -- you an reate a variable without a type and store whatever type you want in that variable, even as it's changing
 * -- this is clearly more flexible
 * -- but you can run into issues with not knowing what kind of data is inside a variable
 * -- "number" holds all (most) numbers, no casting from int to short, etc
 * 
 * Java andd JS are similar, but definitely not the same
 * 
 * JS is NOT compiled
 * -- it's read from top to bottom
 * -- we have to be careful with variable and function declaration
 * -- function is what we call methods in JS
 * 
 */
// console.log() is the equivalent commandd to System.out.println() for JS

console.log("Hello, World!");
console.log("Hello, World")

/**
 * In JS, single and double quotes are interchangeable
 * -- so, we can enclose a string in either one
 * 
 * Another thing is that the semi-colon is optional, if the next command is on the next line
 * -- two commands on the SAME line must be separated by a semi-colon
 */

// Creating a function

/**
 * keyword function creates a function
 * -- you do not specify a return type
 * -- you also do not specify an access modifier
 * -- same naming convention as Java, same structure as Java
 * 
 */

function helloWorld(name, age) {
    // can concatenate strings just like in java
    console.log("Hello, World! My name is " + name + ".")
    // separating items with commas concatenates them and adds a spcae in between each one
    console.log("Hello, World! My name is", name, ".")
    // using a template string with backticks
    console.log(`Hello, World! My name is ${name}.`);
}

helloWorld("Tor", 24);
// if I don't give a variable a value, it is considered "undefined"
// different from "null", and means that a variable has been given any value
helloWorld('Jon');
helloWorld();
