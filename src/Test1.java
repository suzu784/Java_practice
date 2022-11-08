
public class Test1 {

	public static void main(String[] args) {
		// 九九の計算
        for(int i = 1; i <= 9; i++) {
            for(int j = 1; j <= 9; j++) {
                // 変数mに掛け算の結果を代入
		int m = i * j;
		    
		System.out.print(" ");

		if(10 > m) {
        System.out.print( " " );
		}

		System.out.print(m);
	    }
	    // 改行
	    System.out.println();
        }
    }
}

