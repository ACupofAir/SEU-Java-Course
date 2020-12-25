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
 * @author 83849 聊天客户端
 */
public class ChatClient {

	/**
	 * 客户端套接字
	 */
	Socket socket;

	/**
	 * 输入流
	 */
	BufferedReader in;

	/**
	 * 输出流
	 */
	PrintWriter out;

	/**
	 * 端口号
	 */
	public static final int PORT = 8088;

	/**
	 * 构造函数
	 */
	public ChatClient() {
		// TODO Auto-generated constructor stub

		// 新建一个聊天窗口
		ChatUI ClientUI = new ChatUI();
		// 设置标题
		ClientUI.frame.setTitle("Client");

		// 设置发送快捷键    er键
		ClientUI.textField.addKeyListener(new KeyAdapter() {
			public void keyPressed(KeyEvent e) {
				if (e.getKeyCode() == KeyEvent.VK_ENTER) {
					String mes = ClientUI.textField.getText();

					// 若文本框中文本非空,添加到聊天内容显示区域中,并将文本发送到客户端
					if (!mes.isEmpty()) {
						ClientUI.updateText("Client:" + mes);
						out.println(mes);
					}
				}
			}
		});

		// 添加发送按钮的监听事件
		ClientUI.button.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent arg0) {
				// TODO Auto-generated method stub
				String mes = ClientUI.textField.getText();

				// 若文本框中文本非空,添加到聊天内容显示区域中,并将文本发送到客户端
				if (!mes.isEmpty()) {
					ClientUI.updateText("Client:" + mes);
					out.println(mes);
				}
			}
		});

		try {
			// 获取本机ip
			InetAddress addr = InetAddress.getLocalHost();

			// 初始化
			socket = new Socket(addr, PORT);
			in = new BufferedReader(new InputStreamReader(this.socket.getInputStream()));
			out = new PrintWriter(new BufferedWriter(new OutputStreamWriter(socket.getOutputStream())), true);

			// 读取客户端发送的文本,并将文本添加到聊天内容显示区域中
			while (true) {
				String str = in.readLine();
				if (str != null) {
					ClientUI.updateText("Server:" + str);

					// 若文本==bye(不区分大小写),退出循环
					if (str.toLowerCase().equals("bye"))
						break;
				}
			}
		} catch (Exception e) {
			e.printStackTrace();
		} finally {
			try {
				// 关闭输入和输出流
				in.close();
				out.close();

				// 关闭客户端的套接字
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
