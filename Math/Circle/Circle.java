//(c) A+ Computer Science
// www.apluscompsci.com

//Name - Andrew 
//Date - 12/1/2020
//Class - PreAP Cmp Sci I
//Lab  - Circle

import java.lang.Math;

public class Circle
{
	private double radius;
	private double area;

	public void setRadius(double rad)
	{
      radius=rad;
	}

	public void calculateArea( )
	{
      area = Math.PI * radius * radius;
	}

	public void print( )
	{
      System.out.printf("The area is :: %.4f\n\n", area);
	}
}