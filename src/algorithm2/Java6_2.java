package algorithm2;

import java.util.Scanner;

public class Java6_2 {
	
	// forにて左右のどちらからでもソートできる
	static int counter = 0;
	static int exchange = 0;
	
	
	static void swap(int[] a, int idx1, int idx2) {
		int t = a[idx1]; a[idx1] = a[idx2]; a[idx2] = t;
	}
	
	static void bubbleSort(int[]a, int n) {

		for(int i = 0; i < n - 1; i++) {
			for(int j = n - 1; j > n - 1; j--) {
				System.out.print(a[j]);
				if(a[j - 1] > a[j]) {
					swap(a, j - 1, j);
					exchange++;
				}
				counter++;
			}
		}
		
	}

	static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.println("単純交換ソート");
		System.out.print("要素数：");
		int nx = sc.nextInt();
		int[] x = new int[nx];
		
		for(int i = 0; i < nx; i++) {
			System.out.print("x[" + i + "]:");
			x[i] = sc.nextInt();
		}
		
		bubbleSort(x, nx);  // 配列xを単純交換ソート
		
		System.out.println("比較は" + counter + "回でした");
		System.out.println("交換は" + exchange + "回でした");

	}

}
