#include<stdio.h>
void greet(){
    printf("good morning\n");
    printf("how are you \n");
    return;
}
int main(){
    for(int i= 1;i<=20;i++){
        greet();
    }
    
    return 0;

}