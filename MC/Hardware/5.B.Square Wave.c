// program to generate square wave with DAC interface

#include <lpc21xx.h>
unsigned int delay;
int main ()
{
	PINSEL1 = 0x00000000 ;						// Configure P0.16 to P0.31 as GPIO
	IO0DIR  = 0x00FF0000 ;
	while(1)
    {
    	IO0PIN = 0x00000000;
			for(delay=0;delay<=950;delay++);
      IO0PIN = 0x00FF0000;
	    for(delay=0;delay<=950;delay++);
    }
}   
