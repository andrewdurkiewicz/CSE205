import javax.swing.*; // to use Japplet, JButton
import java.awt.*;    // to import FlowLayout manager


public class GridLayoutExample extends JFrame
 {
  public GridLayoutExample()
   {

	JPanel panel = new JPanel();
    panel.setLayout(new GridLayout(2,3));


       // create five buttons
       JButton button1 = new JButton("Button1");
       JButton button2 = new JButton("Button2");
       JButton button3 = new JButton("Button3");
       JButton button4 = new JButton("Button4");
       JButton button5 = new JButton("Button5");

       
       panel.add(button1);
       panel.add(button2);
       panel.add(button3);
       panel.add(button4);
       panel.add(button5);


    add(panel);

    final int FRAME_WIDTH = 600;
	final int FRAME_HEIGHT = 400;
	setSize(FRAME_WIDTH, FRAME_HEIGHT);
	setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

  }

}
