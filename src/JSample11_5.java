
public class JSample11_5 {

	public static void main(String[] args) {
		int num = 10;
		
		// ラッパークラスのオブジェクトに変換した後に各ラッパークラスで用意されているtoStringメソッドを使用
		Integer i = Integer.valueOf(num);
		String str = i.toString();

	}

}
