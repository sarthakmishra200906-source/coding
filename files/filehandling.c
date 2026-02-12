#include<stdio.h>
int main(){
    //FILE *ptr=fopen("sarthaak.txt","r");
    //char str[100];
    //while(fgets(str,100,ptr)!=NULL)
    //printf("%s",str);
    FILE *ptr=fopen("masti.txt","w");
    char str[]="masti chal rahi  bhi sahab ha ";
    fputs(str,ptr);
    fclose(ptr);
}