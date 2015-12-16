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
	Pipe pipe = new Pipe();
	JButton start;
	//Icon rune;
	public GamePanel(Bird bird ) {
		this.selectedBird = bird;
		this.birdImage = bird.getImage(bird.getName());
		start = new JButton();
		this.setMaximumSize(new Dimension(500,400));
		//this.setLayout();
		this.setVisible(true);
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
		g.drawImage(pipe.getImage("pipe_north.png"), 100, 100 , null);
		g.drawImage(pipe.getImage("pipe_south.png"), 50, 50 , null);
	}
}