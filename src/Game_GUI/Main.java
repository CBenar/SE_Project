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
		//controller.startGame();
		mainFrame.add(controller.startBirdPanel());
		

		mainFrame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		mainFrame.getContentPane().setBackground(Color.GREEN); //?
		mainFrame.setVisible(true);		
	}
}
