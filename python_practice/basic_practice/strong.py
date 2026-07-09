import math
def is_strong_number(n):
    # Convert to string to iterate over digits
    digits = [int(d) for d in str(n)]
    # Sum the factorials of each digit
    total = sum(math.factorial(d) for d in digits)
    return total == n

# Example
num = int(input("Enter a number to check if it's a Strong number: "))
if is_strong_number(num):
    print(f"{num} is a Strong number.")
else:
    print(f"{num} is not a Strong number.")
