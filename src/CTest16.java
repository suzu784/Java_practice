
public class CTest16 {

	public static void main(String[] args) {
		E1 e1 = new E1();
		e1.disp();
		
		E2 e2 = new E2();
		e2.disp();
	}

}

class E {
	public void disp() {
		System.out.println("電化製品です");
	}
}

class E1 extends E {
	public void disp() {
		System.out.println("エアコンです");
		super.disp();
	}
}

class E2 extends E1 {
	public void disp() {
		System.out.println("三菱です");
		super.disp();
	}
}


