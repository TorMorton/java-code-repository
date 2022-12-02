// "CLASSES" in JavaScript

/**
 * Very important to remember that there are no classes in JavaScript
 * - This is just another syntax abstraction for constructor functions
 * - still a constructor function "under the hood"
 * - BUT, looks even more like Java syntax to make things (possibly) more readable/easier to parse between languages
 */

class Dinosaur {

    // set up some properties
    // for regular properties, just state the variable name
    name;
    // to specify a property as "private", use the #
    #diet;
    numberOfLegs;
    flying;

    // creating properties that belong to the class (function) and not an instance
    static EXTINCT = true;

    // creating a constructor
    constructor(name, diet, numberOfLegs, flying) {
        this.name = name;
        this.#diet = diet;
        this.numberOfLegs = numberOfLegs;
        this.flying = flying;
    }

    // getters/setters
    get name() {
        return this.name;
    }

    set name(name) {
        this.name = name;
    }

    get diet() {
        return this.#diet;
    }

    set diet(diet) {
        this.#diet = diet;
    }

    get numberOfLegs() {
        return this.numberOfLegs;
    }

    set numberOfLegs(numberOfLegs) {
        this.numberOfLegs = numberOfLegs;
    }

    get flying() {
        return this.flying;
    }

    set flying(flying) {
        this.flying = flying;
    }

    // custom methods
    snackTime() {
        let preference;
        if (this.#diet === 'Carnivore')
            preference = 'meat';
        else
            preference = 'lettuce';
        console.log(`Hi, my name is ${this.name}, and I am hungry for ${preference}!`);
    }

    // custom static method, belongs to class
    static declareExtinctionStatus() {
        console.log(`Am I extinct? ${this.EXTINCT}`);
    }


}

// creating a new Dinosaur using the constructor function
let tRex = new Dinosaur('Tyrannosaurus Rex', 'Carnivore', 2, false);
// does not show value for #diet because it is private
console.log(tRex);
// to access a property, use the standard syntax
// if there is a setter, it will use that
// if the proeprty is private, it will not be changeable without a setter
console.log(tRex.diet);
tRex.diet = 'Herbivore';
console.log(tRex.diet);

let raptor = new Dinosaur('Velociraptor', 'Carnivore', 2, false);
let duckbill = new Dinosaur('Iguanadon', 'Herbivore', 2, false);

console.log(raptor.name);

//Dinosaur.prototype.extinct = true;

//console.log(raptor.extinct);

tRex.snackTime();
duckbill.snackTime();

console.log(Dinosaur, EXTINCT);
// as before this would work in jave (though improper), but doesn't work here
// console.log(duckbill.EXTINCT);

Dinosaur.declareExtinctionStatus();


class Pterodactyl extends Dinosaur {
    // new properties
    beakLength;

    constructor(name, diet, numberOfLegs, flying, beakLength) {
        // pass along values to our Dinosaur constructor
        super(name, 'Carnivore', 2, true);
        // set new properties
        this.beakLength = beakLength;

    }

    // overriding snackTime() from Dinosaur
    snackTime() {
        console.log('Gimme dat fish.');
    }
}

let terry = new Pterodactyl('Terry', '20 inches');

console.log(terry);
console.log(terry.diet);
terry.snackTime();
tRex.snackTime();

// instance __proto__ equals class prototype
console.log(terry.__proto__ === Pterodactyl.prototype);

// what is the prototype of the prototype?
console.log(Pterodactyl.prototype.__proto__ === Dinosaur.prototype);