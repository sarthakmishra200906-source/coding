let userScore = 0;
let compScore = 0;
const choices = document.querySelectorAll(".choice");
const msg = document.querySelector("#msg");
const userScorePara = document.querySelector("#user-Score");
const compScorePara = document.querySelector("#comp-Score");
const genCompChoice = () => {
    const options = ["rock", "paper", "scissor"];
    const randIdx = Math.floor(Math.random() * 3);

    return options[randIdx];
    // rock,paper,scissor
}
const drawGame = () => {
    msg.innerText = "Game was draw! play again"
    msg.style.backgroundColor = "yellow";
}
const showWinner = (userWin, userChoice, compChoice) => {
    if (userWin) {
        userScore++;
        userScorePara.innerText = userScore;
        msg.innerText = `you Win! your ${userChoice} beats ${compChoice}`;
        msg.style.backgroundColor = "green";
    } else {
        compScore++;
        compScorePara.innerText = compScore;
        msg.innerText = `you lose! ${compChoice} beats your ${userChoice}`;
        msg.style.backgroundColor = "red";
    }
}
const playGame = (userChoice) => {

    const compChoice = genCompChoice();


    if (userChoice === compChoice) {
        //draw Game
        drawGame();
    } else {
        let userWin = true;
        if (userChoice === "rock") {
            //scissor,paper
            userWin = compChoice === "paper" ? false : true;


        } else if (userChoice === "paper") {
            //rock,scissor
            userWin = compChoice === "scissor" ? false : true;

        } else {
            //rock,paper
            userWin = compChoice === "scissor" ? false : true;
        }
        showWinner(userWin, userChoice, compChoice);
    }
}
choices.forEach((choice) => {
    choice.addEventListener("click", () => {
        const userChoice = choice.getAttribute("id");
        playGame(userChoice);
    });
});
