package algorithm2;

import java.util.Scanner;

public class Hanoi {
	
	static void move(int no, int x, int y) {
		if(no > 1) {
			move(no - 1, x, 6 - x - y);
		}
		System.out.printf("円盤[%d]を%d軸から%d軸へ移動\n", no, x, y);
		if(no > 1) {
			move(no - 1, 6 - x - y, y);
		}
	}

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.println("ハノイの塔");
		System.out.print("円盤の枚数:");
		int n = sc.nextInt();
		
		move(n, 1, 3);
	}

}
