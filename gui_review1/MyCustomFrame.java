
import javax.swing.JPanel;
import javax.swing.JFrame;
import java.awt.Color;

public class MyCustomFrame extends JFrame
{
   public MyCustomFrame()
   {

      JPanel panel = new createComponents();
      add(panel);
      final int FRAME_WIDTH = 800;
      final int FRAME_HEIGHT = 800;
      setSize(FRAME_WIDTH, FRAME_HEIGHT);
      setTitle("Andrew Durkiewicz GUI Project");
      setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

   }

}
