//(c) A+ Computer Science
//www.apluscompsci.com

//Name - Andrew 
//Date - 1/20/2021
//Class - PreAP Cmp Sci I
//Lab  - StringEquality

import static java.lang.System.*;

public class StringEqualityRunner
{
	public static void main( String args[] )
	{
		//add test cases
		StringEquality test = new StringEquality("hello", "goodbye");
      out.println(test);

      test.setWords("one", "two");
      out.println(test);
      
      test.setWords("three", "four");
      out.println(test);
      
      test.setWords("TCEA", "UIL");
      out.println(test);
      
      test.setWords("State", "Champions");
      out.println(test);
      
      test.setWords("ABC", "ABC");
      out.println(test);
      
      test.setWords("ABC", "CBA");
      out.println(test);
      
      test.setWords("Same", "Same");
      out.println(test);

	}
}