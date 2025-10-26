package personnages;

import objet.equipement;

public class Romain {
	private String nom;
	private int force;
	private equipement[] equipements = new equipement[2];
	private int  nbEquipement = 0;
	
	public Romain(String nom, int force) {
		this.nom = nom;
		this.force = force;
		assert isInvariantVerified();
	}
	public String getNom() {
		return nom;
	}	
	public void parler(String texte) {	
		System.out.println(prendreParole() + "\"" + texte + "\"");
	}
	private String prendreParole() {			
		return "Le romain " + nom + " : ";
	} 
	public void recevoircoup(int force) {
		assert force>0;
		int forcepre = this.force;
		this.force = this.force - force ;
		if (this.force <1) {
			parler("j abandonne");
			
		}
		else {
			parler("aiee");
		}
		assert isInvariantVerified();
		assert this.force<=forcepre;
		
		
	}
	private Boolean isInvariantVerified() {
		if (force <0) {
			return false;
		}
		return true;				
	  }
	private void repetition(equipement equip) {
		System.out.println("le soldat "+ getNom() +"s equipe avec un "+equip.getnom());
	}
	public void sEquiper(equipement equipmen) {
		switch (nbEquipement) {
		case 0: {
			equipements[nbEquipement] = equipmen;
			nbEquipement++;
			repetition(equipmen);
			break;
		}
		case 1:{
			if (equipements[0] == equipmen) {
				System.out.println("le soldat "+ getNom()+" possede deja un "+ equipmen.getnom());	
			
			}
			else {
				equipements[nbEquipement] = equipmen;
				repetition(equipmen);
				nbEquipement ++;
				
			}
			break;
		}
		case 2 :{
			System.out.println("le soldat "+ getNom()+" est deja bien protege!");
			break;
		}
	}
		
	}
	public static void main(String[] args) {
		Romain Minus = new Romain("Minus", 6);
		Minus.sEquiper(equipement.CASQUE);
		Minus.sEquiper(equipement.CASQUE);
		Minus.sEquiper(equipement.BOUCLIER);
		Minus.sEquiper(equipement.CASQUE);
		
		
	}
	
	
	}





