package Graphics_Unit1;

//(c) A+ Computer Science
//www.apluscompsci.com

//Name -
//Date -
//Class -
//Lab  -

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
      
   }

   public void head( Graphics window )
   {
      window.setColor(Color.YELLOW);

      window.fillOval(300, 100, 200, 100);
      
      window.setColor(Color.green);
      
      //Eyes left-Right
      window.fillOval(350, 125, 25, 25);
      window.fillOval(450, 125, 25, 25);
      
      //nose
      window.setColor(400)
      window.fillOval(400, 175, 15, 15);
      

		//add more code here
				
   }

   public void upperBody( Graphics window )
   {

		//add more code here
   }

   public void lowerBody( Graphics window )
   {

		//add more code here

   }
}