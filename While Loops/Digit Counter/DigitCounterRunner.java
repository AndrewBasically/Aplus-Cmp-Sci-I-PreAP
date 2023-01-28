//(c) A+ Computer Science
//www.apluscompsci.com

//Name - Andrew  
//Date - 2/24/2021
//Class - PreAP Cmp Sci I
//Lab - Digit Counter

import static java.lang.System.*;

public class DigitCounterRunner
{
	public static void main( String args[] )
	{
		//add test cases
      System.out.println( "234 contains " + DigitCounter.countDigits( 234 ) + " digits\n" );
      System.out.println( "10000 contains " + DigitCounter.countDigits( 10000 ) + " digits\n" );
      System.out.println( "111 contains " + DigitCounter.countDigits( 111 ) + " digits\n" );
      System.out.println( "9005 contains " + DigitCounter.countDigits( 9005 ) + " digits\n" );
      System.out.println( "84645 contains " + DigitCounter.countDigits( 84645 ) + " digits\n" );
      System.out.println( "8547 contains " + DigitCounter.countDigits( 8547 ) + " digits\n" );
      System.out.println( "123456789 contains " + DigitCounter.countDigits( 123456789 ) + " digits\n" );
	}
}