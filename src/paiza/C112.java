package paiza;

import java.util.Scanner;

public class C112 {

	public static void main(String[] args) {
		// 国A　24時間
		// 国B　20時間(滞在時間が短い)
		// 国C　31時間(滞在時間が長い)
		
		Scanner sc = new Scanner(System.in);
		System.out.println("滞在日数を入力してください");
        int line = sc.nextInt();
        int min = 24; 
        int max = 24;
        
        for(int i = 0; i < line; i++) {
        	int token1 = sc.nextInt();
        	int token2 = sc.nextInt();
        	int token3 = 24 - sc.nextInt();
        	int sum = token1 + token2 + token3;
        	if(sum < min) {
        		min = sum;
        	} else if(sum > max) {
        		max = sum;
        	} 
        }
        
        System.out.println(min);
        System.out.println(max);

	}

}

