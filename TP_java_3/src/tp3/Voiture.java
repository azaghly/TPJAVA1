package tp3;

public class Voiture extends Vehicule {

	private int nbPortes;
	
	public Voiture(String matricule, String marque , int nbpt) {
		super(matricule, marque);
		this.nbPortes = nbpt ;
	}
	public void stationner() {
		System.out.println("   La voiture se gare dans une place standard");
	}
	public void afficher() {
		super.afficher();
		System.out.println("  - nombre de portes : "+nbPortes);
	}
}
