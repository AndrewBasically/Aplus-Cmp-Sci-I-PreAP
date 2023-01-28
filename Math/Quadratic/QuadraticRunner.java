//(c) A+ Computer Science
//www.apluscompsci.com

//Name -
//Date -
//Class -
//Lab  -

import java.util.Scanner; 
import static java.lang.System.*;
import static java.lang.Math.*;

public class QuadraticRunner
{
	public static void main( String[] args )
   {
   
   	Quadratic test = new Quadratic();
      
      Scanner sc = new Scanner(System.in);
      System.out.println("Enter the Value of a :: ");
      int quadA = sc.nextInt();
      System.out.println("Enter the Value of b :: ");
      int quadB = sc.nextInt();
      System.out.println("Enter the Value of c :: ");
      int quadC = sc.nextInt();
      
 
      test.setQuadratic(quadA,quadB,quadC);
      test.calcRoots();
      test.print();
      
      
      
      System.out.println("Enter the Value of a :: ");
      quadA = sc.nextInt();
      System.out.println("Enter the Value of b :: ");
      quadB = sc.nextInt();
      System.out.println("Enter the Value of c :: ");
      quadC = sc.nextInt();
      
      
      test.setQuadratic(quadA,quadB,quadC);
      test.calcRoots();
      test.print();
      
      
      
      System.out.println("Enter the Value of a :: ");
      quadA = sc.nextInt();
      System.out.println("Enter the Value of b :: ");
      quadB = sc.nextInt();
      System.out.println("Enter the Value of c :: ");
      quadC = sc.nextInt();
      
      
      test.setQuadratic(quadA,quadB,quadC);
      test.calcRoots();
      test.print();
      
	}
}