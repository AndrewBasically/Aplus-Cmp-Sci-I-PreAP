//(c) A+ Computer Science
//www.apluscompsci.com

//Name - Andrew 
//Date - 4/26/2021
//Class - PreAP Cmp Sci I
//Lab  - Array Find Smallest

public class SmallestRunner
{
	public static void main( String args[] )
	{
      RaySmallest rs = new RaySmallest();
      
      int [] array1 = {-99,1,2,3,4,5,6,7,8,9,10,12345};
      System.out.println( rs.go( array1 ) );
      int [] array2 = {10,9,8,7,6,5,4,3,2,1,-99};
      System.out.println( rs.go( array2 ) );
      int [] array3 = {10,20,30,40,50,-11818,40,30,20,10};
      System.out.println( rs.go( array3 ) );
      int [] array4 = {32767};
      System.out.println( rs.go( array4 ) );
      int [] array5 = {255,255};
      System.out.println( rs.go( array5 ) );
      int [] array6 = {9,10,-88,100,-555,1000};
      System.out.println( rs.go( array6 ) );
      int [] array7 = {10,10,10,11,456};
      System.out.println( rs.go( array7 ) );
      int [] array8 = {-111,1,2,3,9,11,20,30};
      System.out.println( rs.go( array8 ) );
      int [] array9 = {9,8,7,6,5,4,3,2,0,-2,-989};
      System.out.println( rs.go( array9 ) );
      int [] array10 = {12,15,18,21,23,1000};
      System.out.println( rs.go( array10 ) );
      int [] array11 = {250,19,17,15,13,11,10,9,6,3,2,1,-455};
      System.out.println( rs.go( array11 ) );
      int [] array12 = {9,10,-8,10000,-5000,1000};
      System.out.println( rs.go( array12 ) );
	}
}