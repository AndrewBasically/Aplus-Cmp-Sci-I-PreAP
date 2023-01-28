//(c) A+ Computer Science
//www.apluscompsci.com

//Name - Andrew 
//Date - 1/15/2021
//Class - PreAP Cmp Sci I
//Lab  - OddEvenString

import static java.lang.System.*;
import java.util.Scanner;
import static java.lang.Math.*;

public class StringOddOrEven
{
	private String word;

	public StringOddOrEven()
	{
      word="";
	}

	public StringOddOrEven(String s)
	{
      setString(s);
	}

	public void setString(String s)
	{
      word=s;
	}

 	public boolean isEven()
 	{
      if (abs(word.length() % 2) == 0) {return true;}
		return false;
	}

 	public String toString()
 	{
 		String output="";
      if (isEven()) {
         output="even\n\n";
      }
      if (!isEven()) {
         output="odd\n\n";
      }
 		return output;
	}
}