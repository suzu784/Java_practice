
public class JSample7_2 {

	public static void main(String[] args) {
		int[][] num = new int[2][];
		
		num[0] = new int[3];
		num[0][0] = 78;
		num[0][1] = 64;
		num[0][2] = 59;
		
		num[1] = new int[3];
		num[1][0] = 58;
		num[1][1] = 92;
		num[1][2] = 82;
		
		for (int i = 0; i < 2; i++) {
			for (int j = 0; j < 3; j++) {
				System.out.println("num[" + i + "][" + j + "] = " + num[i][j]);
			}
		}

	}

}
