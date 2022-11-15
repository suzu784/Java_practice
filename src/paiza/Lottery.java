package paiza;

import java.util.Scanner;

public class Lottery {
	
	// Mathクラスのabsメソッドを使用すると、絶対値を取得することができる
	// 当選番号と宝くじの番号の下四桁が一致しているかどうかは、両者を10000で割った余りを比較する

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("宝くじの当選発表");
		
		int b = sc.nextInt();
		
		int n = sc.nextInt();
		for(int i = 0; i < n; i++) {
			int a = sc.nextInt();
			
			String result = "blank";
			if(a == b) {
				result = "first";
			} else if(Math.abs(a - b) == 1) {
				result = "adjacent";
			} else if(a % 10000 == b % 10000) {
				result = "second";
			} else if(a % 1000 == b % 1000) {
				result = "third";
			}
			
			System.out.println(result);
		}

	}

}
