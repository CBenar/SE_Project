package Game_GUI;

import java.awt.Color;

import javax.swing.JFrame;

import Game_Logic.Controller;

public class Main {
	
	public static void main(String[] args) {
		JFrame mainFrame = new JFrame();
		mainFrame.setSize(800, 650);
		
		System.out.println("Controller is initialized");
		Controller controller = new Controller();
		
		BirdPanel birdPanel = new BirdPanel();
		mainFrame.add(birdPanel);
		controller.startGame();

		mainFrame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		mainFrame.getContentPane().setBackground(Color.GREEN); //?
		mainFrame.setVisible(true);		
	}
}
