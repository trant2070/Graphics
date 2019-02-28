package Graphics_Unit1;

//(c) A+ Computer Science
//www.apluscompsci.com

//Name -
//Date -
//Class -
//Lab  -

import java.awt.Font;
import java.awt.Color;
import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.Canvas;
import javax.swing.JPanel;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class ShapePanel extends JPanel
{
	public ShapePanel()
	{
		setBackground(Color.WHITE);
		setVisible(true);
	}

	public void update(Graphics window)
	{
		paint(window);
	}

	/*
	 *All of your test code should be placed in paint.
	 */
	public void paint(Graphics window)
	{
		window.setColor(Color.WHITE);
		window.fillRect(0,0,getWidth(), getHeight());
		window.setColor(Color.BLUE);
		window.drawRect(20,20,getWidth()-40,getHeight()-40);
		window.setFont(new Font("TAHOMA",Font.BOLD,18));
		window.drawString("CREATE YOUR OWN SHAPE!",40,40);


		//instantiate a Shape
                window.fillRect(350, 230, 200, 175);
                window.setColor(Color.WHITE);
                window.fillRect(385, 270, 125, 100);

		//instantiate a Shape
                window.setColor(Color.cyan);
                window.fillOval(425, 300, 50, 50);

		//instantiate a Shape
		window.setColor(Color.ORANGE);
                window.fillRoundRect(50, 100, 250, 250, 175, 225);
                window.setColor(Color.white);
                window.fillOval(100, 150, 155, 155);
                window.setColor(Color.cyan);
                window.fillOval(100, 150, 155, 155);
                
                
	}
}