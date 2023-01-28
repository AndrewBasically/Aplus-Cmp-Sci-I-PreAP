//(c) A+ Computer Science
//www.apluscompsci.com

//Name - Andrew 
//Date - 4/15/2021
//Class - Cmp Sci I PreAP
//Lab  - OddEven

import static java.lang.System.*;

public class OddOrEven
{
	private int number;

	public OddOrEven()
	{
      setNum(0);
	}

	public OddOrEven(int num)
	{
      setNum(num);
	}

	public void setNum(int num)
	{
      number = num;
	}

	public boolean isOdd( )
	{
      if (number % 2 == 1)
      {
         return true;
      }else{
		   return false;
      }
	}

	public String toString()
	{
      if (isOdd())
      {
         return number + " is odd.\n\n";
      }else{
		   return number + " is even.\n\n";
      }
	}
}