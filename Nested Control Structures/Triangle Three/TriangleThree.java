//(c) A+ Computer Science
// www.apluscompsci.com

//Name - Andrew  
//Date - 4/5/2021
//Class - PreAP Cmp Sci I
//Lab  - Triangle Letters 3

import static java.lang.System.*;

public class TriangleThree
{
   private int size;
   private String letter;

	public TriangleThree()
	{
      size = 0;
      letter = "";
	}

	public TriangleThree(int count, String let)
	{
      setTriangle(let, count);
	}

	public void setTriangle( String let, int sz )
	{
      letter = let;
      size = sz;
	}

	public String getLetter() 
	{
      String output = "";
      for (int i = 1; i <= size; i++) {
			for (int j = size - 1; j >= i; j--)
         {
				output += " ";
			};
			for (int j = i - 1; j >= 0; j--)
         {
				output += letter;
			};
         output += "\n";
      };
		return output;
	}

	public String toString()
	{
		return getLetter();
	}
}