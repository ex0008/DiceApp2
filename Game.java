public class Game {
	Player p1;
	Player p2;
	Dice d1;
	Dice d2;
	
	Game() {
		p1 = new Player();
		p2 = new Player();
		d1 = new Dice();
		d2 = new Dice();

		p1.name = "Player1";
		p2.name = "Player2";
	}

	void start() {
		p1.turn(d1);
		p2.turn(d2);
		System.out.println(p1.name()+":"+d1.me);
		System.out.println(p2.name()+":"+d2.me);
	}

	void judge() {
		if (d1.me == d2.me){
			System.out.println("draw!");
		}
		else if (d1.me > d2.me){
			System.out.println(p1.name()+" win!");
		}
		else{
			System.out.println(p2.name()+" win!");
		}
	}
}
