package personnages;

import java.util.Iterator;

public class Village {
	private String nom;
	private int nbvillageois = 0;
	private Gaulois chef ;
	private Gaulois[] villagoies;

	public Village(String nom , int nbmaxvillageois,Gaulois chef) {
		this.nom = nom;
		villagoies = new Gaulois[nbmaxvillageois];
		this.chef = chef;

	}
	

	public String getnom() {
		return nom;
	}

	public String getchef() {
		return chef.getNom();
	}

	public void ajoutervillageois(Gaulois gaulois) {
		villagoies[nbvillageois] = gaulois;
		nbvillageois++;

	}

	public String trouvervillageois(Integer numvillageois) {
		if ( numvillageois > nbvillageois) {
			System.out.println("il n ya pas autant d habitant dans notre village !");
			return null;
		}
		else {
			String vil1 = villagoies[numvillageois-1].getNom();
			return vil1;
		}
		

	}
	public void affichervillageois() {
		System.out.println("Dans le village" + nom + "du chef " + chef.getNom() +""
				+ " vivent les légendaires gaulois :");
		for (Gaulois gaulois : villagoies) {
			System.out.println("-" + gaulois.getNom());
			
		}
			
		}
		
	public static void main(String[] args) {
		Gaulois Abraracourcix  = new Gaulois("Abraracourcix ", 6,true,true);
		Village village = new Village("Village des Irréductibles", 30, Abraracourcix);
		Abraracourcix.setvillage("Village des Irréductibles");
		Gaulois Asterix = new Gaulois("Asterix",8,true,false);
		Gaulois obelix = new Gaulois("obelix", 25, true, false);
		village.ajoutervillageois(Asterix);
		Asterix.setvillage("Village des Irréductibles");
		village.ajoutervillageois(obelix);
		obelix.setvillage("Village des Irréductibles");
		Gaulois doublepolemix = new Gaulois("doublepolemix",4 ,false, false);
		Abraracourcix.sepresenter();
		Asterix.sepresenter();
		doublepolemix.sepresenter();
		
		
		
	}

}
