package ro.ase.csie.cts.g1093.dp.memento;

public class TestMemento {

	public static void main(String[] args) {
		
		SuperHero superman = new SuperHero("SuperMan", 100, "Fly");
		
		HeroMemento initialSave = superman.createRestorePoint();
		
		superman.takesAHit(50);
		superman.takesAHit(20);
		
		System.out.println("Lifepoints: " + superman.lifePoints);
		
		superman.restore(initialSave);
		
		System.out.println("Lifepoints: " + superman.lifePoints);
	}

}
