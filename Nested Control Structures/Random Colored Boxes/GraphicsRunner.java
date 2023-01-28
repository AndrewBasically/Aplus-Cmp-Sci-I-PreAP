//(c) A+ Computer Science
//www.apluscompsci.com

//Name - Andrew  
//Date - 4/7/2021
//Class - PreAP Cmp Sci I
//Lab  - Random Colored Boxes

import javax.swing.JFrame; 

public class GraphicsRunner extends JFrame
{
	private static final int WIDTH = 800;
	private static final int HEIGHT = 600;

	public GraphicsRunner()
	{
		super("Graphics Runner");
		setSize(WIDTH,HEIGHT);
						
   		getContentPane().add(new RandomColoredBoxes());					
						
		//getContentPane().add(new RandomColoredBoxes());
				
		setVisible(true);
	}
	
	public static void main( String args[] )
	{
		GraphicsRunner run = new GraphicsRunner();
	}
}