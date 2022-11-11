package paiza;

import java.util.Scanner;

public class C084 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("文字を入力してください");
        String line = sc.nextLine();
        int wordNum = line.length() + 2;
        
        for(int i = 0; i < wordNum; i++) {
        	System.out.print("+");
        }
        System.out.println();
        System.out.println("+" + line + "+");
        
        for(int i = 0; i < wordNum; i++) {
        	System.out.print("+");
        }
	}
}
