//(c) A+ Computer Science
//www.apluscompsci.com

//Name - Andrew 
//Date - 1/13/2021
//Class - PreAP Cmp Sci I
//Lab  - Discount

import static java.lang.System.*;
import java.util.Scanner;

public class DiscountRunner
{
	public static void main( String args[] )
	{
		Scanner keyboard = new Scanner(System.in);
      Discount myDiscount = new Discount();
		
		out.print("Enter the original bill amount :: ");
		double amt = keyboard.nextDouble();
      out.printf("Bill after discount :: %.2f", myDiscount.getDiscountedBill(amt));
      
      out.print("\n\nEnter the original bill amount :: ");
		amt = keyboard.nextDouble();
      out.printf("Bill after discount :: %.2f", myDiscount.getDiscountedBill(amt));
		
      out.print("\n\nEnter the original bill amount :: ");
		amt = keyboard.nextDouble();
      out.printf("Bill after discount :: %.2f", myDiscount.getDiscountedBill(amt));
      
      out.print("\n\nEnter the original bill amount :: ");
		amt = keyboard.nextDouble();
      out.printf("Bill after discount :: %.2f", myDiscount.getDiscountedBill(amt));
      
      out.print("\n\nEnter the original bill amount :: ");
		amt = keyboard.nextDouble();
      out.printf("Bill after discount :: %.2f", myDiscount.getDiscountedBill(amt));
	}
}