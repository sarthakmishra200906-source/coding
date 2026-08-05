#include<stdio.h>
int main (){
    int r;
    printf("enter number of rows : ");
    scanf("%d",&r);
    int c;
    printf("enter number of colum : ");
    scanf("%d",&c);
    int arr1[r][c];
    for(int i = 0; i<r;i++){
        for(int j=0;j<c;j++){
            scanf("%d",&arr1[i][j]);
        }
    }
    printf("your transpose of matrix is \n");
    for(int i = 0; i<c;i++){
        for(int j=0; j<r;j++){
            printf("%d ",arr1[j][i]);
        }
        printf("\n");
    }


    return 0;
}