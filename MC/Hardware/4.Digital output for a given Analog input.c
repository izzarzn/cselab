include <lpc214x.h> #include <Stdio.h>
#define vol 3.3 //
Reference voltage #define
fullscale 0x3f
//10 bit adc fullscale
unsigned int
data_lcd=0,i=0,n=0;
unsigned int
adc_value=0,temp_adc=0,temp1,temp2,
adc[8]; float temp,adc1[8];
unsigned char var[15],var1[15],fst_flag=0xff; unsigned char *ptr,arr[]= "ADC O/P= ";
unsigned char *ptr1,dis[]="A I/P = ";nit(void); void wr_cn(void); void clr_disp(void);
void
delay
int main()
{
PINSEL1 = 0X04000000;
//AD0.2 pin is
selected IO0DIR = 0x000000FC;
//configure o/p
lines for lcd
delay(3200);
lcd_init(); //LCD initialization
delay(3200);
clr_disp(); //clear display
delay(3200); //delay
ptr = dis;
temp1 = 0x80; //Display starting address of 1st
line on LCD lcd_com();
delay(800);
while(*ptr!='\0')
 ptr; lcd_data();
ptr ++;
}

