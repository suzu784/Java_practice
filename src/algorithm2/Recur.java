package algorithm2;

import java.util.Scanner;

public class Recur {
	
	static void recur(int n) {
		if(n >0) {
			recur(n - 1);
			System.out.println(n);
			recur(n - 2);
		}
	}

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.print("整数を入力せよ：");
		int x = sc.nextInt();
		
		recur(x);

	}

}