//(c) A+ Computer Science
//www.apluscompsci.com

//Name - Andrew 
//Date - 1/14/2021
//Class - PreAP Cmp Sci I
//Lab  - OddEven#

import static java.lang.System.*;
import static java.lang.Math.*;

public class NumberVerify
{
	public static boolean isOdd( int num )
	{
      if (abs(num % 2) == 0) {
         return false;
      }
		return true;
	}
	public static boolean isEven( int num )
	{
      if (abs(num % 2) == 1) {
         return false;
      }
		return true;
	}	
}