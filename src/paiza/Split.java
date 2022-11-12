package paiza;

public class Split {

	public static void main(String[] args) {
		String str = "apple, orange, lemon";
		System.out.println("str:" + str);
		
		String[] fruits = str.split(",");
		for(String fruit : fruits) {
			System.out.println(fruit);
		}
	}

}
