package algorithm;

public class ArgoMax {
	
	// 総当たりで対戦して最後まで勝ち残ったデータが本当の最大値になる

	public static void main(String[] args) {
		int[] data = {30, 60, 70, 90, 20};
		System.out.println(max(data));
	}
	
	public static int max(int[] data) {
		int max = data[0];
		for(int i = 1; i < data.length; i++) {
			if(max < data[i]) {
				max = data[i];
			}
		}
		return max;
	}

}
