//(c)  A+ Computer Science
//www.apluscompsci.com

//Name - Andrew 
//Date - 1/7/2021
//Class - PreAP Cmp Sci I
//Lab  - String Basics

import static java.lang.System.*;

public class AddStrings
{
   private String first, last;
   private String sum;

   public AddStrings()
   {
   first ="";
   last ="";
   sum = "";
   }

   public AddStrings(String one, String two)
   {
   setStrings(one, two);
   add();
    
   }

   public void setStrings(String one, String two)
   {
   first = one;
   last = two;
   }

 	public void add( )
 	{
   sum = first;
   sum = sum.concat(" ");
   sum = sum.concat(last);
	}

 	public String toString()
 	{
 		String output="";
      output = "first :: " + first + "\nlast  :: " + last + "\nsum   :: " + sum + "\n";
 		return output;
	}
}