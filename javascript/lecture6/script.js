let div = document.querySelector("div");
let btn1 = document.querySelector("#btn1");

// 1. Get Attributes
console.log(div.getAttribute("id"));
console.log(div.getAttribute("name"));

// 2. Button Click Event
btn1.onclick = (evt) => {
    console.log("Button 1 was clicked");
    let a = 25;
    a++;
    console.log(a); // 26
    
    // Fixed capitalization for X and Y
    console.log(evt.type);
    console.log(evt.target);
    console.log(evt.clientX, evt.clientY); 
};

// 3. Mouseover Event (Removed the extra "let")
div.onmouseover = (evt) => {
    console.log("You are inside div");
    console.log(evt.type);
    console.log(evt.target);
    console.log(evt.clientX, evt.clientY);
};
