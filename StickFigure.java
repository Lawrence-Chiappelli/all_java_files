import java.awt.*;
import javax.swing.*;

public class StickFigure extends JApplet
{

	public void init()
	{
		getContentPane().setBackground(Color.WHITE);
	}
	
	public void paint(Graphics g)
	{
		super.paint(g);
		super.setSize(200, 400);
		
		g.drawOval(50, 50, 100, 100); //face
			g.drawLine(100, 150, 100, 300);  //body
			g.drawLine(100, 225, 40, 150);	 //left arm
			g.drawLine(100, 225, 160, 150);	 //right arm
			g.drawLine(100, 300, 10, 400);	 //left leg
			g.drawLine(100, 300, 200, 400);   //right leg
	}
	
}
