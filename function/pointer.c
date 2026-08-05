#include<stdio.h>
int main(){
    int a = 5;
    int *x =&a;
    int **y=&x;
    
    printf("%p\n",&a);
    printf("%p\n",x);
    return 0;
}