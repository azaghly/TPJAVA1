package partie3;

import java.util.Scanner;

public class Exercice9 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int[][] mat = new int[3][3];
        int somme = 0;

        // Remplissage
        System.out.print("Entre les element de votre tableau:\n ");
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                System.out.print("mat[" + i + "][" + j + "] = ");
                mat[i][j] = sc.nextInt();
                somme += mat[i][j];
            }
        }

        System.out.println("La somme des éléments est : " + somme);
    }
}
