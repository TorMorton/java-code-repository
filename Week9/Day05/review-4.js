

















// myNums[0] = 0;
// console.log(myOtherNums[0]);
// myNums[0] = 1;

// this spreads out the contents of myNums and adds them into myOtherNums -- they are now completely independent
myOtherNums = [...myNums];

myNums[0] = 0;
// console.log(myOtherNums[0]);

// Rest Operator

function assembleNumbers(num1, num2, ...restOfNums) {
    console.log(num1);
    console.log(num2);
    console.log(restOfNums);
}

// rest operator creates an array, even if no parameters are passed into it (an empty array, in that case)
assembleNumbers();

// but all parameters after the individually-defined ones are smashed into the rest array
assembleNumbers(1, 2, 3, 4, 5);

// destructuring an object into variables holding its properties' values

const myOrder = {
    customerName: 'Jon',
    food: 'Pulled Pork Sandwich',
    drink: "Boddington's Pub Ale",
    ingredients: [
        {
            name: 'Pulled Pork',
            subIngredients: [
                {
                    subIngredientName: 'Vinegar',
                    cost: 3.95
                }
            ]
        }
    ]
}

// this creates three const variable at this scope with the values from the object
// the variable names for object destructuring MUSt match the object properties in order to grab the values
const { customerName, food, drink } = myOrder;

console.log(customerName);
console.log(food);
console.log(drink);

const { name, cost } = myOrder.ingredients[0].subIngredients[0];

console.log(subIngredientName);
console.log(cost);

// destructuring on parameter intake
// the object taken in as a parameter is broken out into its properties, which can be then accessed directly
function orderDetails({customerName, food, drink}) {
    console.log(customerName);
    console.log(food);
    console.log(drink);
}

orderDetails(myOrder);

// destructuring an array
const myLetters = [ 'A', 'B', 'C', 'D', 'E'];
