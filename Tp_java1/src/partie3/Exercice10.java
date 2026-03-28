package partie3;

import java.util.Scanner;

public class Exercice10 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int[][] mat = new int[3][3];
        int[][] trans = new int[3][3];

        // Remplissage
        System.out.print("Entrez les element de votre matrice: \n");
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                System.out.print("mat[" + i + "][" + j + "] = ");
                mat[i][j] = sc.nextInt();
            }
        }

        // Transposée
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                trans[j][i] = mat[i][j];
            }
        }

        // Affichage
        System.out.println("Votre matrice :");
        for (int i = 0 ; i < 3 ; i++) {
        	for (int j = 0 ; j <3 ; j++) {
        		System.out.print(mat[i][j]+" ");
        	}
        	System.out.println();
        	
        }
        System.out.println("La matrice transposée :");

        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                System.out.print(trans[i][j] + " ");
            }
            System.out.println();
        }
    }
}
