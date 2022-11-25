package algorithm2;

import java.util.Scanner;

public class Java2_3 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("合計値を求めるプログラム");
		int num = sc.nextInt();
		
		int[] x = new int[num];
		
		for(int i = 0; i < num; i++) {
			x[i] = sc.nextInt();
		}
		System.out.println("合計値は" + sumOf(x) + "です");
	}
	
	public static int sumOf(int[] a) {
		int sum = 0;
		for(int i = 0; i < a.length; i++) {
			sum += a[i];
		}
		return sum;
	}

}
