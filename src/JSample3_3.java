import java.util.HashMap;

public class JSample3_3 {

	public static void main(String[] args) {
		HashMap<String, Integer> map = new HashMap<>();
		
		map.put("りんご", 80);
		map.put("オレンジ",120);
		map.put("ブドウ", 90);
		
		System.out.println(map.get("ブドウ"));
		System.out.println(map.get("りんご"));
	}

}
