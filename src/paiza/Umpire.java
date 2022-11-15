package paiza;

import java.util.Scanner;

public class Umpire {
	
	// 変数にストライクとボールのカウントを用意する

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("プレイボール！");
		int n = sc.nextInt();
		int strike = 0;
		int ball = 0;
		
		for(int i = 0; i < n; i++) {
			String line = sc.next();
			if(line.equals("strike")) {
				strike += 1;
				if(strike == 3) {
					System.out.println("out!");
					break;
				}
				System.out.println("strike!");
			} else {
				ball += 1;
				if(ball == 4) {
					System.out.println("fourball!");
					break;
				}
				System.out.println("ball!");
			}
		}

	}

}
