//(c) A+ Computer Science
//www.apluscompsci.com

//Name - Andrew 
//Date - 4/13/2021
//Class - Cmp Sci I PreAP
//Lab  - Counter

import java.util.Scanner;
import static java.lang.System.*;  

public class LineCounterRunner
{
   public static void main( String args[] )
   {
      LineCounter lc = new LineCounter("9 10 5 20 1 2 3");
      System.out.println(lc + "\n\n");
       
      lc.setLine("11 22 33 44 55 66 77 5 6 7");
      System.out.println(lc + "\n\n");
       
      lc.setLine("48 52 29 100 50 293 4");
      System.out.println(lc + "\n\n");
       
      lc.setLine("0");
      System.out.println(lc + "\n\n");
       
      lc.setLine("100 90 95 98 100 97");
      System.out.println(lc + "\n\n");
	}
}