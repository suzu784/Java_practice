package practice;

public class Chapter09 {
	public static void main(String[] args) {
		double fuelCost = 12.5;
		double fuelAmount = 55.0;
		
		Car car = new Car(fuelCost, fuelAmount);
		car.move(20);
		System.out.println("残量は," + car.getFuelAmount() + "です");
	}
}
