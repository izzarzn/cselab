#include<lpc21xx.h>
#include<stdio.h>
#include "lcd_h.h"

/******* FUNCTION PROTOTYPE*******/
void get_key(void);
void display(void);
void scan(void);

unsigned long int scan_code[16]= {0x00EE0000,0x00ED0000,0x00EB0000,0x00E70000,
                                  0x00DE0000,0x00DD0000,0x00DB0000,0x00D70000,
                                  0x00BE0000,0x00BD0000,0x00BB0000,0x00B70000,
                                  0x007E0000,0x007D0000,0x007B0000,0x00770000};


unsigned char ASCII_CODE[16]= {'0','1','2','3',
                               '4','5','6','7',
                               '8','9','A','B',
                               'C','D','E','F'};	 

unsigned char  row,col;										  									
unsigned char flag,i,result;
unsigned long int res1,temp2,temp3;
unsigned char *ptr,disp1[] = "KEY PRESSED = ";
int main()
{	
 	lcd_init();             //lcd intialisation
	delay(3200);			//delay
	ptr = disp1;
	temp1 = 0xC0;			// Display starting address of second line
	lcd_com();
	IO1DIR = 0X00F00000;
        
	while(*ptr!='\0')
    {
    	temp1 = *ptr;
      lcd_data();
	  	ptr ++;
    }
 
  while(1)	
		{	         
			get_key();
		}
      
}  //end of main()	

void get_key(void)                //get the key from the keyboard
{
	unsigned int  i;	
	flag = 0x00;
  IO1PIN=0x000f0000;        
	while(1)
	{		
    for(row=0X00;row<0X04;row++)	//Writing one for col's 
       {					
        	if( row == 0X00)
            { 
            	temp3=0x00700000; 
						}
          else if(row == 0X01)
            { 
            	temp3=0x00B00000;
						}
			  	else if(row == 0X02)
						{
            	temp3=0x00D00000;
						}
          else if(row == 0X03)
						{
            	temp3=0x00E00000;
						}
          IO1PIN = temp3;	
					scan();
          delay(100);			//delay
          if(flag == 0xff) 
          break;
       	} // end of for
		if(flag == 0xff)
		break;
	}  // end of while	
  
  for(i=0;i<16;i++)
    {
    	if(scan_code[i] == res1)      //equate the scan_code with res1
    	{
				result =  ASCII_CODE[i];    //same position value of ascii code
				temp1 = 0xCE;			//display  address for key value
				lcd_com();
				delay(3200);			//delay
				temp1 = result;    
				lcd_data();
				delay(3200);			//delay	
				break;                      //is assigned to result
     	}
    }
}// end of get_key(); 

void scan(void)
{	
    temp2 = IO1PIN;                             // status of port1
    temp2 = temp2 & 0x000F0000;                 // Verifying column key
    if(temp2 != 0x000F0000)                     // Check for Key Press or Not
    {
    	delay(1000);                              //delay(100)//give debounce delay check again
    	temp2 = IO1PIN; 		
      temp2 = temp2 & 0x000F0000;              //changed condition is same 

      if(temp2 != 0x000F0000)                // store the value in res1
       {
         flag = 0xff;
         res1 = temp2 | temp3;
			 }
      else
       {
         flag = 0x00;
       }
    }
}  // end of scan()
