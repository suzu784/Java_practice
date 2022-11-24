package algorithm2;

import java.util.Scanner;

public class SumOf {
	
	// 総和を求めるには繰り返し処理を行う必要がある
	// 最小値と最大値が決まっていない場合は条件式を使う

	public static int sumOf(int a, int b) {
		int min, max;
		
		if(a < b) {
			min = a; max = b;
		} else {
			min = b; max = a;
		}
		
		int sum = 0;
		for(int i = min; i <= max; i++) {
			sum += i;
		}
		
		return sum;
		
	}
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("全整数の総和を求める");
		int a = sc.nextInt();
		int b = sc.nextInt();
		
		System.out.println(sumOf(a, b));
	}

}
