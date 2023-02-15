
let userPrompt = prompt("Choose Rock Paper or Scissors and press ENTER!").toLowerCase();

let randomNumber = randomNumberGenerator();

let computerChoice = getComputerChoice(randomNumber);

if (computerChoice == userPrompt) {
    displayPlayerAndComputerChoice();
    console.log("It's a draw!");
} else if (userPrompt === "rock" && computerChoice === "paper" || userPrompt === "scissors" && computerChoice === "rock" || userPrompt === "paper" && computerChoice === "scissors") {
    displayPlayerAndComputerChoice();
    console.log(`Computer wins!`)
} else if (userPrompt === "paper" && computerChoice === "rock" || userPrompt === "rock" && computerChoice === "scissors" || userPrompt === "scissors" && computerChoice === "paper") {
    displayPlayerAndComputerChoice();
    console.log(`Player wins!`)
}


function randomNumberGenerator() {
    return Math.floor(Math.random() * (4 - 1) + 1);
}


function getComputerChoice(randomNumberGenerator) {

    switch (randomNumberGenerator) {
        case 1: return "rock";
            break;
        case 2: return "paper";
            break;
        case 3: return "scissors";
            break;
    }
}

function displayPlayerAndComputerChoice() {
    console.log(`Player picks ${userPrompt}`);
    console.log(`Computer picks ${computerChoice}`);
}