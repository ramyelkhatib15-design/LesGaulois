package objet;

public enum equipement{
	CASQUE("casque"),
	BOUCLIER("bouclier");
	
	private String nom ;
	
	private equipement(String nom) {
		this.nom = nom;
	}
	public String getnom(){
		return nom;
	}

}
