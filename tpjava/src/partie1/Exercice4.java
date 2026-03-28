package partie1;

import java.util.Scanner;

public class Exercice4 {
    public static void main(String[] args) {
    	
        Scanner sc = new Scanner(System.in);

        System.out.print("Entrez un entier : ");
        int num = sc.nextInt();

        int i = 1;
        int somme = 0;

        while (i <= num) {
            somme += i;
            i++;
        }

        System.out.println("La somme est : " + somme);
    }
}
