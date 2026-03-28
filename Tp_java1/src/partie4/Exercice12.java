package partie4;
import java.util.Scanner;

public class Exercice12 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Entrez une chaîne : ");
        String chaine = sc.nextLine();

        int compt = 0;

        for (int i = 0; i < chaine.length(); i++) {
            char c = chaine.charAt(i);

            if (c=='a'||c=='e'||c=='i'||c=='o'||c=='u'||
                c=='A'||c=='E'||c=='I'||c=='O'||c=='U') {
                compt++;
            }
        }

        System.out.println("Nombre de voyelles : " + compt);
    }
}