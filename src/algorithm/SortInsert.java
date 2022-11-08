package algorithm;

public class SortInsert {

	public static void main(String[] args) {
		int[] data = {30, 60, 70, 90, 20};
		sort(data);
		for(int element : data) {
			System.out.println(element + "");
		}
	}
	
	public static void sort(int[] data) {
		for(int i = 1; i < data.length; i++) {
			int tmp = data[i];
			int j = i;
			while(j > 0 && tmp < data[j - 1]) {
				data[j] = data[j - 1];
				j--;
			}
			data[j] = tmp;
		}
	}

}
