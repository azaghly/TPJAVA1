package tp6;
import java.util.*;

public class Note {

	public static void main(String[] args) {
		
		HashMap<String, Double> notes = new HashMap<>();

        notes.put("Yassine", 17.25);
        notes.put("Younes", 15.5);
        notes.put("Hassan", 16.0);
        notes.put("Moha", 15.75);
        
        System.out.println(notes);
        for(String e: notes.keySet()) {
    		System.out.println("   - "+e+" : "+notes.get(e));
        }
        
		System.out.println("");
        System.out.println("Note de Moha : \n"+notes.get("Moha"));
        
		System.out.println("");
		System.out.println("--> les notes apre modfichation et suppression :");
		notes.put("Younes", 18.0);
		
		notes.remove("Hassan");
		 for(String e: notes.keySet()) {
	    		System.out.println("   - "+e+" : "+notes.get(e));
	     }        
		System.out.println("");
		double sum = 0;
		for(Double n : notes.values()) {
			sum +=n;
		}
		System.out.println("- La moyenne de classe :"+ (sum/notes.size()));

        
        

		
		
        
	}

}
