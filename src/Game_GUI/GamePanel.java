package Game_GUI;

import java.awt.Dimension;
import java.awt.Graphics;
import java.awt.Image;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;
import java.awt.image.BufferedImage;
import java.io.File;
import java.io.IOException;
import java.io.InputStream;

import javax.imageio.ImageIO;
import javax.swing.Icon;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JPanel;

import Game_State.Bird;
import Game_State.Pipe;

public class GamePanel extends JPanel {
	Bird selectedBird;
	BufferedImage birdImage;
	BufferedImage background;
	public JLabel backgroundLabel;
	public JLabel birdLabel;
	int x = 10;

	public Pipe pipeUp = new Pipe("pipe_north.png");
	public Pipe pipeDown = new Pipe("pipe_south.png");

	JButton start;

	public GamePanel(Bird bird ) {
		this.selectedBird = bird;
		birdLabel = new JLabel ( new ImageIcon(bird.getImage(selectedBird.getName())));
		backgroundLabel = new JLabel ( new ImageIcon(getImage("x.jpg")));
		birdLabel.setBounds(400,300,50,50);
		backgroundLabel.setBounds(0, 0, 800, 600);
		this.setMaximumSize(new Dimension(500,400));
		
		this.setLayout(null);
		this.add(backgroundLabel);
		backgroundLabel.add(birdLabel);
		this.setVisible(true);

	}
	public BufferedImage getImage(String name){
		InputStream input = this.getClass().getClassLoader().getResourceAsStream(name);
		if (input == null) System.out.println("input null");
		try {
			birdImage = ImageIO.read(input);
			return birdImage;
		} catch (IOException e) {
			e.printStackTrace();
			return null;
		}
	}
	
}





