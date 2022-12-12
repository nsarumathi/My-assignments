package polymorphism.oop;

public class AxisBank extends BankInfo {
	//overriding
	public void deposit() {
		System.out.println("Deposit field in AxisBank Form");
	}
public static void main(String[] args) {
	AxisBank Details=new AxisBank();
	Details.deposit();

}
}
