
public class JSample5_7 {

	public static void main(String[] args) {
		Randamer r = new Randamer(10);
		
		for (int i = 0; i < 5; i++) {
			System.out.println(r.getNum());
		}

	}

}

class Randamer {
	private int maxNum;
	private int lastNum;
	
	public Randamer(int maxNum) {
		this.maxNum = maxNum;
		lastNum = 0;
	}
	
	public int getNum() {
		int newNum;
		do {
			newNum = (int)Math.ceil(Math.random() * 10);
		} while (newNum == lastNum);
		
		// lastNumの値がここで上書きされる
		lastNum = newNum;
		return lastNum;
	}
}
