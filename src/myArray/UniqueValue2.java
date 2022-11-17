package myArray;

import java.util.Random;

public class UniqueValue2 {

	public static void main(String[] args) {
		Random rand = new Random();
		boolean isUnique = true;
		
		int[] array = new int[5];
		int count = 0;
		
		while(count < 5) {
			int n = rand.nextInt(11);
			for(int i = 0; i < count; i++) {
				if(array[i] == n) {
					isUnique = false;
					break;
				} else {
					isUnique = true;
				}
			}
			if(isUnique == true) {
				array[count] = n;
				count++;
			}
			
		}
		
		for(int num : array) {
			System.out.println(num + " ");
		}

	}

}
