
public class JSample8_7 {
	
	// Math.random 乱数を生成することができる
	// 1から10までの整数をランダムで取得したい場合は、取得した乱数の値を10倍し、切り上げる

	public static void main(String[] args) {
		for(int i = 0; i < 10; i++) {
			System.out.println((int) Math.ceil(Math.random() * 5) + 5);
		}

	}

}
