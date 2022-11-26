
public class JSample8_8 {

	public static void main(String[] args) {
		System.out.println(plus(10, 7));
		System.out.println(plus(3.2, 4));
		System.out.println(plus(7, 1.223));
		System.out.println(plus(5.08, 2.4));

	}
	
	private static int plus(int n1, int n2) {
		System.out.println("int + int");
		return n1 + n2;
	}
	
	private static double plus(int n1, double d1) {
		System.out.println("int + double");
		return n1 + d1;
	}
	
	private static double plus(double d1, int n1) {
		System.out.println("double + int");
		return n1 + d1;
	}
	
	private static double plus(double d1, double d2) {
		System.out.println("double + double");
		return d1 + d2;
	}

}
