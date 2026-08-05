a=int(input("Enter a number to reverse: "))
reverse=0
while a!=0:
    digit=a%10
    reverse=reverse*10+digit
    a//=10
print("The reversed number is:", reverse)