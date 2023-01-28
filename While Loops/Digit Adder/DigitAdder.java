//(c) A+ Computer Science
//www.apluscompsci.com

//Name - Andrew  
//Date - 2/24/2021
//Class - PreAP Cmp Sci I
//Lab  - Digit Adder

import static java.lang.System.*; 

public class DigitAdder
{
   public static int sumDigits( int number )
	{
		int sum=0;
      while(number>0)
      {
        sum = sum + number % 10;
        number = number / 10;
      };
		return sum;
	}
}