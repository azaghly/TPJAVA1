package partie1;

import java.util.Scanner;

public class Exercice3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Veuiller saisir un nombre : ");
        int num = sc.nextInt();
        int result;

        for (int i = 1; i <= 10; i++) {
        	result = num*i;
            System.out.println(num + " x " + i + " = " + result);
        }
    }
}
