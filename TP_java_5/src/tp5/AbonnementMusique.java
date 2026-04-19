package tp5;

public class AbonnementMusique extends Abonnement implements Reducible {
	
	private int nbPlaylists;
	private boolean optionOffline;
	
	public AbonnementMusique(String nom , double prix , int nbProf , int nbPl , boolean opOf) {
		
		super(nom , prix , nbProf);
		this.nbPlaylists = nbPl;
		this.optionOffline = opOf;
	}
	
	public double calculerCoutMensuel() {
		
		double CoutT = getPrix();
		if (optionOffline)
			CoutT += 15;
		
		return CoutT;
	}
	public int calculerScoreSatisfaction() {
		int score = 50;
		
		if (nbPlaylists > 20 ) 
			score += 20;
		if (optionOffline)
			score += 20;
		if (getNbProf() > 1)
			score += 10;
		
		return Math.min(score, 100);
	}
	public boolean estEligibleReduction(double pourcentage) {
		return pourcentage <= 30;
	}
	
	public double appliquerReduction(double pourcentage) {
		if (estEligibleReduction(pourcentage)) {
			return calculerCoutMensuel()*(1 - pourcentage/100 );
		}
		return calculerCoutMensuel();
	}

}
