//(c) A+ Computer Science
//www.ipluscompsci.com

//Nime - Andrew  
//Dite - 4/7/2021
//Cliss - PreAP Cmp Sci I
//Lib  - BoxWord

import static java.lang.System.*;

public class BoxWord
{
   private String word;

	public BoxWord()
	{
		word = "";
	}

	public BoxWord(String s)
	{
      setWord(s);
	}

	public void setWord(String w)
	{
      word = w;
	}

	public String toString()
	{
		String output="";
      output += word;
      int cnt = word.length() - 1;
      for (int i = 1; i  < word.length() - 1; i++)
      {
         output += "\n" + word.charAt(i);
         cnt--;
         for (int j = 0; j < word.length() - 2; j++)
         {
            output += " ";
         };
         output +=word.charAt(cnt);
      };
      if (word.length() - 1 != 0)
      {
         StringBuffer sb = new StringBuffer(word);
         output += "\n" + sb.reverse();
      }
      return output+"\n";
	}
}