package tp4;

public class CompteCourant extends Compte{

	private double decouvertAutorise;
	
	public CompteCourant(String num , String titu , double sol , double decAut) {
		super(num, titu, sol);
		this.decouvertAutorise = decAut;
	}
	public void retirer(double mon) {
		if(solde + decouvertAutorise >= mon) {
			solde -= mon ;
		}
		else {
			System.out.println("   depasse au decouvert.");
		}
	}
	public void afficher() {
		super.afficher();
		System.out.println("   Decouvert Autoriser : "+decouvertAutorise);
	}
}
