package tp6;
import java.util.*;
public class Matiere {

	public static void main(String[] args) {
		
		HashSet<String> matier = new HashSet<>();
		
		matier.add("Math");
		matier.add("Java");
		matier.add("Web");
		matier.add("ML");
		matier.add("ML");
		
		System.out.println(matier);
		System.out.println("les doublon est ignore.");
		
		System.out.println("");
		TreeSet<String> tree = new TreeSet<>(matier);
		System.out.println("triee : "+tree);
		
	}

}
