package personnages;

public class Gaulois {
	
	private String nom;
	private int force;
	private  Integer effetPotion = 1;
	private  Boolean village ;
	private Boolean chef ;
	private Village villagee;
	public Gaulois(String nom, int force ) {
		this.nom = nom;
		this.force = force;
		this.village = false;
		this.chef = false;
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
	public void setvillage(Village village) {
		this.villagee = village;
		this.village = true;
		if (villagee.getchef() == nom) {
			this.chef = true;
		}
		else {
			this.chef = false;
		}
		}
	public void sepresenter() {
		if (chef == true) {
			System.out.println("bonjour je m apelle "+ getNom()+" je suis le chef de   "+ villagee.getnom());
		}
		else if (village == true) {
			System.out.println("bonjour je m apelle "+getNom()+" j habite le "+villagee.getnom());
			
		}
		else {
			System.out.println("bonjour je m apelle "+ getNom()+ " je voyage de villages en villages");
		}
		}
}
		
		
		
	


