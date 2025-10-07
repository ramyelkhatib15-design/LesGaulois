package personnages;

import objet.Chaudron;

public class Druide {
	private String nom ;
	private Integer  force ;
	Chaudron chaudron = new Chaudron();
	
	public  Druide(String nom,Integer force) {
		this.nom = nom;
		this.force = force;
	}
	public void parler(String texte) {
		System.out.println(prendreparole() + texte );
		
	}
	private String prendreparole() {
		return "la druide" + nom + ":";
	}
	public void fabriquerportion(Integer quantite , Integer forcepotion){
		chaudron.remplirchaudron(quantite, forcepotion);
		parler("jai concocte"+ quantite +"doses magiques .Elle a une force de "+ forcepotion);
		
		
	}
	public void booster(Gaulois gaulois) {
		if ( chaudron.resterpotion() == false) {
			if (gaulois.getNom() == "Obelix") {
				parler("Non"+ gaulois.getNom() + "Non!... Et tu le sais tres bien!");		
			}
			else {
				gaulois.boirepotion(chaudron.prendreLouche());
				parler("Tiens" + gaulois.getNom() + "un peu de potion magique");	
			}
		}
		else {
			parler("desole "+ gaulois.getNom() + "il n y a plus une seule goutte de potion");
			
		}
		
	}
	public String getnom() {
		return nom;
	}
		
	
	

}
