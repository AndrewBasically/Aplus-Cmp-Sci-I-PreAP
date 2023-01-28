//(c) A+ Computer Science
//www.apluscompsci.com

//Name - Andrew 
//Date - 11/4/2020
//Class - Cmp Sci I PreAP
//Lab - Smiley Face

import java.awt.Graphics;
import java.awt.Color;
import java.awt.Canvas;

public class SmileyFace extends Canvas
{
   public SmileyFace() //constructor - sets up the class
   {
      setSize(800,600);
      setBackground(Color.WHITE);
      setVisible(true);
   }
   
   public void paint( Graphics window )
   {
      smileyFace(window);
   }
   
   public void smileyFace( Graphics window )
   {
      window.setColor(Color.BLUE);
      window.drawString("SMILEY FACE LAB ", 35, 35);
      
      window.setColor(Color.YELLOW);
      window.fillOval( 210, 100, 400, 400 );
      
      //add more code here
      
      //eye #1
      window.setColor(Color.GREEN);
      window.fillOval( 305, 250, 60, 40 );
      
      //eye #2
      window.setColor(Color.GREEN);
      window.fillOval( 455, 250, 60, 40 );
      
      //nose
      window.setColor(Color.BLACK);
      window.fillOval( 395, 300, 30, 30 );
      
      //mouth
      window.setColor(Color.RED);
      window.fillArc( 305, 250, 210, 200, 180, 180 );
   }
}