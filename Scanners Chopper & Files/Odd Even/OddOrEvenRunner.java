//(c) A+ Computer Science
//www.apluscompsci.com

//Name - Andrew 
//Date - 4/15/2021
//Class - Cmp Sci I PreAP
//Lab  - OddEven

import java.io.IOException;
import java.io.File;
import java.util.Scanner;
import static java.lang.System.*;

public class OddOrEvenRunner
{
	public static void main( String args[] ) throws IOException
	{
		Scanner file = new Scanner(new File("oddoreven.dat"));
      int size = file.nextInt();
      file.nextLine();
      for(int i = 0; i < size; i++)
      {
         int num = file.nextInt();
         //instantiate an OddOrEven
         OddOrEven OddOrEven = new OddOrEven(num);
         System.out.println(OddOrEven);
      }
   }
}