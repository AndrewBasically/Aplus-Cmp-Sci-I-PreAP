//(c) A+ Computer Science
//www.apluscompsci.com

//Name - Andrew  
//Date - 2/26/2021
//Class - PreAP Cmp Sci I
//Lab  - Digit Average

import static java.lang.System.*;

public class DigitMathRunner
{
	public static void main( String args[] )
	{
		//add test cases
      System.out.println( "234 has a digit average of " + DigitMath.averageDigits( 234 ) + "\n");
      
      System.out.println( "10000 has a digit average of " + DigitMath.averageDigits( 10000 ) + "\n");
      
      System.out.println( "111 has a digit average of " + DigitMath.averageDigits( 111 ) + "\n");
      
      System.out.println( "9005 has a digit average of " + DigitMath.averageDigits( 9005 ) + "\n");
      
      System.out.println( "84645 has a digit average of " + DigitMath.averageDigits( 84645 ) + "\n");
      
      System.out.println( "8547 has a digit average of " + DigitMath.averageDigits( 8547 ) + "\n");
      
      System.out.println( "123456789 has a digit average of " + DigitMath.averageDigits( 123456789 ) + "\n");
	}
}