package currentAge;
 
import java.time.LocalDate;
import java.time.Period;
import java.time.format.DateTimeFormatter;
import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
 
public class CurrentAgeDetail {
 
	public static void main(String[] args) {
	// 生年月日の取得
	String birthday = getBirthday();
	// 今年の年齢の計算(取得)
	int currentAge = calcCurrentAge(birthday);
	// 結果の表示
	showResult(birthday, currentAge);
	}
 
	public static String getBirthday() {
	// キーボードの準備
	Scanner stdin = new Scanner(System.in);
	System.out.println("あなたの生年月日(yyyy/mm/dd形式)の入力");
	// 文字列を１行読み込む
	String birth = stdin.nextLine();
 
	// 整数以外が入力されたかどうかのチェック(正規表現)
	Pattern pattern = Pattern.compile("^\\d{4}/\\d{1,2}/\\d{1,2}$");
	Matcher matcher = pattern.matcher(birth);
	// 生年月日の書式と一致するかどうかのチェック
	if (!matcher.matches()) { // 一致しない場合
	System.out.println("入力が不適切です。再度やり直してください");
	System.exit(0); // プログラムの終了
	}
	return birth; // 読み込んだ文字列を返す
	}
 
	public static int calcCurrentAge(String birth) {
	Period period = null;
	// DateTimeFormatterオブジェクトの作成(誕生日の書式を指定)
	DateTimeFormatter formatter = DateTimeFormatter.ofPattern("yyyy/M/d");
	
	try {
	// 文字列から書式を指定してLocaDateオブジェクトを作成
	LocalDate birthday = LocalDate.parse(birth, formatter);
	
	String[] array = birth.split("/"); // 西暦を取得
	int year = Integer.parseInt(array[0]); // 西暦を整数に変換
	
	// 現在のLocaDateオブジェクトを取得
	LocalDate today = LocalDate.now();
	
	// 適切な範囲かどうかのチェック
	if (year < 1900 || year > today.getYear()) {
	System.out.println("入力できる西暦は1900年から今年までです");
	System.exit(0); // プログラムの終了
	}
	// 2つのLocaDateオブジェクトの差を求める
	period = Period.between(birthday, today);
	} catch (Exception e) {
	// 不適切なデータによりLocaDateオブジェクトが作成できない場合
	System.out.println("月日の指定が不適切です");
	System.exit(0); // プログラムの終了
	}
	// Periodオブジェクトから経過年数を取り出し返す
	return period.getYears();
	}
 
	public static void showResult(String born, int age) {
	System.out.printf("誕生日が%sのあなたは今年[%d年]、%d歳です%n",
	born,LocalDate.now().getYear(),age);
	}
}