package tp6;
import java.util.*;

public class Client {
	private int Numero;
	private String Nom;
	
	public Client(int num, String nom) {
		this.Numero= num;
		this.Nom = nom;
	}
	
	public String toString() {
		return "   - Numero: "+Numero+", Nom: "+Nom;
	}

	public static void main(String[] args) {
		
		LinkedList<Client> file = new LinkedList<>();
		
		file.add(new Client(123,"Moha"));
		file.add(new Client(124,"Yassine"));
		file.add(new Client(125,"Fatima"));
		file.add(new Client(126,"Yidir"));
		
		System.out.println(file);
		
		System.out.println("");
		System.out.println("-- Le client a servir :");
		System.out.println(file.poll());
		
		System.out.println("");
		file.addLast(new Client(127,"abdo"));
		System.out.println("-- liste des client apres l'ajouter : ");
		for(Client c : file) {
			System.out.println(c);
		}
		
		System.out.println("");
		System.out.println("- Client en tete :\n"+file.peekFirst());

	}

}
