package currentAge;

import java.time.LocalDate;
import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class CurrentAgeHassle {

	public static void main(String[] args) {
		// 生年月日(文字列)の取得
		String birthday = getBirthday();
		
		// 入力した生年月日が適切かどうかのチェック
		if (isBirthday(birthday)) {
			// 今年の年齢の計算(取得)
			int currentAge = calcCurrentAge(birthday);
			// 結果の表示
			showResult(birthday, currentAge);
		} else { // 不適切な場合
			System.exit(0); // プログラムの終了
		}

	}
	
	public static String getBirthday() {
		// キーボードの準備
		Scanner stdin = new Scanner(System.in);
		System.out.println("あなたの生年月日(yyyy/mm/dd形式)の入力");
		// 文字列を1行読み込む
		String birth = stdin.nextLine();
		
		// 整数以外が入力されたかどうかのチェック(正規表現)
		Pattern pattern = Pattern.compile("^\\d{4}/\\d{1,2}/\\d{1,2}$");
		Matcher matcher = pattern.matcher(birth);
		
		// 生年月日の書式と一致するかどうかのチェック
		if (!matcher.matches()) {
			System.out.println("入力が不適切です。再度やり直してください");
			System.exit(0); // プログラムの終了
		}
		return birth; // 読み込んだ文字列を返す
	}
	
	public static boolean isBirthday(String birth) {
		boolean flag = true; // 適切(デフォルト)か不適切かを保存
		
		// 生年月日を「／」で西暦、月、日に分割
		String[] array = birth.split("/");
		// 分割したそれぞれのデータをint型に変換
		int year = Integer.parseInt(array[0]); // 西暦の取得
		int month = Integer.parseInt(array[1]); // 月の取得
		int date = Integer.parseInt(array[2]); // 日の取得
		
		// 西暦が適切な範囲外かどうかのチェック
		if (year < 1900 || year > LocalDate.now().getYear()) {
			System.out.println("入力できる西暦は1900年から今年までです");
			flag = false; // 不適切なデータ
		}
		// 月や日が範囲外かどうかのチェック
		if (month <= 0 || month >= 13 || date <= 0 || date >= 32) {
			System.out.println("月日の指定が不適切です");
			flag = false; // 不適切なデータ
		}
		
		return flag; // 判定結果を返す
	}
	
	public static int calcCurrentAge(String birth) {
		String[] array = birth.split("/");
		// 分割したそれぞれのデータをint型に変換
		int bornYear = Integer.parseInt(array[0]);
		int bornMonth = Integer.parseInt(array[1]);
		int bornDate = Integer.parseInt(array[2]);
		
		// 現在の日付をLocalDateオブジェクトとして取得
		LocalDate today = LocalDate.now();
		int thisYear = today.getYear(); // 今の西暦
		int thisMonth = today.getMonthValue(); // 今の月
		int thisDate = today.getDayOfMonth(); // 今の日
		
		// 西暦から今の年齢を計算
		int age = thisYear - bornYear;
		
		// まだ今年の誕生日の月になっていない場合
		if (thisMonth < bornMonth) {
			age--; // 年齢を-1
		}
		// 今年は誕生月だが、まだ誕生日になっていない場合
		if (thisMonth == bornMonth && thisDate > bornDate) {
			age--; // 年齢を-1
		}
		return age; // 求めた年齢を返す
		
	}
	
	public static void showResult(String birth, int age) {
		System.out.println("生年月日が" + birth + "の人は今年現在" + age + "です");
	}

}
