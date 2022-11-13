
public class ctest14 {

	public static void main(String[] args) {
		G sample = new G();
	}
}

class D {
	D() {
		System.out.println("クラスDのコンストラクター");
	}
}

class F extends D {
	F() {
		System.out.println("クラスFのコンストラクター");
	}
}

class G extends F {
	G() {
		System.out.println("クラスGのコンストラクター");
	}
}
