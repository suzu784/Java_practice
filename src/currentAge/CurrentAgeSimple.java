package currentAge;

import java.time.LocalDateTime;
import java.util.Scanner;

public class CurrentAgeSimple {

	public static void main(String[] args) {
		// 生まれた西暦の取得
		int bornYear = getBornYear();
		
		// 今年の西暦の取得
		int thisYear = getThisYear();
		
		// 今年の年齢の計算(取得)
		int currentAge = calcCurrentAge(bornYear, thisYear);
		
		// 結果の表示
		showResult(bornYear, thisYear, currentAge);
	}
	
	public static int getBornYear() {
		// キーボードの準備
		Scanner stdin = new Scanner(System.in);
		System.out.println("あなたの生まれた西暦の入力");
		// 入力された整数を返す
		return stdin.nextInt();
	}
	
	public static int getThisYear() {
		// 現在の日時を取得
		LocalDateTime today = LocalDateTime.now();
		// 西暦のデータを取り出し返す
		return today.getYear();
	}
	
	public static int calcCurrentAge(int born, int today) {
		// 今年の年齢(今年の西暦ー生まれた西暦)を返す
		return today - born;
	}
	
	public static void showResult(int born, int now, int age) {
		System.out.println(born + "年生まれのあなたは今年" + now + "年" + age + "歳です");
	}

}
