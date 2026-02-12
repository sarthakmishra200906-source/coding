#include <stdio.h>
void swap(int a, int b)
{
    int temp = a;
    a = b;
    b = temp;
    return;
}
int main()
{
    int a, b, temp;
    printf("\nEnter a : ");
    scanf("%d", &a);
    printf("\nEnter b : ");
    scanf("%d", &b);
    swap(a, b);
    printf("%d\n", a);
    printf("%d\n", b);
    return 0;
}