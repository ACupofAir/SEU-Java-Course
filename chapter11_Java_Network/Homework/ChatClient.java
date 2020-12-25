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

/**
 * @author 83849 ����ͻ���
 */
public class ChatClient {

	/**
	 * �ͻ����׽���
	 */
	Socket socket;

	/**
	 * ������
	 */
	BufferedReader in;

	/**
	 * �����
	 */
	PrintWriter out;

	/**
	 * �˿ں�
	 */
	public static final int PORT = 8088;

	/**
	 * ���캯��
	 */
	public ChatClient() {
		// TODO Auto-generated constructor stub

		// �½�һ�����촰��
		ChatUI ClientUI = new ChatUI();
		// ���ñ���
		ClientUI.frame.setTitle("Client");

		// ���÷��Ϳ�ݼ�    er��
		ClientUI.textField.addKeyListener(new KeyAdapter() {
			public void keyPressed(KeyEvent e) {
				if (e.getKeyCode() == KeyEvent.VK_ENTER) {
					String mes = ClientUI.textField.getText();

					// ���ı������ı��ǿ�,��ӵ�����������ʾ������,�����ı����͵��ͻ���
					if (!mes.isEmpty()) {
						ClientUI.updateText("Client:" + mes);
						out.println(mes);
					}
				}
			}
		});

		// ��ӷ��Ͱ�ť�ļ����¼�
		ClientUI.button.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent arg0) {
				// TODO Auto-generated method stub
				String mes = ClientUI.textField.getText();

				// ���ı������ı��ǿ�,��ӵ�����������ʾ������,�����ı����͵��ͻ���
				if (!mes.isEmpty()) {
					ClientUI.updateText("Client:" + mes);
					out.println(mes);
				}
			}
		});

		try {
			// ��ȡ����ip
			InetAddress addr = InetAddress.getLocalHost();

			// ��ʼ��
			socket = new Socket(addr, PORT);
			in = new BufferedReader(new InputStreamReader(this.socket.getInputStream()));
			out = new PrintWriter(new BufferedWriter(new OutputStreamWriter(socket.getOutputStream())), true);

			// ��ȡ�ͻ��˷��͵��ı�,�����ı���ӵ�����������ʾ������
			while (true) {
				String str = in.readLine();
				if (str != null) {
					ClientUI.updateText("Server:" + str);

					// ���ı�==bye(�����ִ�Сд),�˳�ѭ��
					if (str.toLowerCase().equals("bye"))
						break;
				}
			}
		} catch (Exception e) {
			e.printStackTrace();
		} finally {
			try {
				// �ر�����������
				in.close();
				out.close();

				// �رտͻ��˵��׽���
				socket.close();
			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
	}

	public static void main(String[] args) {
		ChatClient chatClient = new ChatClient();
	}
}
