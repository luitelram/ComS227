package lab10;

import java.awt.Color;
import java.awt.Graphics;

public class Portrait3RL extends Portrait{

	  public Portrait3RL()
	  {
	    super(0.2);
	  }

	  @Override
	  public void paintComponent(Graphics g)
	  {
	    super.paintComponent(g);

	    int midX = getWidth() / 2;

	    // Eyes
	    int eyeRadius = (int)(0.02 * SIZE);
	    g.setColor(Color.BLUE);
	    g.fillOval(midX - eyeRadius + 6, headRadius - eyeRadius * 2, 2 * eyeRadius, 2 * eyeRadius);
	    g.fillOval(midX - eyeRadius - 6, headRadius - eyeRadius * 2, 2 * eyeRadius, 2 * eyeRadius);

	    //Smile
	    g.setColor(Color.RED);
	    int smileRadius = (int)(0.5 * headRadius);
	    g.drawArc(midX - smileRadius, (int)(0.8 * headRadius), smileRadius * 2, smileRadius * 2, 0, -180);
	    
	    //Hair
	    g.setColor(Color.YELLOW);
	    g.drawLine(midX + 10, midX / 22, 80, 50);
	    g.drawLine(midX - 10, midX / 22, 15, 50);
	    g.drawLine(midX + 8, midX / 22, 75, 50);
	    g.drawLine(midX - 8, midX / 22, 20, 50);
	    g.drawLine(midX + 4, midX / 22, 70, 50);
	    g.drawLine(midX - 4, midX / 22, 25, 50);
	  }
	}