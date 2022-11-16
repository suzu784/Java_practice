package myArray;

import java.util.Random;

public class UniqueValue {
	
	// 5回分必ずループを繰り返すため、、whileを使う
	// カウントと判定用の変数を用意する
	// 配列内に値がない場合は重複チェックしない

	public static void main(String[] args) {
		Random rand = new Random();
		System.out.println();
		
		// 重複するかどうかの変数
		boolean isUnique = true;
		
		int[] array = new int[5];
		
		// 格納した個数の初期化
		int count =  0;
		
		// 5回分ループを回したい場合はwhileを使う
		while(count < 5) {
			int value = rand.nextInt(11);
			
			for(int i = 0; i < count; i++) {
				if(array[i] == value) {
					isUnique = false;
					break;
				} else {
					isUnique = true; // 重複していなければtrue
				}
			}
			
			if(isUnique == true) {
				array[count] = value;
				count++;
			}
		}
		for(int num : array) {
			System.out.println(num + " ");
		}
	}

}
