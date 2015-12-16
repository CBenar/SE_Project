package Game_Logic;

import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;

import javax.swing.JButton;
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
		final JButton leftButton = birdPanel.createBirdButton(yellowBird, "bird.png");
		final JButton rightButton = birdPanel.createBirdButton(redBird, "bird2.png");
		addKeyLeftListener(leftButton, rightButton);
		addKeyRightListener(leftButton, rightButton);
		birdPanel.add(leftButton);
		birdPanel.add(rightButton);
		return birdPanel;


	}
	private void addKeyRightListener(final JButton rightButton,
			final JButton leftButton) {
		leftButton.addKeyListener(new KeyListener(){
			public void keyPressed(KeyEvent e) {
				// TODO Auto-generated method stub
				int keyCode = e.getKeyCode();
				if (keyCode == KeyEvent.VK_ENTER) {
					System.out.println("Enter pressed");
					//closeBirdPanel();
					//startGamePanel();
					//updateModel("yellow_bird");
				}
				if (keyCode == KeyEvent.VK_LEFT) {
					System.out.println("Right pressed");
					rightButton.requestFocusInWindow();
				}
			}
			public void keyReleased(KeyEvent arg0) {}
			public void keyTyped(KeyEvent arg0) {}
		});
	}
	
	private void addKeyLeftListener(final JButton leftButton,
			final JButton rightButton) {
		leftButton.addKeyListener(new KeyListener(){
			public void keyPressed(KeyEvent e) {
				// TODO Auto-generated method stub
				int keyCode = e.getKeyCode();
				if (keyCode == KeyEvent.VK_ENTER) {
					System.out.println("Enter pressed");
					//closeBirdPanel();
					//startGamePanel();
					//updateModel("yellow_bird");
				}
				if (keyCode == KeyEvent.VK_RIGHT) {
					System.out.println("Right pressed");
					rightButton.requestFocusInWindow();
				}
			}
			public void keyReleased(KeyEvent arg0) {}
			public void keyTyped(KeyEvent arg0) {}
		});
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
