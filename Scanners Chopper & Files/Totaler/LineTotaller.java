//(c) A+ Computer Science
//www.apluscompsci.com

//Name - Andrew 
//Date - 4/13/2021
//Class - Cmp Sci I PreAP
//Lab  - Totaller

import static java.lang.System.*;
import java.util.Scanner;

public class LineTotaller
{
   private String line;

	public LineTotaller()
	{
		setLine("");
	}

	public LineTotaller(String s)
	{
      setLine(s);
	}

	public void setLine(String s)
	{
      line = s;
	}

	public int getSum()
	{
		int total = 0;
      Scanner l = new Scanner(line);
      while (l.hasNextInt())
      {
         total += l.nextInt();
      }
		return total;
	}

	public String getLine()
	{
		return line;
	}

	public String toString()
	{
		return getLine() + "\nsum = " + getSum();
	}
}