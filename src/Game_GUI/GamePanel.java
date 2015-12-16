package Game_GUI;

import java.awt.Dimension;
import java.awt.Graphics;
import java.awt.Image;
import java.awt.image.BufferedImage;
import java.io.IOException;
import java.io.InputStream;

import javax.imageio.ImageIO;
import javax.swing.Icon;
import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JPanel;

import Game_State.Bird;

public class GamePanel extends JPanel {
	Bird selectedBird;
	BufferedImage birdImage;
	BufferedImage pipeSouth;
	BufferedImage pipeNorth;
	BufferedImage background;
	
	

	JButton start;
	//Icon rune;
	public GamePanel(Bird bird ) {
		this.selectedBird = bird;
		this.birdImage = bird.getImage(bird.getName());
		start = new JButton();
		
		this.setMaximumSize(new Dimension(500,400));
		
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
	public BufferedImage createPipeSouth() throws IOException{
		InputStream input = this.getClass().getClassLoader().getResourceAsStream("pipe_south.png");

		pipeSouth = ImageIO.read(input);
		
		return pipeSouth;
		
	}
	public Image createPipeNorth() throws IOException{
		
		InputStream input = this.getClass().getClassLoader().getResourceAsStream("pipe_north.png");

		pipeNorth = ImageIO.read(input);
		
		return pipeNorth;		
	}
	public Image createBackground() throws IOException{
		
		InputStream input = this.getClass().getClassLoader().getResourceAsStream("background.png");

		background = ImageIO.read(input);
		
		return background;		
	}
	public void paint(Graphics g) {
		try {
			g.drawImage(createBackground(), 0, 0 , null);
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		try {
			g.drawImage(createPipeSouth(), 100, 100 , null);
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} // top
//		g.drawImage(createImage2(), 200, null); // bottom
		try {
			g.drawImage(createPipeNorth(), 50, 50 , null);
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		

	}
}
