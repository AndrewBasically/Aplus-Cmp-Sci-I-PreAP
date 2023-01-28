//(c) A+ Computer Science
//www.apluscompsci.com

//Name - Andrew 
//Date - 4/26/2021
//Class - PreAP Cmp Sci I
//Lab  - Array Find Smallest

public class RaySmallest
{
	public static int go(int[] ray)
	{
      int small = ray[0];
      for ( int i : ray )
      {
         if ( i < small)
         {
            small = i;
         }
      }
		return small;
	}
}