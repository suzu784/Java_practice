package algorithm2;

import java.util.Random;
import java.util.Scanner;

public class MaxOfArrayRand {

	public static void main(String[] args) {
		Random rand = new Random();
		Scanner sc = new Scanner(System.in);
		
		System.out.println("身長の最大値を求めます");
		System.out.print("人数は：");
		
		int num = sc.nextInt();
		
		int[] height = new int[num];
		
		for(int i = 1; i < num; i++) {
			height[i] = 100 + rand.nextInt(90);
		}
		
		System.out.println("最大値は" + maxOf(height) + "です");
		
	}
	
	public static int maxOf(int[] a) {
		int max = a[0];
		for(int i = 1; i < a.length; i++) {
			if(a[i] > max) {
				max = a[i];
			}
		}
		return max;
	}

}
