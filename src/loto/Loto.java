package loto;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;

public class Loto {
	private int[] lotos; // 予想結果を格納する配列 
	private int limit; // 種類ごとの最大値を格納する変数		
	
	// Lotoの種類(6か7)を受け取るコンストラクター
	Loto(int type) {
		// Lotoの種類によって配列を作成(要素数が異なる)
		lotos = new int[type];
		
		// Lotoの種類によって選択肢の最大値を決める
		switch(type) {
		case 6:
			this.limit = 43;
		case 7:
			this.limit = 37;
		}
		
		// 予想結果を求め配列に格納
		lotos = getNumber(lotos, limit);
	}
	
	// 予想値を求め、結果(配列)を返す非公開メソッド
	private int[] getNumber(int[] lotos, int limit) {
		// 可変長配列を作成
		ArrayList<Integer> numbers = new ArrayList<>();
		
		// ArrayListに1から順番に値を格納
		for(int i = 0; i < limit; i++) {
			numbers.add(i + 1);
		}
		
		// ArrayList内の値をシャッフル
		Collections.shuffle(numbers);
		
		for(int i = 0; i < lotos.length; i++) {
			lotos[i] = numbers.get(i);
		}
		
		// 取り出した値(配列)を昇順に並び替える
		Arrays.sort(lotos);
		
		return lotos;
	}
	
	public void showLoto() {
		for(int number : lotos) {
			System.out.printf("[%2d]", number);
		}
		System.out.println("");
	}
	
}
