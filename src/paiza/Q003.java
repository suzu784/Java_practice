package paiza;

import java.util.ArrayList;
import java.util.Arrays;

public class Q003 {

	public static void main(String[] args) {
		ArrayList<String> sample_list = new ArrayList<>(Arrays.asList("赤", "青", "緑"));
		sample_list.set(2, "白");
		
		System.out.println(sample_list);
	}

}
