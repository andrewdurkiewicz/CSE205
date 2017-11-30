package assignment10;

//*******************************************************
//SliderPanel class represents the slider control panel to change
//the degree of Red color in the panel.
//*******************************************************
import java.awt.*;
import javax.swing.*;
import javax.swing.event.*; //to use ChangeListener and ChangeEvent

public class SliderPanel extends JPanel
{
private JPanel colorPanel;
private JSlider rSlider;
private JLabel rLabel;
private int red;
//-----------------------------------------------------------------
//  Sets up a slider, a label, and a panel that will display a color
//-----------------------------------------------------------------
public SliderPanel ()
{
  red = 100; //default red value

  rLabel = new JLabel("Red value: " + red);
  rLabel.setAlignmentX (Component.CENTER_ALIGNMENT);

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