function Elephant(variety, age, height) {
    this.variety = variety;
    this.age = age;
    this.height = height;
    this.speak = () => console.log('Toot');
}

let elephant = new Elephant('African', 55, '30 Hands');

elephant.speak();

elephant.__proto__.color = 'Gray';
console.log(elephant.color);

// this creates a "static" property on the Elephant function itself
// if I change it later, it changes for all Elephants
// it "belongs" fully to the function, not an instance
Elephant.hasTusks = true;

// this does not change the static property, it creates a new property on the instance
elephant.hasTusks = false;
console.log(Elephant.hasTusks);

// proper notation for static properties
Elephant.HAS_TUSKS = true;

// creating a static function (method)
Elephant.dance = () => {
    console.log("Doin' the circus boogie")
}

