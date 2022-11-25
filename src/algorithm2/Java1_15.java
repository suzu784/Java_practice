package algorithm2;

import java.util.Scanner;

public class Java1_15 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("ピラミッドの作成");
		int num = sc.nextInt();
		spira(num);
	}
	
	public static void spira(int num) {
		for(int i = 1; i <= num; i++) {
			for(int j = 1; j <= num - i ; j++) {
				System.out.print(" ");
			}
			for(int j = 1; j <= (i - 1) * 2 + 1; j++) {
				System.out.print("*");
			}
			System.out.println();
		}
	}

}