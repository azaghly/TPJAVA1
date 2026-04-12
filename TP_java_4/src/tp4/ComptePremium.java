package tp4;

public class ComptePremium extends Compte{
	
	private double plafondRetrait;
	
	public ComptePremium(String num , String titulaire , double sol , double plafRet) {
		super(num , titulaire , sol);
		this.plafondRetrait = plafRet;
	}
	public void retirer (double mon ) {
		if (mon > plafondRetrait) {
			System.out.println("   Le montant depasse le plafond de retrait autorise ("+plafondRetrait+").");
		}
		else if(solde >= mon) {
			solde -= mon;
		}
		else
			System.out.println("   Sole insuffisant.");
	}
}
