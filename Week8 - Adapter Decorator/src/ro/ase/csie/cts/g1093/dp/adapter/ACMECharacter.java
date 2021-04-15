package ro.ase.csie.cts.g1093.dp.adapter;

public abstract class ACMECharacter {
	protected String name;
	protected int lifePoints;
	public ACMECharacter(String name, int lifePoints) {
		super();
		this.name = name;
		this.lifePoints = lifePoints;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getLifePoints() {
		return lifePoints;
	}
	public void setLifePoints(int lifePoints) {
		this.lifePoints = lifePoints;
	}
	
	public abstract void move();
	public abstract void takeAhit(int points);
	public abstract void heal(int points);
}
