package ro.ase.csie.cts.g1093.dp.state;

public class CriticalWoundedState implements MoveStateInterface {

	@Override
	public void moveAtDifferentLocation() {
		System.out.println("It can't move, critically wounded!");
		
	}

}
