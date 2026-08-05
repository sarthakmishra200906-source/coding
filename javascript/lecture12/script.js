function sum(a, b) {
    console.log(a + b);
}
function subtract(a, b) {
    console.log(a - b);
}
function calculator(a, b, operation) {//what is this line doing? It is defining a function called calculator that takes three parameters: a, b, and operation.
    operation(a, b);//what is this line doing? It is calling the function that is passed as an argument to calculator, and passing a and b to it.
}
calculator(5,10,sum);
calculator(5,10,subtract);
