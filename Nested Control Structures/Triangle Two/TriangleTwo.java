//(c) A+ Computer Science
// www.apluscompsci.com

//Name - Andrew  
//Date - 4/5/2021
//Class - PreAP Cmp Sci I
//Lab  - Triangle Letters 2

import static java.lang.System.*;

public class TriangleTwo
{
   private int size;
   private String letter, output;

	public TriangleTwo()
	{
      size = 0;
      letter = "";
	}

	public TriangleTwo( String let, int sz)
	{
      setTriangle(sz, let);
	}

	public void setTriangle(int count, String let)
	{
      size = count;
      letter = let;
	}

	public String getLetter()
	{
      String output = "";
      for (int i = size; i > 0; i--)
      {
         for (int j = i; j > 0; j--)
         {
            output += letter + "";
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