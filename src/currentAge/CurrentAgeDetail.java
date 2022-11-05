package currentAge;

import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class CurrentAgeDetail {

	public static void main(String[] args) {
		//　生年月日の取得
		
		// 今年の年齢の計算(取得)
		
		// 結果の表示

	}
	
	public static String getBirthday() {
		// キーボードの準備
		Scanner stdin = new Scanner(System.in);
		System.out.println("あなたの生年月日(yyyy/mm/dd形式)の入力");
		
		String birth = stdin.nextLine();
		
		// 整数以外が入力されたかどうかのチェック(正規表現)
		Pattern pattern = Pattern.compile("^\\\\d{4}/\\\\d{1,2}/\\\\d{1,2}$"); // 正規表現を適応するために文字列を返す
		Matcher matcher = pattern.matcher(birth);
		
		// 生年月日の書式と一致するかどうかのチェック
		if (!matcher.matches()) {
			System.out.println("入力が不適切です。再度やり直してください");
			System.exit(0); // プログラムの終了
		}
		return birth; // 読み込んだ文字列を返す
	}

}
