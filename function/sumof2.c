#include <stdio.h>
int add(int a, int b)
{
    return a + b;
}
int main()
{
    int n;
    printf("Enter first number : ");
    scanf("%d", &n);
    int m;
    printf("Enter your second number : ");
    scanf("%d",&m);
    int sum = add(n, m);
    printf("%d", sum);
    return 0;
}