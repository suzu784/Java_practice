package algorithm2;

import java.util.Scanner;

public class SelectionSort {
	
	static void swap(int[] a, int idx1, int idx2) {
		int t = a[idx1]; a[idx1] = a[idx2]; a[idx2] = t;
	}
	
	static void selectionSort(int[] a, int n) {
		for(int i = 0; i < n - 1; i++) {
			int min = i; // 未ソート部の最小要素のインデックス
			for(int j = i + 1; j < n; j++) {
				if(a[j] < a[min]) {
					min = j;
				}
				swap(a, i, min); // 未ソート部の先頭要素と最小要素を交換
			}
		}
	}

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.println("単純選択ソート");
		System.out.print("要素数：");
		int nx = sc.nextInt();
		int[] x = new int[nx];
		
		for(int i = 0; i < nx; i++) {
			System.out.print("x[" + i + "]:");
			x[i] = sc.nextInt();
		}
		
		selectionSort(x, nx);  
		
		for(int i = 0; i < nx; i++) {
			System.out.println("x[" + i + "] = " + x[i]);
		}

	}

}
