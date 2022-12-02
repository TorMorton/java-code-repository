// SEAN'S PIZZA PLACE (TM)

/**
 * We want to be able to take an order and validate it
 * We want to be able to prep the order
 * We want to be able to box up the order
 * We want to be able to deliver the order
 */

const myOrder = {
    name: 'Tor Morton',
    cardNumber: '5555-5555-5555-5555',
    address: '123 Wallaby Way, Sydney',
    orderDetails: [ 'Pineapple Pizza(with implied ham', '10 Buffalo Wings', 'Dr. Pepper', 'Twix Brownies' ]
}

const placeOrder = ({ name, cardNumber, address, orderDetails}) => {

    if (name == null || cardNumber.length !== 19 || address == null || orderDetails == null || orderDetails.length === 0)
        return Promise.reject('This is not a valid order.'); // this wraps whatever data into a new Promise
    return Promise.resolve(`Thank you, ${name}, your order has been placed!`);
}

// function for preparing the order
const prepOrder = (orderDetails) => {
    for (let item of orderDetails) {
        console.log(`Now making: ${item}`);
    }
}

// function for boxing up the order
const boxOrder = (orderDetails) => {
    let numberOfAvailableBoxes = 4;
    if (orderDetails.length > numberOfAvailableBoxes)
        return Promise.reject("We don't have enough boxes on hand. Sorry!")
    return Promise.resolve(`Order boxes! ${numberOfAvailableBoxes} remaining.`)
}

console.log(placeOrder(myOrder)
    .then(() => prepOrder(myOrder.orderDetails)) // this neither resolves nor rejects the promise, just passes it on
    )