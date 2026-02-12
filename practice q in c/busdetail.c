#include<stdio.h>

void loaddata(){
   FILE *ptr=("data.txt","r");
   struct bus businfo[5]={
          {}
   };
}
struct bus{
     int busid [10];
     int busno [5];
     char busname [50];
    char rootadress [100];
     char sheduledtime;


};
struct student{
 int studentid [10];
 char studentpasword [10];
 int rootid[10];
};
int main(){
    return 0;
}