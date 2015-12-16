package Game_State;

import java.awt.image.BufferedImage;
import java.io.IOException;
import java.io.InputStream;

import javax.imageio.ImageIO;

public class Pipe extends PhysicalObject {
	int speedX;
	double x ;
	double y ;
	String name;
	BufferedImage pipeImage;

	public Pipe(String name) {
		this.name = name;	
		}
	public int getSpeedX() {
		return speedX;
	}
	public void setSpeedX(int speedX) {
		this.speedX = speedX;
	}
	public String getName() {
		return name;
	}
	public double getLocation(){
		return x;
	}
	public void setLocation(double x){
		this.x = x;
	}
	public BufferedImage getImage(String name){
		InputStream input = this.getClass().getClassLoader().getResourceAsStream(name);
		if (input == null) System.out.println("input null");
		try {
			pipeImage = ImageIO.read(input);
			return pipeImage;
		} catch (IOException e) {
			e.printStackTrace();
			return null;
		}
	}
}
