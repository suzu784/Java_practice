package omikuji;

import java.util.Random;

public class OmikujiArray {

	public static void main(String[] args) {
		// おみくじの結果を配列に保存しておく
		String[] omikuji = {"大吉", "中吉", "末吉", "凶"};
		
		// 0~3までの範囲で乱数を1つ生成する
		Random rand = new Random();
		int no = rand.nextInt(4);
		
		// 乱数の値を配列の添字としておみくじの結果を取り出し表示する
		System.out.println(omikuji[no]);

	}

}
