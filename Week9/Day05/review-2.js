// CLASS NOTATION

/**
 * There are no actual classes in JavaScript
 * A "class" is just a suped-up constructor function
 */

// create a class using the class keyword
class Animal {

    // declare some properties
    name; // standard property, we just declare the name
    #vertebrate; // private property, we declare the name with a # before it, still can get/set, does not enumerate

    // constructor
    // use the constructor keyword
    // we can only have one constructor in JavaScript because overloading is not allowed
    constructor(name, vertebrate) {
        this.name = name;
        this.vertebrate = vertebrate;
    }

    // getters/setters
    get name() {
        return this.name;
    }

    set name(name) {
        this.name = name;
    }

    get vertebrate() {
        return this.#vertebrate;
    }

    set vertebrate(vertebrate) {
        this.#vertebrate = vertebrate;
    }

    // custom methods
    speak() {
        console.log(`Hi, my name is ${name}, and I am ${(this.#vertebrate) ? '' : 'not'}a vertebrate.`);
    }

    // static method that belongs to the Animal class
    static evolve() {
        console.log('From a bacterium I came...');
    }

}

// creating a new Animal
const animal1 = new Animal('Bipples', true);

console.log(animal1);
console.log(animal1.vertebrate); // this uses the getter method with the same syntax as regular variable access
animal1.vertebrate = false; // this uses the setter method with the same syntax as regular variable assignment
console.log(animal1.vertebrate);
animal1.speak();

// creating a new Mammal
const mammal1 = new Mammal('Kanga', true, true);
// this uses the overridden version of the speak() method
mammal1.speak();
console.log(mammal1.name);

console.log(mammal1.__proto__ === Mammal.prototype);
console.log(mammal1.__proto__.__proto__ === Animal.prototype);

console.log(Animal.ALIVE);
Animal.evolve(); // calling a static method


class Mammal extends Animal {


}

class Dog extends Mammal {

}

class Pug extends Dog {

}

//console.log(Pug.prototype.__proto__ === )