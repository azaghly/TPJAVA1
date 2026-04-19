package tp5;

public class AbonnementJeux extends Abonnement implements Reducible {
	
	private int nbJeuxInclus;
	private int heuresJeuParMois;

	public AbonnementJeux (String nom, double prix, int nbProf, int nbJeIn, int heurJePM) {
		
		super(nom, prix, nbProf);
		this.nbJeuxInclus = nbJeIn;
		this.heuresJeuParMois = heurJePM;
		
	}
    public double calculerCoutMensuel() {
		
    	double CoutTotal = getPrix();
        if (nbJeuxInclus > 50) 
        	CoutTotal += 25;
        if (heuresJeuParMois > 40) 
        	CoutTotal += 15;
        return CoutTotal;
	}
    public int calculerScoreSatisfaction() {
        int score = 40;
        if (nbJeuxInclus >= 30) 
        	score += 20;
        if (heuresJeuParMois >= 20) 
        	score += 20;
        if (getNbProf() >= 2) 
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
