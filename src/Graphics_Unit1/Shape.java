package Graphics_Unit1;

//(c) A+ Computer Science
//www.apluscompsci.com

//Name -
//Date -
//Class -
//Lab  -

import java.awt.Color;
import java.awt.Graphics;

public class Shape
{
   //instance variables
	private int xPos;
	private int yPos;
	private int width;
	private int height;
	private Color color;

   public Shape(int x, int y, int wid, int ht, Color col)
   {
		xPos = x;
                yPos = y;
                width = wid;
                height = ht;
                color = col;
		//finish this constructor
   }


   public void draw(Graphics window)
   {
      window.setColor(getColor());
      window.fillRect(getxPos(), getyPos(), getWidth(), getHeight());
      window.setColor(Color.ORANGE);
      window.fillRoundRect(50, 100, 250, 250, 175, 225);
      window.setColor(Color.white);
      window.fillOval(100, 150, 155, 155);
      window.setColor(Color.cyan);
      window.fillOval(130, 180, 100, 100);
      window.setColor(Color.black);
      window.fillOval(150, 200, 50, 50);
      //draw whatever you want
      //    ^
      //  [ :: ]
      //    ()

   }

   //BONUS
   //add in set and get methods for all instance variables
   

   public String toString()
   {
   	return getxPos()+" "+getyPos()+" "+getWidth()+" "+getHeight()+" "+getColor();
   }

    /**
     * @return the xPos
     */
    public int getxPos() {
        return xPos;
    }

    /**
     * @param xPos the xPos to set
     */
    public void setxPos(int xPos) {
        this.xPos = xPos;
    }

    /**
     * @return the yPos
     */
    public int getyPos() {
        return yPos;
    }

    /**
     * @param yPos the yPos to set
     */
    public void setyPos(int yPos) {
        this.yPos = yPos;
    }

    /**
     * @return the width
     */
    public int getWidth() {
        return width;
    }

    /**
     * @param width the width to set
     */
    public void setWidth(int width) {
        this.width = width;
    }

    /**
     * @return the height
     */
    public int getHeight() {
        return height;
    }

    /**
     * @param height the height to set
     */
    public void setHeight(int height) {
        this.height = height;
    }

    /**
     * @return the color
     */
    public Color getColor() {
        return color;
    }

    /**
     * @param color the color to set
     */
    public void setColor(Color color) {
        this.color = color;
    }
}