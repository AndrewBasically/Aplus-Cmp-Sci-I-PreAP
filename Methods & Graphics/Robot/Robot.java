//(c) A+ Computer Science
//www.apluscompsci.com

//Name - Andrew 
//Date - 11/10/2020
//Class - PreAP Cmp Sci I (2nd period)
//Lab  - Robot

import java.awt.Graphics;
import java.awt.Color;
import java.awt.Canvas;

class Robot extends Canvas
{
   public Robot()    //constructor method - sets up the class
   {
      setSize(800,600);
      setBackground(Color.WHITE);   	
      setVisible(true);
   }

   public void paint( Graphics window )
   {
      window.setColor(Color.BLUE);
      window.drawString("Robot LAB ", 35, 35 );

      //call head method
      
      head(window);
      
      //call other methods
      
      upperBody(window);
      lowerBody(window);
      
   }

   public void head( Graphics window )
   {
      window.setColor(Color.YELLOW); //face
      window.fillOval(300, 100, 200, 100 ); //face
      
      window.setColor(Color.RED); //mouth
      window.drawArc( 350, 150, 100, 38, 180, 180 ); //mouth
      
      window.setColor(Color.BLACK); //nose
      window.fillOval( 388, 150, 25, 10 ); //nose
      
      window.setColor(Color.GREEN); //eye #1
      window.fillOval( 350, 119, 19, 19 ); //eye #1
      
      window.setColor(Color.GREEN); //eye #2
      window.fillOval( 431, 119, 19, 19 ); //eye #2
   }

   public void upperBody( Graphics window )
   {
      window.setColor(Color.BLUE); //upper body fill
      window.fillRect( 344, 225, 113, 69 ); //upper body fill
      
      window.setColor(Color.BLACK); //upper body outline
      window.drawRect( 344, 225, 113, 69 ); //upper body outline
      
      window.setColor(Color.BLACK); //left arm
      window.drawLine( 250, 175, 344, 225 ); //left arm
      
      window.setColor(Color.BLACK); //right arm
      window.drawLine( 457, 225, 551, 175 ); //right arm
   }

   public void lowerBody( Graphics window )
   {
      window.setColor(Color.GRAY); //lower body fill
      window.fillRect( 344, 319, 113, 69 ); //lower body fill
      
      window.setColor(Color.YELLOW); //lower body outline
      window.drawRect( 344, 319, 113, 69 ); //lower body outline

      window.setColor(Color.BLACK); //left leg
      window.drawLine( 344, 388, 250, 438 ); //left leg
      
      window.setColor(Color.BLACK); //right leg
      window.drawLine( 457, 388, 551, 428 ); //right leg
   }
}