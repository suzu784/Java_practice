package algorithm2;

import java.util.Scanner;

public class Java6_1 {
	
	static void swap(int[]a, int idx1, int idx2) {
		int t = a[idx1]; a[idx1] = a[idx2]; a[idx2] = t;
	}
	
	static void bubbleSort(int[]a, int n) {
		for(int i = n - 1; i > 0; i--) {
			for(int j = 0; j < i ; j++) {
				if(a[j] > a[j + 1]) {
					swap(a, j, j + 1);
				}
			}
		}
	}

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.println("単純交換ソート");
		System.out.print("要素数：");
		int nx = sc.nextInt();
		int[] x = new int[nx];
		
		for(int i = 0; i < nx; i++) {
			System.out.println("x[" + i + "]:");
			x[i] = sc.nextInt();
		}
		
		bubbleSort(x, nx);  // 配列xを単純交換ソート
		
		System.out.println("降順にソートしました");
		for(int i = 0; i < nx; i++) {
			System.out.println("x[" + i + "] ==" + x[i]);
		}

	}

}
