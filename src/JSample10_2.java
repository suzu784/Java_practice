
public class JSample10_2 {

	public static void main(String[] args) {
		for (int i = 1; i < 10; i++) {
			// 条件に合致したときにその中身の処理を飛ばす
			if (i % 3 == 0) {
				continue;
			}
			
			System.out.println("i = " + i);
		}
		
		System.out.println("End");

	}

}
