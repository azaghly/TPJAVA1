package partie2;

import java.util.Scanner;

public class Exercice5 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Donner la taille du votre tableau : ");
        int n = sc.nextInt();

        int[] tab = new int[n];

        // Remplissage
        for (int i = 0; i < n; i++) {
            System.out.print("tab[" + (i+1) + "] = ");
            tab[i] = sc.nextInt();
        }

        // Affichage
        System.out.println("Les éléments du votre tableau sont :");
        for (int i = 0; i < n; i++) {
            System.out.println(tab[i]);
        }
    }
}