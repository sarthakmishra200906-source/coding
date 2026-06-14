import random

def game():
    print("Welcome to the game!")
    
    # 1. Generate and save the random score first
    score = random.randint(1, 10)
    print(f"Your score: {score}")
    
    # 2. Read the current high score safely
    try:
        with open("hiscore.txt", "r") as f:
            hiscore = f.read()
            if hiscore != "":
                hiscore = int(hiscore)
            else:
                hiscore = 0
    except FileNotFoundError:
        # If the file doesn't exist yet, start the high score at 0
        hiscore = 0
        
    # 3. Compare and update the high score using .write()
    if score > hiscore:
        print(f"New High Score! Replacing old high score of {hiscore}")
        with open("hiscore.txt", "w") as f:
            f.write(str(score))  # Fixed from writestr to write
    else:
        print(f"Current High Score is still: {hiscore}")
        
    return score

# Run the game
game()