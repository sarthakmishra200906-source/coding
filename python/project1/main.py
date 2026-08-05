'''
Rock-paper-scissors game.

Computer uses:
1  -> rock
0  -> paper
-1 -> scissors
'''
import random


def game():
    # Pick a random move for the computer.
    computer = random.choice([-1, 0, 1])

    # Convert the user's input into the same numeric format.
    youstr = input("Enter r for rock, p for paper and s for scissors: ")
    youDict = {"r": 1, "p": 0, "s": -1}
    youstr = youDict[youstr]

    print(f"Computer chose {computer} and you chose {youstr}")

    # Decide the round result and return it so the caller can count scores.
    if computer == youstr:
        print("It's a tie")
        return "Tie"
    elif (
        (youstr == 1 and computer == -1)
        or (youstr == 0 and computer == 1)
        or (youstr == -1 and computer == 0)
    ):
        print("You win")
        return "You win"
    else:
        print("Computer wins")
        return "Computer wins"


# Play 10 rounds and count the score.
computer_count = 0
you_count = 0

for i in range(5):
    result = game()
    if result == "You win":
        you_count += 1
    elif result == "Computer wins":
        computer_count += 1

print(f"Final score: Computer {computer_count} - You {you_count}")

if computer_count > you_count:
    print("Computer wins the game!")
elif you_count > computer_count:
    print("You win the game!")
else:
    print("The game is a tie!")

