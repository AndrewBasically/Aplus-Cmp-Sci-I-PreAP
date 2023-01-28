//(c) A+ Computer Science
// www.apluscompsci.com

//Name - Andrew  
//Date - 3/29/2021
//Class - PreAP Cmp Sci I
//Lab  - Biggest String

import static java.lang.System.*;

public class BiggestString
{
	private String s1,s2,s3;

	public BiggestString()
	{
		this("","","");
	}

	public BiggestString(String a, String b, String c)
	{
      setStrings(a,b,c);
      System.out.println(toString());
	}

	public void setStrings(String a, String b, String c)
	{
      s1 = a;
      s2 = b;
      s3 = c;
	}

	public String getBiggest()
	{
      String biggest = "";
      if(s1.compareTo(s2) > 0 && s1.compareTo(s3)>0)
   	   {biggest = s1;}
   	if(s2.compareTo(s1) > 0 && s2.compareTo(s3)>0)
   		 {biggest = s2;}
   	if(s3.compareTo(s2) > 0 && s3.compareTo(s1)>0)
   		 {biggest = s3;}
      return biggest;
	}

	public String toString()
	{
	   return s1+" "+s2+" "+s3+"\nbiggest = "+getBiggest()+"\n";
	}
}