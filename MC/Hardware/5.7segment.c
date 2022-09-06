#include<LPC214x.H>
#define DIG1 (1<<10)
unsigned char ssc[]={0x88,0xeb,0x4c,0x49,0x2b,0x19,0x18, 0xcb,0x8,0x9,0xa,0x38,0x9c,0x68,0x1c,0x1e} ;
void delay()
{
unsigned int i,j=0;
for( i=0;i<4000000;i++) j++; }
int main(void)
{
int count;
IODIR0 = 0XFFFFFFFF; 
  while(1)
{
for( count=0;count<16;count++) {
IOCLR0 = 0x007F8000;
IOSET0= (ssc[count]<<15); 
  IOSET0 = DIG1;
delay();
}
}
}
