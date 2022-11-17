package paiza;

import java.util.Scanner;

public class BinarySearch {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int[] a = {2,10,11,12,39,43,45,52,57,63,65,66,73,76,83,97};
		System.out.println("データを入力してください");
		int x = sc.nextInt();
		int pos = -1;
		int lower = 0;
		int upper = a.length - 1;
		while(lower <= upper) {
			int mid = (lower + upper) / 2;
			if(a[mid] == x) {
				pos = mid;
				break;
			} else if(a[mid] < x) {
				lower = mid + 1;
			} else {
				upper = mid - 1;
			}
		}
		if(pos < 0) {
			System.out.println("見つかりません");
		} else {
			System.out.println(x + "は" + pos + "番目です");
		}

	}

}
