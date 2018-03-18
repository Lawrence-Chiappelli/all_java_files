import java.awt.*;
import javax.swing.*;

public class StickFigureElaborate extends JApplet
{

	public void init()
	{
		getContentPane().setBackground(Color.CYAN);
	}
	
	public void paint(Graphics g)
	{
		super.paint(g);
		super.setSize(300, 400);
		buildBackground(g);
		buildForeground(g);		
	}
	
	public void buildBackground(Graphics g)
	{
		g.setColor(Color.YELLOW);
		g.fillOval(-15, -20, 75, 75); //sun
		
		g.setColor(Color.BLACK);
		g.fillOval(0, 380, 305, 30); //grass outline
		
		g.setColor(Color.GREEN);
		g.fillOval(0, 380, 300, 25); //grass
	}
	
	public void buildForeground(Graphics g)
	{
		g.setColor(Color.orange);
		g.fillOval(50, 50, 100, 100); //face	

			g.setColor(Color.WHITE);
			g.fillOval(65, 65, 30, 30); //left eye white		
			g.setColor(Color.BLUE);
			g.fillOval(70, 70, 20, 20); //left eye iris			
			g.setColor(Color.BLACK);
			g.fillOval(75, 75, 10, 10); //left eye pupil

			g.setColor(Color.WHITE);
			g.fillOval(105, 65, 30, 30); //right eye white		
			g.setColor(Color.BLUE);
			g.fillOval(110, 70, 20, 20); //right eye iris		
			g.setColor(Color.BLACK);
			g.fillOval(115, 75, 10, 10); //right eye pupil
			
			g.setColor(Color.BLACK);
			g.drawArc(95, 80, 10, 30, 180, 180); //nose			
			g.setColor(Color.magenta);
			g.fillArc(70, 100, 60, 45, 180, 180); //mouth		
			g.setColor(Color.RED);
			g.fillArc(93, 137, 15, 15, 180, -180); //tongue
			
		g.setColor(Color.ORANGE);
		g.fillRect(95, 147, 10, 20); //neck
		
			g.setColor(Color.GREEN);
			g.fillArc(50, 160, 100, 125, 180, -180); //shirt torso top
			g.fillRect(50, 222, 100, 70); //short torso bottom	
			g.fillArc(27, 170, 50, 75, 180, -180); //shirt arm left
			g.fillArc(123, 170, 50, 75, 180, -180); //shirt arm right
			g.setColor(Color.RED);
			g.drawString("Bob", 90, 230); //shirt logo
			
		g.setColor(Color.ORANGE);
		g.fillRect(30, 207, 15, 55); //arm left
		g.fillRect(155, 207, 15, 55); //arm right
		g.fillOval(25, 250, 25, 25); //hand right
		g.fillOval(150, 250, 25, 25); //hand left
		
		g.setColor(Color.BLUE);
		g.fillRect(50, 290, 100, 20); //pants; waist
		
			g.setColor(Color.BLACK);
			g.fillRect(50, 291, 100, 5); //pants belt		
			
		g.setColor(Color.BLUE);
		g.fillRect(50, 300, 45, 90); //pant leg left
		g.fillRect(105, 300, 45, 90); //pant leg right
		
		g.setColor(Color.BLACK);
		g.fillOval(45, 380, 55, 20); //shoe left
		g.fillOval(101, 380, 55, 20); //shoe right
		
		g.setColor(Color.YELLOW);
		g.fill3DRect(215, 292, 20, 100, true); //sign
		g.fill3DRect(175, 270, 100, 50, true);
		
		g.setColor(Color.BLACK);
		g.drawString("Hello", 210, 292); //sign text
		g.drawString("This is a sign", 190, 310);
	}
}