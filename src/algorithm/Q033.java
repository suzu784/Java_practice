package algorithm;

public class Q033 {
	
	// 線形探索は最も基本的なアルゴリズム

	public static void main(String[] args) {
		String[] a = {"abc", "abcd", "abcde", "xx", "yyy"};
		String key = "yyy";
		
		int i;
		for(i = 0; i < a.length; i++) {
			if(a[i].equals(key)) {
				break;
			}
		}
		
		if(i < a.length) {
			System.out.println(a[i]);
		} else {
			System.out.println("Not Found");
		}
		

	}

}
