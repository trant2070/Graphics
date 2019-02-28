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

public class SmileyFace extends Canvas
{
   public SmileyFace()    //constructor - sets up the class
   {
      setSize(800,600);
      setBackground(Color.WHITE);
      setVisible(true);
   }

   public void paint( Graphics window )
   {
      draw(window);
   }

   public void draw( Graphics window )
   {
      window.setColor(Color.BLUE);
      window.drawString("SMILEY FACE LAB ", 35, 35);

      window.setColor(Color.YELLOW);
      window.fillOval( 210, 100, 400, 400 );
      
      window.setColor(Color.GREEN);
      
      //Left Eye
      window.fillOval(300, 200, 75, 75);
      //Right Eye
      window.fillOval(450, 200, 75, 75);
      
      window.setColor(Color.BLACK);
      //nose
      window.fillOval(390, 300, 50, 50);
      
      window.setColor(Color.RED);
      //window.drawRect(260, 250, 300, 200);
      window.drawArc(260, 250 ,300, 200, 0, -180);
      
		//add more code here


   }
}