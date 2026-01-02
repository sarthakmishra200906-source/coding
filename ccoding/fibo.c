#include<stdio.h>
int main(){
    int a=0;
    int b=1;
    int num;
    int add;
    printf("Enter the number : ");
    scanf("%d",&num);
    printf("%d %d",a,b);
    for(int i = 2;i<=num;i++){
        add = a+b;
        printf("%d ",add);
        a = b;
        b = add;

    }


    return 0;
}