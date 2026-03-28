package partie2;
import java.util.Scanner;

public class Exercice6 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int[] tab = new int[10];
        // Remplissage
        System.out.println("veuiller saisir les element du votre tableau :");
        for (int i = 0; i < 10; i++) {
            System.out.print("tab[" + (i+1)+ "] = ");
            tab[i] = sc.nextInt();
        }
        // Recherche
        System.out.print("Entrez le nombre à rechercher : ");
        int x = sc.nextInt();

        boolean trouve = false;

        for (int i = 0; i < 10; i++) {
            if (tab[i] == x) {
                System.out.println("Trouvé à la position : " + (i+1));
                trouve = true;
                break;
            }
        }
        if (!trouve) {
            System.out.println("Nombre non trouvé.");
        }
    }
}