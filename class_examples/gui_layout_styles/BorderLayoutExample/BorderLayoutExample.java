import javax.swing.*; // to use Japplet, JButton
import java.awt.*;    // to import FlowLayout manager


public class BorderLayoutExample extends JFrame
 {
  public BorderLayoutExample()
   {

	JPanel panel = new JPanel();
    panel.setLayout(new BorderLayout());


       // create five buttons
       JButton button1 = new JButton("Button1");
       JButton button2 = new JButton("Button2");
       JButton button3 = new JButton("Button3");
       JButton button4 = new JButton("Button4");
       JButton button5 = new JButton("Button5");

       
       panel.add(button1, BorderLayout.CENTER);
       panel.add(button2, BorderLayout.NORTH);
       panel.add(button3, BorderLayout.SOUTH);
       panel.add(button4, BorderLayout.WEST);
       panel.add(button5, BorderLayout.EAST);


    add(panel);

    final int FRAME_WIDTH = 600;
	final int FRAME_HEIGHT = 400;
	setSize(FRAME_WIDTH, FRAME_HEIGHT);
	setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

  }

}
