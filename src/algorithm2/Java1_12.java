package algorithm2;

public class Java1_12 {

	public static void main(String[] args) {
		System.out.print("   |");
		for(int i = 1; i <= 9; i++)
			System.out.printf("%3d", i);
		System.out.println("\n---+-----------------------------");
		
		for(int i = 1; i <= 9; i++) {
			for(int j = 1; j <= 9; j++) {
				if(j == 1) {
					System.out.print(" " + i);
					System.out.print(" |");
				}
				System.out.printf("%3d", i + j);
			}
			System.out.println();
		}

	}

}
