
public class GCD_3 {
	
	// 与えられた2つの自然数(正の整数)の最大公約数をユークリッド互除法で求める
	
	static int gcd(int a, int b) {

		// 両方の値が0以下なら0を戻す
		if((0 >= a) && (0 >= b)) {
			return 0;
		}
		
		// 両方の値が同じならaを戻す
		if(a == b) {
			return a;
		}
		
		// 片方の値が0以下なら0を戻す
		if((0 >= a) || (0 >= b)) {
			return Math.max(a, b);
		}
		
		// 最大公約数を求めるループ
		int r = a % b;
		while(0 != r) {
			a = b;
			b = r;
			r = a % b;
		}
		
		return b;
	}

	public static void main(String[] args) {
		
		// 2つの変数を宣言
		int a, b;
		
		// 8と12の最大公約数
		a = 8;
		b = 12;
		System.out.println(a + "と" + b + "の最大公約数は、" + gcd(a, b));
		
		// 13と4の最大公約数
		a = 13;
		b = 4;
		System.out.println(a + "と" + b + "の最大公約数は、" + gcd(a, b));
		
		// 144と32の最大公約数
		a = 144;
		b = 32;
		System.out.println(a + "と" + b + "の最大公約数は、" + gcd(a, b));
		
		// 0と10の最大公約数
		a = 0;
		b = 10;
		System.out.println(a + "と" + b + "の最大公約数は、" + gcd(a, b));
		
		// 0と0の最大公約数
		a = 0;
		b = 0;
		System.out.println(a + "と" + b + "の最大公約数は、" + gcd(a, b));

	}

}
