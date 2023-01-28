//(c) A+ Computer Science
//www.apluscompsci.com

//Name - Andrew 
//Date - 1/20/2021
//Class - PreAP Cmp Sci I
//Lab  - Number Compare

import static java.lang.System.*;

public class NumberCompare
{
	private int one, two;

	public NumberCompare()
	{
      one=0;
      two=0;
	}

	public NumberCompare(int n1, int n2)
	{
      setNums(n1,n2);
	}

	public void setNums(int n1, int n2)
	{
      one=n1;
      two=n2;
	}

	public int getLargest()
	{
		if(one>two)
		   return one;
		else 
		   return two;
	}

	public int getSmallest()
	{
		if(one>two)
		   return two;
		else 
		   return one;

	}

	public String toString()
	{
		return one + " -- " + two;
	}
}