#include<stdio.h>
int main(){
    int a;
    scanf("%d",&a);
    char ch;
    scanf("%c",&ch);
    int b;
    scanf("%d",&b);
    if(ch=='-')
    printf("%d",a-b);
    if(ch=='*')
    printf("%d",a*b);
    if(ch=='/')
    printf("%d",(float)a/b);
    if(ch=='+')
    printf("%d",a+b);
}