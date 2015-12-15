package Game_GUI;

import java.awt.Dimension;
import java.awt.GridBagLayout;
import java.awt.image.BufferedImage;
import java.io.IOException;
import java.io.InputStream;

import javax.imageio.ImageIO;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JPanel;

public class BirdPanel extends JPanel {
	JButton selectionBird1;
	JButton selectionBird2;
	BufferedImage image1;
	BufferedImage image2;
	public BirdPanel() {
		// TODO Auto-generated constructor stub
		
		this.setLayout(new GridBagLayout());
		
		image1 = getImage("blue_bird.gif");
		selectionBird1 = new JButton(new ImageIcon(image1));
		selectionBird1.setPreferredSize(new Dimension(200,200));
		
		image2 = getImage("yellow_bird.jpg");
		selectionBird2 = new JButton(new ImageIcon(image2));
		selectionBird2.setPreferredSize(new Dimension(200,200));
		
		this.add(selectionBird1);
		this.add(selectionBird2);
		
		this.setMaximumSize(new Dimension(400,400));
		this.setVisible(true);
	}
	
	public BufferedImage getImage(String imageName){
		InputStream input = this.getClass().getClassLoader().getResourceAsStream(imageName);
		if (input == null) System.out.println("input null");
		try {
		    return ImageIO.read(input);
		} catch (IOException e) {
		    e.printStackTrace();
		    return null;
		}
	}
}
