a=int(input("Enter a number: "))
# print all prime numbers from 1 to a
for num in range(1, a + 1):
    if num > 1:
        for i in range(2, num):
            if (num % i) == 0:
                break
        else:
            print(num)