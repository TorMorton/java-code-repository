// CALLBACK BASICS

/**
 * A callback is a function that doesn't execute immediately but instead goe off into the event loop to be dealt with later
 */

function sayHello() {
    console.log('Hello');
}

function sayHi() {
    console.log('Hi');
}

//setTimeout(sayHello, 2000);

//setInterval(sayHi, 1000);

// this tiemout even though it has a 0 delay time gets sent into the event loop for callbacks/async operations
// the vent loop has lower priority than inline code
setTimeout(sayHello, 0);

console.log("I'm waiting...");

// if i do this, the callback never returns because it is permanently deprioritized
// while(true) {
//
// }