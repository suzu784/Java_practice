
public class JSample4_5{
	public static void main(String[] args) {
		Television tv1 = new Television();
		
		tv1.setChannel(3);
		tv1.dispChannel();
	}

}

class Television {
	// メンバ変数はオブジェクトの性質や状態などを保存しておくときに利用する
	int channelNo;
	
	void setChannel(int newChannelNo) {
		channelNo = newChannelNo;
	}
	
	void dispChannel() {
		System.out.println("現在のチャンネルは" + channelNo + "です。");
	}
	
	
}
