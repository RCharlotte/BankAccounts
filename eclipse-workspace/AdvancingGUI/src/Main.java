import java.awt.Color;
import javax.swing.ImageIcon;
import javax.swing.JFrame;

public class Main {

	public static void main(String[] args) {
		// JFrame is a GUI window to add components to
		
		JFrame frame = new JFrame(); // creates an instance of class JFrame
		frame.setSize(420, 420);// this sets the width and height 
		frame.setTitle("This is the title");
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE); // exits the application
		frame.setResizable(false); // prevents resizing of frame
		frame.setVisible(true);
		
		ImageIcon image = new ImageIcon("C:\\Users\\jeron\\eclipse-workspace\\AdvancingGUI\\src\\icon.png"); // create an ImageIcon using the undraw
		frame.setIconImage(image.getImage()); // set the frame icon to the instance of ImageIcon 
		//frame.getContentPane().setBackground(new Color (255,192,200));
		frame.getContentPane().setBackground(new Color (0x123456));
	}

}
