/**
 * OBJECTS IN JAVASCRIPT
 * 
 * Objects in JS are a little more lightweight than in Java, BUT they are a bit more flexible
 * 
 * We create an object using the curly braces -- {}
 * -- within the object we have properties listed out in key/value pairs
 * -- can think of this like a little internal HashMap of sorts
 * 
 * Syntax:
 *  {
 *      key: value,
 *      otherKey: otherValue
 * }
 * 
 * Commas are required between key/value pairs, but not after the last one
 */

const artist = {
    name: "Mozart",
    genre: 'Classical',
    birthYear: 1756,
    alive: false
}

console.log();

console.log(artist);

console.log();

// cannot do this, because artist is a const
//artist = {};

artist.name = "Wolfgang Amadeus Mozart";

console.log(artist);

console.log(artist.parents);

artist.wigSize = "X-Large";
console.log(artist);

const artistRevised = {
    name: {
        first: 'Wolfgang',
        middle: 'Amadeus',
        last: 'Mozart'
    },
    genre: 'Classical',
    birthYear: 1756,
    alive: false,
    greatWorks: ['Fantasia', 'The Marriage of Figaro', 'Requiem', 'The Magic Flute']
}

console.log(artistRevised);
// can access sub-object proeprties using the . syntax
console.log(artistRevised.name.first);
console.log(artistRevised.greatWorks[3]);