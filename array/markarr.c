#include<stdio.h>
int main(){
    int mark[10];
    for(int i = 0;i<=9;i++){
        printf("Enter mark : ");
        scanf("%d",&mark[i]);

    }
    for(int i=0;i<=9;i++){
        if(mark[i]<35){
        printf("%d\n",i);
        }
    }
}