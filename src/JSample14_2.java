import java.util.Arrays;

public class JSample14_2 {

	public static void main(String[] args) {
		int[] src = {12, 24, 18, 35, 21};
		
		// 配列の要素に格納された値を使って配列を文字列で表現したものを取得できる
		System.out.println(Arrays.toString(src));
		
		Arrays.sort(src);
		System.out.println(Arrays.toString(src));
		
		for (int f = 0, l = src.length -1; f < l; f++, l--) {
			int temp = src[f];
			src[f] = src[l];
			src[l] = temp;
		}
		
		System.out.println(Arrays.toString(src));

	}

}
