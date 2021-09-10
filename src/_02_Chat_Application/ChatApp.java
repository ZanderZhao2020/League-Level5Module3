package _02_Chat_Application;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;

class Client {
	void Run() {
		
	}
}
class Server {
	void Run() {
		
	}
}
class App {
	JFrame Frame = new JFrame();
	JPanel Panel = new JPanel();
	JLabel Label = new JLabel("Chat Room Thing");
	JButton Client = new JButton("Client");
	JButton Server = new JButton("Server");
	void Run() {
		Panel.add(Label);
		Client.addActionListener((S) -> {
			new Client().Run();
			Frame.dispose();
		});
		Server.addActionListener((S) -> {
			new Server().Run();
			Frame.dispose();
		});
		Panel.add(Client);
		Panel.add(Server);
		Frame.add(Panel);
		Frame.setTitle("Chat Room Thing");
		Frame.setVisible(true);
		Frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		Frame.setSize(1000, 500);
	}
}
public class ChatApp {
	public static void main(String[] args) {
		new App().Run();
	}
}