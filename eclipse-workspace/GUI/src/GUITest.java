import java.awt.Color;

import javax.swing.JFrame;

public class GUITest {

	public static void main(String[] args) {
		
		JFrame frame = new JFrame();
		frame.setSize(350, 200);
		frame.setBackground (Color.BLUE);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		GUI gui =new GUI();
		frame.add(gui);
		frame.setVisible(true);

	}

}
