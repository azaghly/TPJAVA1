package tp2;
public class CompteBancaire {

    // Attributs privés
    private int numero;
    private String titulaire;
    private double solde;
    private double decouvertAutorise;
    
    // Variables static
    private static int nbComptes = 0;
    private static double tauxInteretAnnuel = 0.03;
    // Constructeur par défaut
    public CompteBancaire() {
        this.numero = ++nbComptes;
        this.titulaire = "Inconnu";
        this.solde = 0;
        this.decouvertAutorise = 0;
    }
    // Constructeur paramétré
    public CompteBancaire(String titulaire, double soldeInitial, double decouvertAutorise) {
        this.numero = ++nbComptes;
        this.titulaire = titulaire;
        this.solde = soldeInitial;
        this.decouvertAutorise = decouvertAutorise;
    }
    // GETTERS
    public int getNumero() {
        return numero;
    }
    public String getTitulaire() {
        return titulaire;
    }
    public double getSolde() {
        return solde;
    }
    public double getDecouvertAutorise() {
        return decouvertAutorise;
    }
    // SETTERS avec validation
    public void setTitulaire(String titulaire) {
        if (titulaire != null && !titulaire.isEmpty()) {
            this.titulaire = titulaire;
        }
    }
    public void setDecouvertAutorise(double decouvertAutorise) {
        if (decouvertAutorise >= 0) {
            this.decouvertAutorise = decouvertAutorise;
        }
    }
    // Affichage
    public void afficher() {
        System.out.println("Numero: " + numero);
        System.out.println("Titulaire: " + titulaire);
        System.out.println("Solde: " + solde);
        System.out.println("Découvert autorisé: " + decouvertAutorise);
        System.out.println("---------------------------");
    }
    // Déposer
    public void deposer(double montant) {
        if (montant > 0) {
            solde += montant;
        } else {
            System.out.println("Montant de dépôt invalide.");
        }
    }
    // Retirer
    public void retirer(double montant) {
        if (montant > 0 && montant <= (solde + decouvertAutorise)) {
            solde -= montant;
        } else {
            System.out.println("Retrait refusé.");
        }
    }
    // Virement
    public void virer(CompteBancaire autre, double montant) {
        if (montant > 0 && montant <= (this.solde + this.decouvertAutorise)) {
            this.solde -= montant;
            autre.solde += montant;
        } else {
            System.out.println("Virement impossible: montant ou solde insuffisant.");
        }
    }
    // Calcul intérêt sans bonus
    public double calculerSoldeAvecInterets() {
        return solde + (solde * tauxInteretAnnuel);
    }
    // Calcul intérêt avec bonus
    public double calculerSoldeAvecInterets(double bonus) {
        return solde + (solde * (tauxInteretAnnuel + bonus));
    }
    // Méthodes static
    public static int getNbComptes() {
        return nbComptes;
    }
    public static double getTauxInteretAnnuel() {
        return tauxInteretAnnuel;
    }

    public static void setTauxInteretAnnuel(double taux) {
        if (taux >= 0) {
            tauxInteretAnnuel = taux;
        }
    }
    public class Main {
        public static void main(String[] args) {
            //  
            CompteBancaire c1 = new CompteBancaire("Yassine", 1000, 500);
            CompteBancaire c2 = new CompteBancaire("Moha", 500, 300);
            //  
            c1.afficher();
            c2.afficher();
            // 
            c1.deposer(200);
            c1.retirer(1500); 
            c1.virer(c2, 300);
            // 
            c1.afficher();
            c2.afficher();
            // 
            System.out.println("Solde avec interet c1: " + c1.calculerSoldeAvecInterets());
            System.out.println("Solde avec bonus c2: " + c2.calculerSoldeAvecInterets(0.02));
            // info generale
            System.out.println("Nombre de comptes: " + CompteBancaire.getNbComptes());
            System.out.println("Taux interet: " + CompteBancaire.getTauxInteretAnnuel());
        }
    }
}