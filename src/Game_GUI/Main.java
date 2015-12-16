package Game_GUI;

import java.awt.Color;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;

import javax.swing.JFrame;
import javax.swing.JPanel;

import Game_Logic.Controller;

public class Main {
	
	public static void main(String[] args) {
		JFrame mainFrame = new JFrame();
		mainFrame.setSize(800, 600);
		
		
		
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
	
		
		
		mainFrame.add(controller.startGamePanel());
		birdP.setVisible(false);
		System.out.println(controller.flag);
	
		mainFrame.addKeyListener(new KeyListener(){ 

		    public void keyPressed(KeyEvent ke){ 

		         if(ke.getKeyCode()==KeyEvent.VK_SPACE){
		              System.out.println("yes");
		         }
		    }
		
			public void keyReleased(KeyEvent arg0) {}
			public void keyTyped(KeyEvent arg0) {}
		});


		
	}
	
}
