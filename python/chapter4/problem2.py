# Initialize an empty set to store unique elements
unique_elements = set()

# Get the total number of elements the user wants to enter
num_elements = int(input("Enter the number of elements in the set: "))

# Loop exactly 'num_elements' times
for i in range(num_elements):
    # Take input from the user (f-string helps show current count like 1, 2, 3...)
    value = input(f"Enter element {i + 1}: ")
    
    # Note: If you want to store integers instead of strings, 
    # you would use: value = int(input(...))
    
    # Add the value to the set. 
    # If the user enters a duplicate, the set will automatically ignore it.
    unique_elements.add(value)

# Print the final set
print("\nHere is your set:")
print(unique_elements)