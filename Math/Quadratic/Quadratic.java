//(c) A+ Computer Science
// www.apluscompsci.com

//Name -
//Date -
//Class -
//Lab -

import java.util.Scanner;
import static java.lang.System.*;
import static java.lang.Math.*;

public class Quadratic
{
   private int a, b, c;
   private double rootOne;
   private double rootTwo;
   
   //public Quadratic()
   //{
      //
      //
   //}
   
   public void setQuadratic(int quadA, int quadB, int quadC)
   {
      a = quadA;
      b = quadB;
      c = quadC;
      
   }
   
   //public void setEquation(int quadA, int quadB, int quadC)
   //{
      //
      //
   //}
   
   public void calcRoots( )
   {
      rootOne = (-b + Math.sqrt((b*b)-4*a*c))/(2*a);
      rootTwo = (-b - Math.sqrt((b*b)-4*a*c))/(2*a);
   
   }
   
   public void print( )
   {
      System.out.printf("\nrootone :: %.2f\n", rootOne);
      System.out.printf("roottwo :: %.2f\n\n\n\n", rootTwo);
   }
}