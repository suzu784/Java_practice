package algorithm;

public class Q009 {
	
	// 2回目の繰り返しでは変数jは初期化される

	public static void main(String[] args) {
		int row = 6;
		int col = 10;
		
		for(int i = 0; i < row; i++) {
			int x = i % 2;
			for(int j = 0; j < col; j++) {
				if(j % 2 == x) {
					System.out.print("■");
				} else {
					System.out.print(" ");
				}
			}
			System.out.println();
		}

	}

}
