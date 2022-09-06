#include <LPC214x.H> /* LPC214x definitions */ 
Init_DAC()
{
PINSEL1 = 0X00080000; 
  DACR = 0;
}
Write_DAC(unsigned int dacval)
{
DACR = dacval<< 6;
}
void delay(unsigned int count)
{
int j=0,i=0; for(j=0;j<count;j++)
{
for(i=0;i<120;i++);
}
}
int main (void)
{
Init_DAC(); while(1)
{
Write_DAC(00);
delay(10); // change this value to change Frequency = TON
Write_DAC(1000); // change this value to change Amplitude delay(100);
  delay(20); // change this value to change Frequency = TOFF
}
}
{
