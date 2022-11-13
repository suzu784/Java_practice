package paiza;

import java.util.ArrayList;
import java.util.Collections;

public class List {

	public static void main(String[] args) {
		ArrayList<String> list1 = new ArrayList<>();
		list1.add("a");
		list1.add("b");
		list1.add("c");
		list1.add("d");
		list1.add("e");
		
		ArrayList<String> set = new ArrayList<>();
		Collections.addAll(set, "b", "c", "d");
		
		ArrayList<String> list2 = new ArrayList<>(list1);
		System.out.println(list2);
		
		list2.removeAll(set);
		System.out.println(list2);
	}

}
