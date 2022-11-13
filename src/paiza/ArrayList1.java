package paiza;

import java.util.ArrayList;

public class ArrayList1 {

	public static void main(String[] args) {
		ArrayList strList = new ArrayList();
	    strList.add("いぬ"); // インデックス番号0
	    strList.add("ねこ"); // インデックス番号1
	    strList.add("とり"); // インデックス番号2
	    strList.add("ねこ"); // インデックス番号3
	    strList.add("さる"); // インデックス番号4
	    strList.add("とり"); // インデックス番号5
	    
	    System.out.println(strList.indexOf("ねこ"));

	}

}
