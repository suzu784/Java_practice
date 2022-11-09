package algorithm;

public class Q008 {

	public static void main(String[] args) {
		int row = 5;
		int col = 7;
		
		for(int i = 0; i < row; i++) {
			for(int j = 0; j < col; j++) {
				if(j % 2 == 0) {
					System.out.print("■");
				} else {
					System.out.print(" ");
				}
			}
			System.out.println();
		}

	}

}
