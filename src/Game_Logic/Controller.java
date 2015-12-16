package Game_Logic;

import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;

import javax.swing.JPanel;

import Game_GUI.BirdPanel;
import Game_GUI.GamePanel;
import Game_State.Bird;

public class Controller implements KeyListener {

	public Controller() {
		// TODO Auto-generated constructor stub
	}

	public void selectBird() {


	}

	public void startGame() {
		this.startGamePanel();
	}

	private void startGamePanel() {
		//	GamePanel gamePanel = new GamePanel(3, 1);


	}

	public void gameOver() {

	}

	private void startMenuPanel() {


	}
	public BirdPanel startBirdPanel() {
		
		BirdPanel birdPanel = new BirdPanel();
		Bird yellowBird = new Bird();
		Bird redBird = new Bird();
		birdPanel.add(birdPanel.createBirdButton(yellowBird, "bird.png"));
		birdPanel.add(birdPanel.createBirdButton(redBird, "bird2.png"));
		return birdPanel;


	}
	public Boolean checkCollision() {

		return false;
	}


	public void keyPressed(KeyEvent arg0) {
		// TODO Auto-generated method stub

	}


	public void keyReleased(KeyEvent e) {
		// TODO Auto-generated method stub

	}


	public void keyTyped(KeyEvent e) {
		// TODO Auto-generated method stub

	}
}
