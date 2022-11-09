package algorithm;

public class Q023 {
	
	// elseを使うと条件に該当した時に計算が出力されなくなる

	public static void main(String[] args) {
		for(int i = 1; i <= 9; i++) {
			for(int j = 1; j <= 9; j++) {
				int ans = i * j;
				if(ans < 10) {
					System.out.print(" ");
				}
				System.out.print(ans);
				System.out.print(" ");
			}
			System.out.println();
		}

	}

}
