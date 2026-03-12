#include<stdio.h>// included imp lib 
#include<stdlib.h>
typedef struct dlist {//created a typedef structure d list 
    int data;
    struct dlist *prev;
    struct dlist *next
} dlist;
int main (){
    int n,p,c=0;
    dlist *newnode,*ptr,*temp;
    printf("Enter a integer to calculate factorial ");
    if(scanf("%d",&n)!=1) return 1;//taking input from user 
    newnode=(dlist*)malloc(sizeof(dlist));//allocated sufficent memory space 
    newnode->data =1;
    newnode->next = newnode->prev=NULL;
    temp = newnode;
    for(int m= 2;m<=n;m++){
        ptr = newnode;
        while(ptr!=null){
            p=(ptr->data*m)+c;
            ptr->data=p%10;
        }
    }

}
