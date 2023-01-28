//(c) A+ Computer Science
// www.apluscompsci.com

//Name - Andrew  
//Date - 3/29/2021
//Class - PreAP Cmp Sci I
//Lab  - Biggest String 

import static java.lang.System.*;

public class StringRunner
{
	public static void main(String args[])
	{
		BiggestString big = new BiggestString("abc", "cba", "bca");
      
      big.setStrings("one", "fourteen", "twenty");
      System.out.println(big.toString());
      
      big.setStrings("124323", "20009", "3434");
      System.out.println(big.toString());
      
      big.setStrings("abcde", "ABCDE", "1234234324");
      System.out.println(big.toString());
	}
}