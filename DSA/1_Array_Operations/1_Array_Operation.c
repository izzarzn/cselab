#include<stdio.h>
#include<conio.h>
int a[4], n, elem, i, pos;
/*Function Prototype and Definitions*/
void create() //creating an array
{
  printf("\nEnter the size of the array elements: "); scanf("%d", &n);
  printf("\nEnter the elements for the array:\n"); 
  for(i=0; i<n; i++)
  scanf("%d", &a[i]);
}
void display()
{
  int i;
  printf("\nThe array elements are:\n"); 
  for(i=0; i<n; i++)
{
  printf("%d\t", a[i]);
 }
}//end of display()
void insert() //inserting an element in to an array
{
  printf("\nEnter the position for the new element:"); 
  scanf("%d", &pos);
  pos=pos-1;
  printf("\nEnter the element to be inserted:"); scanf("%d", &elem);
 for(i=n-1; i>=pos; i--)
 {
  a[i+1] = a[i];
 }
  a[pos] = elem; n = n+1;
}//end of insert()
void del() //deleting an array element
{
  printf("\nEnter the position of the element to be deleted:"); scanf("%d", &pos);
  pos=pos-1;
  elem = a[pos]; for(i=pos; i<n-1; i++)
 {
  a[i] = a[i+1];
 }
  n = n-1;
  printf("\nThe deleted element is = %d",elem); }//end of delete()
  void main()
{
 int ch;
 clrscr();
 do
{
 printf("\n\n-------- Menu-----------\n");
 printf("1.Create\n 2.Display\n 3.Insert\n 4.Delete\n 5.Exit\n");
 printf("\nEnter your choice: ");
 scanf(“%d”,&ch);
 switch(ch)
 {
 case 1: create(); break;
case 2: display(); break;
case 3: insert(); break;
case 4: del(); break;
case 5: exit(0); break;
default: printf("\nInvalidchoice:\n"); break;
    }
  }while(ch!=5);
 getch();
}
