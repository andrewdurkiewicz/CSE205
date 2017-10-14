import javax.swing.JFrame;
public class KeyEventView
{

      public static void main(String[] args) {
		JFrame frame = new JFrame("Key Event Tracker");
		KeyEventExample keyboardExample = new KeyEventExample();
		frame.add(keyboardExample);
		frame.setSize(200, 200);
		frame.setVisible(true);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	}


}