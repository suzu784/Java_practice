import java.util.Random;

public class Jsample7_5 {

	public static void main(String[] args) {
		int num;
		Random rand = new Random();
		
		System.out.println("6が出たら終わりです");
		
		while(true) {
			num = rand.nextInt(6) + 1;
			System.out.println("no = " + num);
			if(num == 6) break;
		}
	}

}
