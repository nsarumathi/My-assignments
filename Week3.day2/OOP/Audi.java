package inheritance.oop;

public class Audi extends Car{
	public void  AudiInfo() {
		System.out.println(" Audi");}
public static void main(String[] args) {
	Vehicle Info=new Vehicle();
	Car Category=new Car();
	Audi Details=new Audi();
	Details.AudiInfo();
	Category.CarClass();
	Info.applybreak();
	Info.soundhorn();
}
}
