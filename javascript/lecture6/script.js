// let div = document.querySelector("div");
// let btn1 = document.querySelector("#btn1");

// // 1. Get Attributes
// console.log(div.getAttribute("id"));
// console.log(div.getAttribute("name"));

// // 2. Button Click Event
// btn1.onclick = (evt) => {
//     console.log("Button 1 was clicked");
//     let a = 25;
//     a++;
//     console.log(a); // 26
    
//     // Fixed capitalization for X and Y
//     console.log(evt.type);
//     console.log(evt.target);
//     console.log(evt.clientX, evt.clientY); 
// };

// // 3. Mouseover Event (Removed the extra "let")
// div.onmouseover = (evt) => {
//     console.log("You are inside div");
//     console.log(evt.type);
//     console.log(evt.target);
//     console.log(evt.clientX, evt.clientY);
// };
// let modeBtn=document.querySelector("#mode");
// let currMode="light";
// modeBtn.addEventListener("click",()=>{
//     if(currMode==="light"){
//         currMode="dark";
//         document.querySelector("body").style.backgroundColor ="black";

//     }else{
//         currMode="light";
//         document.querySelector("body").style.backgroundColor ="white";
//     }
//     console.log(currMode);
// });
let modeBtn=document.querySelector("#mode");
 let currMode="light";
 modeBtn.addEventListener("click",()=>{
     if(currMode==="light"){
         currMode="dark";
         document.querySelector("body").style.backgroundColor ="black";
         document.querySelector("#website").style.color ="white";

     }else{
         currMode="light";
         document.querySelector("body").style.backgroundColor ="white";
         document.querySelector("#website").style.color ="black";

     }
     console.log(currMode);
    });
    let changeTextBtn=document.querySelector("#changetext");
    changeTextBtn.addEventListener("click",()=>{
        let website=document.querySelector("#website");
        if(website.innerText==="this is my old website"){
            website.innerText="this is my new website walla the text is changed";
        }else{
            website.innerText="this is my old website";
        }
    });
