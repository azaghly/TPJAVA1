package partie4;

import java.util.Scanner;

public class Exercice14 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Entrez une chaine : ");
        String texte = sc.nextLine();

        String inverse = "";

        for (int i = texte.length() - 1; i >= 0; i--) {
            inverse += texte.charAt(i);
        }

        if (texte.equals(inverse)) {
            System.out.println("La chaine est un palindrome.");
        } else {
            System.out.println("La chaine n'est pas un palindrome.");
        }
    }
}
