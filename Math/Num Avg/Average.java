//(c) A+ Computer Science
//www.apluscompsci.com

//Name - Andrew 
//Date - 11/20/2020
//Class - PreAP Cmp Sci I
//Lab  - NumAvg

public class Average
{
	//instance variables
	private double one, two, average;

	public void setNums(double num1, double num2)
	{
      one=num1;
      two=num2;
	}

	public void average( )
	{
		double sum = 0;
      sum = one + two;
      average = sum / 2;
	}
	public void print( )
	{
      System.out.printf("%.1f + %.1f has an average of %.2f\n\n",one, two, average);
	}
}