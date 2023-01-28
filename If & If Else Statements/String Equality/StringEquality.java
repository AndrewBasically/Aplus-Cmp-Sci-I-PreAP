//(c) A+ Computer Science
//www.apluscompsci.com

//Name - Andrew 
//Date - 1/20/2021
//Class - PreAP Cmp Sci I
//Lab  - StringEquality

import static java.lang.System.*;

public class StringEquality
{
	private String wordOne, wordTwo;

	public StringEquality()
	{
      wordOne="";
      wordTwo="";
	}

	public StringEquality(String one, String two)
	{
      setWords(one, two);
	}

	public void setWords(String one, String two)
	{
      wordOne=one;
      wordTwo=two;
	}

	public boolean checkEquality( )
	{
      if (wordOne == wordTwo) return true;
		return false;
	}

	public String toString()
	{
      if (checkEquality()) return wordOne + " has the same letters as " + wordTwo + "\n";
		return wordOne + " does not have the same letters as " + wordTwo + "\n";
	}
}