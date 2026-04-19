package tp5;

public abstract class Abonnement {
	private String nom;
	private double prix;
	private int nbProfils;
	
	public Abonnement(String nom, double prix, int nbProf) {
		this.nom = nom;
		
		if (prix <= 0) {
			this.prix = 1;
		}
		else
		    this.prix = prix;
		
		if (nbProf <= 0) {
			this.nbProfils = 1;
		}
		else
			this.nbProfils = nbProf;
	}
	
	public String getNom() {
		return nom;
	}
	public void setNom(String nom) {
		this.nom = nom;
	}
	
	public double getPrix() {
		return prix;
	}
	public void setPrix(double prix) {
		this.prix = prix;
	}
	
	public double getNbProf() {
		return nbProfils;
	}
	public void setNbProf(int nbProf) {
		this.nbProfils = nbProf;
	}
	
	public boolean estPartageFamilial() {
		if (nbProfils >=3) {
			return true;
		}
		else
			return false;
	}
	
	public void afficherInfos() {
		System.out.println("   - le nom est : "+nom);
		System.out.println("   -le prix base est : "+prix);
		System.out.println("   -le nombre de profils est : "+nbProfils);
		System.out.println("   -le Partage Familial : "+estPartageFamilial());
	}
	public abstract double calculerCoutMensuel();
	public abstract int calculerScoreSatisfaction();
	
}
