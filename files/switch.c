#include <stdio.h>
int main()
{
    int n;
    printf("Enter day number(1-7) : ");
    scanf("%d", &n);
    switch (n)
    {
    case 1:
        printf("\nmonday\n");
        break;
    case 2:
        printf("twesday\n");
        break;
    case 3:
        printf("wedmesday\n");
        break;
    case 4:
        printf("thrusday\n");
        break;
    case 5:
        printf("friday\n");
        break;
    case 6:
        printf("saturday\n");
        break;
    case 7:
        printf("sunday\n");
        break;
    default:
        printf("Invalid number\n");
    }
    return 0;
}