//(c) A+ Computer Science
// www.apluscompsci.com

//Name - Andrew  
//Date - 4/5/2021
//Class - PreAP Cmp Sci I
//Lab  - Triangle Letters 4

import java.util.Scanner;
import static java.lang.System.*;

public class TriangleFourRunner
{
   public static void main( String args[] )
   {
   	Scanner keyboard = new Scanner(System.in);
   	String choice="";
		do{
			out.print("Enter the size of the triangle : ");
			int big = keyboard.nextInt();
			out.print("Enter a letter : ");
			String value = keyboard.next();

				//instantiate a TriangleFour object
      TriangleFour tw = new TriangleFour( big, value );
         	//call the toString method to print the triangle 
			System.out.println( tw );

			System.out.print("Do you want to enter more data? ");
			choice=keyboard.next();
		}while(choice.equals("Y")||choice.equals("y"));
	}
}