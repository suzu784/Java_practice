package paiza;

import java.util.ArrayList;
import java.util.Scanner;

public class SearchHistory {

	public static void main(String[] args) {
		System.out.println("検索履歴");
		Scanner sc = new Scanner(System.in);
		int line = sc.nextInt();
		
		ArrayList<String> words = new ArrayList<>();
		
		while(sc.hasNext()) {
			String word = sc.next();
			if(words.contains(word)) {
				words.remove(words.lastIndexOf(word));
				words.add(0, word);
			} else {
				words.add(0, word);
			}
		}
		for(int i = 0; i < words.size(); i++) {
			System.out.println(words.get(i));
		}
	}

}
