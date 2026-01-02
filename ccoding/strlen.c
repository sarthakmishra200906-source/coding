#include <stdio.h>
int main()
{
    int n;
    printf("Enter the lenth of string : ");
    scanf("%d", &n);
    char str1[n];
    printf("Enter the element of string : ");
    for (int i = 0; i < n; i++)

    {
        scanf("%s", str1[i]);
    }
    printf("your length of strring is %d", n);
    printf(" the element of string are : ");
    for (int i = 0; i < n; i++)
    {
        printf("%s", str1[i]);
    }
    return 0;
}