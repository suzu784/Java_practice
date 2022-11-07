package algorithm;

public class ArgoSearchLinear {
	
	// データがバラバラの状態でも探索できる

	public static void main(String[] args) {
		int[] data = {30, 60, 70, 90, 20};
		System.out.println(search(data, 70));
	}
	
	public static int search(int[] data, int target) {
		int ret = -1;
		for(int i = 0; i < data.length; i++) {
			if(target == data[i]) {
				ret = i + 1;
			}
		}
		return ret;
	}
}
