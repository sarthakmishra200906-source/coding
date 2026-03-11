// for of loop 
 let str = "sarthakmishra";
 let size=0;
 for (let i of str) {
     console.log("i = ", i);
     size++;
 }
 console.log(size);
//for in loop
let student ={
name :"sarthak",
age: 20,
cgpa:8.2,
ispass:true
};
for(let key in student){
    console.log("key=",key,"value=",student[key]);
}