package tp3;

public class Moto extends Vehicule{
	
	private boolean Casque;
	public Moto(String matricule, String marque, boolean casque) {
		super(matricule , marque);
		this.Casque = casque;
	}
	public void stationner() {
		System.out.println("   La moto se gare dans une place reservee aux deux-roues.");
	}
	public void afficher() {
		super.afficher();
		System.out.println("  - Casque fourni : " + (Casque ? "Oui":"Non"));
	}
}
