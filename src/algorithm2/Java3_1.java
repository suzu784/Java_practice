package algorithm2;

import java.util.Scanner;

public class Java3_1 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("要素数：");
		
		int num = sc.nextInt();
		int[] x = new int[num + 1];
		
		for(int i = 0; i < num; i++) {
			System.out.print("x[" + i + "] = ");
			x[i] = sc.nextInt();
		}
		
		System.out.print("探す値；");
		int ky = sc.nextInt();
		
		int idx = seqSearchSen(x, num, ky);
		
		if(idx == -1) {
			System.out.println("その値の要素は存在しません");
		} else {
			System.out.println("その値はx[" + idx + "]にあります");
		}

	}
	
	public static int seqSearchSen(int[] a, int n, int key) {
		int i;
		a[n] = key;
		
		for(i = 0; a[i] != key; i++) {
		}
		return i == n ? -1 :i;
	}
}
