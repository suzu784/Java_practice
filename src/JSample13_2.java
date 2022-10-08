import java.util.Arrays;

public class JSample13_2 {

	public static void main(String[] args) {
		int[] src = {12, 24, 18, 35, 21};
		int[] dst = Arrays.copyOfRange(src, 1, 4);
		
		System.out.println(Arrays.toString(src));
		System.out.println(Arrays.toString(dst));
	}

}
