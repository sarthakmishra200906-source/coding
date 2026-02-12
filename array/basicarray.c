#include<stdio.h>
int main(){
   int arr[5] ={2,4,6,8,1};
   for(int i=0;i<=4;i++){
   
       printf("Enter %d element number\n : ",i+1);
       scanf("%d",&arr[i]);
   }
   for(int i=0;i<=4;i++){
       printf("\nyour %d number are  :",i);
       printf("%d\n",arr[i]);
   }

 
  

    
    
    return 0;
}