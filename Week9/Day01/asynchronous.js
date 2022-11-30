// Asynchronous operations

// in JS, we have the event loop, to be dealt with later
// BUT we may want things to happen after certain amounts of time or at certain intervals

// We can use setTimeout and setInterval for these

// setTimeout takes two parameters -- a function to execute and a time delay in milliseconds
// setInterval is the same, but the function will execure EVERY (time amount) 

console.log('First action');

setTimeout(() => {
    console.log('Second action');
}, 2000); // 2000ms = 2s

// this is SENT third but happens before the second's time out elapses
console.log('Third action');

let myIntervale = setInterval(() => {
    console.log('Fourth action')
    console.log(x);
}, 1000);


// using setTimeout to break the interval after a certain number of iterations
// for (let i =0; i < 5; i++) {
//      setTimeout(() => {
//      console.log 
//})
//}

// clearing the interval we set earlier after 5 seconds
setTimeout(() => {
    clearInterval(myInterval);
}, 5000);