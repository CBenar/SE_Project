package Game_Logic;


import java.awt.Dimension;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;

import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JLabel;

import Game_GUI.BirdPanel;
import Game_GUI.GamePanel;
import Game_State.Bird;
import Game_State.Pipe;

public class Controller  {

	public  boolean flag ;
	public static Bird selectedBird;
	public 	static	GamePanel gamePanel ;
	JLabel pipe1 ;
	JLabel pipe2;
	JLabel pipe3 ;
	JLabel pipe4;
	//	public Pipe pipeDown;
	//	public Pipe pipeUp;
	public BirdPanel birdPanel;
	public Controller() {
		// TODO Auto-generated constructor stub
	}


	public GamePanel startGamePanel() {

		gamePanel = new GamePanel(selectedBird);
		gamePanel.createStartButton();
		final JButton startButton = gamePanel.createStartButton();
		startButton.setPreferredSize(new Dimension(1,1));
		gamePanel.add(startButton);
		addKeyStartListener(startButton);
		final Pipe pipeDown = new Pipe("pipe_north.png");
		final Pipe pipeUp = new Pipe("pipe_south.png");



		Thread t = new Thread(new Runnable() {
			public void run() {

				pipe1 = createPipe(pipeDown, 60, 400);
				pipe2 = createPipe(pipeUp, 60, -150);
				pipe3 = createPipe(pipeDown, 400, 450);
				pipe4 = createPipe(pipeUp,  350, -120);
				gamePanel.backgroundLabel.add(pipe1);
				gamePanel.backgroundLabel.add(pipe2);
				gamePanel.backgroundLabel.add(pipe3);
				gamePanel.backgroundLabel.add(pipe4);

				try{
					while(true){
						if (gamePanel.isStarted){
							pipe1.setLocation((pipe1.getLocationOnScreen().x-10), 400);
							pipe2.setLocation((pipe2.getLocationOnScreen().x-10), -150);
							pipe3.setLocation((pipe3.getLocationOnScreen().x-10), 450);
							pipe4.setLocation((pipe4.getLocationOnScreen().x-10), -120);
							if(pipe1.getLocationOnScreen().x < -200 || pipe2.getLocationOnScreen().x < -200 ||
									pipe4.getLocationOnScreen().x < -200 ||pipe4.getLocationOnScreen().x < -200 ){
								pipe1.setLocation(560,400);
								pipe2.setLocation(560,-150);
								pipe3.setLocation(900,450);
								pipe4.setLocation(1050,-120);
							}
							Thread.sleep(100);  
						}
						else {
							pipe1.setLocation(100, 400);
							pipe2.setLocation(100, -150);
							pipe3.setLocation(300, 450);
							pipe4.setLocation(300, -120);
							Thread.sleep(100); 
						}
					}
				}catch(Exception ae){
					
				}
			}
		});
		t.start();



		return gamePanel;


	}


	private JLabel createPipe(Pipe pipe, int x , int y) {
		JLabel pipeLabel = new JLabel(new ImageIcon(pipe.getImage(pipe.getName())));

		pipeLabel.setBounds(x,y, 400,400);
		System.out.println("created" + pipe.getName());

		return pipeLabel;
	}


	public void gameOver() {
		//	if(isCrashed()) createReturnButton();

	}


	private JButton createReturnButton() {
		JButton button = new JButton();		
		return button;
	}


	public BirdPanel startBirdPanel() {

		birdPanel = new BirdPanel();
		Bird yellowBird = new Bird("yellow bird.png");
		Bird redBird = new Bird("red bird.png");
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
	private void addKeyStartListener(final JButton startButton){
		startButton.addKeyListener(new KeyListener() {
			public void keyPressed(KeyEvent e) {
				// TODO Auto-generated method stub
				int keyCode = e.getKeyCode();
				if (keyCode == KeyEvent.VK_ENTER) {
					System.out.println("Start button pressed");
					gamePanel.isStarted = true;
					
				}
				if (keyCode == KeyEvent.VK_SPACE) {
					System.out.println("Space button pressed");
				
					gamePanel.birdLabel.setBounds(gamePanel.birdLabel.getLocationOnScreen().x,gamePanel.birdLabel.getLocationOnScreen().y-50,50,50);
				}
			}
			public void keyReleased(KeyEvent arg0) {}
			public void keyTyped(KeyEvent arg0) {}
		});
	}
	public Boolean isCrashed(Pipe pipe) {
		if(pipe.getLocation() == selectedBird.getLocation())	return true;
		else return false;
	}
	




}
