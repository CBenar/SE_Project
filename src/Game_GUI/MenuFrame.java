package Game_GUI;

import java.awt.Color;

import javax.swing.JFrame;

public class MenuFrame extends JFrame {

	public MenuFrame() {
		// TODO Auto-generated constructor stub
		
		BirdPanel birdPanel = new BirdPanel();
		
		this.setSize(800, 650);
		
		this.add(birdPanel);
		
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		this.getContentPane().setBackground(Color.GREEN); //?
		this.setVisible(true);
	}
}
