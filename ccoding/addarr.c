#include <stdio.h>
int main()
{
    int n, m;
    printf("enter your row | colum of matrix 1 : ");
    scanf("%d", &n);
    printf("enter your row | colum of matrix 2 : ");
    scanf("%d",&m);
    int arr1[n][n];
    int arr2[m][m];
    printf("Enter element of array 1 \n");
    for (int i = 0; i < n; i++)
    {
        for (int j = 0; j < n; j++)
        {
            scanf("%d", &arr1[i][j]);
        }
    }
    printf("Enter element of array 2 \n");
    for (int i = 0; i < m; i++)
    {
        for (int j = 0; j < m; j++)
        {
            scanf("%d", &arr2[i][j]);
        }
    }
    int result[n][m];
    for (int i = 0; i < n; i++)
    {
        for (int j = 0; j < n; j++)
        {
            result[i][j] = arr1[i][j] + arr2[i][j];
        }
    }
    printf("your addition result are \n");
    for (int i = 0; i < m; i++)
    {
        for (int j = 0; j < m; j++)
        {
            printf("%d\t", result[i][j]);
        }
        printf("\n");
    }
}
