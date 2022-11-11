package paiza;

import java.util.Scanner;

public class D212 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
        System.out.print("合計したい数値を入力してください");
        int line = sc.nextInt();
        int n = 0;
        
        for(int i = 0; i < 10; i++) {
        	n += line;
        }
        System.out.print(n);
	}

}
