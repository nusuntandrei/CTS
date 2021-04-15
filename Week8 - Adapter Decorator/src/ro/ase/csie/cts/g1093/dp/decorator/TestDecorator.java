package ro.ase.csie.cts.g1093.dp.decorator;

import ro.ase.csie.cts.g1093.dp.adapter.ACMECharacter;
import ro.ase.csie.cts.g1093.dp.adapter.FantasyCharacter;

public class TestDecorator {

	public static void main(String[] args) {
		
		ACMECharacter dragon = new FantasyCharacter ("Blue dragon", 1000);
		dragon.move();
		dragon.takeAhit(700);
		dragon.heal(100);
		
		
		//don't
		//ACMECharacter dragonWithArmor = new ArmorDecorator(dragon1, 200);
		//dragonWithArmor.takeAhit(300);
		
		dragon = new ArmorDecorator(dragon, 200);
		dragon.takeAhit(300);
		
		dragon = new WoundedDecorator(dragon);
		dragon.takeAhit(300);
		dragon.move();
		
		ACMECharacter dragon2 = new FantasyCharacter ("Yellow dragon", 1000);
		dragon2.move();
		dragon2.takeAhit(200);
		dragon2.heal(100);
	}

}
