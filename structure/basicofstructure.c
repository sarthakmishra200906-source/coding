#include <stdio.h>
int main()
{
    struct pokemon
    {
        int hp;
        int speed;
        int attack;
    };
    int pokemon;
    struct pokemon pikachu;
    pikachu.attack = 100;
    pikachu.hp = 50;
    pikachu.speed = 60;
    struct pokemon adam;
    adam.attack = 150;
    adam.hp = 200;
    adam.speed = 40;
    printf("%d", pikachu.hp);

    return 0;
}