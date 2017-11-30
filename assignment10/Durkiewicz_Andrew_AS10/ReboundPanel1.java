//Represents the primary panel for the Rebound applet.

import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

public class ReboundPanel1 extends JPanel
{
private final int DIAMETER = 35;
int DELAY = 20;
ButtonPanel b;

private Timer timer;
private int x, y, moveX, moveY;

//-----------------------------------------------------------------
//  Sets up the applet, including the timer for the animation.
//-----------------------------------------------------------------
public ReboundPanel1 (ButtonPanel b1)
{
  b=b1;
  DELAY=b.getValue();
  timer = new Timer(DELAY, new Rebound1Listener());
  timer.start();
  x = 150;
  y = 100;
  moveY = 3;
  moveX=0;

  setBackground (Color.black);
  setPreferredSize (new Dimension(300, 100));
}

// accessor method of timer to be used in the applet class.
public Timer getTimer()
{
   return timer;
}
//  Draws the circle in the current location.
public void paintComponent (Graphics page)
{
  super.paintComponent (page);
  page.setColor(Color.red);
  page.fillOval(x,y,DIAMETER, DIAMETER);
  timer.stop();
  timer = new Timer(DELAY, new Rebound1Listener());
  timer.start();
}

//  Represents the action listener for the timer.
private class Rebound1Listener implements ActionListener
{
  //  Updates the position of the image and possibly the direction
  //  of movement whenever the timer fires an action event.
  public void actionPerformed (ActionEvent event)
  {
     x += moveX;
     y += moveY;

     //if the circle hits the applets boundary,
     //it changes its direction.
     if (x <= 0 || x >= getSize().getWidth()-DIAMETER)
        moveX = moveX * -1;

     if (y <= 0 || y >= getSize().getHeight()-DIAMETER)
        moveY = moveY * -1;
	 DELAY=b.getValue();
     repaint();
  }
}
}