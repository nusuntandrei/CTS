package ro.ase.csie.cts.g1093.dp.state;

public class TestState {

	public static void main(String[] args) {
		
		SuperHero superMan = new SuperHero("SuperMan", 500);
		superMan.move();
		superMan.takeAHit(350);
		superMan.move();
		superMan.takeAHit(110);
		superMan.move();
		
		superMan.heal(500);
		superMan.move();

	}

}
