package algorithm2;

import java.util.Scanner;

public class SeqSearch {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("要素数：");
		
		int num = sc.nextInt();
		int[] x = new int[num];
		
		for(int i = 0; i < num; i++) {
			System.out.print("x[" + i + "] = ");
			x[i] = sc.nextInt();
		}
		
		System.out.print("探す値；");
		int ky = sc.nextInt();
		
		int idx = seqSearch(x, num, ky);
		
		if(idx == -1) {
			System.out.println("その値の要素は存在しません");
		} else {
			System.out.println("その値はx[" + idx + "]にあります");
		}

	}
	
	public static int seqSearch(int[] a, int n, int key) {
		int i = 0;
		
		while(true) {
			if(i == n) {
				return -1;
			}
			if(a[i] == key) {
				return i;
			}
			i++;
		}
	}

}
