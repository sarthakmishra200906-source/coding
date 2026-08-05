#include<stdio.h>
int  factorial (int *n){
    int fact =1;
   
for(int i=1;i<=*n;i++){
fact = fact * i;
}
return *n=fact;
}
int main(){
    int n;
   
    printf("Enter your no to calculate factorial : ");
    scanf("%d",&n);
       factorial(&n);
       printf("your factorial of number is %d",n);
    return 0;
}