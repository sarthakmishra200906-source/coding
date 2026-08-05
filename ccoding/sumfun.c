#include<stdio.h>
int sum(int *n){
   int a=0;
   int lim=*n;
    for(int i = 1;i<=lim; i++){
       a =a+i;
    }
    printf("%d",a);
   *n=a;
 
    
    return *n;
}
int main(){
    int n,a;
    printf("Enter your number : ");
    scanf("%d",&n);
    sum(&n);
    printf("your sum of natural number is %d",n);

}