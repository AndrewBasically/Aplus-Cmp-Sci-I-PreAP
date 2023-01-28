import java.util.Scanner;
import java.lang.Math.*;
import static java.lang.System.*;

public class Triangle
{
 private int sideA, sideB, sideC;
 private int a, b, c;
 private double perimeter;
 private double theArea;

 public Triangle()
 {
  setSides(0,0,0);
  perimeter=0;
  theArea=0;
 }

 public void setSides(int a,int b,int c)
 {
  sideA = a;
  sideB = b;
  sideC = c;
 }

 public void calcPerimeter( )
 {
  perimeter = sideA+sideB+sideC;
 }

 public void calcArea( )
 {
  double s;
  s = perimeter/2;
  theArea = Math.sqrt(s * (s-sideA) * (s-sideB) * (s-sideC));
 }

 public void print( )
 {
  System.out.printf("\nLength of side a :: %d", sideA);
  System.out.printf("\nLength of side b :: %d", sideB);
  System.out.printf("\nLength of side c :: %d\n", sideC);
  System.out.printf("\nArea of triangle :: %.2f\n", theArea);
  System.out.println("\n\n");
 }
}