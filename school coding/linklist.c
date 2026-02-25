#include<stdio.h>
#include<conio.h>
#include<malloc.h>
#include<process.h>

// Structure declaration for the node
struct node
{
    int info; // To store the data
    struct node *link; // To store the address of the next node
}*start; // Global pointer to the first node

// This function will create a new linked list or add to the end
void Create_List(int data)
{
    struct node *q, *tmp;
    tmp = (struct node*)malloc(sizeof(struct node)); // Allocate memory
    tmp->info = data;
    tmp->link = NULL;
    
    if(start == NULL) /* If list is empty */
        start = tmp;
    else
    { /* Element inserted at the end */
        q = start;
        while(q->link != NULL)
            q = q->link;
        q->link = tmp;
    }
}

// Add new element at the beginning
void AddAtBeg(int data)
{
    struct node *tmp;
    tmp = (struct node*)malloc(sizeof(struct node));
    tmp->info = data;
    tmp->link = start; // Link new node to the old first node
    start = tmp; // Update start to the new node
}

// Add new element after a specific position
void AddAfter(int data, int pos)
{
    struct node *tmp, *q;
    int i;
    q = start;
    for(i = 0; i < pos - 1; i++)
    {
        q = q->link;
        if(q == NULL)
        {
            printf("\n\n There are less than %d elements", pos);
            getch();
            return;
        }
    }
    tmp = (struct node*)malloc(sizeof(struct node));
    tmp->link = q->link;
    tmp->info = data;
    q->link = tmp;
}

// Delete an element from the list
void Del(int data)
{
    struct node *tmp, *q;
    if (start->info == data)
    {
        tmp = start;
        start = start->link; /* Move start to the next node */
        free(tmp);
        return;
    }
    q = start;
    while(q->link->link != NULL)
    {
        if(q->link->info == data) /* Element found in between */
        {
            tmp = q->link;
            q->link = tmp->link;
            free(tmp);
            return;
        }
        q = q->link;
    }
    if(q->link->info == data) /* Delete last element */
    {
        tmp = q->link;
        free(tmp);
        q->link = NULL;
        return;
    }
    printf("\n\nElement %d not found", data);
    getch();
}

// Display all elements
void Display()
{
    struct node *q;
    if(start == NULL)
    {
        printf("\n\nList is empty");
        return;
    }
    q = start;
    printf("\n\nList is : ");
    while(q != NULL)
    {
        printf("%d ", q->info);
        q = q->link;
    }
    printf("\n");
    getch();
}

// Count nodes
void Count()
{
    struct node *q = start;
    int cnt = 0;
    while(q != NULL)
    {
        q = q->link;
        cnt++;
    }
    printf("Number of elements are %d\n", cnt);
    getch();
}

// Reverse the list
void Rev()
{
    struct node *p1, *p2, *p3;
    if(start->link == NULL)
        return;
    p1 = start;
    p2 = p1->link;
    p3 = p2->link;
    p1->link = NULL;
    p2->link = p1;
    while(p3 != NULL)
    {
        p1 = p2;
        p2 = p3;
        p3 = p3->link;
        p2->link = p1;
    }
    start = p2;
}

// Search for an element
void Search(int data)
{
    struct node *ptr = start;
    int pos = 1;
    while(ptr != NULL)
    {
        if (ptr->info == data)
        {
            printf("\n\nItem %d found at position %d", data, pos);
            getch();
            return;
        }
        ptr = ptr->link;
        pos++;
    }
    printf("\n\nItem %d not found in list", data);
    getch();
}

void main()
{
    int choice, n, m, position, i;
    start = NULL;
    while(1)
    {
        clrscr();
        printf("1.Create List\n2.Add at beginning\n3.Add after\n4.Delete\n5.Display\n6.Count\n7.Reverse\n8.Search\n9.Quit\n");
        printf("\nEnter your choice:");
        scanf("%d", &choice);
        switch (choice)
        {
            case 1:
                printf("\nHow many nodes:"); scanf("%d", &n);
                for(i = 0; i < n; i++) { printf("Enter element:"); scanf("%d", &m); Create_List(m); }
                break;
            case 2: printf("Enter element:"); scanf("%d", &m); AddAtBeg(m); break;
            case 3: printf("Enter element:"); scanf("%d", &m); printf("Enter position:"); scanf("%d", &position); AddAfter(m, position); break;
            case 4: if (start == NULL) { printf("List empty"); continue; } printf("Enter element for deletion:"); scanf("%d", &m); Del(m); break;
            case 5: Display(); break;
            case 6: Count(); break;
            case 7: Rev(); break;
            case 8: printf("Enter element to search:"); scanf("%d", &m); Search(m); break;
            case 9: exit(0);
            default: printf("Wrong choice");
        }
    }
}