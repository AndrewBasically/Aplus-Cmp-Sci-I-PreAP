//(c) A+ Computer Science
//www.apluscompsci.com

//Name - Andrew  
//Date - 3/1/2021
//Class - PreAP Cmp Sci I
//Lab  - ReverseNum

import static java.lang.System.*;

public class ReverseNumber
{
   private int num;
   private String reverse;

	//add constructors
   public ReverseNumber()
   {
      num = 0;
      reverse = "";
   }
   
   public ReverseNumber( int number )
   {
      setNumber( number );
   }
	
	//add a set method
   public void setNumber( int number)
   {
      num = number;
   }

	public int getReverse()
	{
		int rev = 0;
      int last = 0;
      
      while ( num > 0)
      {
         last = num % 10;
         rev = 10 * rev + last;
         num /= 10;
      }
		return rev;
	}

	//add  a toString	
	public String toString()
   {
      return num + " reversed is " + getReverse();
   }
}