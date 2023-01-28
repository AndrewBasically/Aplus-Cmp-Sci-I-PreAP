//(c) A+ Computer Science
//www.apluscompsci.com

//Name - Andrew 
//Date - 11-6-2020
//Class - Cmp Sci I PreAP
//Lab - Big House

import java.awt.Graphics;
import java.awt.Color;
import java.awt.Canvas;

public class BigHouse extends Canvas
{
   public BigHouse() //constructor - sets up the class
   {
      setSize(800,600);
      setBackground(Color.WHITE);
      setVisible(true);
   }
   
   public void paint( Graphics window )
   {
      bigHouse(window);
   }
   
   public void bigHouse( Graphics window )
   {
      window.setColor(Color.BLUE);
      
      window.drawString( "BIG HOUSE ", 50, 50 );
      
      //structure
      window.setColor(Color.BLUE);
      window.fillRect( 200, 200, 400, 400 );
      
      //roof
      window.setColor(Color.GREEN);
      window.fillRect( 100, 150, 600, 100 );
      
      //door
      window.setColor(Color.WHITE);
      window.fillRect( 350, 450, 100, 150 );
      
      //window 1
      window.setColor(Color.YELLOW);
      window.fillRect( 275, 325, 75, 75 );
      
      //window 2
      window.setColor(Color.YELLOW);
      window.fillRect( 450, 325, 75, 75 );
      
      //tree
      window.setColor(Color.GREEN);
      window.fillRect( 50, 350, 100, 100 );
      window.setColor(Color.DARK_GRAY);
      window.fillRect( 87, 450, 25, 150 );
      
      //slide - Extra Credit
      window.setColor(Color.GRAY);
      window.fillRect( 650, 450, 25, 150 );
      window.setColor(Color.RED);
      window.drawLine( 675, 450, 800, 600);;
   }
}