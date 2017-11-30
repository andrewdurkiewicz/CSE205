package assignment10;

import java.awt.*;
import java.awt.event.*;
import javax.swing.*;
import javax.swing.event.*;

public class ButtonPanel extends JPanel
{
   private JPanel colorPanel;
  // private JSlider rSlider;
   private JLabel rLabel;
   private JButton speedUp;
   private JButton speedDown;
   private int red;
   private JButton rButton;


  public ButtonPanel()
  {
        //setBackground (Color.black);
	  		  red = 20; //default red value

			  rLabel = new JLabel("Ball Value: " + red);
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
			  colorPanel.setBackground (new Color (red, 0, 0));
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



    //  Represents the action listener for the timer.
      private class ButtonListener implements ActionListener
      {
         //  Updates the position of the image and possibly the direction
         //  of movement whenever the timer fires an action event.
         public void actionPerformed (ActionEvent event)
         {
           if (event.getSource()== speedUp)
           {
        	   red = getValue() + 1;
           }
           if (event.getSource() == speedDown)
           {
        	   red = getValue() - 1;
           }
         
         rLabel.setText ("Ball Value: " + red);
         colorPanel.setBackground (new Color (red, 0, 0));
         repaint();
         }
     }




}