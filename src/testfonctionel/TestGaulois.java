package testfonctionel;

import personnages.Druide;
import personnages.Gaulois;
import personnages.Romain;

public class TestGaulois {
	public static void main(String[] args) {
		Gaulois asterix = new Gaulois("Asterix",8);
		Romain minus = new Romain("Minus",6 );
		Gaulois obelix = new Gaulois("Obelix",16);
		Romain brutus = new Romain("brutus", 14);
		Druide panoramix = new Druide("panoramix", 2);
		panoramix.fabriquerportion(4, 3);
		panoramix.booster(obelix);
		panoramix.booster(asterix);
		for (int i = 0 ; i<3;i++) {
			asterix.frapper(brutus);	
		}
		
	}

}
