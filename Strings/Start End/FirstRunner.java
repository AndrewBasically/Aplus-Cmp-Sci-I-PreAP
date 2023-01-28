//(c) A+ Computer Science
//www.apluscompsci.com

//Name - Andrew 
//Date - 1/10/2021
//Class - PreAP Cmp Sci I
//Lab - String StartEnd

import static java.lang.System.*;

public class FirstRunner
{
   public static void main ( String[] args )
   {
      FirstAndLast demo = new FirstAndLast("Hello");
      System.out.println(demo);
      System.out.println( "first letter :: " + demo.getFirst() );
      System.out.println( "last letter :: " + demo.getLast() + "\n" );
      
      demo.setString("World");
      System.out.println(demo);
      System.out.println( "first letter :: " + demo.getFirst() );
      System.out.println( "last letter :: " + demo.getLast() + "\n" );
      
      demo.setString("JukeBox");
      System.out.println(demo);
      System.out.println( "first letter :: " + demo.getFirst() );
      System.out.println( "last letter :: " + demo.getLast() + "\n" );
      
      demo.setString("TCEA");
      System.out.println(demo);
      System.out.println( "first letter :: " + demo.getFirst() );
      System.out.println( "last letter :: " + demo.getLast() + "\n" );
      
      demo.setString("UIL");
      System.out.println(demo);
      System.out.println( "first letter :: " + demo.getFirst() );
      System.out.println( "last letter :: " + demo.getLast() );
   }
}