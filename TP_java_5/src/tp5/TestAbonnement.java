package tp5;

public class TestAbonnement {

	public static void main(String[] args) {
		
		Abonnement[] abonnement = new Abonnement[3];
		
		abonnement[0] = new AbonnementVideo("Netflix", 1000, 3, true, true);
		abonnement[1] = new AbonnementMusique("AppelMusic", 1500, 1, 20, true);
		abonnement[2] = new AbonnementJeux("DreamLigue",200 ,2 , 50, 100);
		
        System.out.println("--> Les informations des abonnement disponible :");
		int c = 1;
		for (Abonnement a : abonnement) {
            System.out.println(" - Abonnement num "+c);
            a.afficherInfos();
            System.out.println("   - Cout Mensuel est : " + a.calculerCoutMensuel());
            System.out.println("   - Score de satisfaction est : " + a.calculerScoreSatisfaction());
            c +=1;
            System.out.println("");

        }

        System.out.println("--> Reduction ");

        Reducible[] reducibles = {
            (Reducible) abonnement[0],
            (Reducible) abonnement[1]
        };

        for (Reducible r : reducibles) {
            System.out.println("20%: " + r.appliquerReduction(20));
            System.out.println("50%: " + r.appliquerReduction(50));
        }
	}

}
