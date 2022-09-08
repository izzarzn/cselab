#include <LPC21xx.h>
unsigned long int temp=0x00000000; 
  	
int main ()
{
	unsigned int i=0;

  IO0DIR=0x00FF0000;//PIN
   
  while(1)
   {
    	// output 0 to FE 
     for(i=0;i!=0xFF;i++)
		  {
       	temp=i;
       	temp = temp << 16;
       	IO0PIN=temp;
      }
       	
		// output FF to 1   
      for(i=0xFF; i!=0;i--)
      {
       	temp=i;
       	temp = temp << 16;
       	IO0PIN=temp;
      }
	}//End of while(1)
}//End of main()
