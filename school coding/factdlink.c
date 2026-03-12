#include <stdio.h>
#include <stdlib.h>

typedef struct dlist {
    int data;
    struct dlist *prev;
    struct dlist *next;
} dlist;

int main() {
    int n, p, c = 0;
    dlist *root, *ptr, *temp;

    printf("Enter an integer to calculate its factorial: ");
    if (scanf("%d", &n) != 1) return 1;

    // Initialize the list with 1
    root = (dlist *)malloc(sizeof(dlist));
    root->data = 1;
    root->prev = root->next = NULL;

    temp = root;

    // Factorial logic: multiply the list by (n), then (n-1), etc.
    for (int m = 2; m <= n; m++) {
        ptr = root;
        c = 0;

        // Multiply each existing node by m
        while (ptr != NULL) {
            p = (ptr->data * m) + c;
            ptr->data = p % 10;
            c = p / 10;
            temp = ptr; // Keep track of the last node
            ptr = ptr->next;
        }

        // If there's a carry left, create new nodes
        while (c > 0) {
            dlist *newNode = (dlist *)malloc(sizeof(dlist));
            newNode->data = c % 10;
            newNode->prev = temp;
            newNode->next = NULL;
            temp->next = newNode;
            temp = newNode;
            c = c / 10;
        }
    }

    // Print the result by traversing backward
    printf("Factorial of %d: ", n);
    ptr = temp; 
    while (ptr != NULL) {
        printf("%d", ptr->data);
        ptr = ptr->prev;
    }
    printf("\n");

    return 0;
}
//recode

