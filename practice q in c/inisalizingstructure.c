//1. Struct Initialization
//Task: Define a structure for a Point containing two float members: latitude and
// longitude. Create an array of 5 such Point structures and initialize 
//them with dummy data.
#include<stdio.h>
struct location{
    float latitude;
    float longitude;

};
int main(){
     
    
    struct  location askaroad[5]={
    {120.139,145.345},//stop 1
    {124.124,110.234},//stop 2
    {123.4533, 123.433},//stop 3
    {123.433, 123.4666},//stop 4
    {123.4777, 123.4788},//stop 5
    };
    for(int i=0;i<=4;i++){
    printf("\nyour latitude for %dstop  is : %f\n",i+1,askaroad[i].latitude);
  
    printf("\nyour longitude for stop %d is : %f\n",i+1,askaroad[i].longitude);
    }
  
   

            

    return 0;
}