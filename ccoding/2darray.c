#include <stdio.h>

int main()
{
    int n, m;
    printf("Enter number of rows: ");
    scanf("%d", &n);
    printf("Enter number of columns: ");
    scanf("%d", &m);

    int arr[n][m];

    
    printf("Enter the elements:\n");
    for (int i = 0; i < n; i++)
    {
        for (int j = 0; j < m; j++)
        {
           
            scanf("%d", &arr[i][j]);
        }
    }

   
    printf("\nThe Matrix is:\n");
    for (int i = 0; i < n; i++)
    { 
        for (int j = 0; j < m; j++)
        { 
            printf("%d ", arr[i][j]);
        }
        printf("\n");
    }

    return 0;
}