package algorithm2;

import java.util.Scanner;

public class Java1_14 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("直角二等辺三角形の表示");
		int n = sc.nextInt();
		triangleRB(n);
		triangleRU(n);
		triangleLU(n);
		triangleLB(n);

	}
	
	public static void triangleRB(int n) {
		for(int i = 1; i <= n; i++) {
			for(int j = 1; j <= i; j++) {
				System.out.print("*");
			}
			System.out.println();
		}
	}
	
	public static void triangleRU(int n) {
		for(int i = 1; i <= n; i++) {
			for(int j = n; j >= i; j--) {
				System.out.print("*");
			}
			System.out.println();
		}
	}
	
	public static void triangleLU(int n) {
		for(int i = 1; i <= n; i++) {
			for(int j = 1; j <= i - 1; j++) {
				System.out.print(" ");
			}
			for(int j = 1; j <= n - i + 1; j++) {
				System.out.print("*");
			}
			System.out.println();
		}
	}
	
	public static void triangleLB(int n) {
		for(int i = 1; i <= n; i++) {
			for(int j = 1; j <= n - i; j++) {
				System.out.print(" ");
			}
			for(int j = 1; j <= i; j++) {
				System.out.print("*");
			}
			System.out.println();
		}
	}

}
