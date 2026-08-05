let newBtn = document.createElement("button");
newBtn.innerText = "dont click me";
document.querySelector("body").appendChild(newBtn);

let newDiv = document.createElement("div");
let newBtn2 = document.createElement("button"); // Create it once here
newBtn2.innerText = "reset";

newBtn.style.backgroundColor = "green";

newBtn.addEventListener("click", function() {
    newDiv.innerText = "Hello World but why you clicked me ?";
    document.querySelector("body").appendChild(newDiv);
    
    newBtn.style.backgroundColor = "red";
    newBtn.innerText = "clicked";
    
    // Only append if it's not already on the page
    if (!document.body.contains(newBtn2)) {
        document.querySelector("body").appendChild(newBtn2);
    }
});

newBtn2.addEventListener("click", function() {
    newDiv.innerText = "";
    newBtn.style.backgroundColor = "green";
    newBtn.innerText = "dont click me";
    
    // Remove the reset button
    if (document.body.contains(newBtn2)) {
        document.querySelector("body").removeChild(newBtn2);
    }
});