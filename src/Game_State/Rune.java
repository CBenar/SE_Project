package Game_State;

public class Rune extends PhysicalObject {
	int speedUp;
	int healthUp;
	
	public Rune(String runeType) {
		// TODO Auto-generated constructor stub
		this.initiateRune(runeType);
	}
	
	public void initiateRune(String runeType) {
		if (runeType == "Health Rune") {
			this.speedUp = 10;
			this.healthUp = 0; // or -1
		}
		else if (runeType == "Speed Rune") {
			this.healthUp = 1;
			this.speedUp = 0; // or -1
		}
		else {
			System.out.println("Error! There is no such a rune type like " + runeType);
		}
	}

}
