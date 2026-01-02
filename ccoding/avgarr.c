#include<stdio.h>
int main (){
    int n;
    int avrage ;
    int sum =0;
    printf("Enter the lenth of array : ");
    scanf("%d",&n);
    int arr1[n];
    for(int i = 1 ;i <=n ;i++){
        scanf("%d",&arr1[i]);
    }
    for(int i = 1 ;i <=n ; i++){
     sum = sum + arr1[i];
    }
    avrage = sum /n;
    printf("your avrage of array is  : %d",avrage );
    return 0;

}