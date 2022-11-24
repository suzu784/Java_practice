package algorithm2;

import java.util.Scanner;

public class Java1_10 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("桁数を表示するプログラム");
		int num = sc.nextInt();

		if(num < 1000 && num >= 100 ) {
			System.out.println("その数は3桁です");
		} else if(num < 10000 && num >= 1000) {
			System.out.println("その数は4桁です");
		} else {
			System.out.println("範囲外です");
		}
	}

}
