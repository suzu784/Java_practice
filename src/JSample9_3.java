
public class JSample9_3 {

	public static void main(String[] args) {
		for (int i = 1; i < 9; i++) {
			for (int j = 1; j < 9; j++) {
				System.out.println("i * j = " + i * j);
				
				if (i * j > 10) {
					break;
				}
			}
			
			System.out.println("Next");
		}
		
		System.out.println("End");

	}

}
