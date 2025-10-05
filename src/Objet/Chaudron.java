package Objet;

public class Chaudron {
	private Integer quantitepotion ;
	private Integer forcepotion ; 
	
	public Chaudron() {
	}
	
	public void remplirchaudron(Integer quantite , Integer forcepotion) {
		quantitepotion = quantite;
		this.forcepotion = forcepotion;
	}
	public boolean resterpotion() {
		if (quantitepotion ==0) {
			return true;
			
		}
		else {
			return false;
		}
	}
	public Integer prendreLouche() {
		if (quantitepotion == 0) {
			return forcepotion = 0 ;
		}
		else {
			quantitepotion --;
			return forcepotion;
		}
		
	}
	

}
