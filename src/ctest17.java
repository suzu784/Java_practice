
public class ctest17 {

	public static void main(String[] args) {
		I sample = new I();
	}
}

class H {
	H() {
		System.out.println("クラスHのコンストラクタ");
	}
	
	H(int num) {
		System.out.println("クラスHの引数有りコンストラクタ");
	}
}

class I extends H {
	I() {
		super(10);
		System.out.println("クラスIのコンストラクタ");
	}
}