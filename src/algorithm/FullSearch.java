package algorithm;

import java.util.Scanner;

public class FullSearch {
	
	// 全探索とはありうる回答をすべてfor文のネストで調べること
	// 整数Nが与えられるので、Nが１以上9以下の整数の積で表せるかどうか判定

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("全探索を始めます");
		int N = sc.nextInt();
		
		// Nが条件に合致するかどうかのフラグ
		boolean flg = false;
		
		for(int i = 1; i <= 9; i++) {
			for(int j = 1; j <= 9; j++) {
				if(i * j == N) {
					flg = true;
					break;
				}
			}
			if(flg) {
				break;
			}
		}
		
		if(flg) {
			System.out.println("Yes");
		} else {
			System.out.println("No");
		}

	}

}
