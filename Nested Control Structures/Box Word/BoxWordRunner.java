//(c) A+ Computer Science
//www.apluscompsci.com

//Name - Andrew  
//Date - 4/7/2021
//Class - PreAP Cmp Sci I
//Lab  - BoxWord

import java.util.Scanner;
import static java.lang.System.*;

public class BoxWordRunner
{
   public static void main( String args[] )
   {
      Scanner keyboard = new Scanner(System.in);
   	String choice="";
		do{
			out.print("Enter a word : ");
			String w = keyboard.next();

				//instantiate a BoxWord object
         BoxWord bw = new BoxWord( w );
         	//call the toString method to print the triangle 
			System.out.println( bw );

			System.out.print("Do you want to enter more data? ");
			choice=keyboard.next();
		}while(choice.equals("Y")||choice.equals("y"));
	}
}