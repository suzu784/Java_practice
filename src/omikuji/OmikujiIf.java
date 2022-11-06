package omikuji;

import java.util.Random;

public class OmikujiIf {

	public static void main(String[] args) {
		// 0~3までの範囲で乱数を作成する
		Random rand = new Random();
		int no = rand.nextInt(4);
		
		// 取得した乱数の値によって、結果を表示する
		if (no == 0) {
			System.out.println("大吉");
		} else if (no == 1) {
			System.out.println("中吉");
		} else if (no == 2) {
			System.out.println("末吉");
		} else {
			System.out.println("凶");
		}

	}

}
