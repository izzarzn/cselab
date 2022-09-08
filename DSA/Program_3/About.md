### Question - Design, Develop and Implement a menu driven program in C for the following operations on **STACK** of integers (Array implementation of stack with maximum size MAX)

a. Push an element on to stack

b. Pop an element from stack.

c. Demonstrate how stack can be used to check palindrome.

d. Demonstrate Overflow and Underflow situations on stack.

e. Display the status of stack.

f. Exit.

Support the program with appropriate functions for each of the above operations.

### ABOUT THE EXPERIMENT:
A stack is an abstract data type (ADT), commonly used in most programming languages. It is named stack as it behaves like a real-world stack, for example − deck of cards or pile of plates etc.

A real-world stack allows operations at one end only. For example, we can place or remove a card or plate from top of the stack only. LikewCSE, Stack ADT allows all data operations at one end only. At any given time, we can only access the top element of a stack.

This feature makes it LIFO data structure. LIFO stands for Last-in-first-out. Here, the element which is placed (inserted or added) last is accessed first. In stack terminology, insertion operation is called **PUSH** operation and removal operation is called **POP** operation.

Below given diagram tries to depict a stack and its operations −

A stack can be implemented by means of Array, Structure, Pointer and Linked-List. Stack can either be a fixed size one or it may have a sense of dynamic resizing. Here, we are going to implement stack using arrays which makes it a fixed size stack implementation.

### Basic Operations:
- **push()** - pushing (storing) an element on the stack.
- **pop()** - removing (accessing) an element from the stack.

To use a stack efficiently we need to check status of stack as well. For the same purpose, the following 
functionality is added to stacks;

- **peek()** − get the top data element of the stack, without removing it.
- **isFull()** − check if stack is full.
- **CSEmpty()** − check if stack is empty.

### ALGORITHM:
Step 1: Start.

Step 2: Initialize stack size MAX and top of stack -1.

Step 3:  
* Push integer element on to stack and display the contents of the stack.if stack is full give a message as ‘Stack is Overflow’.
       
* Pop element from stack along with display the stack contents.if stack is empty give a message as ‘Stack is Underflow’.

Step 4: Check whether the stack contents are Palindrome or not.

Step 5: Stop.
