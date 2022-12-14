package algorithm2;

public class PrimeNumber2 {
	
	// nが素数であるかどうかの判定は、そこまでに蓄えられた素数で除算を行う

	public static void main(String[] args) {
		int counter = 0;
		int ptr = 0;
		int[] prime = new int[500];
		
		prime[ptr++] = 2;
		
		for(int n = 3; n <= 1000; n += 2) {
			int i;
			for(i = 1; i < ptr; i++) {
				counter++;
				if(n % prime[i] == 0) {
					break;
				}
			}
			if(ptr == i) {
				prime[ptr++] = n;
			}
		}
		
		for(int i = 0; i < ptr; i++) {
			System.out.println(prime[i]);
		}
		
		System.out.println("除算を行なった回数:" + counter);
	}

}
