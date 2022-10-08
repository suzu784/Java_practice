
public class JSample1_7 {

	public static void main(String[] args) {
		try {
			int[] n = {18, 29, 36};
			
			for (int i = 0; i < 4; i++) {
				System.out.println(n[i]);
			}
		}
		catch(ArrayIndexOutOfBoundsException e) {
			System.out.println("終了");
		}
		System.out.println("終了しました");
	}

}
