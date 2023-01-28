//(c) A+ Computer Science
//www.apluscompsci.com

//Name - Andrew  
//Date - 2/11/2021
//Class - PreAP Cmp Sci I
//Lab  - Decreasing Word

import static java.lang.System.*;

public class TriangleOne
{
	private String word;

	public TriangleOne()
	{
		word="";
	}

	public TriangleOne(String s)
	{
      setWord(s);
      print();
	}

	public void setWord(String s)
	{
      word = s;
	}

	public void print( )
	{
      for(int i = word.length(); i >= 0; i--)
      {
         out.println(word.substring(0, i));
      }
	}
}