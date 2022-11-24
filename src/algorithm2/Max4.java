package algorithm2;

public class Max4 {

	public static int max4(int a, int b, int c, int d) {
		int max = a;
		
		if(max < b) {
			max = b;
		}
		
		if(max < c) {
			max = c;
		}
		
		if(max < d) {
			max = d;
		}
		
		return max;
	}
}
