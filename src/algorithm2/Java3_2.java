package algorithm2;

import java.util.Scanner;

public class Java3_2 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("要素数は:");
		
		int num = sc.nextInt();
		int[] x = new int[num];
		
		for(int i = 0; i < num; i++) {
			x[i] = sc.nextInt();
		}
		
		System.out.print("探す値は:");
		int ky = sc.nextInt();
		seqSearch(x, num, ky);
	}
	
	public static int seqSearch(int[] a, int n, int key) {
		System.out.print("   |");
		for(int i = 0; i < n; i++) {
			System.out.printf("%4d", i);
		}
		System.out.println();
		
		System.out.print("---+");
		for(int i = 0; i < 4 * n + 2; i++) {
			System.out.print("-");
		}
		System.out.println();
		
		for(int i = 0; i < n; i++) {
			System.out.printf("   |");
			System.out.printf(String.format("%%%ds*\n", (i * 4) + 3), "");
			System.out.printf("%3d|", i);
			for(int j = 0; j < n; j++) {
				System.out.printf("%4d", a[j]);
			}
			System.out.println("\n   |");
			if(a[i] == key) {
				return i;
			}
		}
		return -1;
	}

}
