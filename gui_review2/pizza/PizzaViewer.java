import javax.swing.JFrame;

public class PizzaViewer
{  
   public static void main(String[] args)
   {  
      JFrame frame = new PizzaChoice();
      frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
      frame.setTitle("Pizza");
      frame.setVisible(true);      
   }
}
