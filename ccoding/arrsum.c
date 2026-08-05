#include <stdio.h>
int main()
{
    int arr[5], a = 0;
    for (int i = 0; i <= 4; i++)
    {
        printf("\nEnter element of array ");
        scanf("%d", &arr[i]);
    }
    for (int i = 0; i <= 4; i++)
    {
        a = a + arr[i];
    }
    printf("your sum of array is :%d ", a);
    return 0;
}