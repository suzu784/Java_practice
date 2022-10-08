
public class JSample4_3 {

	public static void main(String[] args) {
		int num = 8;
		int[] array = {10, 4};
		
		System.out.println("num = " + num);
		System.out.println("array[0] = " + array[0]);
		
		henkou(num, array);
		
		System.out.println("num = " + num);
		System.out.println("array[0] = " + array[0]);
	}
	
	private static void henkou(int num, int array[]) {
		num = 5;
		array[0] = 12;
	}

}
