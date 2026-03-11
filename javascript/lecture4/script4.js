let mark =[38,89,34,54,45];
console.log(mark);
console.log(mark.length);
let arrs= ['saktiman', 'batman' ,'hulk' ]
for(let i= 0;i<arrs.length;i++){
    console.log(arrs[i]);
}
//aray method

arrs.push("spiderman","antman");
for(let arr of arrs){
   console.log(arr); 
}
let deleatedValue=arrs.pop();
console.log("deleated",deleatedValue);
for(let arr of arrs){
   console.log(arr); 
}
 console.log(arrs.toString()); 
  console.log(arrs); 
// concat 
let marval= ["thor","spidrerman","ironman"];
let dc =["superman","batman"];
let hero =marval.concat(dc);
console.log(hero);
//method
//marvalhero.unshift("antman"); to add from starting 
//push to add at end 
//pop to deleat from end 
//shift()used to deleat from starting 
/*slice():return a pece of array slice(startindx,endingindx)
splice()changes in orignal array (add, remove, replace)
splice(startindx,delcount,newEL1)*/
/*for each method is only aplicable to array also called as higher oder functio/methodthey genraly tkae function as parameter or return value*/
let arrfs=[1,2,3,4,5];
arrfs.forEach((val)=>{
console.log(val);
});
