package algorithm2;

import java.util.Scanner;

public class Java3_3 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("要素数は：");
		
		int num = sc.nextInt();
		int[] x = new int[num];
		int[] y = new int[num];
		
		for(int i = 0; i < num; i++) {
			System.out.print("x[" + i + "] :");
			x[i] = sc.nextInt();
		}
		System.out.print("探す値は：");
		int ky = sc.nextInt();
		
		int count = searchIdx(x, num, ky, y);
		
		if(count == 0) {
			System.out.println("その値の要素は存在しません");
		} else {
			for(int i = 0; i < count; i++) {
				System.out.println("その値は" + "x[" + y[i] + "]にあります");
			}
		}

	}
	
	public static int searchIdx(int[] a, int n, int key, int[] idx) {
		int counter = 0;
		for(int i = 0; i < n; i++) {
			if(a[i] == key) {
				idx[counter++] = i;
			}
		}
		return counter;
	}

}
