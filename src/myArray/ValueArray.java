package myArray;

import java.util.Random;

public class ValueArray {

	public static void main(String[] args) {
		int[] array = new int[5];
		
		Random rand = new Random();
		
		// 配列の要素数分繰り返す
		for(int i = 0; i < array.length; i++) {
			array[i] = rand.nextInt(11);
		}
		
		// 配列内の値を順番に表示
		for(int value : array) {
			System.out.println(value + " ");
		}
	}

}
