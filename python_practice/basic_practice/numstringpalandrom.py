def is_palindrome(data):
    # Convert input to string to handle both numbers and text
    s = str(data)
    # Compare the string with its reverse
    # [::-1] creates a reversed copy of the string
    return s == s[::-1]

# Testing the function
num = int(input("Enter a number to check if it's a palindrome: "))
text = input("Enter a text to check if it's a palindrome: ")

print(f"Is {num} a palindrome? {is_palindrome(num)}")
print(f"Is '{text}' a palindrome? {is_palindrome(text)}")