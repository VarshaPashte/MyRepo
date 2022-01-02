import java.util.ArrayList;
import java.util.Collections;
import java.util.HashSet;

public class HashSetOfCollection {

	public static void main(String[] args) {
		
		ArrayList<String> ig=new ArrayList<String>();
		ig.add("abc");
		ig.add("xyz");
		ig.add("pqr");
		ig.add("lmn");
		Collections.sort(ig);
		System.out.println(ig);
		
	HashSet<String> h=new HashSet<String>();
		h.add("a");
		h.add("b");
		h.add("c");
		h.add("d");
		h.add("a");
		h.addAll(ig);
		System.out.println("Set elements:");
		
		for(String element:h){
			System.out.println(element);
		}

	}

}
