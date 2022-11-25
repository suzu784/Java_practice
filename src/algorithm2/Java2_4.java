package algorithm2;

import java.util.Scanner;

public class Java2_4 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("配列bの全要素を配列aにコピーする");
		int num = sc.nextInt();
		
		int[] a = new int[num];
		int[] b = new int[num];
		
		for(int i = 0; i < num; i++) {
			a[i] = sc.nextInt();
			b[i] = sc.nextInt();
		}
		copy(a, b);
		
		for(int i = 0; i < num; i++) {
			System.out.println(a[i]);
			System.out.println(b[i]);
		}
	}
	
	public static void copy(int[] a, int[] b) {
		for(int i = 0; i < a.length; i++) {
			a[i] = b[i];
		}
	}

}
