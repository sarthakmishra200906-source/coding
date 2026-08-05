def avg():
    a=int(input("Enter the first number: "))
    b=int(input("Enter the second number: "))
    c=int(input("Enter the third number: "))
    average=(a+b+c)/3
    print(f"The average of {a}, {b} and {c} is {average}.")
    avg()
avg()