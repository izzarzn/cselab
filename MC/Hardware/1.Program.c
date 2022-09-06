#include<LPC214X.H>
char *msg = "Hello world "; int main()
{
PINSEL0 = 0X5;
U0LCR = 0X83;
U0DLM= 0X00;
U0DLL = 0X61;
U0LCR = 0X03; while(*msg!= 0X00)
{
while (!(U0LSR & 0X20)); U0THR =*msg;
msg++; }
}
