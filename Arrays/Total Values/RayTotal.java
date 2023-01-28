//(c) A+ Computer Science
//www.apluscompsci.com

//Name - Andrew 
//Date - 4/22/2021
//Class - PreAP Cmp Sci I
//Lab  - ArrayTotal Value

public class RayTotal
{
	public static int go(int[] ray)
	{
      int total = 0;
      for (int r:ray)
      {
         total+=r;
      }
		return total;
	}
}