package paiza;

import java.util.Scanner;

public class AverageInterval2 {
	
	// 配列のインデックス番号の範囲外にアクセスできない
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("日別訪問者数の最大平均区間は？");
		
		int n = sc.nextInt();
		int k = sc.nextInt();
		
		int[] sum = new int[n + 1];
		for(int i = 1; i <= n; i++) {
			sum[i] = sc.nextInt();
			sum[i] += sum[i - 1];
		}
		
		int maxVisitor = 0; // 最大訪問者数
		int dayFrom = 0; // 候補のなかで最も早い候補日
		int dayCandidates = 0; // キャンペーンを行なった期間の候補数
		
		for(int i = k; i <= n; i++) {
			int visitor = sum[i] - sum[i - k];
			System.out.println(visitor);
			if(visitor > maxVisitor) {
				maxVisitor = visitor;
				dayCandidates = 1;
				dayFrom = i - k + 1;
			} else if(visitor == maxVisitor) {
				dayCandidates++;
			}
		}
		
		System.out.println(dayCandidates + " " + dayFrom);

	}

}
