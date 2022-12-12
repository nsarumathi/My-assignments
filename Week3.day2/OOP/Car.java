package inheritance.oop;

public class Car extends Vehicle{
	public void CarClass() {
		System.out.println("CarClass");
	}
	
	public static void main(String[] args) {
		Car Info=new Car();
		Vehicle Category=new Vehicle();
		Info.CarClass();
		Category.applybreak();
		Category.soundhorn();
	}}

