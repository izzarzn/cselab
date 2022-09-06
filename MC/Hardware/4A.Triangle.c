#include <LPC214x.H> Init_DAC()
{
PINSEL1 = 0X00080000; DACR = 0;
}
Write_DAC(unsigned int dacval) {
DACR = dacval<< 6;
}
int main (void)
{
unsigned int i; Init_DAC();
  while(1)
{
for(i=0;i<1024;i++) 
  Write_DAC(i);
    for(i=1024;i>0;i--)
      Write_DAC(i);
}
}
