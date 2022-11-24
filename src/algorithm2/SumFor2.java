package algorithm2;

import java.util.Scanner;

public class SumFor2 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n;
		
		do {
			System.out.println("nの値：");
			n = sc.nextInt();
		} while(n <= 0);
		
		int sum = 0;
		
		for(int i = 1; i <= n; i++) {
			sum += i;
		}

		System.out.println(sum);
	}

}
