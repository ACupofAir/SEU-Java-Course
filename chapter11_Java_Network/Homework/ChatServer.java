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
import java.net.ServerSocket;
import java.net.Socket;

public class ChatServer {

	ServerSocket server;

	Socket socket;

	BufferedReader in;

	PrintWriter out;

	public static final int PORT = 8088;

	public ChatServer() {

		ChatUI ServerUI = new ChatUI();
		ServerUI.frame.setTitle("Server");

		ServerUI.textField.addKeyListener(new KeyAdapter() {
			public void keyPressed(KeyEvent e) {
				if (e.getKeyCode() == KeyEvent.VK_ENTER) {
					String mes = ServerUI.textField.getText();

					if (!mes.isEmpty()) {
						ServerUI.updateText("Server:" + mes);
						out.println(mes);
					}
				}
			}
		});

		ServerUI.button.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent arg0) {
				String mes = ServerUI.textField.getText();
				if (!mes.isEmpty()) {
					ServerUI.updateText("Server:" + mes);
					out.println(mes);
				}
			}
		});

		try {
			server = new ServerSocket(PORT);
			socket = server.accept();
			in = new BufferedReader(new InputStreamReader(this.socket.getInputStream()));
			out = new PrintWriter(new BufferedWriter(new OutputStreamWriter(socket.getOutputStream())), true);

			while (true) {
				String str = in.readLine();
				if (str != null) {
					ServerUI.updateText("Client:" + str);

					if (str.toLowerCase().equals("bye")) {
						break;
					}
				}
			}
		} catch (Exception e) {
			e.printStackTrace();
		} finally {
			try {
				in.close();
				out.close();

				socket.close();
				server.close();
			} catch (IOException e) {
				e.printStackTrace();
			}
		}
	}


	/**
	 * @param args
	 */
	public static void main(String[] args) {
		ChatServer chatServer = new ChatServer();
	}
}
