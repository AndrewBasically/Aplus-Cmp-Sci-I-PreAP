//(c) A+ Computer Science
//www.apluscompsci.com

//Name - Andrew  
//Date - 3/1/2021
//Class - PreAP Cmp Sci I
//Lab  - ReverseNum

import static java.lang.System.*;

public class ReverseNumberRunner
{
	public static void main( String args[] )
	{
      ReverseNumber reverse = new ReverseNumber( 234 );
      System.out.println( reverse + "\n" );
      
      reverse.setNumber( 10000 );
      System.out.println( reverse + "\n" );
      
      reverse.setNumber( 111 );
      System.out.println( reverse + "\n" );
        
      reverse.setNumber( 9005 );
      System.out.println( reverse + "\n" );
      
      reverse.setNumber( 84645 );
      System.out.println( reverse + "\n" );
      
      reverse.setNumber( 8547 );
      System.out.println( reverse + "\n" );
      
      reverse.setNumber( 123456789 );
      System.out.println(reverse);
	}
}