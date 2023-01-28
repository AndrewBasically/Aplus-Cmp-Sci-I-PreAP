   //(c) A+ Computer Science
//www.apluscompsci.com

//Name - Andrew  
//Date - 3/1/2021
//Class - PreAP Cmp Sci I
//Lab  - Divisors

import static java.lang.System.*;

public class DivisorsRunner
{
	public static void main( String args[] )
	{
		//add test cases
      System.out.println( "10 has divisors " + Divisors.getDivisors(10) + "\n" );
      System.out.println( "45 has divisors " + Divisors.getDivisors(45) + "\n" );
      System.out.println( "14 has divisors " + Divisors.getDivisors(14) + "\n" );
      System.out.println( "1024 has divisors " + Divisors.getDivisors(1024) + "\n" );
      System.out.println( "1245 has divisors " + Divisors.getDivisors(1245) + "\n" );
      System.out.println( "33 has divisors " + Divisors.getDivisors(33) + "\n" );
      System.out.println( "65535 has divisors " + Divisors.getDivisors(65535) );
	}
}