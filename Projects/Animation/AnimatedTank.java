//© A+ Computer Science  -  www.apluscompsci.com
//Name - Andrew 
//Date - 5/21/2021
//Lab  - Animation Project

import java.awt.Graphics; 
import java.awt.Color;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.Timer;
import javax.swing.JFrame;
import java.awt.Canvas;

class AnimatedTank extends Canvas
{
	private int x;
	private int y;
	private Timer timer;
	private final static int SLEEP = 400;  //bigger # = slower animation	
	
	public AnimatedTank(int width, int heigth)
	{
		setSize(width, heigth);
		setVisible(true);
		setBackground(Color.BLACK);

		x = 0;
		y = 100;

		ActionListener paintCaller = new ActionListener(){
			public void actionPerformed(ActionEvent event)
			{
				repaint();  //each time timer fires it will call paint
			}
		};
		timer = new Timer(SLEEP, paintCaller);
		timer.start();
	}	
	
	public void update(Graphics window)
	{
	   paint(window);	
	}
	
	public void paint( Graphics window )
	{
		window.setColor(Color.BLACK);
		window.fillRect(0,0,getWidth(),getHeight());
		
		window.setColor(Color.WHITE);
		window.drawString("Animation Lab - Lab05c", 25, 50 );

      window.setColor(new Color(75,83,32));
      window.fillOval(x-190,y-70,160,70);

      window.setColor(Color.darkGray);
      window.fillOval(x-210,y,50,60);
      window.fillOval(x-160,y,50,60);
      window.fillOval(x-105,y,50,60);
      window.fillOval(x-55,y,50,60);
      
		window.drawArc(x-230,y,30,60,90,180);
      window.drawLine(x-215,y,x,y);
      window.drawLine(x-215,y+60,x,y+60);
      window.drawArc(x-15,y,30,60,270,180);
      
      window.fillRect(x-40,y-40,80,10);
      
		x += 50;
      y += 5;

		if(x>=getWidth())  //checks value to reset anim loop
		{
			x = 0;
		}
      if(y>=getHeight())
      { 
         y= 100;
      }
	}	
}