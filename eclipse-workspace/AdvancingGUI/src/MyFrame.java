import java.awt.Color;

import javax.swing.ImageIcon;
import javax.swing.JFrame;

public class MyFrame extends JFrame{
	MyFrame(){
		 // creates an instance of class Jthis
		this.setSize(420, 420);// this sets the width and height 
		this.setTitle("This is the title");
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE); // exits the application
		this.setResizable(false); // prevents resizing of this
		this.setVisible(true);
		
		ImageIcon image = new ImageIcon("C:\\Users\\jeron\\eclipse-workspace\\AdvancingGUI\\src\\icon.png"); // create an ImageIcon using the undraw
		this.setIconImage(image.getImage()); // set the this icon to the instance of ImageIcon 
		//this.getContentPane().setBackground(new Color (255,192,200));
		this.getContentPane().setBackground(new Color (0x123456));
	}

}
