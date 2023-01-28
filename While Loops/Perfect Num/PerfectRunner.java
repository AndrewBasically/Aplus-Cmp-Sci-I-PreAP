//(c) A+ Computer Science
//www.apluscompsci.com
//Name -

import static java.lang.System.*; 

public class PerfectRunner
{
	public static void main( String args[] )
	{
		Perfect obj = new Perfect(496);
		out.println(obj);
      
		obj.setNums(45);
		out.println(obj);
		
		obj.setNums(6);
		out.println(obj);
		
		obj.setNums(14);
		out.println(obj);
		
		obj.setNums(8128);
		out.println(obj);
		
		obj.setNums(1245);
		out.println(obj);
		
		obj.setNums(33);
		out.println(obj);			
      
      obj.setNums(28);
		out.println(obj);			
      
      obj.setNums(27);
		out.println(obj);				
      
      obj.setNums(33550336);
		out.println(obj);							
	}
}