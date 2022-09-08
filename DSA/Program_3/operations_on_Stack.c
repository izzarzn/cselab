#include<stdio.h>
#include<conio.h>
#define MAX 4
int stack[MAX], item;
int ch, top = -1, count = 0;
/*PUSH FUNCTION*/
void push( )
{
 if (top == (MAX-1))
 printf("\n\nStack is Overflow");
 else
 {
 stack[++top] = item;
 
 }
 
int pop( )
 {
 int ret;
 if(top == -1)
 printf("\n\nStack is Underflow");
 else
 {
 ret = stack[top--];
 printf("\nPopped element is %d", ret);
 }
 return ret;
}
void palindrome( )
{
int i, temp; 
int flag=0
temp = top;
for(i=0; j=top;i<=top;i++;j--)
{
if(stack[i] == stack[j]) 
flag=1;
}
if(flag==0)
printf("\nStack contents are Palindrome");
else
printf("\nStack contents are not palindrome");
}
void display( )
{
int i;
printf("\nThe stack contents are:"); 
if(top == -1)
printf("\nStack is Empty");
else
{
for(i=top; i>=0; i--)
printf("\n ------\n| %d |", stack[i]); printf("\n");
}
}
void main( )
{
clrscr();
do{
printf("\n\n----MAIN MENU----\n"); 
printf("\n1. PUSH (Insert) in the Stack");
printf("\n2. POP (Delete) from the Stack"); 
printf("\n3. PALINDROME check using Stack");
printf("\n4. Exit (End the Execution)");
printf("\nEnter Your Choice: ");
scanf("%d", &ch);
switch(ch)
{
case 1: printf("\nEnter a element to be pushed: "); 
scanf("%d", &item);
push( ); 
display( );
break;
 
case 2: tem=pop( ); display( );
 break;
case 3:
palindrome( );
break;
case 4:
exit(0); break;
 default:
printf("\nEND OF EXECUTION");
   }
  }while (ch != 4); 
 getch();
}