#include<LPC214x.H> #define CLK1 (1<<16) #define ACLK2 (1<<17) #define STOP3 (1<<18) int main (void)
{
//IO1DIR=0X0007000;
IODIR0 =0XE0;
IOSET0 = 0X80;
while(1)
{
if (!(IOPIN1 &CLK1))
{
IOSET0= (1<<5); IOCLR0=(1<<6); }
if (!(IOPIN1 & ACLK2))
{
IOCLR0= (1<<5); IOSET0=(1<<6); }
if (!(IOPIN1 & STOP3))
{
IOCLR0= (1<<5); IOCLR0=(1<<6); }
}
}
