package partie2;
import java.util.Scanner;

public class Exercice7 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Entrez la taille du votre tableau : ");
        int n = sc.nextInt();

        int[] tab = new int[n];

        // Remplissage
        for (int i = 0; i < n; i++) {
            System.out.print("tab[" + (i+1) + "] = ");
            tab[i] = sc.nextInt();
        }
        // Recherche du max
        int max = tab[0];

        for (int i = 1; i < n; i++) {
            if (tab[i] > max) {
                max = tab[i];
            }
        }
        System.out.println("Le plus grand élément est : " + max);
    }
}
