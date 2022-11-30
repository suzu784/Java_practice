import java.util.Random;

public class JSample2_9 {
	
	// 左、右のどららから昇順にソートするかによって入れ子の構造が異なる
	
	static void sort(int[] array) {
		for(int i = 0; i < array.length; i++) {
			for(int j = array.length - 1; j > i; j--) {
				if(array[j - 1] > array[j]) {
					int tmp = array[j - 1];
					array[j - 1] = array[j];
					array[j] = tmp;
				}
			}
		}
	}
	
	static void print(int[] array) {
		for(int i = 0; i < array.length; i++) {
			if(i != 0) {
				System.out.print(" ");
			}
			System.out.print(array[i]);
		}
		System.out.println();
	}

	public static void main(String[] args) {
		Random r = new Random();
		int[] array = new int[8];
		for(int i = 0; i < array.length; i++) {
			array[i] = r.nextInt(30);
		}
		
		print(array);
		sort(array);
		print(array);

	}

}
