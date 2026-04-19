package tp5;

public class AbonnementVideo extends Abonnement implements Reducible{
	private boolean optionHD;
	private boolean option4K;
	
	public AbonnementVideo(String nom, double prix, int nbProfils, boolean opHD, boolean op4K) {
		super(nom, prix, nbProfils);
		this.optionHD = opHD;
		this.option4K = op4K;
	}
	public double calculerCoutMensuel() {
		double CoutTl= getPrix();
		if (optionHD) {
			CoutTl += 10;
		}
		if (option4K) {
			CoutTl += 20;
		}
		return CoutTl;
	}
	public int calculerScoreSatisfaction() {
		int score = 60;
		if(optionHD) 
			score += 10;

		if (option4K)
			score += 20;
	
		if (getNbProf() >= 4) 
			score +=10;
		
		return Math.min(score, 100);
	}
	
	public boolean estEligibleReduction(double pourcentage) {
		return pourcentage <= 30;
	}
	
	public double appliquerReduction(double pourcentage) {
		if (estEligibleReduction(pourcentage)) 
			return calculerCoutMensuel()*(1 - pourcentage/100 );
		
		return calculerCoutMensuel();
	}

}
