
public class JSample1_5 {

	public static void main(String[] args) {
		int[] point = {75, 94, 68};
		String[] name = {"鈴木", "本田", "遠藤"};
		
		for (int i = 0; i < 3; i++) {
			System.out.println(name[i] +  "さんは");
			
			if (point[i] > 90) {
				System.out.println("判定Aです");
			} else if (point[i] > 70) {
				System.out.println("判定Bです");
			} else {
				System.out.println("判定Cです");
			}
		}

	}

}
