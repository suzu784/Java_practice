
public class CTest2 {

	public static void main(String[] args) {
		Television1 tv1 = new Television1();
		tv1.setChannel(1);

	}

}

class Television1 {
	private int channelNo;
	
	void setChannel(int newChannelNo) {
		channelNo = newChannelNo;
		System.out.println("新しいchannelNo=" + channelNo);
	}
}