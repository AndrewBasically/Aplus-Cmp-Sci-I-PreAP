//(c) A+ Computer Science
//www.apluscompsci.com

//Name - Andrew 
//Date - 4/22/2021
//Class - PreAP Cmp Sci I
//Lab  - Array Sum Value Greater Than Last

public class RaySumLast
{
	public static int go(int[] ray)
	{
      int total = 0;
      for (int i = 0; i < ray.length; i++)
      {
         if (ray[i] > ray[ray.length - 1])
         {
            total += ray[i];
         }
      }
      if (total <= 0)
      {
         return -1;
      }
      return total;
   }
}