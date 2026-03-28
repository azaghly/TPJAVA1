package partie1;

import java.util.Scanner;

public class Exercice1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Entrez un nombre entier : ");
        int num = sc.nextInt();

        if (num > 0) {
            System.out.println("Se nombre est positif.");
        } else if (num < 0) {
            System.out.println("Ce nombre est négatif.");
        } else {
            System.out.println("Ce nombre est Nul.");
        }
    }
}