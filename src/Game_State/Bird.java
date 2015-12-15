package Game_State;

public class Bird extends PhysicalObject {
	String name;
	int speedY;
	int life;
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

}
