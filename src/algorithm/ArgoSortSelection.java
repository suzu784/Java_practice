package algorithm;

public class ArgoSortSelection {

	public static void main(String[] args) {
		int[] data = {30, 60, 70, 90, 20};
		sort(data);
		for(int element: data) {
			System.out.println(element + "");
		}

	}
	
	public static void sort(int[] data) {
		for(int i = 0; i < data.length -1; i++) {
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
