package paiza;

public class Fibonacchi {

	public static void main(String[] args) {
		int f0;
		int f1;
		int fn;
		
		f0 = 0;
		System.out.println(f0);
		
		f1 = 1;
		System.out.println(f1);
		
		for(int i = 2; i <= 10; i++) {
			fn = f0 + f1;
			System.out.println(fn);
			f0 = f1;
			f1 = fn;
		}

	}

}
