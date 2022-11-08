package algorithm;

public class SortSelection {
	
	// 指定範囲の中の最小値もしくは最大値を探索し、それと入れ替えること
	// 最初の繰り返しで、最小値との入れ替え
	// 内部の繰り返しで、最小値の探索を行う

	public static void main(String[] args) {
		int[] data = {30, 60, 70, 90, 20};
		sort(data);
		for(int element : data) {
			System.out.println(element + "");
		}
	}

	public static void sort(int[] data) {
		for(int i = 0; i < data.length - 1; i++) {
			int min = i;
			for(int j = i + 1; j < data.length; j++) {
				if(data[j] < data[min]) {
					min = j;
				}
			}
			int temp = data[i];
			data[i] = data[min];
			data[min] = temp;
			
		}
	}
}
