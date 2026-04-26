package tp6;

import java.util.*;

public class Etudiant {

	protected int Id;
	protected String Nom;
	protected double Moyenne;
	
	public Etudiant(int id , String nom, double moy) {
		this.Id = id;
		this.Nom = nom;
		this.Moyenne = moy;
	
	}
	public String toString() {
		return "   - ID = "+Id+", Nom = "+Nom+", Moyenne = "+Moyenne;
	}
	
	public static void main(String[] agrs) {
		ArrayList<Etudiant> listeEtudiants = new ArrayList<>();
		
		listeEtudiants.add(new Etudiant(1,"Yassine", 14.5));
		listeEtudiants.add(new Etudiant(2,"Moha", 19.5));
		listeEtudiants.add(new Etudiant(3,"Yidir", 18));
		listeEtudiants.add(new Etudiant(4,"Hassan", 17.75));
		listeEtudiants.add(new Etudiant(5,"Mustapha", 10.25));
		
		System.out.println("--> Liste des d'etudiant :");
		for (Etudiant e : listeEtudiants) {
			System.out.println(e);
		}
		
		System.out.println("");
		String NomRercher = "Yidir";
		boolean con = false;
		for(Etudiant e : listeEtudiants) {
			if (e.Nom.equals(NomRercher)) {
				con = true;
			}
		}
		if (con)
			System.out.println("   - le nom est trouver.");
		else
			System.out.println("   - le nom n'exist pas !");
		System.out.println("");
		
		int idSupprimer = 3;
		listeEtudiants.removeIf(e -> e.Id == idSupprimer);
		System.out.println("--> l'etudiant de Id "+idSupprimer+" a ete supprimer.");
		for (Etudiant e : listeEtudiants) {
			System.out.println(e);
		}
		System.out.println("");
		
        listeEtudiants.sort(Comparator.comparingDouble(e -> e.Moyenne));
        System.out.println("--> l'etudiant dans ordre croissante selon moyenne.");
		for (Etudiant e : listeEtudiants) {
			System.out.println(e);
		}
		
		System.out.println("");
		
		Etudiant meilleure = Collections.max(listeEtudiants, Comparator.comparingDouble(e -> e.Moyenne));
		System.out.println("--> Meilleure etudiant : \n"+meilleure);
	
	}

}













