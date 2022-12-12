package inheritance.oop;

public class Auto extends Vehicle {
	public void  AutoClass() {
		System.out.println(" AutoClass");
	}

	public static void main(String[] args) {
		Auto Info=new Auto();
		Vehicle Category=new Vehicle();
		Info.AutoClass();
		Category.applybreak();
		Category.soundhorn();
}}
