public class Player {
	String name;

	String name() {
		return name;
	}
	
	void turn(Dice d) {
		d.roll();
	}
}
