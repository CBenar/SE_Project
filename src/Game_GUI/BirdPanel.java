package Game_GUI;

import java.awt.Dimension;
import java.awt.GridBagLayout;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;
import java.awt.image.BufferedImage;
import java.io.IOException;
import java.io.InputStream;

import javax.imageio.ImageIO;
import javax.swing.Icon;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JPanel;

import Game_State.Bird;

public class BirdPanel extends JPanel {
	
	
	public BirdPanel() {
		// TODO Auto-generated constructor stub	
		this.setLayout(new GridBagLayout());
		
		
		this.setMaximumSize(new Dimension(600,600));
		this.setVisible(true);
	}
	
	public JButton createBirdButton(Bird bird , String name){
		JButton selectionBird = new JButton(new ImageIcon(bird.getImage(name)));
		selectionBird.setPreferredSize(new Dimension(200,200));
		return selectionBird;
		
	}
	
}
