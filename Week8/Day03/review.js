/**
 * Remember that JS distinguishes between things that are "iterable" and things that are "enumerable"
 * 
 * ITERABLE THINGS -- Array values,
 * 
 * ENUMERABLE THINGS -- Array indices, 
 */

// iterating through an array

let breakfastItems = [ 'Coffee','Bagel', 'Eggs', '2nd cup of coffee', 'noobz'];

for (let i = 0; i < breakfastItems.length; i++) {
    console.log(breakfastItems[i])
}

console.log();

// use "for of" to iterate
// this prints out the actual values
// accessing values instead of "keys"
for (let item of breakfastItems) {
    console.log(item)
}

// enumerate an array
// use "for in" to enumerate
// prints indices, not values
// accessing the "key" and not the "value"
for (let item in breakfastItems) {
    console.log(item)
} 

// creating an object to enumerate

const coffeeShop = {
    name: 'Raymond\'s Java Shack',
    hours: '24/7',
    brands: [ 'Ray Supreme', 'Ray Mid-Grade', 'Ray Bottom-Shelf'],
    menu: [ 'Americano', 'Redeye', 'Latte', 'Frappucino', 'Mocha', 'Flat White', 'Black Coffee', 'Hot Chocolate'],
    baristas: [
        {
            name: 'Victoria Morton',
            age: '24',
            specialty: 'Black Coffee'
        },
        {
            name: 'Dylan Howard',
            age: '25',
            specialty: 'Hot Chocolate'
        }
    ]
}

console.log(coffeeShop);

console.log();

for (let property in coffeeShop) {
    console.log(`Key = ${property} --------------- Value = ${coffeeShop[property]}`);
}

console.log();

// grabbing properties of objects within an array within our object

// outer loop uses "for of" to access the objects within the baristas array
for (let barista of coffeeShop.baristas) {
    // inner loop uses "for in" to access the property keys within each object
    for (let property in barista) {
        // print statements uses the property keys to print them and to access the property values
        console.log(`Key = ${property} --------------- Value = ${barista[property]}`);
    }
}


const deepObject = {
    name: [ 'Doug', {
        middleNames: [ 'The', 'Supreme', 'Chancellor', {
            territories: [ 'North Galaxy', 'West Galaxy', 'Brooklyn']
        } ]
    }]
}

console.log(deepObject.name[1]. middleNames[3].territories[2]);