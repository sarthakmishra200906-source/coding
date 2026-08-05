#include<stdio.h>
int min(int a,int b){
    if(a<b) return a;
    else return b;
}
int hcf(int a,int b){
    int hcf;
    for(int i=min(a,b);i>=1;i--){
     if(a%i==0&&b%i==0){
        hcf=i;
        break;
     }
     
    }
    return hcf;
    
}
int main(){
    int a;
    printf("\nEnter 1st number : ");
    scanf("%d",&a);
    int b;
    printf("\nEnter your 2nd number : ");
    scanf("%d",&b);
    int result =hcf(a,b);
    printf("The HCF/GCD of %dand and %d id : %d ",a,b,result);
}