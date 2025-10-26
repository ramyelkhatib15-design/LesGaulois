package personnages;

import java.security.KeyStore.TrustedCertificateEntry;

public class Gaulois {
	
	private String nom;
	private int force;
	private  Integer effetPotion = 1;
	private  Boolean village ;
	private Boolean chef ;
	private String villagee;
	public Gaulois(String nom, int force, Boolean village ,Boolean chef ) {
		this.nom = nom;
		this.force = force;
		this.village = village;
		this.chef = chef;
	}
	public String getNom() {
		return nom;
	}
	public void parler(String texte) {
		System.out.println(prendreParole() + "\"" + texte + "\"");
	}
	private String prendreParole() {
		return "Le gaulois " + nom + " : ";
	}
	public void frapper(Romain romain) {
		System.out.println(nom +"envoie un gros coup a la machoire de "+ romain.getNom());
		romain.recevoircoup((force*effetPotion) /3);
		if (effetPotion>1) {
			effetPotion --;
		}
	}
	public void boirepotion(Integer forcepotion) {
		effetPotion = forcepotion;
		
	}
	public void setvillage(String village) {
		this.villagee = village;
	}
	public void sepresenter() {
		if (chef == true) {
			System.out.println("bonjour je m apelle"+ getNom()+"je suis le chef les villages"+ villagee);
			
			
		}
		else if (village == true) {
			System.out.println("bonjour je m apelle"+getNom()+"j habite le village "+villagee);
			
		}
		else {
			System.out.println("bonjour je m apelle"+ getNom()+ "je voyage de villages en villages");
		}
		}
}
		
		
		
	


