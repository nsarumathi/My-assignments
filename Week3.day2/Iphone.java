package week3.day2;

public class Iphone extends Abstract implements Mobile,Mobilecost  {
	public static void main(String[] args) {
		Iphone Details=new Iphone();
		Details.SendSMS();
		Details.Switchon();
		Details.Dialno();
		Details.touchpad();
		Details.makeCall();
		Details.cost();
		Details.Tax();
	}

	@Override
	public void touchpad() {
		// TODO Auto-generated method stub
		System.out.println("Touchpad is working");
	}

	public void SendSMS() {
		// TODO Auto-generated method stub
		System.out.println("SMS Sent");
	}

	public void Dialno() {
		// TODO Auto-generated method stub
		System.out.println("No is Dialled");
	}

	public void Switchon() {
		// TODO Auto-generated method stub
		System.out.println("Switched on");
	}

	public void cost() {
		// TODO Auto-generated method stub
		System.out.println("multi interface class checked==80kcost");
	}

	public void Tax() {
		// TODO Auto-generated method stub
		System.out.println("multi interface class checked==18%");
	}

}
