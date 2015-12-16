
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
import Game_State.Pipe;

public class GamePanel extends JPanel {
	Bird selectedBird;
	BufferedImage birdImage;
	BufferedImage background;
	int x = 10;

	public Pipe pipeUp = new Pipe("pipe_north.png");
	public Pipe pipeDown = new Pipe("pipe_south.png");

	JButton start;
	//Icon rune;
	public GamePanel(Bird bird ) {
		this.selectedBird = bird;

		this.setMaximumSize(new Dimension(500,400));

		this.setVisible(true);
	}

	public Image createBackground() throws IOException{

		InputStream input = this.getClass().getClassLoader().getResourceAsStream("x.jpg");

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
		g.drawImage(selectedBird.getImage(selectedBird.getName()), 100, 300 ,null);

		g.drawImage(pipeUp.getImage(pipeUp.getName()),
				(int) pipeUp.getLocation() - 60, 400, null);
		System.out.println(pipeUp.getLocation() );
		pipeUp.setLocation(pipeUp.getLocation() - 35);
		// pipeUp.setLocation(600+x);
		// System.out.println(pipeUp.getLocation()+"sdafadsad");
		if (pipeUp.getLocation() < 0) {
			pipeUp.setLocation(600);
			g.drawImage(pipeUp.getImage(pipeUp.getName()),
					(int) pipeUp.getLocation(), 400, null);
			this.repaint();

		}
		this.repaint();
		
		g.drawImage(pipeDown.getImage(pipeDown.getName()),
				(int) pipeDown.getLocation() - 60, -150, null);
		System.out.println(pipeDown.getLocation() );
		pipeDown.setLocation(pipeDown.getLocation() - 35);
		// pipeUp.setLocation(600+x);
		// System.out.println(pipeUp.getLocation()+"sdafadsad");
		if (pipeDown.getLocation() < 0) {
			pipeDown.setLocation(600);
			g.drawImage(pipeDown.getImage(pipeDown.getName()),
					(int) pipeDown.getLocation(), -150, null);
			this.repaint();

		}
		this.repaint();
		
		
		g.drawImage(pipeDown.getImage(pipeDown.getName()),
				(int) pipeDown.getLocation() - 350, -120, null);
		System.out.println(pipeDown.getLocation() );
		pipeDown.setLocation(pipeDown.getLocation() - 35);
		// pipeUp.setLocation(600+x);
		// System.out.println(pipeUp.getLocation()+"sdafadsad");
		if (pipeDown.getLocation() < 0) {
			pipeDown.setLocation(600);
			g.drawImage(pipeDown.getImage(pipeDown.getName()),
					(int) pipeDown.getLocation(), -120, null);
			this.repaint();

		}
		this.repaint();
		

		g.drawImage(pipeUp.getImage(pipeUp.getName()),
				(int) pipeUp.getLocation() - 400, 450, null);
		System.out.println(pipeUp.getLocation() );
		pipeUp.setLocation(pipeUp.getLocation() - 35);
		// pipeUp.setLocation(600+x);
		// System.out.println(pipeUp.getLocation()+"sdafadsad");
		if (pipeUp.getLocation() < 0) {
			pipeUp.setLocation(600);
			g.drawImage(pipeUp.getImage(pipeUp.getName()),
					(int) pipeUp.getLocation(), 120, null);
			this.repaint();

		}
		this.repaint();


	}
}
