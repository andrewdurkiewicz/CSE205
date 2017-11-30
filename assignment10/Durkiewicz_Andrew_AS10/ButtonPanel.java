import java.awt.*;
import java.awt.event.*;
import javax.swing.*;
import javax.swing.event.*;

public class ButtonPanel extends JPanel
{
   private JPanel colorPanel;
   private JLabel rLabel;
   private JButton speedUp;
   private JButton speedDown;
   private int red;
   private JButton rButton;
   private int speed;


  public ButtonPanel()
  {
	  		  red = 20; 
	  		  speed = 20;

			  rLabel = new JLabel("Ball Speed: " + red);
			  rLabel.setAlignmentX (Component.CENTER_ALIGNMENT);
			  speedUp = new JButton();
			  speedUp.setText("SPEED UP");
			  speedDown = new JButton();
			  speedDown.setText("SPEED DOWN");
			  speedUp.addActionListener(new ButtonListener());
			  speedDown.addActionListener(new ButtonListener());
			  

			  JPanel buttonPanel = new JPanel();
			  buttonPanel.setLayout(new GridLayout(2, 1));
			  buttonPanel.add(speedUp);
			  buttonPanel.add(speedDown);
			
			  colorPanel = new JPanel();
			  colorPanel.setPreferredSize (new Dimension (100, 50));
			  colorPanel.setBackground (new Color (speed, 0, 0));
			  setLayout (new BoxLayout (this, BoxLayout.Y_AXIS));
			  add(rLabel);
			  add(buttonPanel);
			  add (colorPanel);
			  setPreferredSize (new Dimension(200, 100));
   }

   //  Draws the circle in the current location.
      public void paintComponent (Graphics g)
      {
         super.paintComponent (g);

     }
      public int getValue()
      {
    	  return red;
      }
      public int getSpeed()
      {
    	  return speed;
      }


    //  Represents the action listener for the timer.
      private class ButtonListener implements ActionListener
      {
         //  Updates the position of the image and possibly the direction
         //  of movement whenever the timer fires an action event.
         public void actionPerformed (ActionEvent event)
         {
      

           if (event.getSource()== speedDown)
           {
        	   if(getSpeed() == 0)
        	   {
        		   red = 40;
        		   speed = 0;
        		   rLabel.setText("Cannot Go Down! Minimum Speed is: " + speed);
        	   }
        	   else {
            	   red = getValue() + 1;
            	   speed = getSpeed() - 1;
                   rLabel.setText ("Ball Speed: " + speed);
        		   
        	   }


           }
           
           if (event.getSource() == speedUp)
           {
               if (getValue() == 0)
               {
            	   red = 0;
            	   int s = 40;
            	   rLabel.setText("Cannot Go up! Maximum Ball Speed is: " + s);
            	   
               }
               else
               {
            	   red = getValue() - 1;
            	   speed = getSpeed() + 1;
                   rLabel.setText ("Ball Speed: " + speed);

               }
           }
         
         colorPanel.setBackground (new Color (speed, 0, 0));
         repaint();
         }
     }




}