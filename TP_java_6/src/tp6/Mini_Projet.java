package tp6;
import java.util.*;

class Livre {
    String Isbn, Titre, Auteur;
    int Annee;

    public Livre(String isbn, String titre, String auteur, int annee) {
        this.Isbn = isbn;
        this.Titre = titre;
        this.Auteur = auteur;
        this.Annee = annee;
    }

    public String toString() {
        return "   - "+Isbn + ", " + Titre + ", " + Auteur + ", " + Annee;
    }
}

public class Mini_Projet {

	public static void main(String[] args) {
		ArrayList<Livre> livres = new ArrayList<>();
		
        HashSet<String> categories = new HashSet<>();
        
        HashMap<String, Livre> emprunts = new HashMap<>();

        livres.add(new Livre("1", "Java", "Auteur1", 1990));
        livres.add(new Livre("2", "Python", "Auteur2", 2000));

        categories.add("Informatique");
        categories.add("Science");

        emprunts.put("Abdo", livres.get(0));

        for (Livre l : livres) {
            if (l.Titre.equals("Python")) {
                System.out.println("- Le livre est trouve :\n " + l);
            }
        }
        System.out.println("");

        livres.removeIf(l -> l.Isbn.equals("2"));

        System.out.println("Livres:");
        for (Livre l : livres) {
            System.out.println(l);
        }
        System.out.println("");

        System.out.println("--> Rapport final:");
        System.out.println("     - Total livres: " + livres.size());
        System.out.println("     - Catégories: " + categories);
        System.out.println("     - Emprunts: " + emprunts);

	}

}
