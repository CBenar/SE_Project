package Game_GUI;

import java.awt.Color;

import javax.swing.JFrame;
import javax.swing.JPanel;

import Game_Logic.Controller;

public class Main {
	
	public static void main(String[] args) {
		JFrame mainFrame = new JFrame();
		mainFrame.setSize(800, 650);
		
		
		
		System.out.println("Controller is initialized");
		Controller controller = new Controller();
		//controller.startGame();
		JPanel birdP = controller.startBirdPanel();
		mainFrame.add(birdP);
		System.out.println(controller.flag);
		mainFrame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		mainFrame.getContentPane().setBackground(Color.GREEN); //?
		mainFrame.setVisible(true);	
		
		while(controller.flag == false){
			System.out.println(controller.flag);
		}
	
		birdP.setVisible(false);
		
		mainFrame.add(controller.startGamePanel());
		System.out.println(controller.flag);
	


		
	}
}
