const jokeURL = "https://official-joke-api.appspot.com/random_joke";
const jokePara=document.querySelector("#joke");
const btn=document.querySelector("#jokeButton");
const getJoke = async () => {
    let response = await fetch(jokeURL);
    let joke = await response.json();
    console.log(joke.setup);
    console.log(joke.punchline);
    jokePara.textContent = `${joke.setup} ${joke.punchline}`;
};
btn.addEventListener("click", getJoke);
const getData = async () => {
    try {
        let response = await fetch(URL);
        
        // Change .json() to .text()
        let textData = await response.text();
        
        console.log("Raw text data:", textData);
    } catch (error) {
        console.error("Error fetching data:", error);
    }
};
getData();
