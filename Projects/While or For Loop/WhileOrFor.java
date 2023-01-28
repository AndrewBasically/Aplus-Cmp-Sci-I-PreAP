//(c) A+ Computer Science
//www.apluscompsci.com

//Name - Andrew  
//Date - 3/4/2021
//Class - PreAP Cmp Sci I
//Lab  - While or For loop

import static java.lang.System.*;

public class WhileOrFor
{
   public static void main( String args[] )
   {
   	//while loop
      out.println("\n   ***** While Loop String Cleaner **** \n");		
      String original="I am Sam I am";
      char lookFor = 'a';
      String cleaned = original;
      out.print(original + " with the letter " + lookFor + " removed by a while loop is ");
      int loc = cleaned.indexOf(lookFor);
      while(loc> -1)
      {
         cleaned = cleaned.substring(0, loc) + cleaned.substring(loc + 1);
         loc = cleaned.indexOf(lookFor);
      }
      out.println(cleaned);
      out.println();
      
      out.println("\n   ***** For Loop String Cleaner **** \n");		
      // rewrite the while loop above as a for loop below here	
      out.print(original + " with the letter " + lookFor + " removed by a for loop is ");
      
      for(int loc2 = cleaned.indexOf(lookFor); loc> -1; loc = cleaned.indexOf(lookFor))
      {
         cleaned = cleaned.substring(0, loc) + cleaned.substring(loc + 1);
      }
      out.println(cleaned);
      out.println();
      
      //for loop
      out.println("\n   ***** For Loop Common Divisor **** \n");		
      int one = 528;
      int two = 60;
      out.println("The for loop determined the common divisors of " + one + " and " + two + " are ");
      for(int i = one; i > 1; i--)
      {
         if(one % i == 0 )
            if (two % i == 0)
               out.print(i + " ");
      }
      out.println();
      out.println();
      
      out.println("\n   ***** For Loop String Cleaner **** \n");	
      // rewrite the for loop above as a while loop below here	
      int i = one;
      out.println("The while loop determined the common divisors of " + one + " and " + two + " are ");
      while(i > 1)
      {
         if(one % i == 0 )
            if (two % i == 0)
               out.print(i + " ");
         i--;
      }
      out.println();
      out.println("\n   ***** My Total Loop My Way **** \n");	
      // write a loop (for or while, your choice) that totals even numbers from 1 to 1000 and prints only the total
      int total = 0;
      for(int j = 1; j <= 1000; j++)
      {
         if(j % 2 == 0)
         {
            total += j;
         }
      };
      out.println("The total of even numbers from 1 to 1000 using a for loop is " + total);
      out.println();
      
      total = 0;
      int j = 1;
      while(j <= 1000)
      {
         if(j % 2 == 0)
         {
            total += j;
         }
         j++;
      };
      out.println("The total of even numbers from 1 to 1000 using a while loop is " + total);
   }
}