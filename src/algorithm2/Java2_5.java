package algorithm2;

import java.util.Scanner;

public class Java2_5 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("配列bの全要素を配列aに逆順にコピーする");
		int num = sc.nextInt();
		
		int[] a = new int[num];
		int[] b = new int[num];
		
		for(int i = 0; i < a.length; i++) {
			a[i] = sc.nextInt();
			System.out.println("a[" + i + "] =" + a[i]);
		}
		
		for(int i = 0; i < b.length; i++) {
			b[i] = sc.nextInt();
			System.out.println("b[" + i + "] =" + b[i]);
		}
		
		rcopy(a, b);
		
		System.out.println("配列bの全要素を配列aに逆順にコピーしました。");
		for(int i = 0; i < num; i++) {
			System.out.println("a[" + i + "] =" + a[i]);
		}
	}
	
	public static void rcopy(int[] a, int[] b) {
		int num = a.length <= b.length ? a.length : b.length;
		for(int i = 0; i < num; i++) {
			a[i] = b[b.length - i - 1];
		}
	}

}
