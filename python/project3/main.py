import random
print("Welcome to the Number Guessing Game!")
player1 = input("Player 1, please enter your name: ")
print(f"Hello, {player1}!")
a= int (input("Guess a number between 1 and 100: "))
b = random.randint(1,100)
while a != b:
    if a < b:
        print("Too low, try again.")
    else:
        print("Too high, try again.")
    a= int (input("Guess a number between 1 and 100: "))
print("Congratulations! You guessed the number.")
player2 = input("Player 2, please enter your name: ")
print(f"Hello, {player2}!")
c= int (input("Guess a number between 1 and 100: "))
d = random.randint(1,100)
while c != d:
    if c < d:
        print("Too low, try again.")
    else:
        print("Too high, try again.")
    c= int (input("Guess a number between 1 and 100: "))
print("Congratulations! You guessed the number.")
print (f"{player1} and {player2}, thank you for playing the Number Guessing Game!")
print("player 1 took", a, "guesses to find the number.")
print("player 2 took", c, "guesses to find the number.")
print("so player 1 is the winner!") if a < c else print("so player 2 is the winner!") if c < a else print("It's a tie!")
print("want to play again? (yes/no)")
play_again = input().lower()
if play_again == "yes":
    print("Great! Let's start a new game.")
    # You can call the main function again or reset the game state here