package algorithm;

public class Q031 {

	public static void main(String[] args) {
		int[] array = {68, 55, 72, 93, 87};
		int sum = 0;
		
		for(int i = 0; i <= array.length; i++) {
			sum += array[i];
		}
		
		int avg = sum / array.length;
		System.out.println(avg);

	}

}
