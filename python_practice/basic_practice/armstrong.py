def is_armstrong_number(n):
    # Convert to string to get digits and length
    s = str(n)
    power = len(s)
    # Sum of digits raised to the power of the number of digits
    total = sum(int(digit) ** power for digit in s)
    return total == n

# Example
num = int(input("Enter a number to check if it's an Armstrong number: "))
if is_armstrong_number(num):
    print(f"{num} is an Armstrong number.")
else:
    print(f"{num} is not an Armstrong number.")