package algorithm2;

import java.util.Scanner;

public class Factorial {
	
	// 階乗値を再帰的に求める
	
	static int factorial(int n) {
		if(n > 0) {
			return n * factorial(n - 1);
		} else {
			return 1;
		}
	}

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("整数を入力せよ:");

		int x = sc.nextInt();
		
		System.out.println(x + "の階乗は" + factorial(x) + "です");
	}
	
}
