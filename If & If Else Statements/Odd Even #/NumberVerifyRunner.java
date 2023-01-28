//(c) A+ Computer Science
//www.apluscompsci.com

//Name - Andrew 
//Date - 1/14/2021
//Class - PreAP Cmp Sci I
//Lab  - OddEven#

import static java.lang.System.*;
import java.util.Scanner;

public class NumberVerifyRunner
{
	public static void main ( String[] args )
	{
      //add in input
      Scanner keyboard = new Scanner(System.in);
      out.print("Enter a whole number :: ");
      int number = keyboard.nextInt();
		out.printf("%d is odd  :: %b\n", number, NumberVerify.isOdd(number) );
      out.printf("%d is even :: %b\n\n", number, NumberVerify.isEven(number) );
      
      //add in more test cases
      out.print("Enter a whole number :: ");
      number = keyboard.nextInt();
		out.printf("%d is odd  :: %b\n", number, NumberVerify.isOdd(number) );
      out.printf("%d is even :: %b\n\n", number, NumberVerify.isEven(number) );
      
      out.print("Enter a whole number :: ");
      number = keyboard.nextInt();
		out.printf("%d is odd  :: %b\n", number, NumberVerify.isOdd(number) );
      out.printf("%d is even :: %b\n\n", number, NumberVerify.isEven(number) );
      
      out.print("Enter a whole number :: ");
      number = keyboard.nextInt();
		out.printf("%d is odd  :: %b\n", number, NumberVerify.isOdd(number) );
      out.printf("%d is even :: %b\n\n", number, NumberVerify.isEven(number) );
      
      out.print("Enter a whole number :: ");
      number = keyboard.nextInt();
		out.printf("%d is odd  :: %b\n", number, NumberVerify.isOdd(number) );
      out.printf("%d is even :: %b", number, NumberVerify.isEven(number) );
	}
}