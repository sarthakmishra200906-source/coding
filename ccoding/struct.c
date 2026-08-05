#include<stdio.h>
int main (){
    struct pokimon{
      int hp ;
      float power ;
      int speed;
    };
    struct pokimon pikachu;
    scanf("%d",&pikachu.hp);
     scanf("%f",&pikachu.power);
      scanf("%d",&pikachu.speed);
      struct pokimon charizard;
       scanf("\n%d",&charizard.hp);
        scanf("\n%f",&charizard.power);
         scanf("\n%d",&charizard.speed);
         printf("\n%d",pikachu.hp);
         printf("\n%f",pikachu.power);
         printf("\n%d",pikachu.speed);
         printf("\n%d",charizard.hp);
         printf("\n%f",charizard.power);
         printf("\n%d",charizard.speed);
          
    return 0;
}