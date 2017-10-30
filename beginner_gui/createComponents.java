import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.Color;
import java.awt.Font;
import java.util.Vector;
public class createComponents extends JPanel
{
	private JButton button;
	private JLabel label;
	private JPanel panel;

	public createComponents()
	{
		label = new JLabel("<- Click There");
		button = new JButton("Click Me!");
		panel = new JPanel();
		setBackground(Color.RED);
		ActionListener b1 = new ClickListener();
		button.addActionListener(b1);
		add(button);
		add(label);

	}
public class ClickListener implements ActionListener
{
	public void actionPerformed(ActionEvent event)
	{
		if(event.getSource() == button)
		{
			System.out.println("Button Pressed");
		}
	}

}
}