package paiza;

import java.util.ArrayList;
import java.util.Scanner;

public class WordCount {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("文字の重複チェック");
		ArrayList<String> list = new ArrayList<String>();
		
		// 重複数の合計
		int count = 0;
		
		String target = sc.nextLine();
		String str = sc.nextLine();
		
		// 文を1文字ずつlistに詰める
		for(int i = 1; i < str.length() + 1; i++) {
			list.add(str.substring(i - 1, i));
		}
		
		for(int i = 0; i < list.size(); i++) {
			if(target.equals(list.get(i))) {
				count++;
			}
		}
		System.out.println(count);
	}

}
