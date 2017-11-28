import java.awt.*;
import java.awt.event.*;
import javax.swing.*;
import javax.swing.event.*;

public class ButtonPanel extends JPanel
{
   private JPanel colorPanel;
   private JSlider rSlider;
   private JLabel rLabel;
   private int red;
   private JButton rButton;

  public ButtonPanel()
  {
        //setBackground (Color.black);
           red = 20; //default red value

		      rLabel = new JLabel("Red value: " + red);
		      rLabel.setAlignmentX (Component.CENTER_ALIGNMENT);
		      rButton = new JButton();
			  rButton.setText("Adjust Delay");


		      rSlider = new JSlider (JSlider.HORIZONTAL, 0, 255, red);
		      rSlider.setMajorTickSpacing (50);
		      rSlider.setMinorTickSpacing (10);
		      rSlider.setPaintTicks (true);
		      rSlider.setPaintLabels (true);
		      rSlider.setAlignmentX (Component.CENTER_ALIGNMENT);
		      rSlider.addChangeListener (new SliderListener());

		      colorPanel = new JPanel();
		      colorPanel.setPreferredSize (new Dimension (100, 50));
		      colorPanel.setBackground (new Color (red, 0, 0));
		      setLayout (new BoxLayout (this, BoxLayout.Y_AXIS));
		      add(rLabel);
		      add(rSlider);
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
		 return rSlider.getValue();
	 }

    //  Represents the action listener for the timer.
      private class ButtonListener implements ActionListener
      {
         //  Updates the position of the image and possibly the direction
         //  of movement whenever the timer fires an action event.
         public void actionPerformed (ActionEvent event)
         {
           repaint();
         }
     }


     //**********************************************
	    //  Represents the listener for the slider.
	    //**********************************************
	    private class SliderListener implements ChangeListener
	    {
	       //--------------------------------------------------------------
	       //  Gets the value of each slider, then updates the label and
	       //  the color panel.
	       //--------------------------------------------------------------
	       public void stateChanged (ChangeEvent event)
	       {
	          red = rSlider.getValue();
	          rLabel.setText ("Red value: " + red);
	          colorPanel.setBackground (new Color (red, 0, 0));
	       }
   }

}

