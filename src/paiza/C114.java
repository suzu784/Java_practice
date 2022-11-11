package paiza;

import java.util.Scanner;

public class C114 {

	public static void main(String[] args) {
		// 判定文がいる(末尾と先頭が一致しているか)
		// 最初に数字を入力し、その回数文ループにて回す
		Scanner sc = new Scanner(System.in);
		System.out.println("数字を入力してください");
        int line = sc.nextInt();
                
        for(int i = 0; i < line; i++) {
            Scanner scn = new Scanner(System.in);
            String a = scn.nextLine();
            String b = scn.nextLine();
            String aLast = a.substring(a.length() - 1);
            String bFirst = b.substring(0, 1);
            
            if(!aLast.equals(bFirst)) {
            	System.out.print(aLast);
            	System.out.print(" ");
            	System.out.print(bFirst);
            	System.exit(0);
            }
        }
        System.out.println("Yes");
	}

}
