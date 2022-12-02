// PROMISES, ASYNC and AWAIT

/**
 * What is a promise?
 * 
 * Functionallym it is a promise to return with some data and a statement of success
 * 
 * Literally, it is a special kind of object with some data and aa status
 * 
 * Promise States
 * -- pending
 * -- fulfilled
 * -- rejected
 * 
 * We can manually create and return promises
 * Also, async (asynchronous) functions ALWAYS return promises
 * 
 */

const myPromise = new Promise((resolve, reject) => {
    if (true)
        resolve('Fulfilled');
    reject('Rejected');
})

function createPromise(input) {
    return new Promise((resolve, reject) => {
        if (typeof input == 'number')
            resolve('Fulfilled');
        reject('Rejected')
    })
}

createPromise('123');

createPromise(123)
    .then(data => {
        console.log(data);
        if(data[0] === 'F')
            return 'Starts with F'; // returns a fulfilled promise
        throw 'WRONG LETTER'; // returns a rejected promise
    })
    .then(data => {
        if (data.length > 20)
            throw 'TOO LONG';
        return 'Short enough'
    })
    .then(data => console.log(data))
    .catch(error => console.log(error));

// Promise.resolve and Promise.reject

function resolution() {
    return Promise.resolve('Resolved');
}

function rejection() {
    return Promise.reject('Rejected');
}

// setTimeout(() => console.log(resolution().catch(error => {})), 0);

// ASYNC and AWAIT

// an async function always returns a promise
// inside an async function, we can use the await keyword to force our code to wait for another async to complete before moving on

async function myAsyncFunction() {
    console.log();
}

const myOtherAsyncFunction = async (data1, data2) => {
    console.log();
}

// can only use the await keyword inside an async function
// this does not work

//function test() {
//    await myAsyncFunction();
//}

async function sketchyPromise() {
    return new Promise((resolve) => {
        setTimeout(() => {
            if (Math.random() > .5)
                resolve('Waiting Period Over!');
            reject('You chose....poorly');
        }, 3000);
    })
}

//async function weLoveWaiting() {
//    console.log('Read to wait...'); // this happens right away
//    console.log(await waitForPromise()); // this starts but won't let the next line happen until it's done -- awaait
//    console.log('Done waiting'); // this only happens after the await function is complete
//}

//weLoveWaiting();

// try/catch instead of .then/.catch

async function tryCatch() {
    console.log('Starting try/catch...')
    try {
        // this block can include multiple (different) await operations on async functions
        console.log('Inside try block...');
        console.log(await sketchyPromise());
    } catch (error) {
        // all rejected promises from any async operation will be caught here
        console.log('Inside catch block...');
    }
    console.log('All done');
}

tryCatch();
