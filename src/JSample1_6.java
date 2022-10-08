
public class JSample1_6 {

	public static void main(String[] args) {
		int eigo = 78;
		int suugaku = 90;
		int kokugo = 68;
		
		check("英語", eigo);
		check("数学", suugaku);
		check("国語", kokugo);

	}
	
	private static void check(String kyoka, int seiseki) {
		System.out.println(kyoka + "の試験結果は");
		if (seiseki > 80) {
			System.out.println("合格です");
		} else {
			System.out.println("不合格です");
		}
	}

}
