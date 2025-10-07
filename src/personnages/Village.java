package personnages;

public class Village {
	private String nom ; 
	private Integer nbvillageois =0 ; 
	private Gaulois gaulois  = new Gaulois("chef", 2) ; 
	private  Gaulois villagoies[] ; 
	
	
	public Village (String nom, int nbvillageois, Integer nbmaxvillageois) {
		this.nom = nom;
		this.nbvillageois = nbvillageois;
		nbvillageois = new  Gaulois[nbmaxvillageois];
	
		
	}
	public String getnom() {
		return nom;
	}
	public Gaulois getchef() {
		return gaulois;	
	}
	public void ajoutervillageois(Gaulois gaulois) {
		
	}
	public void trouvervillageois(Integer numvillageois) {
		
	}
	
	
	
	
	

}
