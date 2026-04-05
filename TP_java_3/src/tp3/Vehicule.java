package tp3;

public class Vehicule {

	protected String matricule;
	protected String marque;
	
	Vehicule(String matricule, String maque){
		this.matricule = matricule ;
		this.marque = maque;
	}
	public void stationner() {
		System.out.println("Le voiture se gare dans le parking");	
	}
    public void afficher() {
    	System.out.println("  - Matricule : "+matricule);
    	System.out.println("  - Marque : "+marque);
    }
    
}
