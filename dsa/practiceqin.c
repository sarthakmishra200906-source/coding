// imported library function
#include <stdio.h>
#include <stdlib.h>
// defined max function as global so as to use frequently
#define max 5
// set the value of front and rear as -1 to ensure its empty condition
int front = -1;
int rear = -1;
// define array of size max ;
int arr[max];
// write a enqueue function to add element in a queue
void enqueue(int x)
{
    // condition to check weather the stack is full oe not
    if (rear == max - 1)
    {
        printf("stack overflow your queue is full ");
        // if not full check if stack is fully empty or not if so make pointer to shift from -1 to 0 and put value of x
    }
    else if (front == -1 && rear == -1)
    {
        front = rear = 0;
        arr[0] = x;
    }
    // if not so just do rear ++ to reach the next empty box and update it with x
    else
    {
        printf("\nThe value %d has been enqueued successfully.", x);
        rear++;
        arr[rear] = x;
    }
}
// write a function to dequeue a element from queue
void dequeue()
{
    // check weather stack is empty or not
    if (front == -1 && rear == -1)
    {
        printf("stack underflow nothing to deleat ");
    }
    // then check if all the elemnt alrady dequed in the queue or not if so make front and rear = -1 as in this case queue is empty
    else 
    printf("\nThe dequeued element is: %d", arr[front]);
    if (front == rear)
    {
        front = rear = -1;
    }
    // if none of the avove condition exist mean stack has some value so deleat from the front as ti follows a(fifo)
    else
    {
       
        front++;
    }
}
// write a function to display
void display()
{
    if (front == -1 && rear == -1) // check if empty if so print empty
    {
        printf("The queue is empty ");
    }
    else
    { // if not so print queue
        for (int i = front; i < rear + 1; i++)
        {
            printf(" %d", arr[i]);
        }
    }
}
int main()
{
    // define x foe taking value to enqueue and choice for taking value for performing operation
    int x, choice;
    // while 1 in c means 1 represent true so loop will be running continusly
    while (1)
    {
        // add option menu for user   to make it user friendly
        printf("\n----Linear Queue operation---- \n");
        printf("1. enqueue \n 2. dequeue  \n 3. display \n 4 .exit \n");
        printf("Enter your choice \n");
        scanf("%d", &choice);
        // perform operation as per as the choice entred by the user
        switch (choice)
        {
        case 1:

            printf("\nEnter the value for enqueue : ");
            scanf("%d", &x);
            enqueue(x);
            break;
        case 2:
            dequeue();
            break;
        case 3:
            display();
            break;
        case 4:
            // it is a lib function of c languaage standerd library to exit the code
            // remember break exit the loop in which it lies but this function exit the whole code means end of code
            printf("Exiting program...\n");
            exit(0);
            // for the end case if user entred wrong or any non existing option or if avove all case fails then default case will be exiqueted
        default:
            printf("Invalid choice! Please try again.");
        }
    }
    return 0;
}
