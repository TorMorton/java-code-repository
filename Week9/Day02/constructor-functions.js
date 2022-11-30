/**
 * Before ES6 (2015), there was no real support in JS for Java-like OOP syntax
 * There was SOME support for traditional inheritance via prototypical inheritance
 * 
 * In JS, there's no such thing as a calss (OOP sense)
 * 
 */

function Hyena() {
    console.log('Hee-hee!')
}
// calling it normally
Hyena();

// even with a variable assignment, we're just calling it normally
let myHyena = Hyena();

// nothing returned, so prints as undefined
console.log(myHyena);

// this makes our function into a "class" abnd our variable into an "instance" of the "class"
myHyena = new Hyena();

// now this prints the instance object
console.log(myHyena);

console.log();

function BetterHyena(name, evil, numberOfTeeth) {
    this.name = name;
    this.evil = evil;
    this.numberOfTeeth = numberOfTeeth;
}

let betterHyena1 = new BetterHyena('Shenzi', true, 40);

console.log(betterHyena1);

let betterHyena2 = new BetterHyena('Banzai', true, 36);
let betterHyena3 = new BetterHyena('Ed', false, 20);

console.log(betterHyena2);
console.log(betterHyena3);

console.log(betterHyena2.evil);
betterHyena2.evil = false;
console.log(betterHyena2);

// PROTOTYPES IN JAVASCRIPT
/**
 * Javascript uses prototypiccal inheritance
 * 
 * Functions that create instances have a prototype (an object)
 * -- NameOfFunction.prototype
 * -- any key on the prototype object can be considered like an instance field in Java
 */









// the constructor function's prototype is the same as the isntance's __proto__
console.log(BetterHyena.prototype === betterHyena1.__proto__);

// printing the prototype doesn't help much
console.log(BetterHyena.prototype);

// adding an instance method to the prototype makes it available for ALL instances, even those already created
BetterHyena.prototype.laugh = () => console.log('Bwa ha ha');

// calling my new isntance method
betterHyena1.laugh();
betterHyena2.laugh();
betterHyena3.laugh();

// adding a property to all instances
BetterHyena.prototype.funny = true;

// printing our properties to see the ones that's been added for a specific instance