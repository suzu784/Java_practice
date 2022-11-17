package paiza;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Scanner;

public class Shiritori {
	
	// bef->before

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int n = sc.nextInt();
		int k = sc.nextInt();
		int m = sc.nextInt();
		
		HashSet<String> words = new HashSet<>();
		for(int i = 0; i < k; i++) {
			words.add(sc.next());
		}
		
		boolean[] alive = new boolean[n];
		Arrays.fill(alive, true);
		
		String bef = "";
		int player = 0;
		for(int i = 0; i < m; i++) {
			while(!alive[player]) {
				player = (player + 1) % n;
			}
			
			String s = sc.next();
			boolean violateRule13 = !words.contains(s);
			boolean violateRule2 =
				bef != "" && bef.charAt(bef.length() -1) != s.charAt(0);
			boolean violateRule4 = s.charAt(s.length() - 1) == 'z';
			if(violateRule13 || violateRule2 || violateRule4) {
				alive[player] = false;
				bef = "";
			} else {
				words.remove(s);
				bef = s;
			}
			
			player = (player + 1) % n;
		}
		
		int aliveCount = 0;
		for(int i = 0; i < n; i++) {
			if(alive[i]) {
				System.out.println(i + 1);
			}
		}

	}

}
