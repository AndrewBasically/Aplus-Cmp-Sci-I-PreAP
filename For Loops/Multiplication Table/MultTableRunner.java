//(c) A+ Computer Science
//www.apluscompsci.com

//Name - Andrew  
//Date - 2/16/2021
//Class - PreAP Cmp Sci I
//Lab  - Multiplication Table

import static java.lang.System.*;

public class MultTableRunner
{
	public static void main ( String[] args )
	{
		//add test cases
		MultTable table = new MultTable(5, 5);
      
      table.setTable(3, 7);
      table.printTable();
      
      table.setTable(1, 6);
      table.printTable();
      
      table.setTable(9, 9);
      table.printTable();
      
      table.setTable(7, 8);
      table.printTable();
	}
}