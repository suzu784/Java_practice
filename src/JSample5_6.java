
public class JSample5_6 {

	public static void main(String[] args) {
		int lastNum = 0;
		
		for (int i = 0; i < 5; i++) {
			int newNum;
			do {
				newNum = (int)Math.ceil(Math.random() * 10);
			} while (newNum == lastNum);
			
			System.out.println(newNum);
			// 表示する乱数は続けて同じ値が表示されないようにしている
			lastNum = newNum;
		}

	}

}
