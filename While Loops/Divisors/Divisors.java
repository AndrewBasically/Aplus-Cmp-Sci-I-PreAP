//(c) A+ Computer Science
//www.apluscompsci.com

//Name - Andrew  
//Date - 3/1/2021
//Class - PreAP Cmp Sci I
//Lab  - Divisors

import static java.lang.System.*;

public class Divisors
{
	public static String getDivisors( int number )
	{
		String divisors = "";
      int i = 1;
      do {
         if ( number % i == 0 )
         {
            divisors += i + " ";
         }
         i++;
      } while ( i != number );
		return divisors;
	}
}