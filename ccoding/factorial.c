#include <stdio.h>
int main()
{
    int n;
    int fact = 1;

    printf("Enter your number : ");
    scanf("%d", &n);
    for (int i = n; i >= 1; i--)
    {

        fact = fact * i;
    }
    printf("your factorial of number is %d", fact);
    return 0;
}