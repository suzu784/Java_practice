package paiza;

import java.util.Scanner;

public class WordCount1 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("重複チェック");
		
		int count = 0;
		
		char target = sc.nextLine().charAt(0);
		String str = sc.nextLine();
		
		for(int i = 0; i < str.length(); i++) {
			if(str.charAt(i) == target) {
				count++;
			}
		}
		System.out.println(count);
	}

}
