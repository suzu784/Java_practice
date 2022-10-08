
public class JSample3_2 {

	public static void main(String[] args) {
		disp(1);
		disp(2);
		disp(3);

	}
	
	private static void disp(int no) {
		int[] n = {18, 29, 36};
		
		try {
			System.out.println(n[no]);
		}
		catch(ArrayIndexOutOfBoundsException e) {
			System.out.println("配列の範囲を超えています");
		}
		finally {
			System.out.println("要素の出力を終了します");
		}
	}

}
