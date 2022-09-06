import java.util.*;
class arrayStack
{ int arr[];
int top, max;
arrayStack(int n) 
{ max = n;
arr = new int[max];
top = -1; }
void push(int i) {
if (top == max - 1)
System.out.println("Stack Overflow"); 
  else
arr[++top] = i;
}
void pop() {
if (top == -1) {
System.out.println("Stack Underflow"); } 
  else {
int element = arr[top--];
System.out.println("Popped Element: " + element); }
}
void display() 
{ System.out.print("\nStack = "); 
                if (top == -1) {
System.out.print("Empty\n");
return; }
for (int i = top; i >= 0; i--) 
  System.out.print(arr[i] + " ");
System.out.println(); }
}
class Stack {
public static void main(String[] args) {
Scanner scan = new Scanner(System.in); 
  System.out.println("Enter Size of Integer Stack "); 
  int n = scan.nextInt();
boolean done = false;
  arrayStack stk = new arrayStack(n);
char ch; do {
System.out.println("\nStack Operations"); 
  System.out.println("1. push");
  System.out.println("2. pop"); 
  System.out.println("3. display");
  System.out.println("4. Exit");
int choice = scan.nextInt(); 
  switch (choice) {
case 1:
System.out.println("Enter integer element to push"); 
      stk.push(scan.nextInt());
        break;
case 2:
stk.pop();
break;
case 3:
stk.display();
break;
case 4:
done = true;
break;
default:
System.out.println("Wrong Entry \n ");
      break;
}
} while (!done); }
}
