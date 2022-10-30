package mygame;

import java.util.Random;
import java.util.Scanner;

public class JankenIf {

	public static void main(String[] args) {
		// ユーザーの手をキーボードから入力してもらう
		int user = getUser();
		
		// コンピューターの手を乱数で作成する
		int pc = getPc();

	}
	public static int getUser() {
		//　キーボード入力の準備
		Scanner stdin = new Scanner(System.in);
		
		// 無限ループ
		while(true) {
			// メッセージの表示
			System.out.println("あなたのじゃんけんの手を入力してください");
			System.out.println("グー: 0, チョキ: 1, バー: 2");
			
			// 入力されたデータが整数かどうかのチェック
			if (stdin.hasNextInt() ) {
				// 入力されたデータを整数として読み込む
				int number = stdin.nextInt();
				// 整数でも有効なの「0, 1, 2」のみ
				if (number <= -1 || number >= 3) {
					System.out.println("入力できるのは0〜2です");
					continue;
				} else {
					// 0, 1, 2の場合、メソッドの結果として返す
					return number;
				}
			} else {
				// 整数以外の場合、無効なデータなのでやり直し
				System.out.println("入力できるのは整数だけです");
				stdin.next();
			}
		}
	}
	
	public static int getPc() {
		// 乱数の準備
		Random rand = new Random();
		// 0, 1, 2のどれかを求め、メソッドの結果として返す
		return rand.nextInt(3);
	}
	
	

}
