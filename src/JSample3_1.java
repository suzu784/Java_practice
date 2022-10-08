
public class JSample3_1 {

	public static void main(String[] args) {
		int num1, num2;
		
		num1 = 10;
		num2 = 8;
		keisan(num1, num2);
		
		num1 = 23;
		keisan(num1, 7);
		
		keisan(15, 22);

	}
	
	private static void keisan(int n1, int n2) {
		System.out.println("num1 = " + n1 + ",num2 = " + n2);
		System.out.println("num1 + num2 = " + (n1 + n2));
		System.out.println("num1 - num2 = " + (n1 - n2));
	}

}
