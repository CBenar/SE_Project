package Game_GUI;

import java.awt.image.BufferedImage;

import javax.swing.Icon;
import javax.swing.JLabel;

public class Shape {
	int x;
	int y;
	Icon icon; 
	JLabel shape;
	
	public Shape(int x, int y, Icon icon) {
		// TODO Auto-generated constructor stub
		
	}
	public int getX() {
		return x;
	}
	public void setX(int x) {
		this.x = x;
	}
	public int getY() {
		return y;
	}
	public void setY(int y) {
		this.y = y;
	}
	public Icon getIcon() {
		return this.icon;
	}
	public void setImg(Icon icon) {
		this.icon = icon;
	}

}
