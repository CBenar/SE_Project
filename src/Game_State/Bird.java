package Game_State;

import java.awt.Image;
import java.awt.image.BufferedImage;
import java.io.IOException;
import java.io.InputStream;

import javax.imageio.ImageIO;

public class Bird extends PhysicalObject {
	String name;
	int speedY;
	int life;
	BufferedImage birdImage;
	public Bird() {
		// TODO Auto-generated constructor stub
	}
	
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getSpeedY() {
		return speedY;
	}
	public void setSpeedY(int speedY) {
		this.speedY = speedY;
	}
	public int getLife() {
		return life;
	}
	public void setLife(int life) {
		this.life = life;
	}
	
	public BufferedImage getImage(String name){
		InputStream input = this.getClass().getClassLoader().getResourceAsStream(name);
		if (input == null) System.out.println("input null");
		try {
			birdImage = ImageIO.read(input);
		    return birdImage;
		} catch (IOException e) {
		    e.printStackTrace();
		    return null;
		}
	}

}
