package partie1;

import java.util.Scanner;

public class Exercice2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Veullier saisire le premier nombre : ");
        int num1 = sc.nextInt();

        System.out.print("Veullier saisire le deuxième nombre : ");
        int num2 = sc.nextInt();

        System.out.print("Veullier saisire le troisième nombre : ");
        int num3 = sc.nextInt();

        int max = num1;

        if (num2> max) {
            max = num2;
        }
        if (num3 > max) {
            max = num3;
        }

        System.out.println("Le plus grand element est : " + max);
    }
}