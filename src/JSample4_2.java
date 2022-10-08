
public class JSample4_2 {

	public static void main(String[] args) {
		String msg1 = "Hello";
		String msg2 = new String(msg1);
		String msg3 = "Hello";
		
		System.out.println(msg1 == msg2);
		System.out.println(msg1.equals(msg2));
		System.out.println(msg1 == msg3);

	}

}
