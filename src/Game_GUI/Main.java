package Game_GUI;

import javax.swing.JFrame;

import Game_Logic.Controller;

public class Main extends JFrame {
	
	public static void main(String[] args) {
		System.out.println("Controller is initialized");
		Controller controller = new Controller();
		
		MenuPanel menuFrame = new MenuPanel();
		controller.startGame();
		
	}
}
