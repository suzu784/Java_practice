package paiza;

import java.util.Scanner;

public class AverageInterval2 {
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("日別訪問者数の最大平均区間は？");
		
		int n = sc.nextInt();
		int k = sc.nextInt();
		
		int[] sum = new int[n + 1];
		for(int i = 1; i <= n; i++) {
			sum[i] = sc.nextInt();
			sum[i] += sum[i - 1];
			System.out.println(sum[i]);
		}
		
		int maxVisitor = 0;
		int dayFrom = 0;
		int dayCandidates = 0;
		
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
