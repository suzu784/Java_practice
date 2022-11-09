
package algorithm;

public class Q012 {
	
	// どのタイミングで■を表示するか

	public static void main(String[] args) {
		int n = 8;
		
		for(int i = 0; i < n; i++) {
			for(int j = 0; j < n; j++) {
				if(j == i) {
					System.out.print("■");
					break;
				} else {
					System.out.print(" ");
				}
			}
			System.out.println();
		}

	}

}
