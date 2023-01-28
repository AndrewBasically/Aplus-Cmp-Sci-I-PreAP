//(c) A+ Computer Science
//www.apluscompsci.com

//Name - Andrew 
//Date - 2/9/2021
//Class - PreAP Cmp Sci I
//Lab  - Vowel Counter

import static java.lang.System.*;

public class VowelCounter
{
	public static String getNumberString( String s)
	{
      String str = ""; 
      byte index = 0;
      for (byte i = 0; i <= s.length() - 1; i++)
      {
         char c = Character.toLowerCase(s.charAt(i));
         if (c == 'a' || c == 'e' || c == 'i' || c == 'o' || c == 'u')
         {
            str += index;
            index++;
            if (index >= 10)
            {
               index = 0;
            }
         } else 
         {
            str += s.charAt(i);
         }
      };
		return str;
	}
}


