// for of loop 
let str = "sarthakmishra";
let size = 0;
for (let i of str) {
    console.log("i = ", i);
    size++;
}
console.log(size);
//for in loop
let student = {
    name: "sarthak",
    age: 20,
    cgpa: 8.2,
    ispass: true
};
for (let key in student) {
    console.log("key=", key, "value=", student[key]);
}
console.log(str);
console.log(str[0]);
//template litrall
let specialstring = `this is a template litral`;
console.log(specialstring);
//application
let obj = {
    item: "pen",
    price: 10,
};
let output = `the cost of ${obj.item} is ${obj.price} rupees`;
console.log(output);
console.log("the cost of", obj.item, "is", obj.price, "rupees");