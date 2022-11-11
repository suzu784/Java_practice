package paiza;

import java.util.Scanner;

public class Q114 {

	public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("数字を入力してください");
        int N = sc.nextInt();
        for (int i = 0; i < N; i++) {
            String token1 = sc.next();
            String token2 = sc.next();
            System.out.println("hello = " + token1 + " , world = " + token2);
        }

	}

}
