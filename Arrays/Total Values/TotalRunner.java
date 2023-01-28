//(c) A+ Computer Science
//www.apluscompsci.com

//Name - Andrew 
//Date - 4/22/2021
//Class - PreAP Cmp Sci I
//Lab  - ArrayTotal Value

public class TotalRunner
{
	public static void main( String args[] )
	{
		RayTotal rt = new RayTotal();
		
		int [] array1 = {-99,1,2,3,4,5,6,7,8,9,10,12345};
		System.out.println( rt.go( array1 ) );
      int [] array2 = {10,9,8,7,6,5,4,3,2,1,-99};
		System.out.println( rt.go( array2 ) );
      int [] array3 = {10,20,30,40,50,-11818,40,30,20,10};
		System.out.println( rt.go( array3 ) );
      int [] array4 = {32767};
		System.out.println( rt.go( array4 ) );
      int [] array5 = {255,255};
		System.out.println( rt.go( array5 ) );
      int [] array6 = {9,10,-88,100,-555,1000};
		System.out.println( rt.go( array6 ) );
      int [] array7 = {10,10,10,11,456};
		System.out.println( rt.go( array7 ) );
      int [] array8 = {-111,1,2,3,9,11,20,30};
		System.out.println( rt.go( array8 ) );
      int [] array9 = {9,8,7,6,5,4,3,2,0,-2,-989};
		System.out.println( rt.go( array9) );
      int [] array10 = {12,15,18,21,23,1000};
		System.out.println( rt.go( array10 ) );	
      int [] array11 = {250,19,17,15,13,11,10,9,6,3,2,1,-455};
		System.out.println( rt.go( array11 ) );
      int [] array12 = {9,10,-8,10000,-5000,1000};
		System.out.println( rt.go( array12 ) );										
	}
}



/*

12301
-44
-11568
32767
510
476
497
-35
-947
1089
-99
6011


*/