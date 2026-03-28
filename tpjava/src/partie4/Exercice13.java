package partie4;

import java.util.Scanner;

public class Exercice13 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Entrez une chaine : ");
        String texte = sc.nextLine();

        String inverse = "";

        for (int i = texte.length() - 1; i >= 0; i--) {
            inverse += texte.charAt(i);
        }

        System.out.println("Chaine inversée est : " + inverse);
    }
}