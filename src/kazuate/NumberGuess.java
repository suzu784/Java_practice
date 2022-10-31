package kazuate;

import java.util.Random;
import java.util.Scanner;

public class NumberGuess {

	public static void main(String[] args) {
		// キーボードの準備
		Scanner stdin = new Scanner(System.in);
		
		int count = 0; // 入力した回数を格納する変数
		
		// コンピューターの答えを作成
		int comAnswer = new Random().nextInt(100) + 1;
		
		while(true) {
			try { // ユーザの予想値をキーボードから入力
				count++; // 入力した回数を1加算
				System.out.println(count + "回目:予想値(1~100)の入力");
				// キーバードから整数としてデータを読み込み変数に保存
				int userGuess = stdin.nextInt();
				// 答えと一致するかどうかのチェック
				// 答えの方が予想値よりも小さい場合
				if(comAnswer < userGuess) {
					System.out.println("もっと小さな値です");
				} else if(comAnswer > userGuess) {
					System.out.println("もっと大きな値です");
				} else {
					System.out.println("\n正解です");
					break; // 無限ループの終了
				}
			} catch (Exception e) {
				// 整数以外のデータが入力された場合
				System.out.println("エラー:予想値は数値を入力してください");
				// 入力されたデータの除去
				stdin.next();
			}
		}
	}

}
