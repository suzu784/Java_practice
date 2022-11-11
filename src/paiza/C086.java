package paiza;

import java.util.Scanner;

public class C086 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("ハンドルネームを入力してください");
		
        String line = sc.nextLine();
        String rpl = line.replace("a", "").replace("e", "").replace("i", "").replace("o", "").replace("u" , "");
        System.out.println(rpl);

	}

}
