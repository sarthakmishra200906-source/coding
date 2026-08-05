#include<Stdio.h>
#include<stdlib.h>
// structure declaration for the node 
struct node{
int info ;// to store data 
struct node *link;//to store address of next node
}*start;
void  creat_list(int data){
    struct node *q,*temp;
    temp= (struct node*)malloc(sizeof (struct node));
    temp->info=data ;//as we created info to sore data 
    temp->link = NULL;//because at starting it will not point any where 
    if (start == NULL){
        start=temp ;

    }else{
        q=start;
        while(q->link !=NULL);
          q=q->link;//make q = link mean both points at same place 
          q->link = temp;// store the data and next adress in q
    }
    //add new element in the begning 
    struct node* temp ;
    temp = (struct node*)malloc (sizeof(struct node));
    temp->info = data ;
    temp -> link = start;
    start = temp ;
    void addafter(int data,int pos){
        struct *q,*temp ;
        int i;
        q = start ;
        for(i = 0 ;i <pos-1;i++){
            q=q->link;
        }
        if(q==NULL){
            printf(" less element ");
            return;
        }
    }
}