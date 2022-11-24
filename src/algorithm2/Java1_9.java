package algorithm2;

import java.util.Scanner;

public class Java1_9 {
	
	// breakは繰り返しを抜けることができる

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("aの値");
		int a = sc.nextInt();
		int b;
		
		while(true) {
			System.out.println("bの値");
			b = sc.nextInt();
			if(b > a) break;
			System.out.println("aより大きな値を入力せよ");
		}
		
		int num = b - a;
		
		System.out.println("b - aは" + num + "です");
	}

}
