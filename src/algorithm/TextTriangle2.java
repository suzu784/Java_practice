package algorithm;

public class TextTriangle2 {

	public static void main(String[] args) {
		int n = 10; // 繰り返しの数
		 for(int i = 0; i < n; i++) {
			 for(int j = 0; j < n - i; j++) {
				 System.out.print("●");
			 }
			 System.out.println();
		 }
	}

}
