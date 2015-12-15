package Game_GUI;

import java.awt.Dimension;
import java.awt.GridBagLayout;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;
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
		
		image1 = getImage("bird.png");
		createButton1(image1);
			
		image2 = getImage("bird2.png");
		createButton2(image2);
			
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
	
	public void updateState(String birdName) {
		
	}

	public void closeBirdPanel(){
		System.out.println("closeMenuFrame");
		this.setVisible(false);
	}
	public void startGamePanel(){
		GamePanel gamePanel = new GamePanel(4,4);
		gamePanel.renderPipe(gamePanel.numPipes);
		gamePanel.renderRune(gamePanel.numRunes);
	}
	public void createButton1(BufferedImage image){
		selectionBird1 = new JButton(new ImageIcon(image));
		selectionBird1.setPreferredSize(new Dimension(200,200));
		selectionBird1.addKeyListener(new KeyListener(){
			
			public void keyPressed(KeyEvent e) {
				// TODO Auto-generated method stub
				int keyCode = e.getKeyCode();
				if (keyCode == KeyEvent.VK_ENTER) {
					System.out.println("Enter pressed");
					closeBirdPanel();
					startGamePanel();
					//this.updateState("");
				}
				if (keyCode == KeyEvent.VK_RIGHT) {
					System.out.println("Right pressed");
					selectionBird2.requestFocusInWindow();
				}
			}
			public void keyReleased(KeyEvent arg0) {}
			public void keyTyped(KeyEvent arg0) {}
		});
	}
	public void createButton2(BufferedImage image) {
		selectionBird2 = new JButton(new ImageIcon(image));
		selectionBird2.setPreferredSize(new Dimension(200,200));
		selectionBird2.addKeyListener(new KeyListener(){
			
			public void keyPressed(KeyEvent e) {
				// TODO Auto-generated method stub
				int keyCode = e.getKeyCode();
				if (keyCode == KeyEvent.VK_ENTER) {
					System.out.println("Enter pressed");
					closeBirdPanel();
					startGamePanel();
				}
				if (keyCode == KeyEvent.VK_LEFT) {
					System.out.println("Left pressed");
					selectionBird1.requestFocusInWindow();
				}
			}
			public void keyReleased(KeyEvent e) {}
			public void keyTyped(KeyEvent e) {}	
		});
	}
}
