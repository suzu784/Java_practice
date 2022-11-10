package algorithm;

public class Q021 {

	public static void main(String[] args) {
		int n = 20;
		
		for(int i = 1; i <= n; i++) {
			if(i % 3 == 0) {
				System.out.print("?");
			} else {
				System.out.print(i);
			}
			
			if(i != 20) {
				System.out.print(",");
			}
		}

	}

}
