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
      upperBody(window);
      lowerBody(window);
      
   }

   public void head( Graphics window )
   {
      window.setColor(Color.YELLOW);

      window.fillOval(300, 100, 200, 100);
      
      window.setColor(Color.green);
      
      //Eyes left-Right
      window.fillOval(350, 125, 25, 25);
      window.fillOval(450, 125, 25, 25);
      
      window.setColor(Color.red);
      window.fillOval(410, 150, 15, 15);
      
      //nose
      window.setColor(Color.black);
      window.fillOval(400, 175, 25, 25);
      

		//add more code here
				
   }

   public void upperBody( Graphics window )
   {
      window.setColor(Color.magenta);
      window.fillRect(325, 225, 150, 100);
      window.setColor(Color.black);
      window.drawLine(325, 225, 100, 100);
      window.drawLine(475, 225, 500, 400);
		//add more code here
   }

   public void lowerBody( Graphics window )
   {
      window.setColor(Color.blue);
      window.fillRect(325, 350, 150, 100);
      window.setColor(Color.black);
      window.drawLine(325, 450, 300, 550);
      window.drawLine(475, 450, 500, 550);
		//add more code here

   }
}