 #include<stdio.h>
 int main(){
    int i;
    int n;
    printf("Enter your number of element in array : ");
    scanf("%d",&n);
    int arr[n];
   
    for( i =0;i<=n-1;i++){
        printf("Enter your number : ");
        scanf("%d",&arr[i]);
    }
     int max=arr[0];
    for( i=1;i<=n-1;i++){
       if(max < arr[i]){
        max=arr[i];
       }
    }
    printf("The largest number is %d",max);
    return 0;
 }