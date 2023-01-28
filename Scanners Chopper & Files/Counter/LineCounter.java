//(c) A+ Computer Science
//www.apluscompsci.com

//Name - Andrew 
//Date - 4/13/2021
//Class - Cmp Sci I PreAP
//Lab  - Counter

import java.util.Scanner;
import static java.lang.System.*;

public class LineCounter
{
   private String line;

   public LineCounter()
   {
		setLine("");
   }

   public LineCounter(String s)
   {
      setLine(s);
   }

	public void setLine(String s)
	{
      line = s;
	}

	public int getCount()
	{
		int count = 0;
      Scanner l = new Scanner(line);
      while (l.hasNextInt())
      {
         l.nextInt();
         count++;
      }
		return count;
	}

	public String getLine()
	{
		return line;
	}

	public String toString()
	{
		return getLine() + "\nCount = " + getCount();
	}
}