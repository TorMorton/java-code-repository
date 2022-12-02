// NULLISH COALESCING OPERATOR

// this returns the first value if it is not null or undefined -- it CAN be falsy
const myValue = 0 ?? 45;  

// if I did this -- const myValue = 0|| 45; -- it would return the second parameter, because the first is falsy

console.log(myValue);

// OBJECT PROPERTY PERMISSIONS
// you may want to restrict whether a particular property of your object is visible, writable or configurable

const myObject = {
    name: 'Yolanda',
    age: 12,
    favoritePasttime: 'Mischeif'
}

// enumerable
Object.defineProperty(myObject, favoritePasttime, {enumerable: false});
console.log(myObject);