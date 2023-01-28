import java.util.Scanner;
import java.lang.Math.*;
import static java.lang.System.*;

public class TriangleRunner
{
 public static void main( String[] args )
 {
  Triangle test = new Triangle();
  
   Scanner sc = new Scanner(System.in);
   System.out.println("Enter side a :: ");
   int inputA = sc.nextInt();
   System.out.println("Enter side b :: ");
   int inputB = sc.nextInt();
   System.out.println("Enter side c :: ");
   int inputC = sc.nextInt();
         
   test.setSides(inputA, inputB, inputC);
   test.calcPerimeter();
   test.calcArea();
   test.print();
  }
}