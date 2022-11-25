package algorithm2;

public class PrimeNumber1 {
	
	// breakされていれば素数ではない

	public static void main(String[] args) {
		int counter = 0;
		
		for(int n = 2; n <= 1000; n++) {
			int i;
			for(i = 2; i < n; i++) {
				counter++;
				if(n % i == 0) {
					break;
				}
			}
			if(n == i) {
				System.out.println(n);
			}
		}
		System.out.println("除算を行なった回数：" + counter);

	}

}
