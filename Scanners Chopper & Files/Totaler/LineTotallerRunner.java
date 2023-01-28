//(c) A+ Computer Science
//www.apluscompsci.com

//Name - Andrew 
//Date - 4/13/2021
//Class - Cmp Sci I PreAP
//Lab  - Totaller

import static java.lang.System.*;
import java.util.Scanner;

public class LineTotallerRunner
{
   public static void main( String args[] )
   {
      LineTotaller lt = new LineTotaller("1 2 3 4 5 6");
      System.out.println(lt + "\n\n");
      
      lt.setLine("10 20 30 40 50 60");
      System.out.println(lt + "\n\n");
      
      lt.setLine("250 657 2154 345 6796");
      System.out.println(lt + "\n\n");
      
      lt.setLine("0");
      System.out.println(lt + "\n\n");
      
      lt.setLine("-99 45 -98 92 87");
      System.out.println(lt);
	}
}