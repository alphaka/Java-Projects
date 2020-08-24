import javax.swing.*;
import java.awt.*; // for GirdLayout
import java.awt.event.*; // for actionListener

public class TemperatureConverter extends JFrame {

	private class Converter implements ActionListener {

		@Override
		public void actionPerformed(ActionEvent e) {

			String value = text.getText(); // get the value in the box
			double temp = Double.parseDouble(value);

			temp = 9 * temp / 5 + 32;

			text.setText(Double.toString(temp)); // put back the new result in the text textbox

		}

	} // end actionListener 

	// JLabel, JTextField, JButton are called components

	private JLabel prompt;
	// permit you to display a prompt for the user

	private JTextField text;
	// a place to enter a new text by the user

	private JButton button;

	public TemperatureConverter() {

		super();

		setSize(500, 100);

		setDefaultCloseOperation(EXIT_ON_CLOSE);

		setTitle("Temperature Converter");

		prompt = new JLabel("Enter a Celcius Temperature");

		text = new JTextField(10);
		// can pass it 10 thing

		button = new JButton("Calculate!!!");

		button.addActionListener(new Converter());
		// An action listener is an interface in the java library set, precisely in ActionListener
		// The actionListener has a action perferm

		JPanel panel = new JPanel();

		panel.setLayout(new GridLayout(3,1));

		panel.add(prompt);

		panel.add(text);

		panel.add(button);

		add(panel);

		setVisible(true);		

	} // end public TemperatureConverter()

	public static void main(String[] args) {

		new TemperatureConverter();

	}

} // end class TemperatureConverter
