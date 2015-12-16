package Game_Logic;

import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;

import javax.swing.JButton;
import javax.swing.JPanel;

import Game_GUI.BirdPanel;
import Game_GUI.GamePanel;
import Game_State.Bird;

public class Controller  {
	
public  boolean flag ;
public static Bird selectedBird;

	public Controller() {
		// TODO Auto-generated constructor stub
	}

	public void selectBird() {


	}

	/*public void startGame() {
		this.startGamePanel();
	}*/

	public GamePanel startGamePanel() {
		GamePanel gamePanel = new GamePanel(selectedBird);
		System.out.println("game panel");
		return gamePanel;

	}

	
	public void gameOver() {

	}

	private void startMenuPanel() {


	}
	public BirdPanel startBirdPanel() {

		BirdPanel birdPanel = new BirdPanel();
		Bird yellowBird = new Bird("bird.png");
		Bird redBird = new Bird("bird2.png");
		final JButton leftButton = birdPanel.createBirdButton(yellowBird, yellowBird.getName() );
		final JButton rightButton = birdPanel.createBirdButton(redBird, redBird.getName());
		addKeyLeftListener(leftButton, rightButton, yellowBird);
		addKeyRightListener(leftButton, rightButton, redBird);
		birdPanel.add(leftButton);
		birdPanel.add(rightButton);
		return birdPanel;

	}

	private void addKeyRightListener(final JButton rightButton,
			final JButton leftButton, final Bird bird) {
		leftButton.addKeyListener(new KeyListener(){
			public void keyPressed(KeyEvent e) {
				// TODO Auto-generated method stub
				int keyCode = e.getKeyCode();
				if (keyCode == KeyEvent.VK_ENTER) {
					System.out.println("Enter pressed");
					selectedBird = bird;
					flag = true;
					
				}
				if (keyCode == KeyEvent.VK_LEFT) {
					System.out.println("Left pressed");
					rightButton.requestFocusInWindow();
				}
			}
			public void keyReleased(KeyEvent arg0) {}
			public void keyTyped(KeyEvent arg0) {}
		});
	}

	private void addKeyLeftListener(final JButton leftButton,
			final JButton rightButton,final Bird bird) {
		leftButton.addKeyListener(new KeyListener(){
			public void keyPressed(KeyEvent e) {
				// TODO Auto-generated method stub
				int keyCode = e.getKeyCode();
				if (keyCode == KeyEvent.VK_ENTER) {
					System.out.println("Enter pressed");
					selectedBird = bird;
					flag = true;
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



}
