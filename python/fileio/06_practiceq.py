def generateTable(n):
    # Open the file once in write ('w') mode to clear old tables 
    # or append ('a') mode if you want to keep adding new ones.
    with open("table.txt", "w") as f:
        for i in range(1, 11):
            line = f"{n} x {i} = {n*i}\n"
            f.write(line)

# Call the function to test it
generateTable(5)