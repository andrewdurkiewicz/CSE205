package assignment10;

import java.awt.*;
import javax.swing.*;
import javax.swing.ButtonPanel;


public class ReboundExample
{

   //-----------------------------------------------------------------
   //  Presents up a frame with a control panel and a panel that
   //  changes color as the sliders are adjusted.
   //-----------------------------------------------------------------
   public static void main (String[] args)
   {
      JFrame frame = new JFrame ("Rebound");
      GridLayout myLayout = new GridLayout(2,2, 3,3);
	  frame.setLayout(myLayout);

      frame.setDefaultCloseOperation (JFrame.EXIT_ON_CLOSE);
      ButtonPanel b = new ButtonPanel();
      ReboundPanel1 p = new ReboundPanel1(b);
      p.getTimer().start();

      ReboundPanel2 p1 = new ReboundPanel2();
	  ButtonPanel b1 = new ButtonPanel();
      p1.getTimer().start();

      frame.add(b);
      frame.add(p);
      frame.add(b1);
      frame.add(p1);


      frame.setSize(600, 400);
      frame.setVisible(true);
   }
}