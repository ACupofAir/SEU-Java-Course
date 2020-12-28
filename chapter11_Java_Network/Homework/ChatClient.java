package chapter11_Java_Network.Homework;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.KeyAdapter;
import java.awt.event.KeyEvent;
import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.io.PrintWriter;
import java.net.InetAddress;
import java.net.Socket;

public class ChatClient {

	Socket socket;

	BufferedReader in;

	PrintWriter out;

	public static final int PORT = 8088;

	public ChatClient() {

		ChatUI ClientUI = new ChatUI();
		ClientUI.frame.setTitle("Client");
		ClientUI.textField.addKeyListener(new KeyAdapter() {
			public void keyPressed(KeyEvent e) {
				if (e.getKeyCode() == KeyEvent.VK_ENTER) {
					String mes = ClientUI.textField.getText();

					if (!mes.isEmpty()) {
						ClientUI.updateText("Client:" + mes);
						out.println(mes);
					}
				}
			}
		});

		ClientUI.button.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent arg0) {
				String mes = ClientUI.textField.getText();

				if (!mes.isEmpty()) {
					ClientUI.updateText("Client:" + mes);
					out.println(mes);
				}
			}
		});

		try {
			InetAddress addr = InetAddress.getLocalHost();

			socket = new Socket(addr, PORT);
			in = new BufferedReader(new InputStreamReader(this.socket.getInputStream()));
			out = new PrintWriter(new BufferedWriter(new OutputStreamWriter(socket.getOutputStream())), true);

			while (true) {
				String str = in.readLine();
				if (str != null) {
					ClientUI.updateText("Server:" + str);
					if (str.toLowerCase().equals("bye"))
						break;
				}
			}
		} catch (Exception e) {
			e.printStackTrace();
		} finally {
			try {
				in.close();
				out.close();

				socket.close();
			} catch (IOException e) {
				e.printStackTrace();
			}
		}
	}


	/**
	 * @param args
	 */
	public static void main(String[] args) {
		ChatClient chatClient = new ChatClient();
	}
}
