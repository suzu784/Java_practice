
public class JSample2_8 {

	public static void main(String[] args) {
		JSample2_8 js = new JSample2_8();
		
		js.test(15, 21);
		
		System.out.println("------------------------");
		
		js.test(154, 195);

	}
	
	private void test(int a, int b) {
		System.out.println(a + "と" + b + "の最大公約数は" + gcdOf(a, b));
	}
	
	private int gcdOf(int a, int b) {
		int p;
		int q = a;
		int r = b;
		
		if(a < b) {
			q = b;
			r = a;
		}
		
		do {
			p = q;
			q = r;
			r = p % q;
		} while(r > 0);
		
		return q;
	}

}
