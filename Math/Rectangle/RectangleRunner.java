//(c) A+ Computer Science
//www.apluscompsci.com

//Name - Andrew 
//Date - 11/18/2020
//Class - PreAP Cmp Sci I, 2nd period
//Lab  - Rectangle

public class RectangleRunner
{
	public static void main( String[] args )
	{
		Rectangle test = new Rectangle();
		test.setLengthWidth(2,6);
		test.calculatePerimeter( );
		test.print();

		test.setLengthWidth(12,5);
		test.calculatePerimeter( );
		test.print();

		//add more test cases
		
      test.setLengthWidth(131,75);
		test.calculatePerimeter( );
		test.print();
      
      test.setLengthWidth(20,25);
		test.calculatePerimeter( );
		test.print();
      
      test.setLengthWidth(9,256);
		test.calculatePerimeter( );
		test.print();
      
      test.setLengthWidth(36,72);
		test.calculatePerimeter( );
		test.print();
	}
}