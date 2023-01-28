//(c) A+ Computer Science
//www.apluscompsci.com

//Name - Andrew  
//Date - 2/26/2021
//Class - PreAP Cmp Sci I
//Lab  - Digit Average

import static java.lang.System.*;

public class DigitMath
{
   private static int countDigits( int number )
	{
		int count = 0;
      while(number > 0)
      {
         count++;
         number = number / 10;
      };
		return count;
	}

	private static double sumDigits( int number )
	{
		double sum = 0;
      while(number>0)
      {
         sum = sum + number % 10;
         number = number / 10;
      };
		return sum;
	}

	public static double averageDigits( int number )
	{
      return sumDigits(number) / countDigits(number);
	}
}