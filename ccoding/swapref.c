#include<stdio.h>
void swap(int *a,int *b){
      int temp;
      temp = *a;
      *a=*b;
      *b = temp;
    return;
}
int main (){
    int a,b;
    printf("Enter your first number : ");
    scanf("%d",&a);
    printf("Enter your second number : ");
    scanf("%d",&b);
    swap(&a,&b);
    printf("%d %d",a,b);
    return 0;
}