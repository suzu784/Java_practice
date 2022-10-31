package kazuate;

import java.util.Random;
import java.util.Scanner;

public class NumberGuessMethod {
	
	public static void main(String[] args) {
		// コンピューターの答えを取得
		int comAnswer = getComAnswer();
		// 正解するまで何度でも繰り返す
		while(true) {
			// ユーザーの予想値の取得
			int userGuess = getUserGuess();
			
			// 正解/不正解のチェック
			boolean judge = isJudgeAnswer(comAnswer, userGuess);
			
			// 正解の場合
			if(judge) {
				break; // 処理の終了
			} else { // 不正解の場合
				// 何もしない
			}
		}
		
	}
	
	// コンピューターの答えを返すメソッド
	public static int getComAnswer() {
		// 作成した乱数を返す
		return new Random().nextInt(100) + 1;
	}
	
	// キーボードから入力された数値(予想値)を返すメソッド
	public static int getUserGuess() {
		int guess;
		// キーボードの準備
		Scanner stdin = new Scanner(System.in);
		
		while(true) {
			try {
				System.out.println("予想値1~100の入力");
				// キーボードから予想値を読み込む
				guess = stdin.nextInt();
				break; // 整数として読み込めたので無限ループの終了
			} catch(Exception e) {
				System.out.println("予想値は整数を入力してください");
				stdin.next();
			}
		}
		return guess; // 読み込んだ整数を返す
	}
	
	// 答えと予想値が一致するかどうかを判定するメソッド
	public static boolean isJudgeAnswer(int com, int user) {
		if(com < user) { // 答えの方が小さい場合
			// ヒントの表示
			System.out.println("もっと小さな値です");
			return false;
		} else if(com > user) { // 答えの方が大きい場合
			// ヒントの表示
			System.out.println("もっと大きな値です");
			return false;
		} else { // 答えと予想値が一致した場合
			System.out.println("\n正解です");
			// 正解なのでtrueを返す
			return true;
		}
	}
}
