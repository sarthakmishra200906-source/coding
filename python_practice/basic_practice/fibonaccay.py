a=1
b=1
n=int(input("Enter the number of terms: "))
print("The Fibonacci sequence is:")
print(a)
print(b)
for _ in range(n):
    c=a+b
    print(c)
    a=b
    b=c
