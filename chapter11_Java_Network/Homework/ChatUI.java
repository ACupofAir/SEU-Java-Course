package chapter11_Java_Network.Homework;

import java.awt.BorderLayout;
import java.awt.FlowLayout;
import java.awt.Font;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.JTextArea;
import javax.swing.JTextField;
import javax.swing.UIManager;

public class ChatUI {

	public JFrame frame;

	public JTextArea textArea;

	public JTextField textField;

	public JButton button;

	public ChatUI() {
		try {
			UIManager.setLookAndFeel("com.sun.java.swing.plaf.nimbus.NimbusLookAndFeel");
		} catch (Exception e) {
			e.printStackTrace();
		}

		Font font = new Font("Î¢ÈíÑÅºÚ", Font.PLAIN, 20);

		frame = new JFrame();
		button = new JButton("send");
		textArea = new JTextArea();
		textField = new JTextField(40);

		frame.getContentPane().setLayout(new BorderLayout());
		frame.setResizable(false);

		textArea.setLineWrap(true);
		textArea.setWrapStyleWord(true);
		textArea.setEditable(false);
		textArea.setFont(font);

		JScrollPane scorallPane = new JScrollPane(textArea);
		scorallPane.setHorizontalScrollBarPolicy(JScrollPane.HORIZONTAL_SCROLLBAR_NEVER);
		scorallPane.setVerticalScrollBarPolicy(JScrollPane.VERTICAL_SCROLLBAR_AS_NEEDED);

		textField.setSize(40, 25);
		textField.setFont(font);

		JPanel panel = new JPanel();
		panel.setLayout(new FlowLayout());
		panel.add(textField);
		panel.add(button);

		frame.add(scorallPane, BorderLayout.CENTER);
		frame.add(panel, BorderLayout.SOUTH);
		frame.setSize(800,600);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.setVisible(true);
	}


	/**
	 * @param mes
	 */
	public void updateText(String mes) {
		textArea.append(mes + "\n");

		textArea.setCaretPosition(textArea.getText().length());

		textField.setText(null);
	}

}
