#include <stdio.h>
void swap(int* x, int* y)
{
    int temp;
    temp = *x;
    *x = *y;
    *y = temp;
    return;
}
int main()
{
    int a;
    printf("\nEnter a : ");
    scanf("%d",&a);
    int b;
    printf("\nEnter b : ");
    scanf("%d",&b);
    int *x = &a;
    int *y = &b;

    swap(x, y);
    printf("%d\n", a);
    printf("%d\n", b);
    return 0;
}