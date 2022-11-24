package algorithm2;

import java.util.Scanner;

public class Java1_13 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("正方形を表示します");
		System.out.print("辺の長さ：");
		
		int num = sc.nextInt();
		
		for(int i = 1; i <= num; i++) {
			for(int j = 1; j <= num; j++) {
				System.out.print("*");
			}
			System.out.println();
		}

	}

}
