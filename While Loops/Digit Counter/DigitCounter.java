//(c) A+ Computer Science
//www.apluscompsci.com

//Name - Andrew  
//Date - 2/24/2021
//Class - PreAP Cmp Sci I
//Lab - Digit Counter

import static java.lang.System.*;

public class DigitCounter
{
   public static int countDigits( int number )
	{
		int count = 0;
      while(number > 0)
      {
         count++;
         number = number / 10;
      }
      return count;
	}
}