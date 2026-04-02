package TP2;
public class TestBanque {

    public static void main(String[] args) {

        Banque banque = new Banque("MarocBank",1500);

        CompteBancaire c1 = new CompteBancaire("Yassine",1000,500);
        CompteBancaire c2 = new CompteBancaire("Moha",2000,300);
        CompteBancaire c3 = new CompteBancaire("Yidir",1500,400);

        banque.ajouterCompte(c1);
        banque.ajouterCompte(c2);
        banque.ajouterCompte(c3);
        
        c1.deposer(500);
        c1.retirer(1200);

        c2.virementVers(c3,300);

        banque.afficherTous();

        System.out.println("Solde c2 avec interets : " + c2.calculerSoldeAvecInterets());
        System.out.println("Solde c2 avec bonus : " + c2.calculerSoldeAvecInterets(0.015));

        System.out.println("Nombre total de comptes : " + CompteBancaire.getNbComptes());
        System.out.println("Taux d'interet annuel : " + CompteBancaire.getTauxInteretAnnuel());
    }
}