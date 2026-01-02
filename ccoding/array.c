#include<stdio.h>
int main (){
    int n;
    printf("Enter the size of array : ");
    scanf("%d",&n);
    int arr[n];
    for(int i=0;i<n;i++){
        printf("enter your %d element of array : ",i+1);
        scanf("%d",&arr[i]);
    }
    for(int i=0;i<n;i++){
        printf("your %d element of array is : %d ",i+1,arr[i]);
        
    }
    return 0;
}