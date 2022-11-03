package currentAge;

import java.time.LocalDateTime;
import java.util.Scanner;

public class CurrentAgeCheck {

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
		int born; // 入力された西暦(整数)を格納
		
		// 入力回数が未定なので無限ループ
		while (true) {
			// 整数以外が入力された時の例外処理を実装
			try {
				System.out.println("あなたの生まれた西暦の入力");
				born = stdin.nextInt();
				// 入力された整数の範囲チェック
				if (born < 1900 || born > getThisYear()) {
					// 範囲外の場合
					System.out.println("西暦は1900年から今年までの範囲で入力してください");
					continue; // while文のやり直し
				} else {
					// 範囲内の場合
					break; // while文の終了
				}
			} catch (Exception e) {
				System.out.println("西暦は整数で入力してください");
				stdin.next();
			}
		}
		
		// 入力された西暦(整数)を返す
		return born;
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
