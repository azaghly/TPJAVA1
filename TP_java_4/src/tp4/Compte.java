package tp4;

public class Compte {

	protected String numero;
	protected String titulaire;
	protected double solde;
	
	public Compte(String num, String titu, double sol) {
		
		this.numero = num;
		this.titulaire = titu;
		this.solde = sol;
		
	}
	
	public void deposer(double mon) {
		this.solde += mon;
	}
	
	public void retirer(double mon) {
		if(solde >= mon) {
			solde -= mon;
		}
		else {
			System.out.println("   Solde est insuffisant.");
		}
	}
	
	public void afficher() {
		System.out.println("   Nomero : "+numero);
		System.out.println("   Titulaire : "+titulaire);
		System.out.println("   Solde : "+solde);
	}

}
