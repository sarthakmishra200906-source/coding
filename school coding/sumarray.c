#include<stdio.h>
int main(){
    int arr1[5],arr2[5],i;
    printf("Enter your 1st 5 numbers : ");
    for(i=0;i<=4;i++){
            scanf("%d",&arr1[i]);
    }
     printf("Enter your 2nd 5 numbers : ");
    for(i=0;i<=4;i++){
            scanf("%d",&arr2[i]);
    }
     printf("Sum is11 : ");
    for(i=0;i<=4;i++){
            printf("%d\n",arr1[i]+arr2[i]);
    }
    return 0;
    }