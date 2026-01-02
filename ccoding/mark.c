#include<stdio.h>
int main(){
    int mark[10];
    for(int i=0;i<=9;i++){
        printf("Enter mark of student");
        scanf("%d",&mark[i]);

    }
    printf("the student who scored less than 35 mark are ");
    for(int i=0;i<=9;i++){
        if(mark[i]<=35){
            printf("%d",i);
        }
    }
    return 0;
}