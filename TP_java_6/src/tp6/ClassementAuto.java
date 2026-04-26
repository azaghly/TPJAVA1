package tp6;
import java.util.*;

public class ClassementAuto {

	public static void main(String[] args) {
		TreeMap<Integer, String> map = new TreeMap<>();

        map.put(111, "yassine");
        map.put(50, "Khadija");
        map.put(180, "Ismail");

        System.out.println(map);
        System.out.println("");

        System.out.println("Premier: "+ map.firstEntry());
        System.out.println("Dernier: "+ map.lastEntry());
        System.out.println("");

        System.out.println(map.tailMap(100));
	}
}
