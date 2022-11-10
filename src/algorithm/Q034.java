package algorithm;

public class Q034 {

	public static void main(String[] args) {
		int[] a = {68, 55, 72, 93, 87};
		int minValue = a[0];
		int minIndex = 0;
		
		for(int i = 1; i < a.length; i++) {
			if(minValue > a[i]) {
				minValue = a[i];
				minIndex = i;
			}
		}
		System.out.println(minValue);
		System.out.println(minIndex);

	}

}
