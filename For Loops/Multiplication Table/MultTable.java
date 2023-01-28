//(c) A+ Computer Science
//www.apluscompsci.com

//Name - Andrew  
//Date - 2/16/2021
//Class - PreAP Cmp Sci I
//Lab  - Multiplication Table

import static java.lang.System.*;

public class MultTable
{
	private int number;
	private int stop;

	public MultTable()
	{
		number = stop = 0;
	}

	public MultTable(int num, int end)
	{
      setTable(num, end);
      printTable();
	}

	public void setTable(int num, int end)
	{
      number = num;
      stop = end;
	}

	public void printTable( )
	{
      out.println("multiplication table for " + number);
      for(int l = 1; l <= stop; l++)
      {
         out.println(l + "\t" + (l * number));
      }
      out.println();
	}
}