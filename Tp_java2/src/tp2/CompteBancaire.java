package tp2;

public class CompteBancaire {

    private int numero;
    private String titulaire;
    private double solde;
    private double decouvertAutorise;

    private static int nbComptes = 0;
    private static double tauxInteretAnnuel = 0.03;

    private static int compteurNumero = 1;

    public CompteBancaire() {
        this.numero = compteurNumero++;
        this.titulaire = "Inconnu";
        this.solde = 0;
        this.decouvertAutorise = 0;
        nbComptes++;
    }

    public CompteBancaire(String titulaire, double solde, double decouvertAutorise) {
        this.numero = compteurNumero++;
        this.titulaire = titulaire;
        this.solde = solde;
        this.decouvertAutorise = decouvertAutorise;
        nbComptes++;
    }

    public String getTitulaire() {
        return titulaire;
    }

    public void setTitulaire(String titulaire) {
        if(titulaire != null && !titulaire.isEmpty())
            this.titulaire = titulaire;
    }

    public double getDecouvertAutorise() {
        return decouvertAutorise;
    }

    public void setDecouvertAutorise(double decouvertAutorise) {
        if(decouvertAutorise >= 0)
            this.decouvertAutorise = decouvertAutorise;
    }

    // Affichage
    public void afficher() {
        System.out.println("Numero : " + numero);
        System.out.println("Titulaire : " + titulaire);
        System.out.println("Solde : " + solde);
        System.out.println("Découvert autorisé : " + decouvertAutorise);
        System.out.println("---------------------------");
    }

    public void deposer(double montant) {
        if(montant > 0)
            solde += montant;
        else
            System.out.println("Montant de dépôt invalide.");
    }

    public void retirer(double montant) {
        if(montant > 0 && solde - montant >= -decouvertAutorise)
            solde -= montant;
        else
            System.out.println("Retrait refusé.");
    }

    // Virement
    public void virementVers(CompteBancaire autre, double montant) {

        if(montant > 0 && solde - montant >= -decouvertAutorise) {
            this.solde -= montant;
            autre.solde += montant;
        }
        else {
            System.out.println("Virement impossible : montant ou solde insuffisant");
        }
    }

    public double calculerSoldeAvecInterets() {
        return solde + (solde * tauxInteretAnnuel);
    }

    public double calculerSoldeAvecInterets(double bonus) {
        return solde + (solde * (tauxInteretAnnuel + bonus));
    }

    public static int getNbComptes() {
        return nbComptes;
    }

    public static double getTauxInteretAnnuel() {
        return tauxInteretAnnuel;
    }

    public static void setTauxInteretAnnuel(double taux) {
        tauxInteretAnnuel = taux;
    }
}
