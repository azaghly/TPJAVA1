package tp4;

public class CompteEpargne extends Compte{
	
	private double tauxInteret;
	public CompteEpargne(String num, String titu, double sol , double tauInt) {
		super(num, titu, sol);
		this.tauxInteret = tauInt;
		}
	
	public void calculerInteret() {
		double interets = solde *(tauxInteret/100);
		solde += interets;
		System.out.println("   Interets ajouter au solde :"+interets);
	}
	public void retirer(double mon) {
		if(solde >= mon)
			solde -= mon;
		else
			System.out.println("   reterait interdit : solde insuffisant.");
	}

	

}
