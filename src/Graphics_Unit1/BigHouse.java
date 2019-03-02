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

public class BigHouse extends Canvas
{
   public BigHouse()  //constructor - sets up the class
   {
      setSize(800,600);
      setBackground(Color.WHITE);
      setVisible(true);
   }

   public void paint( Graphics window )
   {
      //call bigHouse
	   bigHouse(window);
   }

   public void bigHouse( Graphics window )
   {
      window.setColor(Color.BLUE);

      window.drawString( "BIG HOUSE ", 50, 50 );
      //house main
      window.setColor(Color.BLUE);

      window.fillRect( 200, 200, 400, 400 );
      //house windows
      window.setColor(Color.yellow);
      window.fillRect(250, 250, 100, 100);
      window.fillRect(450, 250, 100, 100);
      //house door
      window.setColor(Color.white);
      window.fillRect(365, 400, 75, 300);
      //house roof
      window.setColor(Color.green);
      window.fillRect(150, 125, 500, 100);

   }
}