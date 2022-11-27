
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;

public class JSample2_6 {

	public static void main(String[] args) {
		ArrayList<Integer> list = new ArrayList<Integer>();
		list.add(5);
		list.add(3);
		list.add(100);
		list.add(40);
		list.add(2);
		
		Comparator<Integer> comparator = new Comparator<Integer>() {
			public int compare(Integer o1, Integer o2) {
				return Integer.valueOf(o1).compareTo(Integer.valueOf(o2));
			}
		};
		
		Collections.sort(list, comparator);
		
		System.out.println(list);
	}

}
