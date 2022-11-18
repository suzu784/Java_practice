package paiza;

import java.util.Arrays;
import java.util.Scanner;

public class LongTable {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int n = sc.nextInt();
		int m = sc.nextInt();
		
		boolean[] vacant = new boolean[n];
		Arrays.fill(vacant, true);
		
		int answer = 0;
		for(int i = 0; i < m; i++) {
			int a = sc.nextInt();
			int b = sc.nextInt();
			
			boolean ableToSit = true;
			for(int j = 0; j < a; j++) {
				if(!vacant[(b + j) % n]) {
					ableToSit = false;
				}
			}
			
			if(!ableToSit) continue;
			
			answer += a;
			
			for(int j = 0; j < a; j++) {
				vacant[(b + j) % n] = false;
			}
		}

		System.out.println(answer);
	}

}
