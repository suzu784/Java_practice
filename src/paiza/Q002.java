package paiza;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;

public class Q002 {
	
	// Iteratorインターフェースを使用すると、クラスの違いに依らない反復処理が行える
	// ループを使ったリストへのアクセス forEach

	public static void main(String[] args) {
		ArrayList<String> list = new ArrayList<>(Arrays.asList("か", "き", "く"));
		Iterator<String> list_iterated = list.iterator();
		String moji;
		
		while(list_iterated.hasNext()) {
			moji = list_iterated.next();
			System.out.println(moji);
		}

	}

}
