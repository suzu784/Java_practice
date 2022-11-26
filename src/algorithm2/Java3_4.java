package algorithm2;

import java.util.Scanner;

public class Java3_4 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("要素数は:");
		
		int num = sc.nextInt();
		int[] x = new int[num];
		
		System.out.println("昇順に入力してください");
		
		System.out.print("x[0]:");
		x[0] = sc.nextInt();
		
		for(int i = 1; i < num; i++) {
			do {
				System.out.print("x[" + i + "]:");
				x[i] = sc.nextInt();
			} while(x[i] < x[i - 1]);
		}
		
		System.out.println("探す値は:");
		int ky = sc.nextInt();
		binSearch(x, num, ky);

	}
	
	public static int binSearch(int a[], int n, int key) {
		int pl = 0;
		int pr = n - 1;
		
		System.out.print("   |");
		for(int i = 0; i < n; i++) {
			System.out.printf("%4d", i);
		}
		System.out.println();
		
		System.out.print("---+");
		for(int i = 0; i < 4 * n + 2; i++) {
			System.out.print("-");
		}
		System.out.println();
		
		do {
			int   pc = (pl + pr) / 2;		// 中央要素のインデックス
			System.out.print("   |");
			if (pl != pc)
				System.out.printf(String.format("%%%ds<-%%%ds+",
												(pl * 4) + 1, (pc - pl) * 4),
												"", "");
			else
				System.out.printf(String.format("%%%ds<-+",   pc * 4 + 1), "");
			if (pc != pr)
				System.out.printf(String.format("%%%ds->\n",
												(pr - pc) * 4 - 2), "");
			else
				System.out.println("->");
			System.out.printf("%3d|", pc);
			for (int k = 0; k < n; k++)
				System.out.printf("%4d", a[k]);
			System.out.println("\n   |");
			if (a[pc] == key)
				return pc;					// 探索成功
			else if (a[pc] < key)
				pl = pc + 1;				// 探索範囲を後半に絞り込む
			else
				pr = pc - 1; 
		} while(pl <= pr);	
		
		return -1;
	}

}
