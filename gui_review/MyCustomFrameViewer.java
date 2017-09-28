import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JButton;
import javax.swing.JPanel;
import java.awt.Color;
public class MyCustomFrameViewer
{
	public static void main(String[] args)
	{
		JFrame frame = new JFrame();
		JLabel label = new JLabel("Hello World");
		JButton button = new JButton("Click Me!");
		JPanel panel = new JPanel();
		panel.add(button);
		panel.add(label);
		frame.add(panel);




		final int FRAME_WIDTH = 800;
		final int FRAME_HEIGHT = 800;
		frame.setSize(FRAME_WIDTH,FRAME_HEIGHT);
		frame.setTitle("My First Frame");
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);



		frame.setVisible(true);


	}
}