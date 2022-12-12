package inheritance.oop;

public class BMW extends Car{
	public void BMWClass() {
		System.out.println("BMWClass");}
	public void ABS() {
		System.out.println("ABS");
	}
	
public static void main(String[] args) {
	Vehicle Info=new Vehicle();
	Car Category=new Car();
	BMW Details=new BMW();
	Details.BMWClass();
	Details.ABS();
	Category.CarClass();
	Info.applybreak();
	Info.soundhorn();
}
}
