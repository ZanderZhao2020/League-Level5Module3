package _02_Chat_Application;

import java.net.InetAddress;
import java.net.UnknownHostException;
import java.util.Random;

import javax.swing.BoxLayout;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;

class App {
	JFrame Frame = new JFrame();
	JPanel Panel = new JPanel();
	JButton SClient = new JButton("Run Client");
	JButton SServer = new JButton("Run Server");
	JLabel SInfo = new JLabel();
	JTextField Input = new JTextField(20);
	int Port;
	void Server() {
		Input.setText("Send messages to chat room here.");
		Panel.add(SInfo);
		Panel.add(Input);
		Panel.remove(SClient);
		Panel.remove(SServer);
		Panel.repaint();
		Frame.pack();
	}
	void Client() {
		
	}
	void Run() {
		Port = new Random().nextInt(25566);
		SClient.addActionListener((S) -> Client());
		SServer.addActionListener((S) -> Server());
		try {
			SInfo.setText(InetAddress.getLocalHost().getHostAddress() + ":" + Port);
		} catch (UnknownHostException e) {
		}
		Panel.add(SClient);
		Panel.add(SServer);
		Frame.add(Panel);
		Frame.setTitle("Chat App");
		Frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		Frame.setVisible(true);
		Frame.setSize(1000, 500);
		Frame.setMinimumSize(Frame.getSize());
	}
}
public class ChatApp {
	public static void main(String[] args) {
		new App().Run();
	}
}