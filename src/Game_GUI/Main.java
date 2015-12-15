package Game_GUI;

import javax.swing.JFrame;

import Game_Logic.Controller;

public class Main extends JFrame {
	
	public static void main(String[] args) {
		JFrame mainJF = new JFrame();
		JFrame f=new JFrame();
		
		System.out.println("Controller is initialized");
		Controller controller = new Controller();
		
		MenuPanel menuFrame = new MenuPanel();
		controller.startGame();
		
	}
}
