
public class CTest10 {

	public static void main(String[] args) {
		Television2 tv1 = new Television2("台所");
		tv1.dispChannel();
		
		Television2 tv2 = new Television2();
		tv2.dispChannel();

	}

}

class Television2 {
	private int channelNo;
	private String place;
	
	Television2() {
		channelNo = 1;
		place = "未定";
	}
	
	Television2(String newPlace) {
		channelNo = 1;
		place = newPlace;
	}
	
	public void dispChannel() {
		System.out.println("現在のチャンネルは" + channelNo+ "です");
	    System.out.println("設置してある場所は" + place + "です");
	}
}
