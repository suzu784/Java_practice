package paiza;

import java.util.ArrayList;

public class ArrayList3 {

	public static void main(String[] args) {
		ArrayList<String> array = new ArrayList<>();
		array.add("侍");
		array.add("samurai");
		array.add("さむらい");
		array.add("サムライ");
		
		array.remove(array.indexOf("さむらい"));
		
		System.out.println(array);

	}

}
