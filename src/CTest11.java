
public class CTest11 {

	public static void main(String[] args) {
		Soarer soarer = new Soarer();
		
		soarer.openRoof();
		if (soarer.roofOpenFlag) {
			System.out.println("屋根が開いています");
		} else {
			System.out.println("屋根が閉じています");
		}
		
		soarer.accele();
		System.out.println("現在の速度は" + soarer.speed + "キロです");

	}

}

class Car {
	int speed = 0;
	
	public void accele() {
		speed += 5;
	}
	
	public void brake() {
		speed -= 5;
	}
}

class Soarer extends Car {
	boolean roofOpenFlag = false;
	
	public void openRoof() {
		roofOpenFlag = true;
	}
	
	public void closeRoof() {
		roofOpenFlag = true;
	}
}
