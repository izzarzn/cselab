#include <LPC214x.H> 
#define CLK (1 << 16) //KEY1, P1.16
#define ACLK (1 << 17) //KEY5, P1.17
void delay(unsigned int count)
{
int j=0,i=0; for(j=0;j<count;j++) {
for(i=0;i<500;i++); }
}
int main (void)
{
int i;
IO1DIR = 0x0F000000; 
  IO1CLR = 0x0F000000; 
  PINSEL2 = 0x0; 
  while(1)
{
if (!(IO1PIN & ACLK) ) 
  for(i=0;i<50;i++)
{
IO1PIN = 0X01000000; 
  delay(200);
  IO1PIN = 0X02000000; 
    delay(200);
    IO1PIN = 0X04000000; 
    delay(200); 
    IO1PIN = 0X08000000;
    delay(200);
}
if (!(IO1PIN & CLK) ) for(i=0;i<50;i++)
{
IO1PIN = 0X08000000; 
  delay(200);
IO1PIN = 0X04000000;
  delay(200);
IO1PIN = 0X02000000; 
  delay(200);
IO1PIN = 0X01000000;
  delay(200);
}
}
}
