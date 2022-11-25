package algorithm2;

import java.util.Arrays;
import java.util.Scanner;

public class Java2_2 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("要素数は；");
		
		int num = sc.nextInt();
		int[] x = new int[num];
		
		for(int i = 0; i < num; i++) {
			System.out.print("x[" + i + "] : ");
			x[i] = sc.nextInt();
		}
		
		reverse(x);
		System.out.println("反転が終了しました");
	}
	
	public static void swap(int[] a, int idx1, int idx2) {
		int t = a[idx1]; a[idx1] = a[idx2]; a[idx2] = t;
	}
	
	public static void reverse(int[] a) {
		System.out.println(Arrays.toString(a));
		for(int i = 0; i < a.length / 2; i++) {
			System.out.println("a[" + i + "]とa[" + (a.length - i - 1) + "]を交換します。");
			swap(a, i, a.length - i - 1);
			System.out.println(Arrays.toString(a));
		}
	}

}
