
public class JSample6_5 {

	public static void main(String[] args) {
		B_1 b1 = new B_1();
		b1.disp();
		
		B_2 b2 = new B_2();
		b2.disp();
	}
}

class A_1 {
	public void disp() {
		System.out.println("電化製品です");
	}
}

class B_1 extends A_1 {
	public void disp() {
		System.out.println("エアコンです");
	}
}

class B_2 extends A_1 {
}
