#include<stdio.h>
int main(){
    int n,lastdigit,rem;
    printf("Enter your number : ");
    scanf("%d",&n);
    while(n!=0){
        rem= n%10;
        lastdigit = 0;
        lastdigit = lastdigit*10+rem;
        n=n/10;
        printf("%d",lastdigit);
        
    }
    return 0;
}
3
