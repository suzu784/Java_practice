package algorithm;

public class Q032 {

	public static void main(String[] args) {
		int[] array = {68, 55, 72, 93, 87};
		int min = 80; // 最小値
		int max = 100; // 最大値
		
		int sum = 0;
		
		for(int i = 0; i <= array.length; i++) {
			if(min <= array[i] && array[i] <= max) {
				sum += array[i];
			}
		}
		System.out.println(sum);

	}

}
