package paiza;

import java.util.ArrayList;
import java.util.Arrays;

public class Q01 {
	
	// 配列は事前に要素の数を決める必要があり、さまざまな処理が必要となる要素の管理には適していない
	// ArrayListの場合、要素の追加や削除が自由に行えることに加えて、クラスに備わる利便性の高いさまざまなメソッドが使える
	
	public static void main(String[] args) {
		String[] ary = {"あ", "い", "う", "え", "お"};
		
		ArrayList<String> aryList = new ArrayList<>(Arrays.asList("あ", "い", "う", "え", "お"));

	}

}
