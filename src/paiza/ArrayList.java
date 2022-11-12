package paiza;

import java.util.LinkedList;

public class ArrayList {

	public static void main(String[] args) {
		LinkedList<String> array = new LinkedList<>();
		array.add("侍");
		array.add("samurai");
		array.add("さむらい");
		array.add("サムライ");
		
		array.clear();
		
		System.out.println("要素数は" + array.size() + "です");
	}

}
