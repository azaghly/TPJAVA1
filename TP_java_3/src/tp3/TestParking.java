package tp3;

public class TestParking {
	
	public static void main (String[] args) {
		
		Vehicule[] v = new Vehicule[4] ;
	    v[0] = new Voiture("6541-A86", "Hyundai",4);
		v[1] = new Voiture("45800-A38", "Audi",2);
		v[2] = new Moto("B1-5501","sania",true);
		v[3] = new Camion("89670-A26","Mercedes",50);
		
		System.out.println("--> La liste de tout les vehicules :");
		int c = 1;
		for (Vehicule vehicule : v) {
			System.out.println("- Le vehicule nombre:"+c);
			vehicule.afficher();
			vehicule.stationner();
			c = c + 1;
		}
		c = 1;
		System.out.println("- Les vehicule de type voiture: ");
		for(Vehicule vehicule :v) {
			if(vehicule instanceof Voiture) {
				System.out.println("- La voiture nombre:"+c);
				vehicule.afficher();
	            c = c+1;
			}
		}
		Vehicule x = new Moto("11C22", "Yamaha", true);

		if (x instanceof Voiture) {
		    Voiture v1 = (Voiture) x;
		    System.out.println("- Downcasting reussi !");
		} else {
		    System.out.println("- x n'est pas une Voiture");
		}
	}
}
