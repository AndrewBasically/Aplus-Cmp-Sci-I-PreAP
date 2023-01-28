//(c) A+ Computer Science
//www.apluscompsci.com

//Name - Andrew 
//Date - 1/24/2021
//Class - PreAP Cmp Sci I
//Lab  - Social Security

import static java.lang.System.*;

public class Social
{
   private String socialNum;
   private int sum;

	public Social()
	{
      socialNum="";
      sum=0;
	}

	public Social(String soc)
	{
      setWord(soc);
      chopAndAdd();
	}


	public void setWord(String w)
	{
      socialNum=w;
	}

	public void chopAndAdd()
	{
		String sub = socialNum;
      sum = Integer.parseInt(sub.substring(0,sub.indexOf("-"))) + Integer.parseInt(sub.substring(sub.indexOf("-") + 1,sub.lastIndexOf("-"))) + Integer.parseInt(sub.substring(sub.lastIndexOf("-") + 1,sub.length()));
	}

	public String toString()
	{
		return "SS# " + socialNum + " has a total of " + sum + "\n";
	}
}