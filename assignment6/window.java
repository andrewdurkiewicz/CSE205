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
import javax.swing.JTextArea; 
import java.text.NumberFormat;
import javax.swing.JScrollPane;

public class window extends JFrame
{
	public final int FRAME_WIDTH = 800;
	public final int FRAME_HEIGHT = 800;

	private JTextArea inputDisplay;
	private JTextField outputDisplay;
	private JRadioButton f_small;
	private JRadioButton f_medium;
	private JRadioButton f_large;
	private JCheckBox word_c;
	private JCheckBox char_c;
	private JCheckBox vow_c;
	private ActionListener listener;

	public window()
	{
		//input for analysis
		inputDisplay = new JTextArea(); //input text box
		inputDisplay.setEditable(true); //make editable
		inputDisplay.setFont(new Font("default",Font.PLAIN, 24));
		inputDisplay.setLineWrap(true);
		inputDisplay.setWrapStyleWord(true);//Wraps words to avoid horizontal scroll.
		JScrollPane scrollpane = new JScrollPane(inputDisplay);

		//output after the analysis
		outputDisplay = new JTextField(); //input text box
		outputDisplay.setEditable(false); //make editable
		//outputDisplay.setLineWrap(true);
		//outputDisplay.setWrapStyleWord(true);//Wraps words to avoid horizontal scroll.

		//set the border layout with an etched border
		inputDisplay.setBorder(new TitledBorder(new EtchedBorder(), "Text Processor"));
		outputDisplay.setBorder(new TitledBorder(new EtchedBorder(), "Analysis Results"));
		JPanel displays = new JPanel();
		displays.setLayout(new GridLayout(1,2));
		displays.add(scrollpane);
		displays.add(outputDisplay);
		add(displays,BorderLayout.CENTER);


		listener = new ChoiceListener();
		createControlPanel();
		setSize(FRAME_WIDTH,FRAME_HEIGHT);


	}

	class ChoiceListener implements ActionListener
	{  
	  public void actionPerformed(ActionEvent event)
	  {  
	  	setNewSize();
	  }
	}

	public void createControlPanel()
	{
		JPanel sizeButtons = createRadioButtons();
		JPanel analysisBox = createCheckBoxes();

		JPanel controlPanel = new JPanel();
		controlPanel.setLayout(new GridLayout(1,2));
		controlPanel.add(sizeButtons);
		controlPanel.add(analysisBox);

		add(controlPanel, BorderLayout.SOUTH);

	}

	public JPanel createRadioButtons()
	{
		f_small = new JRadioButton("Small");
		f_small.addActionListener(listener);

		f_medium = new JRadioButton("Medium");
		f_medium.addActionListener(listener);

		f_large = new JRadioButton("Large");
		f_large.addActionListener(listener);
		f_large.setSelected(true);

		ButtonGroup size_select = new ButtonGroup();

		size_select.add(f_small);
		size_select.add(f_medium);
		size_select.add(f_large);

		JPanel panel = new JPanel();
		panel.setLayout(new GridLayout(1,3));
		panel.add(f_small);
		panel.add(f_medium);
		panel.add(f_large);
		panel.setBorder(new TitledBorder(new EtchedBorder(), "Size"));

		return panel;

	}

	public JPanel createCheckBoxes()
	{
		word_c = new JCheckBox("Word Count");
		word_c.addActionListener(listener);

		char_c = new JCheckBox("Character Count");
		char_c.addActionListener(listener);

		vow_c = new JCheckBox("Vowel Count");
		vow_c.addActionListener(listener);

		JPanel panel = new JPanel();
		panel.setLayout(new GridLayout(1,3));
		panel.add(word_c);
		panel.add(char_c);
		panel.add(vow_c);
		panel.setBorder(new TitledBorder(new EtchedBorder(), "Analysis Type"));
		
		return panel;
	}

	public void setNewSize()
	{
		int size = 0;
		final int SMALL_SIZE = 12;
		final int MEDIUM_SIZE = 18;
		final int LARGE_SIZE = 24;

		if (f_large.isSelected()) {size = LARGE_SIZE;}
		else if (f_medium.isSelected()) {size = MEDIUM_SIZE;}
		else if (f_small.isSelected()) {size = SMALL_SIZE;}

		String message = inputDisplay.getText();
		inputDisplay.setFont(new Font("default",Font.PLAIN,size));

	}

}