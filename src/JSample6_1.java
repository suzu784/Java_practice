
public class JSample6_1 {

	public static void main(String[] args) {
		int num = 1;
		
		while(true) {
			System.out.println("num = " + num);
			num *= 2;
			
			if (num > 10) {
				break;
			}
			
		}
		System.out.println(num);
		

	}

}
