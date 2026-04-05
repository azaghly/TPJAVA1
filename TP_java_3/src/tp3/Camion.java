package tp3;

public class Camion extends Vehicule {
	
	private double chargeMax;
	public Camion(String matricule, String marque, double charg_max) {
		super(matricule, marque);
		this.chargeMax = charg_max;
	}
	public void stationner() {
		System.out.println("   Le camion se gare dans une zone pour vehicules lourds.");
	}
	public void afficher() {
		super.afficher();
		System.out.println("  - Charge maximale : "+ chargeMax + " T");
	}
}
