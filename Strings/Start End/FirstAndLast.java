//(c) A+ Computer Science
//www.apluscompsci.com

//Name - Andrew 
//Date - 1/10/2021
//Class - PreAP Cmp Sci I
//Lab - String StartEnd

import static java.lang.System.*;

public class FirstAndLast
{
   private String word;
   
   public FirstAndLast(String s)
   {
      setString(s);
      toString();
   }
   
   public void setString(String s)
   {
      word = s;
   }
   
   public String getFirst()
   {
      return word.substring(0,1);
   }
   
   public String getLast()
   {
      return (word.substring(word.length() - 1, word.length()));
   }
   
   public String toString()
   {
      String output="";
      output = ("word :: " + word);
      return output;
   }
}