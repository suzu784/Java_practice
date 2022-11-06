package omikuji;

import java.util.Random;

public class OmikujiSwitch {

	public static void main(String[] args) {
		// 0~3までの範囲で乱数を1つ作成する
		Random rand = new Random();
		int no = rand.nextInt(4);
		
		// 取得した乱数の値によって、結果を表示する
		switch(no) {
		case 0:
			System.out.println("大吉");
			break;
		case 1:
			System.out.println("中吉");
			break;
		case 2:
			System.out.println("末吉");
			break;
		case 3:
			System.out.println("凶");
		}

	}

}
