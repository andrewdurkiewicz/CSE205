import java.awt.BorderLayout;
import java.awt.Font;
import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.ButtonGroup;
import javax.swing.JButton;
import javax.swing.JCheckBox;
import javax.swing.JComboBox;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JRadioButton;
import javax.swing.border.EtchedBorder;
import javax.swing.border.TitledBorder;
import javax.swing.JTextField;
import java.text.NumberFormat;

public class PizzaChoice extends JFrame
{
	private static final int FRAME_WIDTH  = 800;
	private static final int FRAME_HEIGHT = 400;

	private JLabel label;
	private JRadioButton cheesePizza;
	private JRadioButton pepperoni;
	private JRadioButton veggie;
	private JCheckBox mushroom;
	private JCheckBox peppers;
	private JCheckBox sausage;
	private JButton calcTotal;
	private ActionListener listener;
	private JTextField display;
	private JLabel bottom_ast;

	public PizzaChoice()
	{
		display = new JTextField();
		display.setEditable(false);
		display.setBorder(new TitledBorder(new EtchedBorder(),"Current Total"));
		add(display,BorderLayout.EAST);
		label = new JLabel("Andrew's Pizza Shop");
		label.setFont(new Font("Serif", Font.ITALIC, 18));
		label.setBorder(new EtchedBorder());
		bottom_ast = new JLabel("*All toppings include an aditional $1.50 charge to total bill.");
		bottom_ast.setFont(new Font("Serif", Font.ITALIC, 12));
		bottom_ast.setBorder(new EtchedBorder());
		add(bottom_ast,BorderLayout.SOUTH);



		listener = new ChoiceListener();

		createControlPanel();
		setPrice();
		add(label, BorderLayout.NORTH);

		setSize(FRAME_WIDTH,FRAME_HEIGHT);
	}
	class ChoiceListener implements ActionListener
	{  
	  public void actionPerformed(ActionEvent event)
	  {  
	     setPrice();
	  }
	}
	public void createControlPanel()
	{
		JPanel pizzatypePanel = createRadioButtons();
		JPanel toppingPanel = createCheckBoxes();


		JPanel controlPanel = new JPanel();
		controlPanel.setLayout(new GridLayout(1,100,5,10));
		controlPanel.add(pizzatypePanel);
		controlPanel.add(toppingPanel);

		add(controlPanel,BorderLayout.CENTER);

	}
	public JPanel createRadioButtons()
	{
		cheesePizza = new JRadioButton("Cheese ($10.00)");
		cheesePizza.addActionListener(listener);

		pepperoni = new JRadioButton("Pepperoni ($12.00)");
		pepperoni.addActionListener(listener);

		veggie = new JRadioButton("Veggie ($15.00)");
		veggie.addActionListener(listener);

		ButtonGroup group = new ButtonGroup();
		group.add(cheesePizza);
		group.add(pepperoni);
		group.add(veggie);

		JPanel panel = new JPanel();
		panel.setLayout(new GridLayout(3,1));
		panel.add(cheesePizza);
		panel.add(pepperoni);
		panel.add(veggie);
		panel.setBorder(new TitledBorder(new EtchedBorder(),"Pizza Type"));
		
		return panel;
	}
	public JPanel createCheckBoxes()
	{
		mushroom = new JCheckBox("Mushroom");
		mushroom.addActionListener(listener);

		peppers = new JCheckBox("Peppers");
		peppers.addActionListener(listener);

		sausage = new JCheckBox("Sausage");
		sausage.addActionListener(listener);

		JPanel panel = new JPanel();
		panel.setLayout(new GridLayout(3,1));

		panel.add(mushroom);
		panel.add(peppers);
		panel.add(sausage);
		panel.setBorder(new TitledBorder(new EtchedBorder(),"Toppings*"));
		
		return panel;
	}
	public void setPrice()
	{
		NumberFormat formatter = NumberFormat.getCurrencyInstance();


		double total = 0;


		if (sausage.isSelected())
		{
			total+=1.5;
		}
		if (mushroom.isSelected())
		{
			total+=1.5;
		}
		if (peppers.isSelected())
		{
			total+=1.5;
		}
		if (pepperoni.isSelected())
		{
			total+=12;
		}
		if (cheesePizza.isSelected())
		{
			total+=10;
		}
		if (veggie.isSelected())
		{
			total+=15;
		}
		String current_total = "          " +formatter.format(total) + "       ";
		display.setText(current_total);

	}

}

