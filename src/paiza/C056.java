package paiza;

import java.util.Scanner;

public class C056 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
        int line = sc.nextInt();
        
        for(int i = 0; i <= line; i++) {
        	int token1 = sc.nextInt();
        	int token2 = sc.nextInt();
        	int sum =  token1 - 5 * token2;
			if(sum >= 25) {
				System.out.println(i);
			}
        }

	}

}
