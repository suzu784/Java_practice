
public class JSample2_7 {
	
	// 固定長の配列には値を追加するという方法がない
	// 追加したい分だけ配列の要素数を大きくした配列をベット用意し、値をコピーして使う

	public static void main(String[] args) {
		int[] foo = new int[10];
		int[] bar = new int[15];
		
		System.arraycopy(foo, 0, bar, 0, 10);

	}

}
