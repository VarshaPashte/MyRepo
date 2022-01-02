import java.util.ArrayList;

public class RemoveDuplicateData {

	public static void main(String[] args) {
		ArrayList<Integer> ig=new ArrayList<Integer>();
		ig.add(12);
		ig.add(13);
		ig.add(34);
		ig.add(56);
		ig.add(13);
		for(int element:ig){
			if(!ig.contains(element)){
				ig.remove(ig);
			}
		}

	}

}
