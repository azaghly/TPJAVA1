package tp4;

public class TestBanque {
    public static void main(String[] args) {
       
        Compte[] cpt = new Compte[4];
        
        cpt[0] = new CompteCourant("PA1", "Yassine", 7500, 160);
        cpt[1] = new CompteEpargne("PB1", "Hassan", 8000, 10);
        cpt[2] = new ComptePremium("PA2", "Moha", 1900, 1000);
        cpt[3] = new CompteCourant("PB2", "Fatima", 10000, 90);

        System.out.println("- Operations sur tous les comptes :");
        for (Compte c : cpt) {
            c.deposer(100);    
            c.retirer(1500);
            c.afficher(); 
            
        }

        System.out.println("- Affichage des Comptes Epargne uniquement :");
        for (Compte c : cpt) {
            if (c instanceof CompteEpargne) {
                c.afficher();
            }
        }
        
    }
}
