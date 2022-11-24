package algorithm2;

import java.util.Scanner;

public class Digits {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int num;
		
		do {
			System.out.println("数字を入力してください");
			num = sc.nextInt();
		} while(num <= 0);
		
		int no = 0;
		while(num > 0) {
			num /= 10;
			no++;
		}
		
		System.out.println("桁数は" + no + "です");

	}

}
