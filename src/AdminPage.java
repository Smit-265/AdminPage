import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JPasswordField;
import javax.swing.JTextField;

class AdminPage implements ActionListener{
	static JFrame frame;
	static JPanel panel;
	static JLabel userLabel;
	static JLabel passwordLabel;
	static JTextField userText;
	static JPasswordField passwordText;
	static JButton button;
	static JButton button1;
	static JLabel success;
	public static void main(String args[])
	{
		frame = new JFrame();
		panel = new JPanel();
		frame.setSize(100, 100);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.add(panel);
		panel.setLayout(null);
		
		userLabel = new JLabel("Username");
		userLabel.setBounds(10, 20, 80, 25);
		panel.add(userLabel);
		userText = new JTextField(20);
		userText.setBounds(90, 20, 170, 25);
		panel.add(userText);
		
		passwordLabel = new JLabel("Password");
		passwordLabel.setBounds(10, 50, 80, 25);
		panel.add(passwordLabel);
		passwordText = new JPasswordField();
		passwordText.setBounds(90, 50, 170, 25);
		panel.add(passwordText);
		
		button = new JButton("Login");
		button.setBounds(90, 90, 70, 25);
		button.addActionListener(new AdminPage());
		panel.add(button);
		button1 = new JButton("Sign in");
		button1.setBounds(170, 90, 80, 25);
		panel.add(button1);
		
		success = new JLabel("");
		success.setBounds(90, 130, 300, 25);
		panel.add(success);
		
		frame.setVisible(true);
	}
	@Override
	public void actionPerformed(ActionEvent e) {
		String user = userText.getText();
		String password = passwordText.getText();
		
		if(user.isBlank() || password.isBlank()) {
			success.setText("Please Enter Username and Password...");
		}
		else if(user.equals("admin") && password.equals("123456")) {
			success.setText("Login Successful  :)");
		}
		else {
			success.setText("Invalid Username or Password...!");
		}
	}
}