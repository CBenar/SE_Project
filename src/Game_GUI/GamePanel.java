package Game_GUI;

import java.io.IOException;
import java.io.InputStream;

import javax.imageio.ImageIO;
import javax.swing.Icon;
import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JPanel;

public class GamePanel extends JPanel {
	JLabel bird;
	JButton start;
	//Icon rune;
	public GamePanel(String birdName ) {
		
		bird = new JLabel(); 
		start = new JButton();
		this.setLayout(null);
		this.setVisible(true);
	}
	
	public void renderPipe(int numObjects) {
		for (int i=0; i<numObjects; i++) {
			Shape s = new Shape(i*10, i*15, getIcon("pipe.png"));
			add(new JLabel());
		}
	}
	public void renderRune(int numObjects) {
		for (int i=0; i<numObjects; i++) {
			Shape s = new Shape(i*10, i*15, getIcon("rune.png"));
			add(new JLabel());
		}
	}
	public Icon getIcon (String iconName) {
		InputStream input = this.getClass().getClassLoader().getResourceAsStream(iconName);
		if (input == null) System.out.println("input null");
		try {
		    return (Icon)ImageIO.read(input);
		} catch (IOException e) {
		    e.printStackTrace();
		    return null;
		}
	}
}
