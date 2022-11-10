package algorithm;

public class Q027 {

	public static void main(String[] args) {
		String[] a = {"abc", "abcd", "abced", "xx", "yyy"};
		int n = 3;
		
		for(int i = 0; i < a.length; i++) {
			if(a[i].length() <= n) {
				System.out.println(a[i]);
			}
		}

	}

}
