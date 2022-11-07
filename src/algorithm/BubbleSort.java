package algorithm;

public class BubbleSort {
	
	// 隣り合う者同士を比較し、交換して並び替える

	public static void main(String[] args) {
		int[] data = {1, 4, 2, 5, 3};
		sort(data);
		for(int element : data) {
			System.out.println(element + "");
		}
	}
	
	public static void sort(int[] data) {
		for(int i = data.length - 1; i > 0; i--) {
			for(int j = 0; j < i; j++) {
				if(data[j] > data[j + 1]) {
					int tmp = data[j + 1];
					data[j + 1] = data[j];
					data[j] = tmp;
				}
			}
		}
	}

}
