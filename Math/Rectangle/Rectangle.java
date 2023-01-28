//(c) A+ Computer Science
//www.apluscompsci.com

//Name - Andrew 
//Date - 11/18/2020
//Class - PreAP Cmp Sci I, 2nd period
//Lab  - Rectangle

public class Rectangle
{
	private int length;
	private int width;
	private int perimeter;

	public void setLengthWidth(int len, int wid )
	{
		length=len;
		width=wid;
	}

	public void calculatePerimeter( )
	{
      perimeter = length * 2 + width * 2;
	}

	public void print( )
	{
      System.out.printf("The perimeter is :: %d\n\n",perimeter);
	}
}
