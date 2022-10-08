import java.util.Arrays;

public class JSample11_2 {

	public static void main(String[] args) {
		int[] a = {85, 78, 92};
		int[] b = a;
		int[] c = {85, 78, 92};
		
		
		// 多次元配列の場合は、deepEquals?を用いる
		System.out.println(a == b);
		System.out.println(a == c);
		System.out.println(b == c);
		System.out.println(Arrays.equals(a, b));
		System.out.println(Arrays.equals(a, c));
		System.out.println(Arrays.equals(b, c));

	}

}
