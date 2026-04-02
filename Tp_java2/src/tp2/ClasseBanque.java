package tp2;

public class ClasseBanque {

    public String nom;
    public CompteBancaire[] comptes;
    public int nbActuels;

    public Banque(String nom, int capacite) {
        this.nom = nom;
        comptes = new CompteBancaire[capacite];
        nbActuels = 0;
    }

    public void ajouterCompte(CompteBancaire c) {

        if(nbActuels < comptes.length) {
            comptes[nbActuels] = c;
            nbActuels++;
        }
        else {
            System.out.println("Banque pleine !");
        }
    }

    public void afficherTous() {

        for(int i=0; i<nbActuels; i++) {
            comptes[i].afficher();
        }
    }
}
