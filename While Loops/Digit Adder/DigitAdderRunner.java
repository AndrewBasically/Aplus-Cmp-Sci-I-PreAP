//(c) A+ Computer Science
//www.apluscompsci.com

//Name - Andrew  
//Date - 2/24/2021
//Class - PreAP Cmp Sci I
//Lab  - Digit Adder

import static java.lang.System.*;

public class DigitAdderRunner
{
	public static void main( String args[] )
	{
		//add test cases 
      System.out.println( DigitAdder.sumDigits( 234 ) + " is the sum of the digits of 234\n");
      System.out.println( DigitAdder.sumDigits( 10000 ) + " is the sum of the digits of 10000\n");
      System.out.println( DigitAdder.sumDigits( 111 ) + " is the sum of the digits of 111\n");
      System.out.println( DigitAdder.sumDigits( 9005 ) + " is the sum of the digits of 9005\n");
      System.out.println( DigitAdder.sumDigits( 84645 ) + " is the sum of the digits of 84645\n");
      System.out.println( DigitAdder.sumDigits( 8547 ) + " is the sum of the digits of 8547\n");
      System.out.println( DigitAdder.sumDigits( 123456789 ) + " is the sum of the digits of 123456789");
	}
}