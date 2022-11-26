package week1.day1;

public class Mobile {
      public void sendsms() {
    	  System.out.println("Happy to Learn Java");
      }
      public void makecall() {
    	  System.out.println("Calling my Friend");
      }
      
	public static void main(String[] args) {

		Mobile action=new Mobile();
		action.sendsms();
		action.makecall();
	}
}
