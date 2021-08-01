import java.awt.Color;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.File;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JPasswordField;
import javax.swing.JTextField;

public class GUI implements ActionListener{
	private static JLabel  userlabel;
	private static JTextField userText;
	private static JLabel passwordLabel;
	private static JPasswordField passwordText;
	private static JLabel success;
	private static JPanel panel;
	
	public static void main(String[] args) {
		panel = new JPanel();
		
		JFrame frame = new JFrame();
		frame.setSize(350, 200);
		frame.setBackground (Color.BLUE);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		frame.add(panel);
		
		panel.setLayout(null);
		userlabel = new JLabel("Technician Name:");
		userlabel.setBounds(10,20,105,25);
		panel.add(userlabel);
		
		userText = new JTextField();
		userText.setBounds(116,20,200,25);
		panel.add(userText);
		
		passwordLabel = new JLabel("Password:");
		passwordLabel.setBounds(10,50,105,25);
		panel.add(passwordLabel);
		
		passwordText = new JPasswordField();
		passwordText.setBounds(116,50,200,25);
		panel.add(passwordText);
		
		JButton button = new JButton("Login");
		button.setBounds(200,100,116,25);
		button.addActionListener(new GUI());
		panel.add(button);
		
		success = new JLabel("");
		success.setBounds(10, 110,300,25);
		panel.add(success);
		
		
		frame.setVisible(true);
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		String user = userText.getText();
		String password = passwordText.getText();
		
		if (user.equalsIgnoreCase("Kennedy") && password.equals("0704880403")){
			
			success.setText("Log in successful");
			String path = "C:\\Users\\jeron\\eclipse-workspace\\GUI\\src\\c.txt";
			File file = new File(path);
			
		try{
			if (file.exists()) {
			Process pro = Runtime.getRuntime().exec("rundll32 url.dll, FileProtocolHandler " + path);
			pro.waitFor();
					
		}
		else {
			System.out.println("File does not exist");
		}
		}
		catch (Exception e1) {
			System.out.println("Error in accessing file");
		}
			
		}
		else {
			

			success.setText("Not Successful");
			
		}
			
	}

}
